

package com.system.service.modules.sys.vo;

import lombok.Data;

/**
 * 登錄表單
 *
 * @author Mark
 */
@Data
public class SysLoginVo {


    private String loginId;

    private String password;

    private String captcha;

    private String uuid;

}
