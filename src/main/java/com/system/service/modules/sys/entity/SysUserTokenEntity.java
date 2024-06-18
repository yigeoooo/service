

package com.system.service.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 系統用戶Token
 *
 * @author Mark
 */
@Data
@TableName("sys_user_token")
public class SysUserTokenEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //用戶ID
    @TableId(type = IdType.INPUT)
    private String userId;
    //token
    private String token;

    /**
     * 1登陸Token 0臨時Token
     */
    private String type;
    //過期時間
    private Date expireTime;
    //更新時間
    private Date updateTime;

}
