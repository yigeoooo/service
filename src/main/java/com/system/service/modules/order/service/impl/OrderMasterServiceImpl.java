package com.system.service.modules.order.service.impl;

import com.system.service.common.constant.Constant;
import com.system.service.common.exception.BusinessException;
import com.system.service.modules.order.vo.OrderMasterAddVo;
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

    @Override
    public void insertOrder(OrderMasterAddVo vo) {
        //vo转entity
        OrderMasterEntity entity = new OrderMasterEntity();
        //填充参数
        entity.setHouseId(vo.getHouseId());
        entity.setBeginDate(vo.getBeginDate());
        entity.setLastDate(vo.getLastDate());
        entity.setDays(vo.getDays());
        entity.setTotalPrice(vo.getTotalPrice());
        entity.setState(Constant.STR_ONE);
        //插入
        if ((orderMasterDao.insert(entity)) != Constant.ONE) {
            throw new BusinessException("新增房间订单失败！");
        }
    }
}
