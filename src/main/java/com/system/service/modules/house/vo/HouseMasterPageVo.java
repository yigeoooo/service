package com.system.service.modules.house.vo;

import com.system.service.common.pojo.vo.BasicsVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author WangJianHui
 * @since date 2024/7/3
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class HouseMasterPageVo extends BasicsVo {
    /**
     * 房间名称
     */
    private String houseName;
    /**
     * 房间状态
     */
    private String state;

}
