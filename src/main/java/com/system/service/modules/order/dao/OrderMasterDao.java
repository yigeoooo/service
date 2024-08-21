package com.system.service.modules.order.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.service.modules.order.dto.OrderMasterPageDto;
import com.system.service.modules.order.entity.OrderMasterEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 房间订单主档表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-08-21 13:10:43
 */
@Repository
@Mapper
public interface OrderMasterDao extends BaseMapper<OrderMasterEntity> {

	Page<OrderMasterPageDto> selectPage(
            @Param("page") Page<OrderMasterEntity> page,
            @Param("ew") QueryWrapper<OrderMasterEntity> queryWrapper);

	Integer editOrderState(String houseId);

}
