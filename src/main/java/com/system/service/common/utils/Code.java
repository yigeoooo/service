package com.system.service.common.utils;

public interface Code {
    Integer COMM_BASE = 0;

    Integer getCode();

    String getName();

    String getMessage();

    static Code newInstance(final Integer code, final String name, final String message) {
        return new Code() {
            @Override
            public Integer getCode() {
                return code;
            }

            @Override
            public String getMessage() {
                return message;
            }

            @Override
            public String getName() {
                return name;
            }
        };
    }
}
