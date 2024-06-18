

package com.system.service.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.system.service.common.validator.group.AddGroup;
import com.system.service.common.validator.group.UpdateGroup;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * 系統用戶
 *
 * @author Mark
 */
@Data
@TableName("sys_user")
public class SysUserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用戶ID
     */
    @TableId(value = "user_id" , type = IdType.INPUT)
    private String userId;

    /**
     * 登錄ID
     */
    private String loginId;

    /**
     * 用戶名
     */
    @NotBlank(message = "用戶名不能爲空", groups = {AddGroup.class, UpdateGroup.class})
    private String userName;

    /**
     * 聯係電話
     */
    private String telephone;

    /**
     * 谷歌密碼
     */
    private String googleKey;
    /**
     * 角色id
     */
    private String roleId;
    /**
     * 部门ID
     */
    private String departmentId;
    /**
     * 郵箱
     */
    @NotBlank(message = "郵箱不能爲空", groups = {AddGroup.class, UpdateGroup.class})
    @Email(message = "郵箱格式不正確", groups = {AddGroup.class, UpdateGroup.class})
    private String email;

    /**
     * 密碼
     */
    @NotBlank(message = "密碼不能爲空", groups = AddGroup.class)
    private String password;

    /**
     * 邏輯刪除
     */
    @TableLogic
    private String is_deleted;

    /**
     * 更新者
     */
    private String updateUserId;

    /**
     * 更新時間
     */
    private Date updateTime;

    /**
     * 創建者
     */
    private String insertUserId;

    /**
     * 初始密碼，規則：titan拼接email前綴
     */
    private String initialPassword;

    /**
     * 創建時間
     */
    private Date insertTime;

//    /**
//     * 谷歌密碼
//     */
//    private String googleKey;


    /**
     * 加密鹽
     */
    private String salt;


}
