package com.system.service.common.validator;



import com.system.service.common.exception.BusinessException;
import com.system.service.common.utils.MessageCode;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * hibernate-validator校驗工具類
 * <p>
 * 參考文檔：http://docs.jboss.org/hibernate/validator/5.4/reference/en-US/html_single/
 *
 * @author Mark sunlightcs@gmail.com
 */
public class ValidatorUtils {
    private static Validator validator;

    static {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    /**
     * 校驗對象
     *
     * @param object 待校驗對象
     * @param groups 待檢驗的組
     * @throws BusinessException 校驗不通過，則報BusinessException異常
     */
    public static void validateEntity(Object object, Class<?>... groups)
            throws BusinessException {
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(object, groups);
        if (!constraintViolations.isEmpty()) {
            StringBuilder msg = new StringBuilder();
            for (ConstraintViolation<Object> constraint : constraintViolations) {
                msg.append(constraint.getMessage()).append("<br>");
            }
            throw new BusinessException(MessageCode.CommonMessage.DYNAMIC_ERROR, msg);
        }
    }
}
