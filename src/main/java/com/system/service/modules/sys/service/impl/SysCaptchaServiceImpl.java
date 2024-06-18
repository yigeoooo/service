

package com.system.service.modules.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.code.kaptcha.Producer;
import com.system.service.common.exception.BusinessException;
import com.system.service.common.utils.DateUtils;
import com.system.service.common.utils.MessageCode;
import com.system.service.modules.sys.dao.SysCaptchaDao;
import com.system.service.modules.sys.entity.SysCaptchaEntity;
import com.system.service.modules.sys.service.SysCaptchaService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;
import java.util.Date;

/**
 * 驗證碼
 *
 * @author Mark
 */
@Service("sysCaptchaService")
public class SysCaptchaServiceImpl extends ServiceImpl<SysCaptchaDao, SysCaptchaEntity> implements SysCaptchaService {

    @Autowired
    private Producer producer;

    @Override
    public BufferedImage getCaptcha(String uuid) {
        if (StringUtils.isBlank(uuid)) {
            throw new BusinessException(MessageCode.OtherMessage.UUID_PARAM_ERROR);
        }
        //生成文字驗證碼
        String code = producer.createText();

        SysCaptchaEntity captchaEntity = new SysCaptchaEntity();
        captchaEntity.setUuid(uuid);
        captchaEntity.setCode(code);
        //5分鐘后過期
        captchaEntity.setExpireTime(DateUtils.addDateMinutes(new Date(), 5));
        this.save(captchaEntity);

        return producer.createImage(code);
    }

    /**
     * 驗證碼校驗
     * @param uuid  uuid
     * @param code  驗證碼
     * @return true：成功  false：失敗
     */
    @Override
    public boolean validate(String uuid, String code) {
        SysCaptchaEntity captchaEntity = this.getOne(new QueryWrapper<SysCaptchaEntity>().eq("uuid", uuid));
        if (captchaEntity == null) {
            return false;
        }
        //刪除驗證碼
        this.removeById(uuid);

        if (captchaEntity.getCode().equalsIgnoreCase(code) && captchaEntity.getExpireTime().getTime() >= System.currentTimeMillis()) {
            return true;
        }
        return false;
    }
}
