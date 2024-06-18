package com.system.service.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * tokenAp通用表
 *
 * @author shanyue
 * @email
 * @date 2023-02-28 18:07:06
 */
@Data
@TableName("server_token")
public class ServerTokenEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * token
     */
    private String token;
    /**
     * 服务类型 10管理後套/20客戶後臺/30代理后台
     */
    @TableId(type = IdType.ASSIGN_UUID)
    private String serverType;
    /**
     * 用戶id
     */
    @TableId(type = IdType.ASSIGN_UUID)
    private String userId;

}
