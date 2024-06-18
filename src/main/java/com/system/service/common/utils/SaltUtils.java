package com.system.service.common.utils;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;

/**
 * 加密鹽工具類
 */
public class SaltUtils {

    /**
     * 生成加密鹽
     * @return
     */
    public static String getSaltKey(){
        return RandomStringUtils.randomAlphanumeric(20);
    }

    /**
     * 根據加密鹽生成用戶最終密碼
     * @param password 用戶輸入密碼MD5值
     * @param salt 加密鹽
     * @return 用戶最終密碼
     */
    public static String getUserPasswordBySalt(String password,String salt){
       return new Sha256Hash(password, salt).toHex();
    }

}
