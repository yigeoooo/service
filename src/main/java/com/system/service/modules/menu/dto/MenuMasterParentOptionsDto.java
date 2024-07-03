package com.system.service.modules.menu.dto;

import lombok.Data;

/**
 * @author WangJianHui
 * @since date 2024/7/3
 */
@Data
public class MenuMasterParentOptionsDto {
    /**
     * 父级菜单ID
     */
    private String parentMenuId;
    /**
     * 父级菜单名称
     */
    private String menuName;
}
