package com.system.service.modules.department.vo;

import com.system.service.common.pojo.vo.BasicsVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author WangJianHui
 * @since date 2024/6/7
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentMasterPageVo extends BasicsVo {

    private String departmentName;

}
