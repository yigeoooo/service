

package com.system.service.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 系統驗證碼
 *
 * @author Mark
 */
@Data
@TableName("sys_captcha")
public class SysCaptchaEntity {
    @TableId(type = IdType.INPUT)
    private String uuid;
    /**
     * 驗證碼
     */
    private String code;
    /**
     * 過期時間
     */
    private Date expireTime;

}
