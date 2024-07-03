package com.system.service.modules.menu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.service.common.pojo.vo.BasicsVo;
import com.system.service.modules.menu.dto.MenuMasterNodeDto;
import com.system.service.modules.menu.dto.MenuMasterParentOptionsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.system.service.modules.menu.dao.MenuMasterDao;
import com.system.service.modules.menu.entity.MenuMasterEntity;
import com.system.service.modules.menu.service.MenuMasterService;

import java.util.Collections;
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
}
