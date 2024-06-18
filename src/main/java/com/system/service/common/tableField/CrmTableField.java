package com.system.service.common.tableField;

/**
 * @Author: congdandan
 * @Date: 2022-3-16 11:18
 */
public class CrmTableField extends TableField {

    public static class CrmQuestion extends CommonField {
        /**
         * 主問題ID
         */
        public static final String PARENT_ID = "parent_id";
        /**
         * 排序
         */
        public static final String SORT = "sort";
    }


    public static class CrmCases extends CommonField {
        /**
         * 案件編號
         */
        public static final String CASE_NUMBER = "case_number";

        /**
         * 案件狀態
         */
        public static final String CASE_STATE = "case_state";

        /**
         * 回報管道
         */
        public static final String RETURN_CHANNEL = "return_channel";

        /**
         * 負責部門
         */
        public static final String DEPT_ID = "dept_id";

        /**
         * 問題類型
         */
        public static final String QUESTIONS_TYPE = "questions_type";

        /**
         * 問題副類型
         */
        public static final String QUESTIONS_TYPE_SUB = "questions_type_sub";

        /**
         * 優先度
         */
        public static final String PRIORITY = "priority";

        /**
         * 創建人名稱
         */
        public static final String INSERT_USER_NAME = "insert_user_name";

        /**
         * 負責人名稱
         */
        public static final String USER_ID_NAME = "user_id_name";

        /**
         * 回報人姓名
         */
        public static final String RETURN_NAME = "return_name";

        /**
         * 案件編號
         */
        public static final String CUSTOMER_NAME = "customer_name";

        /**
         * 客戶名稱
         */
        public static final String CASE_PURPORT = "case_purport";

        /**
         * 創建案件用戶所屬部門
         */
        public static final String INSERT_DEPT_ID = "insert_dept_id";

        /**
         * 案件id
         */
        public static final String CASE_ID = "case_id";

        /**
         * 備注説明
         */
        public static final String NOTES = "notes";

    }

    public static class CrmCaseAssignment extends CommonField {
        /**
         * 案件id
         */
        public static final String CASE_ID = "case_id";

        /**
         * 工作狀態
         */
        public static final String ASSIGNMENT_STATE = "assignment_state";

        /**
         * 父工作
         */
        public static final String PARENT_ID = "parent_id";

        /**
         * 工作分派id
         */
        public static final String ASSIGNMENT_ID = "assignment_id";

        /**
         * 創建人名稱
         */
        public static final String INSERT_USER_NAME = "insert_user_name";

        /**
         * 創建人名稱
         */
        public static final String USER_NAME = "user_name";

        /**
         * 工作名稱
         */
        public static final String ASSIGNMENT_NAME = "assignment_name";

        /**
         * 工作編號
         */
        public static final String ASSIGNMENT_NUM = "assignment_num";

        /**
         * 負責部門
         */
        public static final String DEPT_ID = "dept_id";

        /**
         * 創建工作用戶所屬部門
         */
        public static final String INSERT_DEPT_ID = "insert_dept_id";

        /**
         * 全路徑
         */
        public static final String ALL_PATH = "all_path";


    }

    public static class CrmReturnPerson extends CommonField {
        /**
         * 規格化回報人email地址
         */
        public static final String NORMALIZED_EMAIL = "normalized_email";
    }

    public static class CrmCaseCommunicationRecord extends CommonField {
        /**
         * 案件id
         */
        public static final String CASE_ID = "case_id";
    }

    public static class CrmCaseResume extends CommonField {
        /**
         * 主問題ID
         */
        public static final String CASE_COMMUNICATE_ID = "case_communicate_id";

        /**
         * 排序
         */
        public static final String RESUME_TYPE = "resume_type";

        /**
         * 排序
         */
        public static final String BUSINESS_ID = "business_id";
    }
}
