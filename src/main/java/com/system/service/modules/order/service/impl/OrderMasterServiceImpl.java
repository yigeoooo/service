package com.system.service.modules.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.system.service.modules.order.dao.OrderMasterDao;
import com.system.service.modules.order.entity.OrderMasterEntity;
import com.system.service.modules.order.service.OrderMasterService;


@Service("orderMasterService")
public class OrderMasterServiceImpl extends ServiceImpl<OrderMasterDao, OrderMasterEntity> implements OrderMasterService {

    @Autowired
    private OrderMasterDao orderMasterDao;

}
