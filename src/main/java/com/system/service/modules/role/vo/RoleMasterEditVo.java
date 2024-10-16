package com.system.service.modules.role.vo;

import lombok.Data;

/**
 * @author WangJianHui
 * @since date 2024/10/9
 */
@Data
public class RoleMasterEditVo {

    /**
     * 主键
     */
    private String roleId;
    /**
     * 角色ID
     */
    private String roleName;
    /**
     * 逻辑排序标识符
     */
    private long sort;

}
