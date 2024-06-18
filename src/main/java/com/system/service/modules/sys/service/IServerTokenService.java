package com.system.service.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.system.service.modules.sys.entity.ServerTokenEntity;

/**
 * tokenAp通用表
 *
 * @author shanyue
 * @email
 * @date 2023-02-28 18:07:06
 */
public interface IServerTokenService extends IService<ServerTokenEntity> {
    /**
     * 記錄token
     *
     * @param token token
     */
    void createToken(String token,String userId);

}

