package com.system.service.modules.menu.service;

import cn.hutool.core.lang.tree.Tree;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.system.service.common.pojo.vo.BasicsVo;
import com.system.service.modules.menu.dto.MenuMasterNodeDto;
import com.system.service.modules.menu.dto.MenuMasterParentOptionsDto;
import com.system.service.modules.menu.entity.MenuMasterEntity;
import com.system.service.modules.menu.vo.MenuMasterAddVo;

import java.util.List;

/**
 * 菜单主档表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-06-07 12:35:49
 */
public interface MenuMasterService extends IService<MenuMasterEntity> {

    /**
     * 获取菜单
     * @return 树形结构
     */
    Page<MenuMasterNodeDto> getTreeList(BasicsVo vo);
    /**
     * 查询父级菜单列表
     * @return 父类菜单集合
     */
    List<MenuMasterParentOptionsDto> getParentMenuOptions();
    /**
     * 新增菜单信息
     * @param vo 接参对象
     */
    void insert(MenuMasterAddVo vo);
}

