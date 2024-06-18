package com.system.service.modules.menu.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author WangJianHui
 * @since date 2024/6/7
 */
@Data
public class MenuMasterNodeDto {

    /**
     * 菜单ID
     */
    private String menuId;
    /**
     * 父级菜单ID
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
     * 创建者
     */
    private String userName;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime insertTime;
    /**
     * 排序标识符
     */
    private long sort;
    /**
     * 子类节点
     */
    List<MenuMasterNodeDto> children = new ArrayList<>();
}
