package com.system.service.modules.menu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.service.common.constant.Constant;
import com.system.service.common.exception.BusinessException;
import com.system.service.common.pojo.vo.BasicsVo;
import com.system.service.common.utils.ShiroUtils;
import com.system.service.modules.menu.dto.MenuMasterNodeDto;
import com.system.service.modules.menu.dto.MenuMasterParentOptionsDto;
import com.system.service.modules.menu.vo.MenuMasterAddVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.system.service.modules.menu.dao.MenuMasterDao;
import com.system.service.modules.menu.entity.MenuMasterEntity;
import com.system.service.modules.menu.service.MenuMasterService;

import java.time.LocalDateTime;
import java.util.List;


@Service("menuMasterService")
public class MenuMasterServiceImpl extends ServiceImpl<MenuMasterDao, MenuMasterEntity> implements MenuMasterService {

    @Autowired
    private MenuMasterDao menuMasterDao;

    @Override
    public Page<MenuMasterNodeDto> getTreeList(BasicsVo vo) {
        Page<MenuMasterEntity> page = new Page<>(vo.getPage(), vo.getSize());
        return menuMasterDao.getPage(page);
    }

    @Override
    public List<MenuMasterParentOptionsDto> getParentMenuOptions() {
        return menuMasterDao.getParentMenuOptions();
    }

    @Override
    public void insert(MenuMasterAddVo vo) {
        //实体转换
        MenuMasterEntity entity = new MenuMasterEntity();
        entity.setParentMenuId(vo.getParentMenuId());
        entity.setMenuName(vo.getMenuName());
        entity.setRouter(vo.getRouter());
        entity.setInsertTime(LocalDateTime.now());
        entity.setInsertUserId(ShiroUtils.getUserId());
        entity.setUpdateTime(LocalDateTime.now());
        entity.setUpdateUserId(ShiroUtils.getUserId());
        entity.setSort(vo.getSort());
        entity.setIsDeleted(Constant.STR_ZERO);
        //插入
        if ((menuMasterDao.insert(entity)) != Constant.ONE) {
            throw new BusinessException("插入失败！");
        }
    }
}
