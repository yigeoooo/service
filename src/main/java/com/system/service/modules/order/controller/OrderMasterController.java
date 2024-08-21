package com.system.service.modules.order.controller;

import com.system.service.common.utils.ResultInfo;
import com.system.service.modules.order.vo.OrderMasterAddVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/orderMaster")
public class OrderMasterController {

    @Autowired
    private OrderMasterService orderMasterService;

    /**
     * 新增房间订单
     * @param vo 接参对象
     * @return 统一返回值
     */
    @PostMapping("/insert")
    public ResultInfo<String> insert(@RequestBody OrderMasterAddVo vo) {
        orderMasterService.insertOrder(vo);
        return ResultInfo.build();
    }

}
