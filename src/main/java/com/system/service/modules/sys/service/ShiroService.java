

package com.system.service.modules.sys.service;



import com.system.service.modules.sys.entity.SysUserEntity;
import com.system.service.modules.sys.entity.SysUserTokenEntity;


/**
 * shiro相關接口
 *
 * @author Mark
 */
public interface ShiroService {


    SysUserTokenEntity queryByToken(String token, String type);

    SysUserEntity queryUser(String userId);

}
