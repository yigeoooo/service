package com.system.service.modules.department.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.service.common.pojo.vo.BasicsVo;
import com.system.service.common.utils.ResultInfo;
import com.system.service.modules.department.dto.DepartmentMasterOptionsListDto;
import com.system.service.modules.department.dto.DepartmentMasterPageDto;
import com.system.service.modules.department.entity.DepartmentMasterEntity;
import com.system.service.modules.department.vo.DepartmentMasterPageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.system.service.modules.department.service.DepartmentMasterService;



/**
 * 部门主档表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-06-06 23:01:47
 */
@RestController
@RequestMapping("/department-master")
public class DepartmentMasterController {

    @Autowired
    private DepartmentMasterService departmentMasterService;

    /**
     * 新增部门
     * @param entity 实体类
     * @return 统一返回值
     */
    @PostMapping("/add")
    public ResultInfo<String> insert(@RequestBody @Validated(DepartmentMasterEntity.Save.class)
                                     DepartmentMasterEntity entity) {
        departmentMasterService.insert(entity);
        return ResultInfo.build();
    }

    /**
     * 分页查询部门信息
     * @param vo 接参对象
     * @return 统一返回值
     */
    @GetMapping("/page")
    public ResultInfo<Page<DepartmentMasterPageDto>> getPage(@Validated(BasicsVo.BasicsPageVo.class)
                                                                 DepartmentMasterPageVo vo) {
        return ResultInfo.build(departmentMasterService.getPage(vo));
    }

    /**
     * 逻辑删除部门信息
     * @param departmentId 部门id
     * @return 统一返回值
     */
    @DeleteMapping("/delete/{departmentId}")
    public ResultInfo<String> remove(@PathVariable("departmentId") String departmentId) {
        departmentMasterService.removeById(departmentId);
        return ResultInfo.build();
    }

    /**
     * 获取部门下拉列表
     * @return 统一返回值
     */
    @GetMapping("/options")
    public ResultInfo<DepartmentMasterOptionsListDto> getOptions() {
        return ResultInfo.build(departmentMasterService.getOptions());
    }

}
