package com.system.service.modules.house.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author WangJianHui
 * @since date 2024/7/3
 */
@Data
public class HouseMasterPageDto {
    /**
     * 主键
     */
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
     * 房间价格
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal price;
    /**
     * 逻辑排序
     */
    private long sort;
    /**
     * 房间状态
     */
    private String state;
    /**
     * 房间编号
     */
    private String houseNumber;

}
