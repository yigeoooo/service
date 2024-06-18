package com.system.service.modules.menu.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 菜单权限从表
 * 
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-06-07 15:19:40
 */
@Data
@TableName("menu_permission_content")
public class MenuPermissionContentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String id;
	/**
	 * 菜单ID
	 */
	private String menuId;
	/**
	 * 角色ID
	 */
	private String roleId;
	/**
	 * 部门ID
	 */
	private String departmentId;

}
