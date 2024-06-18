package com.system.service.modules.menu.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.system.service.modules.menu.dto.MenuContentNodeDto;
import com.system.service.modules.menu.entity.MenuPermissionContentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 菜单权限从表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-06-07 15:19:40
 */
@Repository
@Mapper
public interface MenuPermissionContentDao extends BaseMapper<MenuPermissionContentEntity> {

    List<MenuContentNodeDto> getMenuList(@Param("ew")QueryWrapper<MenuPermissionContentEntity> queryWrapper);

}
