package com.system.service.modules.order.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author WangJianHui
 * @since date 2024/8/21
 */
@Data
public class OrderMasterAddVo {
    /**
     * 开始时间
     */
    private LocalDate beginDate;
    /**
     * 结束时间
     */
    private LocalDate lastDate;
    /**
     * 总计日期
     */
    private Long days;
    /**
     * 房间ID
     */
    private String houseId;
    /**
     * 总金额
     */
    private BigDecimal totalPrice;

}
