package com.system.service.common.utils;

import com.system.service.common.exception.BusinessException;
import com.system.service.modules.sys.entity.SysUserEntity;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

/**
 * Shiro工具類
 *
 * @author Mark sunlightcs@gmail.com
 */
public class ShiroUtils {

	public static Session getSession() {
		return SecurityUtils.getSubject().getSession();
	}

	public static Subject getSubject() {
		return SecurityUtils.getSubject();
	}

	public static SysUserEntity getUserEntity() {
		return (SysUserEntity)SecurityUtils.getSubject().getPrincipal();
	}

	public static String getLoginId() {
		return getUserEntity().getLoginId();
	}

	public static String getUserId() {
		return getUserEntity().getUserId();
	}

	public static String getRoleId() {
		return getUserEntity().getRoleId();
	}

	public static void setSessionAttribute(Object key, Object value) {
		getSession().setAttribute(key, value);
	}

	public static Object getSessionAttribute(Object key) {
		return getSession().getAttribute(key);
	}

	public static boolean isLogin() {
		return SecurityUtils.getSubject().getPrincipal() != null;
	}

	public static String getKaptcha(String key) {
		Object kaptcha = getSessionAttribute(key);
		if(kaptcha == null){
//			throw new RRException("驗證碼已失效");
			throw new BusinessException(MessageCode.CommonMessage.PARAM_ERROR);
		}
		getSession().removeAttribute(key);
		return kaptcha.toString();
	}

}
