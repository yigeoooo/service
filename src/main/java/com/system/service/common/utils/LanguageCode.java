package com.system.service.common.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangq
 */
public enum LanguageCode {
    NONE("","",""),
    ENGLISH("EN", "en", ""),
    JAPANESE("JP", "ja", "JP"),
    S_CHINESE("CN", "zh", "CN"),
    T_CHINESE("TC", "zh", "TW");

    private final String languageTypeCode;
    private final String language;
    private final String country;

    private LanguageCode(String languageTypeCode, String language, String country) {
        this.languageTypeCode = languageTypeCode;
        this.language = language;
        this.country = country;
    }
    private static final Map<String, LanguageCode> CODE_MAP = new HashMap<>();

    static {
        for(LanguageCode code : values()) {
            CODE_MAP.put(code.getLanguageTypeCode(), code);
        }
    }

    public static LanguageCode getValueByCode(String code){
        return CODE_MAP.getOrDefault(code, LanguageCode.NONE);
    }

    public String getLanguageTypeCode() {
        return languageTypeCode;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }

}
