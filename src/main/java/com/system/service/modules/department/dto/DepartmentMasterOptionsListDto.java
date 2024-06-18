package com.system.service.modules.department.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WangJianHui
 * @since date 2024/6/7
 */
@Data
public class DepartmentMasterOptionsListDto {

    List<DepartmentMasterOptionsDto> list = new ArrayList<>();

}
