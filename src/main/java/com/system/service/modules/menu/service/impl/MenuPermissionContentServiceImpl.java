package com.system.service.modules.menu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.system.service.common.exception.BusinessException;
import com.system.service.modules.menu.dto.MenuContentNodeDto;
import com.system.service.modules.menu.dto.MenuPermissionContentVo;
import com.system.service.modules.sys.dao.SysUserDao;
import com.system.service.modules.sys.entity.SysUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.system.service.modules.menu.dao.MenuPermissionContentDao;
import com.system.service.modules.menu.entity.MenuPermissionContentEntity;
import com.system.service.modules.menu.service.MenuPermissionContentService;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service("menuPermissionContentService")
public class MenuPermissionContentServiceImpl extends ServiceImpl<MenuPermissionContentDao, MenuPermissionContentEntity> implements MenuPermissionContentService {

    @Autowired
    private MenuPermissionContentDao menuPermissionContentDao;
    @Autowired
    private SysUserDao sysUserDao;

    @Transactional
    @Override
    public void insert(MenuPermissionContentVo vo) {
        //插入权限前先删除菜单绑定的角色权限
        String menuId = vo.getMenuId();
        QueryWrapper<MenuPermissionContentEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("menu_id", menuId);
        Integer count = menuPermissionContentDao.selectCount(queryWrapper);
        if (count != 0) {
            menuPermissionContentDao.delete(queryWrapper);
        }
        List<MenuPermissionContentEntity> list = new ArrayList<>();
        List<String> roleList = vo.getRoleList();
        for (String roleId : roleList) {
            MenuPermissionContentEntity entity = new MenuPermissionContentEntity();
            entity.setRoleId(roleId);
            entity.setDepartmentId(vo.getDepartmentId());
            entity.setMenuId(menuId);
            list.add(entity);
        }
        //批量插入
        if (!(this.saveBatch(list))) {
            throw new BusinessException("菜单授权失败！");
        }
    }

    @Override
    public List<MenuContentNodeDto> getMenuList(String userId) {
        //查询该用户的角色和部门
        SysUserEntity entity = sysUserDao.selectById(userId);
        QueryWrapper<MenuPermissionContentEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("mpc.role_id", entity.getRoleId());
        queryWrapper.eq("mpc.department_id", entity.getDepartmentId());
        queryWrapper.eq("mm.parent_menu_id", "0");
        queryWrapper.orderByAsc("mm.sort");
        return menuPermissionContentDao.getMenuList(queryWrapper);
    }
}
