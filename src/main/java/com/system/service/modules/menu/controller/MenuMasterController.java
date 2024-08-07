package com.system.service.modules.menu.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.service.common.pojo.vo.BasicsVo;
import com.system.service.common.utils.ResultInfo;
import com.system.service.modules.menu.dto.MenuMasterNodeDto;
import com.system.service.modules.menu.dto.MenuMasterParentOptionsDto;
import com.system.service.modules.menu.vo.MenuMasterAddVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.system.service.modules.menu.service.MenuMasterService;

import java.util.List;


/**
 * 菜单主档表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-06-07 12:35:49
 */
@RestController
@RequestMapping("/menu-master")
public class MenuMasterController {

    @Autowired
    private MenuMasterService menuMasterService;

    /**
     * 分页查询菜单
     * @param vo 接参对象
     * @return 统一返回值
     */
    @GetMapping("/list")
    public ResultInfo<Page<MenuMasterNodeDto>> getMenuList(BasicsVo vo) {
        return ResultInfo.build(menuMasterService.getTreeList(vo));
    }

    /**
     * 查询父级菜单列表
     * @return 统一返回值
     */
    @GetMapping("/parentMenuList")
    public ResultInfo<List<MenuMasterParentOptionsDto>> getParentMenuList() {
        return ResultInfo.build(menuMasterService.getParentMenuOptions());
    }

    /**
     * 新增菜单信息
     * @param vo 接参对象
     * @return 统一返回值
     */
    @PostMapping("/add")
    public ResultInfo<String> add(@RequestBody MenuMasterAddVo vo) {
        menuMasterService.insert(vo);
        return ResultInfo.build();
    }

}
