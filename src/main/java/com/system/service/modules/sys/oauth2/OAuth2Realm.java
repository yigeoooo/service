

package com.system.service.modules.sys.oauth2;


import com.system.service.common.constant.Constant;
import com.system.service.modules.sys.entity.SysUserEntity;
import com.system.service.modules.sys.entity.SysUserTokenEntity;
import com.system.service.modules.sys.service.ShiroService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



/**
 * 認證
 *
 * @author Mark
 */
@Component
public class OAuth2Realm extends AuthorizingRealm {

    @Autowired
    private ShiroService shiroService;

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof OAuth2Token;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    /**
     * 認證(登入時調用)
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String accessToken = (String) token.getPrincipal();
        // 不通過ap工程請求查詢token是否過期
        SysUserTokenEntity tokenEntity = shiroService.queryByToken(accessToken, Constant.VALID);
        // token失效
        if (tokenEntity == null || tokenEntity.getExpireTime().getTime() < System.currentTimeMillis()) {
            throw new IncorrectCredentialsException("token失效，請重新登錄");
        }

        // 查詢用戶訊息
        SysUserEntity user = shiroService.queryUser(tokenEntity.getUserId());
        // 帳號鎖定
        return new SimpleAuthenticationInfo(user, accessToken, getName());
    }
}
