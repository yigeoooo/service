

package com.system.service.modules.sys.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.system.service.modules.sys.dto.SysUserDto;
import com.system.service.modules.sys.dto.SysUserPageDto;
import com.system.service.modules.sys.dto.TokenDto;
import com.system.service.modules.sys.entity.SysUserEntity;
import com.system.service.modules.sys.vo.SysUserSaveVo;
import com.system.service.modules.sys.vo.SysUserVo;


/**
 * 系統用戶
 *
 * @author Mark
 */
public interface SysUserService extends IService<SysUserEntity> {

    /**
     * 根據用戶登陸ID，查詢系統用戶
     */
    SysUserEntity queryByLoginId(String loginId);

    /**
     * 保存用戶
     */
    boolean saveUser(SysUserSaveVo user);

    /**
     * 发送email验证码
     * @param email
     */
    void sendEmail(String email, String captcha, String uuid);

    /**
     * 邮箱验证登录
     * @param email 邮箱
     * @return TokenDto
     */
    TokenDto loginByEmail(String email, String code);

    /**
     * 分页查询系统用户
     * @return Page
     */
    Page<SysUserDto> getPage(SysUserVo vo);

    /**
     * 分页查询账号信息
     * @param vo 接参对象
     * @return 分页对象
     */
    Page<SysUserPageDto> getUserPage(SysUserVo vo);

}
