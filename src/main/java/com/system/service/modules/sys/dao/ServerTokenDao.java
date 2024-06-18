package com.system.service.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.system.service.modules.sys.entity.ServerTokenEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * tokenAp通用表
 *
 * @author shanyue
 * @email
 * @date 2023-02-28 18:07:06
 */
@Repository
@Mapper
public interface ServerTokenDao extends BaseMapper<ServerTokenEntity> {

}
