

package com.system.service.common.constant;

/**
 * 常量
 *
 * @author Mark
 */
public class Constant {
    /**
     * 超級管理員登陸ID
     */
    public static final String SUPER_ADMIN = "f26c49d522c44a2d9f133390a0b8469b";
    /**
     * 最高部門ID
     */
    public static final String SUPER_DEPT = "299be46a02964a5a90eb2e920f4a6a69";

    /**
     * 文件獲取路徑
     */
    public static final String DOWNLOAD_FOLDER = ConfigConstant.getFileServerUrl() + "tli-crm/image/";


    public static final String SITE = "20";

    /**
     * 數據權限過濾
     */
    public static final String SQL_FILTER = "sql_filter";

    /**
     * 企業ID
     */
    public static final String ENTERPRISE_ID = "0000-0000-0000-0000";
    /**
     * 當前頁碼
     */
    public static final String PAGE = "page";
    /**
     * 每頁顯示記錄數
     */
    public static final String LIMIT = "limit";
    /**
     * 排序字段
     */
    public static final String ORDER_FIELD = "sidx";
    /**
     * 排序方式
     */
    public static final String ORDER = "order";
    /**
     * 升序
     */
    public static final String ASC = "asc";
    /**
     * 主要語言id
     */
    public static final String PRIME_LANGUAGEID = "1e4b372f533b441aa76e896d136b4f81";

    //常用問題分類類型
    public static final String CATEGORY_TYPE = "30";

    //默認登錄密碼
    public static final String LOGIN_PW = "88888888";
    /**
     * 菜單類型
     *
     * @author Mark
     */
    public enum MenuType {
        /**
         * 目錄
         */
        CATALOG("10"),
        /**
         * 菜單
         */
        MENU("30"),
        /**
         * 按鈕
         */
        BUTTON("20");

        private String value;

        MenuType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 定時任務狀態
     *
     * @author Mark
     */
    public enum ScheduleStatus {
        /**
         * 正常
         */
        NORMAL(0),
        /**
         * 暫停
         */
        PAUSE(1);

        private int value;

        ScheduleStatus(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    /**
     * 云服務商
     */
    public enum CloudService {
        /**
         * 七牛雲
         */
        QINIU(1),
        /**
         * 阿裏雲
         */
        ALIYUN(2),
        /**
         * 騰訊雲
         */
        QCLOUD(3);

        private int value;

        CloudService(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    /**
     * 公用狀態 【0 禁用/有效】 【1 啟用/無效】
     */
    public enum CommonStatus {

        /**
         * 【1 啟用/無效】
         */
        ENABLE("1"),

        /**
         * 【0 禁用/有效】
         */
        DISABLE("0");


        private String value;

        CommonStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }



    //獲取用戶登錄IDsession
    public static final String GET_CODE_LOGINID = "login_id";
    public static final String GET_CODE_USERID = "user_id";
    public static final String GET_CODE_ROLEID = "role_id";
    public static final String GET_CODE_ENTERPRISEID = "enterprise_id";
    public static final String GET_CODE_LANGUAGEID = "language_id";
    public static final String GET_PRIME_LANGUAGEID = "英文";
    public static final String USER_NAME = "userName";

    /**
     * 刪除標識
     */
    public static class DeleteFlag {
        /**
         * 未刪除
         */
        public static final String DELETED = "1";
        /**
         * 已经刪除
         */
        public static final String NOT_DELETED = "0";
        /**
         * 逻辑删除列
         */
        public static final String COLUM_IS_DELETED = "is_deleted";
    }

    //有效
    public static final String VALID = "1";
    //無效
    public static final String INVALID = "0";

    //有效
    public static final String NO = "0";
    //無效
    public static final String YES = "1";

    /**
     * String變量設定null ISNULL
     * By Liu
     */
    public static final String STRING_IS_NULL = "null";

    /**
     * 日誌類型 1:需求單 2:報價單 3：課時包 4:訂單 5:線下課時 6：其他 7：帳號異動
     */
    public static class LogType {
        public static final String AccountChanges = "7";
        public static final String MemberChanges = "8";
    }

    //token的服務器類型 10 管理後臺
    public static final String SERVER_TOKEN_TYPE = "10";

    public static final String STR_EMPTY = "";
    public static final String STR_ZERO = "0";
    public static final String STR_ONE = "1";
    public static final String STR_TWO = "2";
    public static final String STR_THREE = "3";
    public static final String STR_FOUR = "4";
    public static final String STR_FIVE = "5";
    public static final String STR_SIX = "6";
    public static final String STR_NINE = "9";
    public static final String STR_TEN = "10";
    public static final String STR_TWENTY = "20";
    public static final String STR_TWD = "TWD";
    public static final String STR_USD = "USD";

    public static final int ZERO  = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FUOR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int TEN = 10;
    public static final int TWOHUNDRED = 200;
    public static final int FIFTY = 50;


    public static final String PHONE = "4";

    public static final String EMAIL = "1";
    /**
     * 上傳業務的資源數量最多個數
     */
    public static final int resourceMaxCount = 5;

    /**
     * 上傳資源文件路徑
     */
    public enum FilePath {

        /**
         * 0 案件
         */
        CASE("0", "crm/case"),

        /**
         * 1 案件溝通同記錄
         */
        COMMUNICATE("1", "crm/communicate"),

        /**
         * 2 案件工作
         */
        ASSIGNMENT("2", "crm/assignment"),

        /**
         * 3 會員頭像
         */
        MEMBERAVATAR("3", ""),
        /**
         * 4 會員證書
         */
        MEMBERCERTIFICATE("4", ""),
        /**
         * 5 教師學歷
         */
        TEACHEREDUCATION("5", ""),
        /**
         * 6 教師證書
         */
        TEACHERCERTIFICATE("6", ""),
        /**
         * 99 其他
         */
        OTHER("99", "other/");

        private String value;

        private String key;

        FilePath(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static String getValue(String key) {
            for (FilePath item : FilePath.values()) {
                if (key.equals(item.key)) {
                    return item.value;
                }
            }
            return "";
        }

        public String getKey() {
            return key;
        }
    }

    /**
     * 登陸驗證類型
     */
    public enum VerifyType {
        /**
         * 郵箱Code
         */
        EMAIL(STR_ONE),
        /**
         * 電話Code
         */
        PHONE(STR_TWO),
        /**
         * 谷歌Code
         */
        GOOGLE(STR_THREE);

        private String type;

        VerifyType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    /**
     * 系統碼表信息
     */
    public static class CodeType {
        // TODO 站別區分
        public static final String TW = "10";
        // TODO 站別區分
        public static final String TH = "20";
        // TODO 站别区分
        public static final String CN = "30";
    }

    /**
     * 通知途徑
     */
    public static class noticeChannel {
        //電子郵件
        public static final String EMAIL = "E";
        //App推送
        public static final String APPPUSHMESSAGE = "A";
        //Web站内信
        public static final String WEBPUSHMESSAGE = "W";
        //sms手機短信
        public static final String SMS = "S";
    }

    /**
     * 通知發送使用語系
     */
    public static class noticeLanguageType {
        // 英文
        public static final String EN = "EN";
        // 繁體中文
        public static final String TC = "TC";
        // 日文
        public static final String JP = "JP";
        // 簡體中文
        public static final String CN = "CN";
    }

    // 常量逗號
    public static final String COMMA = ",";

    /**
     * 問題類型
     */

    public static class QuestionsType {
        // 審核事件
        public static final String AUDIT = "Audit";
        // 審核-新客戶申請
        public static final String MA = "MA";
        // 審核-客戶修改
        public static final String ME = "ME";
        // 爭議事件
        public static final String DISPUTE = "Dispute";
        // 退款事件
        public static final String REFUND = "Refund";
        // 退款事件-申請
        public static final String RO = "RO";
        // 審核-申請license
        public static final String LC = "LC";
    }

    /**
     * 碼表類型
     */
    public static class sysCodeType {
        // 聯絡方式類型
        public static final String CONTACTTYPE = "contactType";
        // 聯絡方式類型
        public static final String RETURNCHANNEL = "returnChannel";
        // 回報人身分
        public static final String RETURNIDENTITY = "returnIdentity";
        // 問題發生平臺
        public static final String OCCURRENCEPALTFORM = "occurrencePaltform";
    }
    /**
     * 通知發送編碼
     */
    public static class noticeCode {
        // CRM案件郵件通知
        public static final String CRMCASE = "CR0001";
        // CRM工作郵件通知
        public static final String CRMASSIGNMENT = "CR0002";
    }

    /**
     * 列表分頁參數
     */
    public static class pagination {
        //page
        public static final String PAGE = "1";
        //limit
        public static final String LIMIT = "20";
        //limit_5
        public static final String LIMIT5 = "5";
    }


    /**
     *  退款狀態
     */
    public static class refundStatus {
        //1申請退款
        public static final String APPLYREFUND = "1";
        //2退款中
        public static final String REFUNDPROGRESS= "2";
        //3退款完成
        public static final String REFUNDCOMPLETED= "3";
        //4退款失敗
        public static final String REFUNDFAILED= "4";
        //5取消退款
        public static final String CANCELREFUND= "5";
        //6拒絕退款
        public static final String REFUSEREFUND= "6";
    }

    /**
     *  處理狀態
     */
    public static class processStatus {
        //1未處理
        public static final String UNHANDLED = "1";
        //2已通過
        public static final String PASSED= "2";
        //3取消
        public static final String CANCEL= "3";
        //4拒絕
        public static final String REJECT= "4";
    }

    /**
     * 文件編碼格式
     */
    public static class encodingFormat {
        // UTF-8
        public static final String UTF8 = "UTF-8";
        // big5
        public static final String BIG5 = "BIG5";


    }

    /**
     *  部門隱藏狀態
     */
    public static class deptHideStatus {
        //1申請退款
        public static final String HIDE = "0";
        //2退款中
        public static final String UNHIDE = "1";
    }


    /**
     *  產品設定排序
     */
    public static class ProductSettingOrderBy {
        //10 產品綫名稱正序
        public static final String PRODUCT_LINE_ASC = "10";
        //20 產品類別名稱正序
        public static final String PRODUCT_CATEGORY_ASC = "20";
        //30 產品模型名稱正序
        public static final String PRODUCT_MODEL_ASC = "30";
        //40 產品版本名稱正序
        public static final String PRODUCT_VERSION_ASC = "40";
        //11 產品綫名稱倒序
        public static final String PRODUCT_LINE_DESC = "11";
        //21 產品類別名稱倒序
        public static final String PRODUCT_CATEGORY_DESC = "21";
        //31 產品模型名稱倒序
        public static final String PRODUCT_MODEL_DESC = "31";
        //41 產品版本名稱倒序
        public static final String PRODUCT_VERSION_DESC = "41";
    }

    /**
     *  產品版本排序
     */
    public static class ProductVersionOrderBy {
        //10 產品綫名稱正序
        public static final String PRODUCT_LINE_ASC = "10";
        //20 產品類別名稱正序
        public static final String PRODUCT_CATEGORY_ASC = "20";
        //30 產品模型名稱正序
        public static final String PRODUCT_MODEL_ASC = "30";
        //40 產品版本名稱正序
        public static final String PRODUCT_VERSION_ASC = "40";
        //11 產品綫名稱倒序
        public static final String PRODUCT_LINE_DESC = "11";
        //21 產品類別名稱倒序
        public static final String PRODUCT_CATEGORY_DESC = "21";
        //31 產品模型名稱倒序
        public static final String PRODUCT_MODEL_DESC = "31";
        //41 產品版本名稱倒序
        public static final String PRODUCT_VERSION_DESC = "41";
    }

    //授權有效期無綫
    public static final String LICENSE_DAY_UNLIMIT = "99991231";

    //生成授權密鑰長度
    public static final String LICENSE_KEY_LEN = "81";

    public static class License {
        //有效期類型:1固定天數/2範圍
        public static final String EXPIRATION_TYPE_1 = "1";
        //有效期類型:1固定天數/2範圍
        public static final String EXPIRATION_TYPE_2 = "2";
    }


    //公司等級
    public static class CompanyLevel {
        //總公司等級：1
        public static final int LEVEL_HEADQUARTER = 1;
        //分公司等級：2
        public static final int LEVEL_BRANCH = 2;
    }

    //資料審核狀態:00未提交/10未審核/11審核通過/12審核駁回/90商戶撤回
    public static class AuditStatus {
        //00未提交
        public static final String NOT_SUBMITTED = "00";
        //10未審核
        public static final String NOT_AUDITED = "10";
        //11審核通過
        public static final String AUDIT_PASSED = "11";
        //12審核駁回
        public static final String AUDIT_REJECTED = "12";
        //90商戶撤回
        public static final String MERCHANT_REVOKED = "90";
    }

}
