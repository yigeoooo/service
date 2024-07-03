package com.system.service.modules.house.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 房间主表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-07-03 19:10:19
 */
@Data
@TableName("house_master")
public class HouseMasterEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 房间ID
	 */
	@TableId
	private String id;
	/**
	 * 房间名称
	 */
	private String houseName;
	/**
	 * 房间密码
	 */
	private String password;
	/**
	 * 房间状态（0：空闲，1：占用，2：已退房，3：打扫中）
	 */
	private String state;
	/**
	 * 创建时间
	 */
	private LocalDateTime insertTime;
	/**
	 * 创建人ID
	 */
	private String insertUserId;
	/**
	 * 最近更新时间
	 */
	private LocalDateTime updateTime;
	/**
	 * 最近更新人ID
	 */
	private String updateUserId;
	/**
	 * 排序
	 */
	private Long sort;
	/**
	 * 逻辑删除标识符(0：正常，1：删除)
	 */
	private String isDeleted;
	/**
	 * 房间单价
	 */
	private BigDecimal price;
	/**
	 * 房间编号
	 */
	private String houseNumber;
}
