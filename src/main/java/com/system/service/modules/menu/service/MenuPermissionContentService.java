package com.system.service.modules.menu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.system.service.modules.menu.dto.MenuContentNodeDto;
import com.system.service.modules.menu.dto.MenuPermissionContentVo;
import com.system.service.modules.menu.entity.MenuPermissionContentEntity;

import java.util.List;

/**
 * 菜单权限从表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-06-07 15:19:40
 */
public interface MenuPermissionContentService extends IService<MenuPermissionContentEntity> {

    /**
     * 菜单授权
     * @param vo 接参对象
     */
    void insert(MenuPermissionContentVo vo);

    /**
     * 查询用户菜单权限
     * @param userId 角色ID
     * @return 权限集合
     */
    List<MenuContentNodeDto> getMenuList(String userId);

}

