package com.system.service.modules.department.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.system.service.modules.department.dto.DepartmentMasterOptionsListDto;
import com.system.service.modules.department.dto.DepartmentMasterPageDto;
import com.system.service.modules.department.entity.DepartmentMasterEntity;
import com.system.service.modules.department.vo.DepartmentMasterEditVo;
import com.system.service.modules.department.vo.DepartmentMasterPageVo;

/**
 * 部门主档表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-06-06 23:01:47
 */
public interface DepartmentMasterService extends IService<DepartmentMasterEntity> {

    /**
     * 新增部门
     * @param entity 实体类
     */
    void insert(DepartmentMasterEntity entity);

    /**
     * 分页查询科室信息
     * @param vo 接参对象
     * @return 分页对象
     */
    Page<DepartmentMasterPageDto> getPage(DepartmentMasterPageVo vo);

    /**
     * 获取所有部门下拉列表
     * @return 列表对象
     */
    DepartmentMasterOptionsListDto getOptions();

    /**
     * 修改部信息
     * @param vo 接参对象
     */
    void editDepartmentMaster(DepartmentMasterEditVo vo);
}

