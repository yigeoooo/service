

package com.system.service.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.system.service.modules.sys.entity.SysCaptchaEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 *
 * @author Mark
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
