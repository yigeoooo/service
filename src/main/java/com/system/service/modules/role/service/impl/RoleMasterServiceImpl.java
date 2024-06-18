package com.system.service.modules.role.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.service.common.constant.Constant;
import com.system.service.common.exception.BusinessException;
import com.system.service.common.utils.ShiroUtils;
import com.system.service.common.utils.StringUtils;
import com.system.service.modules.role.dto.RoleMasterOptionsDto;
import com.system.service.modules.role.dto.RoleMasterPageDto;
import com.system.service.modules.role.vo.RoleMasterPageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.system.service.modules.role.dao.RoleMasterDao;
import com.system.service.modules.role.entity.RoleMasterEntity;
import com.system.service.modules.role.service.RoleMasterService;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@Service("roleMasterService")
public class RoleMasterServiceImpl extends ServiceImpl<RoleMasterDao, RoleMasterEntity> implements RoleMasterService {

    @Autowired
    private RoleMasterDao roleMasterDao;

    @Override
    public Page<RoleMasterPageDto> getPage(RoleMasterPageVo vo) {
        //分页条件构造
        Page<RoleMasterEntity> page = new Page<>(vo.getPage(), vo.getSize());
        //条件构造器
        QueryWrapper<RoleMasterEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("rm.is_deleted", Constant.STR_ZERO);
        queryWrapper.orderByAsc("rm.sort");
        if (StringUtils.isNotBlank(vo.getRoleName())) {
            queryWrapper.like("rm.role_name", vo.getRoleName());
        }
        return roleMasterDao.getPage(page, queryWrapper);
    }

    @Override
    public void insert(RoleMasterEntity entity) {
        //实体类其余属性赋值
        entity.setInsertTime(LocalDateTime.now());
        entity.setInsertUserId(ShiroUtils.getUserId());
        entity.setUpdateTime(LocalDateTime.now());
        entity.setUpdateUserId(ShiroUtils.getUserId());
        entity.setIsDeleted(Constant.STR_ZERO);
        //插入
        if (roleMasterDao.insert(entity) != Constant.ONE) {
            throw new BusinessException("角色插入失败，请稍后重试！");
        }
    }

    @Override
    public List<RoleMasterOptionsDto> getOptions(String departmentId) {
        QueryWrapper<RoleMasterEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("sort");
        queryWrapper.eq("department_id", departmentId);
        List<RoleMasterEntity> roleMasterEntities = roleMasterDao.selectList(queryWrapper);
        return roleMasterEntities.stream().map(i -> {
            RoleMasterOptionsDto dto = new RoleMasterOptionsDto();
            dto.setRoleId(i.getRoleId());
            dto.setRoleName(i.getRoleName());
            return dto;
        }).collect(Collectors.toList());
    }
}
