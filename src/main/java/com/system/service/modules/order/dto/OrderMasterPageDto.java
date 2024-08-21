package com.system.service.modules.order.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

/**
 * @author WangJianHui
 * @since date 2024/8/21
 */
@Data
public class OrderMasterPageDto {

    private String id;

    private String houseId;

    private String houseName;

    private String houseNumber;

    private LocalDate beginDate;

    private LocalDate lastDate;

    private Long days;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String totalPrice;

    private String state;

    private String userName;

    private String userId;

}
