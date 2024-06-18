package com.system.service.modules.menu.controller;

import com.system.service.common.utils.ResultInfo;
import com.system.service.modules.menu.dto.MenuContentNodeDto;
import com.system.service.modules.menu.dto.MenuPermissionContentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.system.service.modules.menu.service.MenuPermissionContentService;

import javax.validation.constraints.NotBlank;
import java.util.List;


/**
 * 菜单权限从表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-06-07 15:19:40
 */
@RestController
@RequestMapping("/menu-permission-content")
public class MenuPermissionContentController {

    @Autowired
    private MenuPermissionContentService menuPermissionContentService;

    /**
     * 菜单授权
     * @param vo 接参对象
     * @return 统一返回值
     */
    @PostMapping("/permission")
    public ResultInfo<String> insert(@RequestBody MenuPermissionContentVo vo) {
        menuPermissionContentService.insert(vo);
        return ResultInfo.build();
    }

    /**
     * 查询用户菜单权限
     * @param userI 用户ID
     * @return 统一返回值
     */
    @GetMapping("/start/permission/{userId}")
    public ResultInfo<List<MenuContentNodeDto>> getMenuList(@PathVariable("userId") @NotBlank String userI) {
        return ResultInfo.build(menuPermissionContentService.getMenuList(userI));
    }

}
