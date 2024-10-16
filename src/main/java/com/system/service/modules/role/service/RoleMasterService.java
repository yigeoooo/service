package com.system.service.modules.role.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.system.service.modules.role.dto.RoleMasterOptionsDto;
import com.system.service.modules.role.dto.RoleMasterPageDto;
import com.system.service.modules.role.entity.RoleMasterEntity;
import com.system.service.modules.role.vo.RoleMasterEditVo;
import com.system.service.modules.role.vo.RoleMasterPageVo;

import java.util.List;

/**
 * 角色主档表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-06-06 12:20:33
 */
public interface RoleMasterService extends IService<RoleMasterEntity> {

    /**
     * 分页查询角色信息
     * @param roleName 角色名称
     * @return 分页对象
     */
    Page<RoleMasterPageDto> getPage(RoleMasterPageVo vo);

    /**
     * 新增角色
     * @param entity 实体类
     */
    void insert(RoleMasterEntity entity);

    /**
     * 获取某部门下角色
     * @param departmentId 部门ID
     * @return 角色列表
     */
    List<RoleMasterOptionsDto> getOptions(String departmentId);

    /**
     * 修改角色信息
     * @param vo 接参对象
     */
    void editRoleInfo(RoleMasterEditVo vo);
}

