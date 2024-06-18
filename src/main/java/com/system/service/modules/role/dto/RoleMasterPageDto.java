package com.system.service.modules.role.dto;

import lombok.Data;

/**
 * 分页查询dto
 * @author WangJianHui
 * @since date 2024/6/6
 */
@Data
public class RoleMasterPageDto {
    /**
     * 角色ID
     */
    private String roleId;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 创建时间
     */
    private String insertTime;
    /**
     * 创建人
     */
    private String userName;
    /**
     * 排序标识符
     */
    private long sort;
    /**
     * 科室名称
     */
    private String departmentName;
}
