package com.system.service.common.pojo.vo;

import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class BasicsVo {

    @NotNull(message = "页码不能为空！", groups = {BasicsPageVo.class})
    private long page;
    @NotNull(message = "每页长度不能为空！", groups = {BasicsPageVo.class})
    private long size;

    /**
     * 校验分组
     */
    public interface BasicsPageVo {

    }

}
