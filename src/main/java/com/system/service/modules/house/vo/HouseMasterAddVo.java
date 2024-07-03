package com.system.service.modules.house.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author WangJianHui
 * @since date 2024/7/3
 */
@Data
public class HouseMasterAddVo {
    /**
     * 房间名称
     */
    private String houseName;
    /**
     * 默认密码
     */
    private String password;
    /**
     * 房间排序
     */
    private long sort;
    /**
     * 房间单价
     */
    private BigDecimal price;
    /**
     * 房间编号
     */
    private String houseNumber;

}
