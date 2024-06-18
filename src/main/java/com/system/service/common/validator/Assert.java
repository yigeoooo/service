package com.system.service.common.validator;

import com.system.service.common.exception.BusinessException;
import com.system.service.common.utils.MessageCode;
import org.apache.commons.lang.StringUtils;

/**
 * 數據校驗
 *
 * @author Mark sunlightcs@gmail.com
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new BusinessException(MessageCode.CommonMessage.PARAM_ERROR);
        }
    }
}
