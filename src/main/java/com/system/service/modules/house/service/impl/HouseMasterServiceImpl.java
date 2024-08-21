package com.system.service.modules.house.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.service.common.constant.Constant;
import com.system.service.common.exception.BusinessException;
import com.system.service.common.utils.ShiroUtils;
import com.system.service.common.utils.StringUtils;
import com.system.service.modules.house.dto.HouseMasterPageDto;
import com.system.service.modules.house.vo.HouseMasterAddVo;
import com.system.service.modules.house.vo.HouseMasterEditVo;
import com.system.service.modules.house.vo.HouseMasterPageVo;
import com.system.service.modules.order.dao.OrderMasterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.system.service.modules.house.dao.HouseMasterDao;
import com.system.service.modules.house.entity.HouseMasterEntity;
import com.system.service.modules.house.service.HouseMasterService;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;


@Service("houseMasterService")
public class HouseMasterServiceImpl extends ServiceImpl<HouseMasterDao, HouseMasterEntity> implements HouseMasterService {

    @Autowired
    private HouseMasterDao houseMasterDao;

    @Autowired
    private OrderMasterDao orderMasterDao;

    @Override
    public void insert(HouseMasterAddVo vo) {
        //转换entity
        HouseMasterEntity entity = new HouseMasterEntity();
        entity.setHouseName(vo.getHouseName());
        entity.setPassword(vo.getPassword());
        entity.setState(Constant.STR_ZERO);
        entity.setInsertTime(LocalDateTime.now());
        entity.setInsertUserId(ShiroUtils.getUserId());
        entity.setUpdateTime(LocalDateTime.now());
        entity.setUpdateUserId(ShiroUtils.getUserId());
        entity.setSort(vo.getSort());
        entity.setIsDeleted(Constant.STR_ZERO);
        entity.setPrice(vo.getPrice());
        entity.setHouseNumber(vo.getHouseNumber());
        //插入
        if ((houseMasterDao.insert(entity)) != Constant.ONE) {
            throw new BusinessException("新增房间失败！");
        }
    }

    @Override
    public Page<HouseMasterPageDto> selectPage(HouseMasterPageVo vo) {
        //构筑分页条件
        Page<HouseMasterEntity> page = new Page<>(vo.getPage(), vo.getSize());
        //构筑查询条件
        QueryWrapper<HouseMasterEntity> query = new QueryWrapper<>();
        if (StringUtils.isNotBlank(vo.getHouseName())) {
            query.like("hm.house_name", vo.getHouseName());
        }
        if (StringUtils.isNotBlank(vo.getState())) {
            query.eq("hm.state", vo.getState());
        }
        query.eq("hm.is_deleted", Constant.STR_ZERO);
        query.orderByAsc("hm.sort");
        return houseMasterDao.selectPage(page, query);
    }

    @Override
    public void editHouse(HouseMasterEditVo vo) {
        if ((houseMasterDao.editHouse(vo)) != Constant.ONE) {
            throw new BusinessException("入住失败！");
        }
    }

    @Transactional
    @Override
    public void returnHouse(String houseId) {
        if ((houseMasterDao.returnHouse(houseId)) != Constant.ONE) {
            throw new BusinessException("退房失败！");
        }
        //修改订单状态信息
        if ((orderMasterDao.editOrderState(houseId)) != Constant.ONE) {
            throw new BusinessException("退房失败！");
        }
    }

    @Override
    public void cleanHouse(String houseId) {
        if ((houseMasterDao.cleanHouse(houseId)) != Constant.ONE) {
            throw new BusinessException("失败！");
        }
    }

    @Override
    public void finishClean(String houseId) {
        if ((houseMasterDao.finishClean(houseId)) != Constant.ONE) {
            throw new BusinessException("失败！");
        }
    }
}
