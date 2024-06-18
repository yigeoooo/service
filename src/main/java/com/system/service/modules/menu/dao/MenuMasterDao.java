package com.system.service.modules.menu.dao;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.service.modules.menu.dto.MenuMasterNodeDto;
import com.system.service.modules.menu.entity.MenuMasterEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 菜单主档表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-06-07 12:35:49
 */
@Repository
@Mapper
public interface MenuMasterDao extends BaseMapper<MenuMasterEntity> {
    /**
     * 分页查询菜单
     * @param page 分页对象
     * @return 分页结果
     */
    Page<MenuMasterNodeDto> getPage(Page<MenuMasterEntity> page);

}
