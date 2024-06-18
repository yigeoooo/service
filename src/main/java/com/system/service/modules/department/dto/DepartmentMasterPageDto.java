package com.system.service.modules.department.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author WangJianHui
 * @since date 2024/6/7
 */
@Data
public class DepartmentMasterPageDto {
    /**
     * 科室ID
     */
    private String departmentId;
    /**
     * 科室名称
     */
    private String departmentName;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime insertTime;
    /**
     * 创建人
     */
    private String userName;
    /**
     * 排序标识符
     */
    private String sort;

}
