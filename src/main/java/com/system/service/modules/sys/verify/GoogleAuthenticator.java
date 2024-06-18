package com.system.service.modules.sys.verify;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * 谷歌二次驗證工具類
 *
 * @Date: 2020-05-28 14:04
 * @Version: 1.0
 */
@Slf4j
public class GoogleAuthenticator {


    /**
     * 生成的key長度( Generate secret key length)
     */
    public static final int SECRET_SIZE = 10;
    /**
     * 產生密鑰的種子
     */
    public static final String SEED = "N%U%cls36e7Ab!@#asd34nB4%9%Nmo2ai1IC9@54n06aY";
    /**
     * 安全哈希算法（Secure Hash Algorithm）
     */
    public static final String RANDOM_NUMBER_ALGORITHM = "SHA1PRNG";
    /**
     * 可偏移的時間 3*30秒的驗證時間
     */
    private static final Integer WINDOW_SIZE = 3;


    /**
     * 生成密鑰 用於綁定用戶和用戶端
     *
     * @param
     * @author: LingHu RongJun
     * @return: java.lang.String
     * @Exception
     */
    public static String generateSecretKey() {
        SecureRandom sr;
        try {
            sr = SecureRandom.getInstance(RANDOM_NUMBER_ALGORITHM);
            sr.setSeed(Base64.decodeBase64(SEED));
            byte[] buffer = sr.generateSeed(SECRET_SIZE);
            Base32 codec = new Base32();
            byte[] bEncodedKey = codec.encode(buffer);
            return new String(bEncodedKey);
        } catch (NoSuchAlgorithmException e) {
            log.error("生成Google密鑰失敗！", e);
        }
        return null;
    }


    /**
     * 根據user和secret生成二維碼的密鑰
     *
     * @param user
     * @param host
     * @param secret
     * @author: LingHu RongJun
     * @return: java.lang.String
     * @Exception
     */
    public static String getQRBarcodeURL(String user, String host, String secret) {
        String format = "http://www.google.com/chart?chs=200x200&chld=M%%7C0&cht=qr&chl=otpauth://totp/%s@%s?secret=%s";
        return String.format(format, user, host, secret);
    }

    /**
     * 這個format不可以修改，身分驗證器無法識別二維碼
     *
     * @param user
     * @param secret
     * @author: LingHu RongJun
     * @return: java.lang.String
     * @Exception
     */
    public static String getQRBarcode(String user, String secret) {
        String format = "otpauth://totp/%s?secret=%s";
        return String.format(format, user, secret);
    }

    private static int verifyCode(byte[] key, long t) throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] data = new byte[8];
        long value = t;
        for (int i = 8; i-- > 0; value >>>= 8) {
            data[i] = (byte) value;
        }
        SecretKeySpec signKey = new SecretKeySpec(key, "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(signKey);
        byte[] hash = mac.doFinal(data);
        int offset = hash[20 - 1] & 0xF;
        // We're using a long because Java hasn't got unsigned int.
        long truncatedHash = 0;
        for (int i = 0; i < 4; ++i) {
            truncatedHash <<= 8;
            // We are dealing with signed bytes:
            // we just keep the first byte.
            truncatedHash |= (hash[offset + i] & 0xFF);
        }
        truncatedHash &= 0x7FFFFFFF;
        truncatedHash %= 1000000;
        return (int) truncatedHash;
    }

    /**
     * 驗證碼校驗
     *
     * @param secret   密鑰
     * @param code     驗證碼
     * @param timeMsec 當前時間戳
     * @author: LingHu RongJun
     * @return: boolean
     * @Exception
     */
    public boolean checkCode(String secret, String code, long timeMsec) {
        Base32 codec = new Base32();
        byte[] decodedKey = codec.decode(secret);
        // convert unix msec time into a 30 second "window"
        // this is per the TOTP spec (see the RFC for details)
        long t = (timeMsec / 1000L) / 30L;
        // Window is used to check codes generated in the near past.
        // You can use this value to tune how far you're willing to go.
        for (int i = -WINDOW_SIZE; i <= WINDOW_SIZE; ++i) {
            long hash;
            try {
                hash = verifyCode(decodedKey, t + i);
            } catch (Exception e) {
                log.error("獲取比對的實時驗證碼失敗！");
                throw new RuntimeException(e.getMessage());
            }

            if (code.equals(addZero(hash))) {
                return true;
            }
        }
        // The validation code is invalid.
        return false;
    }

    /**
     * 驗證碼補零
     *
     * @param code
     * @author: LingHu RongJun
     * @return: java.lang.String
     * @Exception
     */
    private String addZero(long code) {
        return String.format("%06d", code);
    }
}
