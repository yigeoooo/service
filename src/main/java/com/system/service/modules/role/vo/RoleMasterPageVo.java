package com.system.service.modules.role.vo;

import com.system.service.common.pojo.vo.BasicsVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 分页查询角色信息vo
 * @author WangJinaHui
 * @since date 2024/6/6
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RoleMasterPageVo extends BasicsVo {
    /**
     * 角色名称
     */
    private String roleName;

}
