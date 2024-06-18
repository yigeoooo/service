package com.system.service.modules.role.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.service.modules.role.dto.RoleMasterPageDto;
import com.system.service.modules.role.entity.RoleMasterEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 角色主档表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-06-06 12:20:33
 */
@Repository
@Mapper
public interface RoleMasterDao extends BaseMapper<RoleMasterEntity> {

    /**
     * 查询角色信息
     * @param page 分页对象
     * @param ew 条就构造器
     * @return 分页对象
     */
    Page<RoleMasterPageDto> getPage(@Param("page") Page<RoleMasterEntity> page,
                                    @Param("ew") QueryWrapper<RoleMasterEntity> ew);

}
