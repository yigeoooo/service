package com.system.service.modules.department.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.service.modules.department.dto.DepartmentMasterPageDto;
import com.system.service.modules.department.entity.DepartmentMasterEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 部门主档表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-06-06 23:01:47
 */
@Repository
@Mapper
public interface DepartmentMasterDao extends BaseMapper<DepartmentMasterEntity> {

    /**
     * 分页查询部门信息
     * @param page 分页对象
     * @param ew 条件构造器
     * @return 分页结果
     */
    Page<DepartmentMasterPageDto> getPage(@Param("page") Page<DepartmentMasterEntity> page,
                                          @Param("ew")QueryWrapper<DepartmentMasterEntity> ew);

}
