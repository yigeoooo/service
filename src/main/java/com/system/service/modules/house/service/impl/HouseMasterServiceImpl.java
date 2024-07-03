package com.system.service.modules.house.service.impl;

import com.system.service.common.constant.Constant;
import com.system.service.common.exception.BusinessException;
import com.system.service.common.utils.ShiroUtils;
import com.system.service.modules.house.vo.HouseMasterAddVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.system.service.modules.house.dao.HouseMasterDao;
import com.system.service.modules.house.entity.HouseMasterEntity;
import com.system.service.modules.house.service.HouseMasterService;

import java.time.LocalDateTime;


@Service("houseMasterService")
public class HouseMasterServiceImpl extends ServiceImpl<HouseMasterDao, HouseMasterEntity> implements HouseMasterService {

    @Autowired
    private HouseMasterDao houseMasterDao;

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
        //插入
        if ((houseMasterDao.insert(entity)) != Constant.ONE) {
            throw new BusinessException("新增房间失败！");
        }
    }
}
