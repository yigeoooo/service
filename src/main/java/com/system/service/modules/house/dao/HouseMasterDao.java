package com.system.service.modules.house.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.service.modules.house.dto.HouseMasterPageDto;
import com.system.service.modules.house.entity.HouseMasterEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 房间主表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-07-03 19:10:19
 */
@Repository
@Mapper
public interface HouseMasterDao extends BaseMapper<HouseMasterEntity> {

    Page<HouseMasterPageDto> selectPage(@Param("page") Page<HouseMasterEntity> page,
                                        @Param("ew")QueryWrapper<HouseMasterEntity> ew);

}
