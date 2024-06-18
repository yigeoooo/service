package com.system.service.modules.sys.dto;


import lombok.Data;

@Data
public class TokenDto {

    private String token;

    private String expire;

    private String userName;

    private String userId;

    private Boolean editPassword = Boolean.FALSE;
}
