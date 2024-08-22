package com.system.service.modules.department.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.service.common.constant.Constant;
import com.system.service.common.exception.BusinessException;
import com.system.service.common.utils.ShiroUtils;
import com.system.service.common.utils.StringUtils;
import com.system.service.modules.department.dto.DepartmentMasterOptionsDto;
import com.system.service.modules.department.dto.DepartmentMasterOptionsListDto;
import com.system.service.modules.department.dto.DepartmentMasterPageDto;
import com.system.service.modules.department.vo.DepartmentMasterEditVo;
import com.system.service.modules.department.vo.DepartmentMasterPageVo;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.system.service.modules.department.dao.DepartmentMasterDao;
import com.system.service.modules.department.entity.DepartmentMasterEntity;
import com.system.service.modules.department.service.DepartmentMasterService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;


@Service("departmentMasterService")
public class DepartmentMasterServiceImpl extends ServiceImpl<DepartmentMasterDao, DepartmentMasterEntity> implements DepartmentMasterService {

    @Autowired
    private DepartmentMasterDao departmentMasterDao;

    @Override
    public void insert(DepartmentMasterEntity entity) {
        //实体类其他赋值
        entity.setInsertUserId(ShiroUtils.getUserId());
        entity.setInsertTime(LocalDateTime.now());
        entity.setUpdateUserId(ShiroUtils.getUserId());
        entity.setUpdateTime(LocalDateTime.now());
        entity.setIsDeleted(Constant.STR_ZERO);
        //插入
        if ((departmentMasterDao.insert(entity)) != Constant.ONE) {
            throw new BusinessException("新增科室失败！");
        }
    }

    @Override
    public Page<DepartmentMasterPageDto> getPage(DepartmentMasterPageVo vo) {
        //分页设置
        Page<DepartmentMasterEntity> page = new Page<>(vo.getPage(), vo.getSize());
        //基础条件构造
        QueryWrapper<DepartmentMasterEntity> query = new QueryWrapper<>();
        query.eq("dm.is_deleted", Constant.STR_ZERO);
        query.orderByAsc("dm.sort");
        //条件拼接
        if (StringUtils.isNotBlank(vo.getDepartmentName())) {
            query.like("dm.department_name", vo.getDepartmentName());
        }
        //查询并返回
        return departmentMasterDao.getPage(page, query);
    }

    @Override
    public DepartmentMasterOptionsListDto getOptions() {
        DepartmentMasterOptionsListDto dto = new DepartmentMasterOptionsListDto();
        List<DepartmentMasterEntity> departmentMasterEntities = departmentMasterDao.selectList(null);
        List<DepartmentMasterOptionsDto> collect = departmentMasterEntities
                .stream()
                .map(i -> {
                    DepartmentMasterOptionsDto res = new DepartmentMasterOptionsDto();
                    res.setDepartmentId(i.getDepartmentId());
                    res.setDepartmentName(i.getDepartmentName());
                    return res;
                })
                .collect(Collectors.toList());
        dto.setList(collect);
        return dto;
    }

    @Override
    public void editDepartmentMaster(DepartmentMasterEditVo vo) {
        //vo转entity
        DepartmentMasterEntity entity = new DepartmentMasterEntity();
        if (StringUtils.isNotBlank(vo.getDepartmentName())) {
            entity.setDepartmentName(vo.getDepartmentName());
        }
        if (vo.getSort() != null) {
            entity.setSort(vo.getSort());
        }
        entity.setUpdateTime(LocalDateTime.now());
        entity.setDepartmentId(vo.getDepartmentId());
        //修改
        if ((departmentMasterDao.updateById(entity) != Constant.ONE)) {
            throw new BusinessException("修改失败！");
        }
    }
}
