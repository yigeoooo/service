package com.system.service.modules.menu.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WangJianHui
 * @since date 2024/6/7
 */
@Data
public class MenuPermissionContentVo {
    /**
     * 部门ID
     */
    private String departmentId;
    /**
     * 菜单ID
     */
    private String menuId;
    /**
     * 角色ID数组
     */
    private List<String> roleList = new ArrayList<>();

}
