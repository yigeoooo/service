package com.system.service.modules.house.controller;

import com.system.service.common.utils.ResultInfo;
import com.system.service.modules.house.vo.HouseMasterAddVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
