package com.system.service.modules.menu.vo;

import lombok.Data;

/**
 * @author WangJianHui
 * @since date 2024/7/3
 */
@Data
public class MenuMasterAddVo {
    /**
     * 父类菜单Id
     */
    private String parentMenuId;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 菜单路由
     */
    private String router;
    /**
     * 排序
     */
    private long sort;
}
