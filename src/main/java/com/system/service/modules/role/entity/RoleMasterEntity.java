package com.system.service.modules.role.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 角色主档表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-06-06 12:20:33
 */
@Data
@TableName("role_master")
public class RoleMasterEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String roleId;
	/**
	 * 角色名称
	 */
	@NotNull(message = "角色名称不能为空！", groups = {Save.class})
	private String roleName;
	/**
	 * 排序标识符
	 */
	@NotNull(message = "排序标识符不能为空！", groups = {Save.class})
	private Long sort;
	/**
	 * 部门id
	 */
	private String departmentId;
	/**
	 * 逻辑删除标识符
	 */
	@TableLogic
	private String isDeleted;
	/**
	 * 创建时间
	 */
	private LocalDateTime insertTime;
	/**
	 * 创建人ID
	 */
	private String insertUserId;
	/**
	 * 最近修改时间
	 */
	private LocalDateTime updateTime;
	/**
	 * 最近修改人ID
	 */
	private String updateUserId;

	/**
	 * 校验分组 新增校验
	 */
	public interface Save {

	}
}
