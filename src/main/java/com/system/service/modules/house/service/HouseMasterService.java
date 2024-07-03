package com.system.service.modules.house.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.system.service.modules.house.dto.HouseMasterPageDto;
import com.system.service.modules.house.entity.HouseMasterEntity;
import com.system.service.modules.house.vo.HouseMasterAddVo;
import com.system.service.modules.house.vo.HouseMasterPageVo;

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

    /**
     * 分页查询房间信息
     * @param vo 接参对象
     * @return 分页对象
     */
    Page<HouseMasterPageDto> selectPage(HouseMasterPageVo vo);
}

