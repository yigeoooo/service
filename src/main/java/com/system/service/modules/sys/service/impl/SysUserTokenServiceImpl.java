

package com.system.service.modules.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.system.service.common.constant.Constant;
import com.system.service.modules.sys.dao.SysUserTokenDao;
import com.system.service.modules.sys.dto.TokenDto;
import com.system.service.modules.sys.entity.ServerTokenEntity;
import com.system.service.modules.sys.entity.SysUserTokenEntity;
import com.system.service.modules.sys.oauth2.TokenGenerator;
import com.system.service.modules.sys.service.IServerTokenService;
import com.system.service.modules.sys.service.SysUserTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service("sysUserTokenService")
public class SysUserTokenServiceImpl extends ServiceImpl<SysUserTokenDao, SysUserTokenEntity> implements SysUserTokenService {
    //12小時後過期
    private final static int EXPIRE = 3600 * 12;

    // 60分鐘後過期
    private final static int EXPIRE_FIVE_MINUTES = 60;

    @Autowired
    private IServerTokenService serverTokenService;


    @Override
    public TokenDto createToken(String userId) {
        //生成一個token
        String token = TokenGenerator.generateValue();
        //當前時間
        Date now = new Date();
        //過期時間
        Date expireTime = new Date(now.getTime() + EXPIRE);

        updateToken(userId, token, expireTime, Constant.INVALID);
        TokenDto rtn = new TokenDto();
        rtn.setToken(token);
        rtn.setExpire(String.valueOf(EXPIRE));
        return rtn;
    }

    /**
     * 生成臨時token
     *
     * @param userId 用户ID
     */
    @Override
    public TokenDto createTempToken(String userId) {
        //生成一個token
        String token = TokenGenerator.generateValue();
        //當前時間
        Date now = new Date();
        //過期時間
        Date expireTime = new Date(now.getTime() + EXPIRE_FIVE_MINUTES * 60 * 1000);

        updateToken(userId, token, expireTime, Constant.VALID);
        TokenDto rtn = new TokenDto();
        rtn.setToken(token);
        rtn.setExpire(String.valueOf(EXPIRE_FIVE_MINUTES));
        return rtn;
//        return R.ok().put("token", token).put("expire", EXPIRE_FIVE_MINUTES);
    }

    /**
     * 更新Token
     *
     * @param userId
     * @param token
     * @param expireTime
     */
    private void updateToken(String userId, String token, Date expireTime, String type) {
        Date now = new Date();
        //判斷是否生成過token
        SysUserTokenEntity tokenEntity = this.getById(userId);
        if (tokenEntity == null) {
            tokenEntity = new SysUserTokenEntity();
            tokenEntity.setUserId(userId);
            tokenEntity.setToken(token);
            tokenEntity.setUpdateTime(now);
            tokenEntity.setExpireTime(expireTime);
            tokenEntity.setType(type);
            //保存token
            this.save(tokenEntity);
        } else {
            tokenEntity.setToken(token);
            tokenEntity.setUpdateTime(now);
            tokenEntity.setExpireTime(expireTime);
            tokenEntity.setType(type);
            //更新token
            this.updateById(tokenEntity);
        }
        //tokenap服務用 server_token表記錄數據
        serverTokenService.createToken(token, userId);
    }

    /**
     * 退出，修改token值
     *
     * @param userId 用戶ID
     */
    @Override
    public void logout(String userId) {
        //生成一個token
        String token = TokenGenerator.generateValue();

        //修改token
        SysUserTokenEntity tokenEntity = new SysUserTokenEntity();
        tokenEntity.setUserId(userId);
        tokenEntity.setToken(token);
        this.updateById(tokenEntity);
        //tokenap服務用 server_token表記錄數據
        ServerTokenEntity entity = new ServerTokenEntity();
        entity.setToken(token);
        entity.setServerType(Constant.SERVER_TOKEN_TYPE);
        entity.setUserId(userId);
        serverTokenService.updateById(entity);
    }
}
