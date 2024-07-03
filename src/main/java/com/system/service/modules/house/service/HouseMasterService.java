package com.system.service.modules.house.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.system.service.modules.house.entity.HouseMasterEntity;
import com.system.service.modules.house.vo.HouseMasterAddVo;

/**
 * 房间主表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-07-03 19:10:19
 */
public interface HouseMasterService extends IService<HouseMasterEntity> {
    /**
     * 房间新增
     * @param vo 接参对象
     */
    void insert(HouseMasterAddVo vo);

}

