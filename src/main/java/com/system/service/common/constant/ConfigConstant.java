

package com.system.service.common.constant;

import org.springframework.stereotype.Component;

/**
 * 系統參數相關Key
 *
 * @author Mark
 */
@Component
public class ConfigConstant {

    /**
     * 文件上傳配置信息地址 FILE_SERVER_URL
     */
    private static String fileServerUrl;

    /**
     * web服務地址
     */
    private static String webServerUrl;

    /**
     * 文件上傳根目錄(盤符) FILE_DIR
     */
    private static String fileDir;

    /**
     * 文件上傳路徑
     */
    private static String filePath;

    /**
     * 文件磁盤圖片映射URL
     */
    private static String mapperUrl;

    /**
     * IOS 推送證書
     */
    private static String pushIosCertificate;

    /**
     *  IOS 老師推送證書
     */
    private static String pushiOSTeacherCerti;

    /**
     *  PAD 老師推送證書
     */
    private static String pushiOSTeacherCertiHd;

    /**
     * Andriod 推送證書
     */
    private static String pushAndriodCerti;

    /**
     * 手機推送證書路徑 證書.p12
     */
    private static String proveDir;

    /**
     * 域名或者Ip
     */
    private static String dns;

    /**
     * ios推送環境
     */
    private static String isDistribution;

    /**
     * ios證書密碼
     */
    private static String cerPassword;

    /**
     * iOS BundleId 學生端
     */
    private static String iosAppBundleId;
    /**
     * iOS BundleId 教師端
     */
    private static String iosAppBundleIdTeacher;

    public static String getFileServerUrl() {
        return fileServerUrl;
    }

//    @Value("${param.fileServerUrl}")
    public void setFileServerUrl(String fileServerUrl) {
        ConfigConstant.fileServerUrl = fileServerUrl;
    }

    public static String getWebServerUrl() {
        return webServerUrl;
    }

//    @Value("${param.webServerUrl}")
    public void setWebServerUrl(String webServerUrl) {
        ConfigConstant.webServerUrl = webServerUrl;
    }

    public static String getFileDir() {
        return fileDir;
    }

//    @Value("${param.fileDir}")
    public void setFileDir(String fileDir) {
        ConfigConstant.fileDir = fileDir;
    }

    public static String getFilePath() {
        return filePath;
    }

//    @Value("${param.filePath}")
    public void setFilePath(String filePath) {
        ConfigConstant.filePath = filePath;
    }

    public static String getMapperUrl() {
        return mapperUrl;
    }

//    @Value("${param.mapperUrl}")
    public void setMapperUrl(String mapperUrl) {
        ConfigConstant.mapperUrl = mapperUrl;
    }


    public static String getIosAppBundleId() {
        return iosAppBundleId;
    }

//    @Value("${param.iosAppBundleId}")
    public void setIosAppBundleId(String iosAppBundleId) {
        ConfigConstant.iosAppBundleId = iosAppBundleId;
    }

    public static String getIosAppBundleIdTeacher() {
        return iosAppBundleIdTeacher;
    }

//    @Value("${param.iosAppBundleIdTeacher}")
    public void setIosAppBundleIdTeacher(String iosAppBundleIdTeacher) {
        ConfigConstant.iosAppBundleIdTeacher = iosAppBundleIdTeacher;
    }

    public static String getCerPassword() {
        return "tli1956";
    }

    public static boolean getIsDistribution() {
        return Boolean.parseBoolean(isDistribution);
    }

//    @Value("${param.isDistribution}")
    public void setIsDistribution(String isDistribution) {
        ConfigConstant.isDistribution = isDistribution;
    }

    public static String getProveDir() {
        return proveDir;
    }

//    @Value("${param.proveDir}")
    public void setProveDir(String proveDir) {
        ConfigConstant.proveDir = proveDir;
    }

    public static String getDns() {
        return dns;
    }


    public static String getPushIosCertificate() {
        return pushIosCertificate;
    }

//    @Value("${param.pushIosCertificate}")
    public void setPushIosCertificate(String pushIosCertificate) {
        ConfigConstant.pushIosCertificate = pushIosCertificate;
    }

    public static String getPushiOSTeacherCerti() {
        return pushiOSTeacherCerti;
    }

//    @Value("${param.pushiOSTeacherCerti}")
    public void setPushiOSTeacherCerti(String pushiOSTeacherCerti) {
        ConfigConstant.pushiOSTeacherCerti = pushiOSTeacherCerti;
    }

    public static String getPushiOSTeacherCertiHd() {
        return pushiOSTeacherCertiHd;
    }

//    @Value("${param.pushiOSTeacherCertiHd}")
    public void setPushiOSTeacherCertiHd(String pushiOSTeacherCertiHd) {
        ConfigConstant.pushiOSTeacherCertiHd = pushiOSTeacherCertiHd;
    }

    public static String getPushAndriodCerti() {
        return pushAndriodCerti;
    }

//    @Value("${param.pushAndriodCerti}")
    public void setPushAndriodCerti(String pushAndriodCerti) {
        ConfigConstant.pushAndriodCerti = pushAndriodCerti;
    }
}
