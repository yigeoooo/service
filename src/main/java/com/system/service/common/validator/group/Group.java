package com.system.service.common.validator.group;

import javax.validation.GroupSequence;

/**
 * 定義校驗順序，如果AddGroup組失敗，則UpdateGroup組不會再校驗
 *
 * @author Mark sunlightcs@gmail.com
 */
@GroupSequence({AddGroup.class, UpdateGroup.class})
public interface Group {

}
