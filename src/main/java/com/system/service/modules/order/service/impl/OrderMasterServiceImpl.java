package com.system.service.modules.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.service.common.constant.Constant;
import com.system.service.common.exception.BusinessException;
import com.system.service.common.utils.ShiroUtils;
import com.system.service.modules.order.dto.OrderMasterPageDto;
import com.system.service.modules.order.vo.OrderMasterAddVo;
import com.system.service.modules.order.vo.OrderMasterPageVo;
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
        entity.setUserId(ShiroUtils.getUserId());
        //插入
        if ((orderMasterDao.insert(entity)) != Constant.ONE) {
            throw new BusinessException("新增房间订单失败！");
        }
    }

    @Override
    public Page<OrderMasterPageDto> page(OrderMasterPageVo vo) {
        //分页条件构造
        Page<OrderMasterEntity> page = new Page<>(vo.getPage(), vo.getSize());
        //查询条件构造
        QueryWrapper<OrderMasterEntity> query = new QueryWrapper<>();
        query.eq("house_id", vo.getId());
        return orderMasterDao.selectPage(page, query);
    }
}
