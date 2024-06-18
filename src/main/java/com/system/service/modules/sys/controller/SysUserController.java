package com.system.service.modules.sys.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.service.common.exception.BusinessException;
import com.system.service.common.utils.MessageCode;
import com.system.service.common.utils.ResultInfo;
import com.system.service.common.validator.ValidatorUtils;
import com.system.service.common.validator.group.AddGroup;
import com.system.service.modules.sys.dto.SysUserDto;
import com.system.service.modules.sys.dto.SysUserPageDto;
import com.system.service.modules.sys.service.SysUserService;
import com.system.service.modules.sys.vo.SysUserSaveVo;
import com.system.service.modules.sys.vo.SysUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.system.service.common.utils.ShiroUtils.getLoginId;

/**
 * @author yigeoooo
 * @since date 2024/1/27
 */
@RestController
@RequestMapping("/system/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 分页条件查询系统用户
     * @param vo 接参对象
     * @return 统一返回值
     */
    @PostMapping("/page")
    public ResultInfo<Page<SysUserDto>> getPage(@RequestBody SysUserVo vo) {
        return ResultInfo.build(sysUserService.getPage(vo));
    }

    /**
     * 分页查询账户信息
     * @param vo 接参对象
     * @return 统一返回值
     */
    @GetMapping("/page/page")
    public ResultInfo<Page<SysUserPageDto>> getUserPage(SysUserVo vo) {
        return ResultInfo.build(sysUserService.getUserPage(vo));
    }

    /**
     * 用戶管理-保存用戶
     */
    @PostMapping("/save")
    public ResultInfo<String> save(@RequestBody SysUserSaveVo user) {
//        ValidatorUtils.validateEntity(user, AddGroup.class);
//        user.setInsertUserId(getLoginId());
        boolean result = sysUserService.saveUser(user);
        if (result) {
            return ResultInfo.build();
        } else {
            throw new BusinessException(MessageCode.CommonMessage.PARAM_ERROR);
        }

    }

}
