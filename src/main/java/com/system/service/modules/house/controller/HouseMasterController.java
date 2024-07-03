package com.system.service.modules.house.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("house-master")
public class HouseMasterController {

    @Autowired
    private HouseMasterService houseMasterService;


}
