

package com.system.service.modules.sys.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.system.service.modules.sys.entity.SysCaptchaEntity;

import java.awt.image.BufferedImage;

/**
 * 驗證碼
 *
 * @author Mark
 */
public interface SysCaptchaService extends IService<SysCaptchaEntity> {

    /**
     * 獲取圖片驗證
     */
    BufferedImage getCaptcha(String uuid);

    /**
     * 驗證碼校驗
     * @param uuid  uuid
     * @param code  驗證碼
     * @return true：成功  false：失敗
     */
    boolean validate(String uuid, String code);
}
