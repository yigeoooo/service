package com.system.service.modules.sys.dto;

import lombok.Data;

/**
 * @author WangJianHui
 * @since date 2024/6/18
 */
@Data
public class SysUserPageDto {
    /**
     * 登录ID
     */
    private String loginId;
    /**
     * 用户名称
     */
    private String userName;
    /**
     *联系电话
     */
    private String telephone;
    /**
     *所属部门名称
     */
    private String departmentName;
    /**
     *所属角色名称
     */
    private String roleName;

}
