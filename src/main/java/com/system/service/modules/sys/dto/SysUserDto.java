package com.system.service.modules.sys.dto;

import lombok.Data;

/**
 * @author yigeoooo
 * @since date 2024/2/10
 */
@Data
public class SysUserDto {

    private String userId;

    private String userName;

    private String roleName;

    private String telephone;

    private String initialPassword;

    private String email;

}
