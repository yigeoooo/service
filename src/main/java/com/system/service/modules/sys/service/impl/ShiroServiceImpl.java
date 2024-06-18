

package com.system.service.modules.sys.service.impl;

import com.system.service.modules.sys.dao.SysUserDao;
import com.system.service.modules.sys.dao.SysUserTokenDao;
import com.system.service.modules.sys.entity.SysUserEntity;
import com.system.service.modules.sys.entity.SysUserTokenEntity;
import com.system.service.modules.sys.service.ShiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShiroServiceImpl implements ShiroService {

    @Autowired
    private SysUserDao sysUserDao;
    @Autowired
    private SysUserTokenDao sysUserTokenDao;


    @Override
    public SysUserTokenEntity queryByToken(String token, String type) {
        return sysUserTokenDao.queryByToken(token, type);
    }

    @Override
    public SysUserEntity queryUser(String userId) {
        return sysUserDao.selectById(userId);
    }


}
