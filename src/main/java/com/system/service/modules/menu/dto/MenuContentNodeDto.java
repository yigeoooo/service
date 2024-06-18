package com.system.service.modules.menu.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WangJianHui
 * @since date 2024/6/7
 */
@Data
public class MenuContentNodeDto {
    /**
     * 菜单ID
     */
    private String menuId;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 菜单路由
     */
    private String router;
    /**
     * 角色ID
     */
    private String roleId;
    /**
     * 部门ID
     */
    private String departmentId;
    /**
     * 子节点
     */
    private List<MenuContentNodeDto> children = new ArrayList<>();

}
