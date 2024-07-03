package com.system.service.modules.house.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.system.service.common.utils.ResultInfo;
import com.system.service.modules.house.dto.HouseMasterPageDto;
import com.system.service.modules.house.vo.HouseMasterAddVo;
import com.system.service.modules.house.vo.HouseMasterPageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.system.service.modules.house.service.HouseMasterService;



/**
 * 房间主表
 *
 * @author WangJianHui
 * @email 2844623709@qq.com
 * @date 2024-07-03 19:10:19
 */
@RestController
@RequestMapping("/house-master")
public class HouseMasterController {

    @Autowired
    private HouseMasterService houseMasterService;

    /**
     * 创建房间信息
     * @param vo 接参对象
     * @return 统一返回值
     */
    @PostMapping("/insert")
    public ResultInfo<String> insert(@RequestBody HouseMasterAddVo vo) {
        houseMasterService.insert(vo);
        return ResultInfo.build();
    }

    /**
     * 分页查询房间信息
     * @param vo 接参对象
     * @return 统一返回值
     */
    @GetMapping("/page")
    public ResultInfo<Page<HouseMasterPageDto>> selectPage(HouseMasterPageVo vo) {
        return ResultInfo.build(houseMasterService.selectPage(vo));
    }

}
