

package com.system.service.modules.sys.vo;


import lombok.Data;

import java.io.Serializable;


/**
 * 新增、編輯用戶傳入參數
 */
@Data
public class SysUserSaveVo implements Serializable {


    private String userId;

    private String loginId;

    private String userName;

    private String telephone;
//    @NotBlank(message = "邮箱不能为空", groups = {AddGroup.class, UpdateGroup.class})
//    @Email(message = "邮箱格式不正确", groups = {AddGroup.class, UpdateGroup.class})
    private String email;

    private String password;

    private String updateUserId;

    private String insertUserId;

    /**
     * 初始密碼，規則：Array_拼接email前綴
     */
    private String initialPassword;

    /**
     * 上次更改帳號的日期 YYYY-MM-DD
     */
    private String lastChangePwdDate;
    /**
     * 角色ID
     */
    private String roleId;

}
