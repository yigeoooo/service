package com.system.service.modules.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.system.service.modules.order.service.OrderMasterService;



/**
 * 房间订单主档表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-08-21 13:10:43
 */
@RestController
@RequestMapping("order-master")
public class OrderMasterController {

    @Autowired
    private OrderMasterService orderMasterService;


}
