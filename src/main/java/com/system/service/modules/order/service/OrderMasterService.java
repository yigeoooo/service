package com.system.service.modules.order.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.system.service.modules.order.dto.OrderMasterPageDto;
import com.system.service.modules.order.entity.OrderMasterEntity;
import com.system.service.modules.order.vo.OrderMasterAddVo;
import com.system.service.modules.order.vo.OrderMasterPageVo;

/**
 * 房间订单主档表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-08-21 13:10:43
 */
public interface OrderMasterService extends IService<OrderMasterEntity> {
    /**
     * 新增房间订单
     * @param vo 接视视图类
     */
    void insertOrder(OrderMasterAddVo vo);

    /**
     * 查询特定房间预订详情
     * @param id 房间主键
     * @return page对象
     */
    Page<OrderMasterPageDto> page(OrderMasterPageVo vo);

}

