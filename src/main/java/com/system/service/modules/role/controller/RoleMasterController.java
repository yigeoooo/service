package com.system.service.modules.role.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.service.common.utils.ResultInfo;
import com.system.service.modules.role.dto.RoleMasterOptionsDto;
import com.system.service.modules.role.dto.RoleMasterPageDto;
import com.system.service.modules.role.entity.RoleMasterEntity;
import com.system.service.modules.role.vo.RoleMasterEditVo;
import com.system.service.modules.role.vo.RoleMasterPageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.system.service.modules.role.service.RoleMasterService;
import javax.validation.constraints.NotBlank;
import java.util.List;


/**
 * 角色主档表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-06-06 12:20:33
 */
@RestController
@RequestMapping("/role-master")
public class RoleMasterController {

    @Autowired
    private RoleMasterService roleMasterService;

    /**
     * 分页查询角色信息
     * @param vo 接参对象vo
     * @return 统一返回值
     */
    @GetMapping("/page")
    public ResultInfo<Page<RoleMasterPageDto>> getPage(RoleMasterPageVo vo) {
        return ResultInfo.build(roleMasterService.getPage(vo));
    }

    /**
     * 插入角色
     * @param entity 实体类
     * @return 统一返回值
     */
    @PostMapping("/add")
    public ResultInfo<String> insert(@RequestBody @Validated(RoleMasterEntity.Save.class)
                                         RoleMasterEntity entity) {
        roleMasterService.insert(entity);
        return ResultInfo.build();
    }

    /**
     * 逻辑删除角色
     * @param roleId 角色ID
     * @return 统一返回值
     */
    @DeleteMapping("/delete/{roleId}")
    public ResultInfo<String> remove(@PathVariable("roleId") @NotBlank String roleId) {
        roleMasterService.removeById(roleId);
        return ResultInfo.build();
    }

    /**
     * 根据部门获取角色下拉框
     * @param departmentId 部门ID
     * @return 统一返回值
     */
    @GetMapping("/option/{departmentId}")
    public ResultInfo<List<RoleMasterOptionsDto>> getOption(@PathVariable("departmentId") String departmentId) {
        return ResultInfo.build(roleMasterService.getOptions(departmentId));
    }

    /**'
     * 修改角色信息
     * @param vo 接参对象
     * @return 统一返回值
     */
    @PostMapping("/edit")
    public ResultInfo<String> editRoleInfo(@RequestBody RoleMasterEditVo vo) {
        roleMasterService.editRoleInfo(vo);
        return ResultInfo.build();
    }

}
