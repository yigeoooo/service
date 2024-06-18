package com.system.service.modules.sys.vo;

import com.system.service.common.pojo.vo.BasicsVo;
import lombok.Data;

/**
 * @author yigeoooo
 * @since date 2024/2/10
 */
@Data
public class SysUserVo extends BasicsVo {

    private String roleName;

    private String userName;

    private String departmentName;

}
