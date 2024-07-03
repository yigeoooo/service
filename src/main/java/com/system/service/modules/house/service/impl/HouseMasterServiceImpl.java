package com.system.service.modules.house.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.system.service.modules.house.dao.HouseMasterDao;
import com.system.service.modules.house.entity.HouseMasterEntity;
import com.system.service.modules.house.service.HouseMasterService;


@Service("houseMasterService")
public class HouseMasterServiceImpl extends ServiceImpl<HouseMasterDao, HouseMasterEntity> implements HouseMasterService {

    @Autowired
    private HouseMasterDao houseMasterDao;

}
