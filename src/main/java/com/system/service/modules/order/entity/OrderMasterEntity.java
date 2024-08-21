package com.system.service.modules.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Data;

/**
 * 房间订单主档表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-08-21 13:10:43
 */
@Data
@TableName("order_master")
public class OrderMasterEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String id;
	/**
	 * 房间ID
	 */
	private String houseId;
	/**
	 * 预订人ID
	 */
	private String userId;
	/**
	 * 预定开始日期
	 */
	private LocalDate beginDate;
	/**
	 * 预定结束日期
	 */
	private LocalDate lastDate;
	/**
	 * 预订总日期
	 */
	private Long days;
	/**
	 * 总金额
	 */
	private BigDecimal totalPrice;
	/**
	 * 订单有效性(1:有效，0:过期)
	 */
	private String state;

}
