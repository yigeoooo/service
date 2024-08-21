package com.system.service.modules.order.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.service.common.utils.ResultInfo;
import com.system.service.modules.order.dto.OrderMasterPageDto;
import com.system.service.modules.order.vo.OrderMasterAddVo;
import com.system.service.modules.order.vo.OrderMasterPageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    /**
     * 查询特定房间预订详情
     * @param vo 接参对象
     * @return 统一返回值
     */
    @GetMapping("/page")
    public ResultInfo<Page<OrderMasterPageDto>> selectPage(OrderMasterPageVo vo) {
        return ResultInfo.build(orderMasterService.page(vo));
    }

}
