package com.system.service.modules.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.system.service.common.constant.Constant;
import com.system.service.common.tableField.AdminTableField;
import com.system.service.modules.sys.dao.ServerTokenDao;
import com.system.service.modules.sys.entity.ServerTokenEntity;
import com.system.service.modules.sys.service.IServerTokenService;
import org.springframework.stereotype.Service;


@Service("serverTokenService")
public class ServerTokenServiceImpl extends ServiceImpl<ServerTokenDao, ServerTokenEntity> implements IServerTokenService {

    /**
     * 記錄token
     *
     * @param token  token
     * @param userId 用戶id
     */
    @Override
    public void createToken(String token, String userId) {
        QueryWrapper<ServerTokenEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(AdminTableField.ServerToken.USER_ID, userId);
        queryWrapper.eq(AdminTableField.ServerToken.SERVER_TYPE, Constant.SERVER_TOKEN_TYPE);
        ServerTokenEntity serverToken = baseMapper.selectOne(queryWrapper);
        if (null == serverToken) {
            ServerTokenEntity entity = new ServerTokenEntity();
            entity.setToken(token);
            entity.setUserId(userId);
            entity.setServerType(Constant.SERVER_TOKEN_TYPE);
            this.save(entity);
        } else {
            serverToken.setToken(token);
            UpdateWrapper<ServerTokenEntity> updateWrapper = new UpdateWrapper<>();
            updateWrapper.eq(AdminTableField.ServerToken.USER_ID, userId);
            updateWrapper.eq(AdminTableField.ServerToken.SERVER_TYPE, Constant.SERVER_TOKEN_TYPE);
            baseMapper.update(serverToken,updateWrapper);
        }
    }

}
