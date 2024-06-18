package com.system.service.modules.menu.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 菜单主档表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-06-07 12:35:49
 */
@Data
@TableName("menu_master")
public class MenuMasterEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 菜单ID
	 */
	@TableId
	private String menuId;
	/**
	 * 父级菜单ID
	 */
	private String parentMenuId;
	/**
	 * 菜单名称
	 */
	private String menuName;
	/**
	 * 菜单路由
	 */
	private String router;
	/**
	 * 创建者
	 */
	private String insertUserId;
	/**
	 * 创建时间
	 */
	private LocalDateTime insertTime;
	/**
	 * 最近更新者
	 */
	private String updateUserId;
	/**
	 * 最近更新时间
	 */
	private LocalDateTime updateTime;
	/**
	 * 排序标识符
	 */
	private Long sort;
	/**
	 * 逻辑删除标识符
	 */
	private String isDeleted;

}
