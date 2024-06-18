

package com.system.service.modules.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.system.service.common.constant.Constant;
import com.system.service.common.exception.BusinessException;
import com.system.service.common.pojo.entity.ToEmail;
import com.system.service.common.tableField.TableField;
import com.system.service.common.utils.*;
import com.system.service.modules.sys.dao.SysUserDao;
import com.system.service.modules.sys.dto.SysUserDto;
import com.system.service.modules.sys.dto.SysUserPageDto;
import com.system.service.modules.sys.dto.TokenDto;
import com.system.service.modules.sys.entity.SysUserEntity;
import com.system.service.modules.sys.service.SysCaptchaService;
import com.system.service.modules.sys.service.SysUserService;
import com.system.service.modules.sys.service.SysUserTokenService;
import com.system.service.modules.sys.verify.GoogleAuthenticator;
import com.system.service.modules.sys.vo.SysUserSaveVo;
import com.system.service.modules.sys.vo.SysUserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import static com.system.service.common.utils.ShiroUtils.getLoginId;
import static com.system.service.common.utils.ShiroUtils.getUserId;


/**
 * 系統用戶
 *
 * @author Mark
 */
@Slf4j
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Autowired
    private SysUserTokenService sysUserTokenService;

    @Autowired
    private SysCaptchaService sysCaptchaService;


    /**
     * 根據用戶登陸ID，查詢系統用戶
     * @param loginId 傳入參數
     * @return 返回對象
     */
    @Override
    public SysUserEntity queryByLoginId(String loginId) {
        return baseMapper.queryByLoginId(loginId);
    }

    @Override
    public boolean saveUser(SysUserSaveVo userForm) {
        // 檢查登錄帳號是否重複
        checkLoginId(userForm);
        SysUserEntity user = new SysUserEntity();
        user.setLoginId(userForm.getLoginId());
        user.setUserName(userForm.getUserName());
        user.setTelephone(userForm.getTelephone());
        user.setEmail(userForm.getEmail());
        user.setRoleId(userForm.getRoleId());
        Date sysDate = new Date();
        user.setSalt(SaltUtils.getSaltKey());
        // 根據加密鹽生成用戶最終密碼
        user.setPassword((SaltUtils.getUserPasswordBySalt(userForm.getPassword(),user.getSalt())));
        user.setInsertUserId(getUserId());
        user.setUpdateUserId(getUserId());
        user.setInsertTime(sysDate);
        user.setUpdateTime(sysDate);
        user.setInitialPassword(userForm.getPassword());
        user.setUserId(IdWorker.getIdStr(user));
        user.setIs_deleted(Constant.STR_ZERO);
        //設置GoogleKey
        user.setGoogleKey(GoogleAuthenticator.generateSecretKey());

        return baseMapper.insert(user)>0;
    }

    @Override
    public void sendEmail(String email, String captcha, String uuid) {
        //email是否存在
        checkEmail(email);
        //check图像验证码
        boolean bo = sysCaptchaService.validate(uuid, captcha);
        if (!bo) {
            throw new BusinessException(MessageCode.LoginMessage.VERIFICATION_CODE_PARAM_ERROR);
        }
        //生成随机验证码
        String code = StringUtils.getUUID().substring(Constant.ZERO, Constant.SIX);
        ToEmail toEmail = new ToEmail();
        String[] toPerson = {email};
        toEmail.setTos(toPerson);
        String title = "TITAN SAAS后台管理系统";
        String content = "本次您的登录验证码为" + code + "," + "有效期为5分钟！";
        toEmail.setSubject(title);
        toEmail.setContent(content);

    }

    @Override
    public TokenDto loginByEmail(String email, String code) {
        return null;
    }

//    @Override
//    public TokenDto loginByEmail(String email, String code) {
//        //檢驗郵箱是否存在
//        SysUserEntity entity = checkEmail(email);
//        String redisCode = redisUtils.get(email);
//        //检验验证码是否正确
//        if (!code.equals(redisCode)) {
//            throw new BusinessException("邮箱验证码错误！");
//        }
//        //生成token令牌
//        TokenDto dto = sysUserTokenService.createTempToken(entity.getUserId());
//        dto.setUserName(entity.getUserName());
//        return dto;
//    }

    @Override
    public Page<SysUserDto> getPage(SysUserVo vo) {
        //构筑分页对象
        Page<SysUserEntity> page = new Page<>(vo.getPage(), vo.getSize());
        //构筑条件
        QueryWrapper<SysUserEntity> query = new QueryWrapper<>();
        query.eq("su." + TableField.SysUser.IS_DELETED, Constant.STR_ZERO);
        if (org.apache.commons.lang3.StringUtils.isNotBlank(vo.getRoleName())) {
           query.eq("rm." + TableField.RoleMaster.ROLE_NAME, vo.getRoleName());
        }
        if (org.apache.commons.lang3.StringUtils.isNotBlank(vo.getUserName())) {
            query.eq("su." + TableField.SysUser.USER_NAME, vo.getUserName());
        }
        return sysUserDao.getPage(page, query);
    }

    @Override
    public Page<SysUserPageDto> getUserPage(SysUserVo vo) {
        //构筑分页对象
        Page<SysUserEntity> page = new Page<>(vo.getPage(), vo.getSize());
        //构筑条件
        QueryWrapper<SysUserEntity> query = new QueryWrapper<>();
        query.eq("su." + TableField.SysUser.IS_DELETED, Constant.STR_ZERO);
        if (org.apache.commons.lang3.StringUtils.isNotBlank(vo.getRoleName())) {
            query.like("rm." + TableField.RoleMaster.ROLE_NAME, vo.getRoleName());
        }
        if (org.apache.commons.lang3.StringUtils.isNotBlank(vo.getUserName())) {
            query.like("su." + TableField.SysUser.USER_NAME, vo.getUserName());
        }
        if (org.apache.commons.lang3.StringUtils.isNotBlank(vo.getDepartmentName())) {
            query.like("dm." + "department_name", vo.getDepartmentName());
        }
        return sysUserDao.getUserPage(page, query);
    }

    /**
     * 检查登录账号是否重复
     */
    private void checkLoginId(SysUserSaveVo user) {
        if (user.getLoginId() == null || user.getLoginId().isEmpty()) {
            return;
        }
        Integer loginIdNum = baseMapper.queryByLoginIdNum(user.getLoginId(),user.getUserId());
        //判斷是否有重複登錄用戶名
        if (loginIdNum != null && loginIdNum >0) {
            throw new BusinessException(MessageCode.LoginMessage.LOGIN_ACCOUNT_DUPLICATE);
        }
    }

    /**
     * 檢驗郵箱是否存在
     * @param email 邮箱
     */
    public SysUserEntity checkEmail(String email) {
        QueryWrapper<SysUserEntity> query = new QueryWrapper<>();
        query.eq("email", email);
        SysUserEntity sysUserEntity = sysUserDao.selectOne(query);
        if (sysUserEntity == null) {
            throw new BusinessException("该邮箱不存在！");
        }
        return sysUserEntity;
    }
}
