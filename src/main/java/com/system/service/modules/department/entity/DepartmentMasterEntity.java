package com.system.service.modules.department.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 部门主档表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-06-06 23:01:47
 */
@Data
@TableName("department_master")
public class DepartmentMasterEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 部门ID
	 */
	@TableId
	private String departmentId;
	/**
	 * 部门名称
	 */
	@NotBlank(message = "科室名称不能为空！", groups = {Save.class})
	private String departmentName;
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
	 * 排序表示符
	 */
	@NotNull(message = "排序标识符不能为空！", groups = {Save.class})
	private Long sort;
	/**
	 * 逻辑删除标识符
	 */
	@TableLogic
	private String isDeleted;

	/**
	 * 校验分组
	 */
	public interface Save {

	}

}
