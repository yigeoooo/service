package com.system.service.common.tableField;

/**
 * @Author: lhrj
 * @Date: 2021-09-30 16:18
 * @Version: 1.0
 */
public class TableField {

    public static class CommonField {

        /**
         * 刪除標記
         */
        public static final String IS_DELETED = "is_deleted";
        /**
         * 檢索條件
         */
        public static final String VISIBLE = "visible";

        /**
         * 公司
         */
        public static final String ENTERPRISE_ID = "enterprise_id";

        /**
         * 更新時間
         */
        public static final String UPDATE_TIME = "update_time";

        /**
         * 創建時間
         */
        public static final String INSERT_TIME = "insert_time";

        /**
         * 更新者
         */
        public static final String UPDATE_USER_ID = "update_user_id";
        /**
         * 創建者
         */
        public static final String INSERT_USER_ID = "insert_user_id";

        /**
         * 會員ID
         */
        public static final String MEMBER_ID = "member_id";
        /**
         * 資源類型
         */
        public static final String TYPE = "type";
        /**
         * 狀態
         */
        public static final String STATUS = "status";
        /**
         * 國際化語言内容
         */
        public static final String LANGUAGE_CONTENT = "language_content";
    }

    public static class DepartmentMaster extends CommonField {

        public static final String DEPARTMENT_CODE = "department_code";

        public static final String DEPARTMENT_NAME = "department_name";

    }

    public static class MenuContentMaster extends CommonField {
        public static final String ROLE_ID = "role_id";

        public static final String MENU_PATH = "menuPath";

        public static final String MENU_ICON = "menuIcon";

        public static final String MENU_ID = "menu_id";

        public static final String SORT = "sort";
    }

    public static class MenuMaster extends CommonField {
        public static final String MENU_ID = "menu_id";
    }

    public static class WorkMaster extends CommonField {
        public static final String USER_ID = "user_id";

        public static final String TIME = "time";

    }

    public static class VacationMaster extends CommonField {
        public static final String USER_ID = "user_id";

        public static final String INSERT_TIME = "insert_time";

        public static final String STATUS = "status";
    }

    public static class CommonResource extends CommonField {
        public static final String RESOURCE_ID = "resource_id";

        public static final String IS_DELETED = "is_deleted";

        public static final String STATUS = "status";
    }

    public static class CaseContent extends CommonField {
        public static final String TITLE = "title";

        public static final String AUTHOR = "author";
    }

    public static class RoleMaster extends CommonField {
        public static final String ROLE_ID = "role_id";

        public static final String ROLE_NAME = "role_name";
    }

    public static class IpMaster extends CommonField {
        public static final String HOST_NAME = "host_name";

        public static final String BAN_STATUS = "ban_status";
    }

    public static class IpContent extends CommonField {
        public static final String HOST_NAME = "host_name";

        public static final String REQUEST_METHOD = "request_method";

        public static final String REQUEST_PORT = "request_port";

        public static final String INSERT_TIME = "insert_time";
    }

    public static class ScheduleJobLog extends CommonField {
        /**
         * 任務id
         */
        public static final String JOB_ID = "job_id";
    }

    public static class ScheduleJob extends CommonField {
        /**
         * spring bean名稱
         */
        public static final String BEAN_NAME = "bean_name";
    }

    public static class SysLanguageType extends CommonField {
        /**
         * 主要語言FLAG  0:次要語言，1:主要語言
         */
        public static final String PRIME_LANGUAGE = "prime_language";
        /**
         * 詞匯語系種類ID
         */
        public static final String LANG_TYPE_ID = "lang_type_id";
        /**
         * 預留字段
         */
        public static final String FIELD1 = "field1";
        /**
         * 詞匯語系名稱
         */
        public static final String LANG_TYPE_NAME = "lang_type_name";
        /**
         * 排序
         */
        public static final String SORT = "sort";
    }

    public static class SysCode extends CommonField {
        /**
         * 類型
         */
        public static final String TYPE = "type";
        /**
         * 編碼
         */
        public static final String CODE = "code";
        /**
         * 站別
         */
        public static final String SITE = "site";
        /**
         * 名稱
         */
        public static final String NAME = "name";
        /**
         * 詞匯Key
         */
        public static final String NAME_KEY = "name_key";
    }

    public static class SysConfig extends CommonField {
        /**
         *
         */
        public static final String PARAM_KEY = "param_key";
        /**
         *
         */
        public static final String STATUS = "status";
    }

    public static class SysLog extends CommonField {
        /**
         * 日志ID
         */
        public static final String LOG_ID = "log_id";
        /**
         * 日志類型 1:需求單 2:報價單 3：課時包 4:其他
         */
        public static final String LOG_TYPE = "log_type";
        /**
         * 操作名稱
         */
        public static final String OPT_NAME = "opt_name";
        /**
         * 操作描述
         */
        public static final String REMARK = "remark";
        /**
         * 業務ID
         */
        public static final String BUSINESS_ID = "business_id";
        /**
         * 操作人姓名
         */
        public static final String USER_NAME = "user_name";
    }

    public static class SysOptLog extends CommonField {
        /**
         * 用戶名
         */
        public static final String USERNAME = "username";
        /**
         * 【10 教學管理後臺】【20 CRM管理後臺】
         */
        public static final String SITE = "site";
        /**
         * 創建時間
         */
        public static final String CREATE_DATE = "create_date";
    }

    public static class SysRole extends CommonField {
        /**
         * 【10 教學管理後臺】【20 CRM管理後臺】
         */
        public static final String SITE = "site";
        /**
         * 角色名稱
         */
        public static final String ROLE_NAME = "role_name";
        /**
         * 創建者所屬部門
         */
        public static final String INSERT_DEPT_ID = "insert_dept_id";
    }

    public static class SysUserDept extends CommonField {
        /**
         * 用戶ID
         */
        public static final String USER_ID = "user_id";
        /**
         * 部門ID
         */
        public static final String DEPT_ID = "dept_id";
    }

    public static class SysDept extends CommonField {
        /**
         * 部門ID
         */
        public static final String DEPT_ID = "dept_id";

        /**
         * 部門全路徑
         */
        public static final String ALL_PATH = "all_path";
    }

    public static class SysUser extends CommonField {
        /**
         * 用戶ID
         */
        public static final String USER_ID = "user_id";

        /**
         * 用戶ID
         */
        public static final String ROLE_ID = "role_id";
        /**
         * 用戶名
         */
        public static final String USER_NAME = "user_name";
        /**
         * 是否有效
         */
        public static final String IS_VALID = "is_valid";
        /**
         * Email地址
         */
        public static final String EMAIL = "email";
        /**
         * 登錄ID
         */
        public static final String LOGINID = "login_id";

    }

    /**
     * 序號
     */
    public static class SequenceNumber {
        /**
         * id
         */
        public static final String ID = "id";

        /**
         * 類型
         */
        public static final String TYPE = "type";

        /**
         * 日期編號
         */
        public static final String DATE_CODE = "date_code";

    }

    public static class SysLanguageContentsItem extends CommonField {
        /**
         * 功能代碼
         */
        public static final String FUNCTION_CODE = "function_code";

        /**
         * 項目類型
         */
        public static final String ITEM_TYPE = "item_type";

        /**
         * 項目編號
         */
        public static final String ITEM_KEY = "item_key";

        /**
         * 詞匯ID
         */
        public static final String PC_ITEM_ID = "pc_item_id";
    }

    public static class SysLanguageContentsContent extends CommonField {
        /**
         * 詞匯ID
         */
        public static final String PC_ITEM_ID = "pc_item_id";
        /**
         * 詞匯語系種類ID
         */
        public static final String LANG_TYPE_ID = "lang_type_id";
        /*
         * 詞彙内容
         * */
        public static final String LANGUAGE_CONTENT = "language_content";
    }

    public static class BusinessLanguageContentsItem extends CommonField {
        /**
         * 功能代碼
         */
        public static final String FUNCTION_CODE = "function_code";

        /**
         * 項目類型
         */
        public static final String ITEM_TYPE = "item_type";

        /**
         * 項目編號
         */
        public static final String ITEM_KEY = "item_key";

        /**
         * 詞匯ID
         */
        public static final String PC_ITEM_ID = "pc_item_id";
    }

    public static class BusinessLanguageContentsContent extends CommonField {
        /**
         * 詞匯ID
         */
        public static final String PC_ITEM_ID = "pc_item_id";
        /**
         * 詞匯語系種類ID
         */
        public static final String LANG_TYPE_ID = "lang_type_id";
        /*
         * 詞彙内容
         * */
        public static final String LANGUAGE_CONTENT = "language_content";
    }

    public static class EntMember extends CommonField {
        /**
         * 企業用戶ID
         */
        public static final String ENTERPRISE_USER_ID = "enterprise_user_id";
    }

    public static class VerificationCode extends CommonField {

        /**
         * code類型 1：email 2:phone
         */
        public static final String CODE_TYPE = "code_type";
        /**
         * 驗證帳號
         */
        public static final String ACCOUNT = "account";
        /**
         * 驗證碼
         */
        public static final String CODE = "code";
        /**
         * 過期時間
         */
        public static final String EXPIRATION_TIME = "expiration_time";
    }

    public static class SysEnterprise extends CommonField {
        /**
         * 公司编码
         */
        public static final String ENTERPRISE_CODE = "enterprise_code";
    }

    public static class Page {
        /**
         * 當前頁
         */
        public static final String PAGE = "page";
        /**
         * 每頁數量
         */
        public static final String LIMIT = "limit";
    }
}
