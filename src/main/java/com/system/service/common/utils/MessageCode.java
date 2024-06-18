package com.system.service.common.utils;


/**
 * @author wangq
 */
public class MessageCode {
    /* *********************  框架 BEGIN  ******************* */
    public static class CommonMessage {
        /**
         * 處理成功!
         */
        public static final String ERROR = "ERROR";
        /****/
        public static final String ACCOUNT_DISABLE_ERROR = "ACCOUNT_DISABLE_ERROR";
        /**
         * 未經授權!
         */
        public static final String UNAUTHORIZED = "UNAUTHORIZED";
        /**
         * 不存在!
         */
        public static final String NOT_FOUND = "NOT_FOUND";
        /**
         * 參數錯誤!
         */
        public static final String PARAM_ERROR = "PARAM_ERROR";
        /**
         * 參數為空!
         */
        public static final String PARAM_EMPTY = "PARAM_EMPTY";
        /**
         * 數據已存在!
         */
        public static final String DATA_EXISTS = "DATA_EXISTS";
        /**
         * 數據已存在!
         */
        public static final String TOKEN_CREATE_ERROR = "TOKEN_CREATE_ERROR";

        public static final String DYNAMIC_ERROR = "DYNAMIC_ERROR";

        /**
         * 數據更新失敗!
         */
//        public static final String SUCCESS = "SUCCESS";
//        public static final String DATA_UPDATE_ERROR = "DATA_UPDATE_ERROR";

    }
    /* *********************  框架 END  ******************* */

    /**
     * 網路連線超時，請重試
     */
    public static String NETWORK_CONNECT_TIME_OUT = "NETWORK_CONNECT_TIME_OUT";
    /**
     * 當前賬戶沒有郵箱
     */
    public static final String EMAIL_EXIST_ERROR = "EMAIL_EXIST_ERROR";
    /**
     * 當前賬戶沒有手機號碼
     */
    public static final String PHONE_EXIST_ERROR = "PHONE_EXIST_ERROR";
    /**
     * 發送文件手機號錯誤
     */
    public static final String SEND_FAIL_PHONE_ERROR = "SEND_FAIL_PHONE_ERROR";
    /**
     * 發送驗證碼失敗
     */
    public static final String SEND_VERIFY_CODE_ERROR = "SEND_VERIFY_CODE_ERROR";

    /**
     * 請選擇上傳的文件
     */
    public static final String FILE_UPLOAD_FILE_NOT_EXISTS = "FILE_UPLOAD_FILE_NOT_EXISTS";

    /*** 文件上傳失敗,文件僅支持.JPG.PNG.JPEG.PDF格式*/
    public static final String FILE_UPLOAD_FORMAT_ERROR = "FILE_UPLOAD_FORMAT_ERROR";

    /*** 文件獲取失敗,文件資源雲服務器同步失敗*/
    public static final String FILE_UPLOAD_STATUS_ERROR = "FILE_UPLOAD_STATUS_ERROR";

    /*** 文件獲取失敗,文件正在等待雲服務器同步上傳*/
    public static final String FILE_UPLOAD_STATUS_IN_HAND = "FILE_UPLOAD_STATUS_IN_HAND";

    /**
     * 文件上傳失敗
     */
    public static final String FILE_UPLOAD_FAIL = "FILE_UPLOAD_FAIL";

    /**
     * 簡訊驗證碼發送失敗返回code
     */
//    public static final String SEND_CODE_OVER_ERROR = "SEND_CODE_OVER_ERROR";

    /* *********************  登入相關提示訊息 BEGIN  ******************* */
    public static class LoginMessage {
        /*** 驗證碼錯誤，請重新輸入*/
        public static final String VERIFICATION_CODE_PARAM_ERROR = "VERIFICATION_CODE_PARAM_ERROR";
        /*** 帳號或密碼錯誤，請重新輸入*/
        public static final String ACCOUNT_PASSWORD_PARAM_ERROR = "ACCOUNT_PASSWORD_PARAM_ERROR";
        /*** 當前帳號已被鎖定，請聯係管理員*/
        public static final String ACCOUNT_LOCKING_ERROR = "ACCOUNT_LOCKING_ERROR";
        /*** 當前登錄帳號重複，請確認*/
        public static final String LOGIN_ACCOUNT_DUPLICATE = "LOGIN_ACCOUNT_DUPLICATE";
        /*** 當前用戶標識不存在，請確認*/
        public static final String TOKEN_NOT_EXIST_ERROR = "TOKEN_NOT_EXIST_ERROR";
        /*** 登入驗證超時，請重新登入*/
        public static final String LOGIN_TIME_OUT_ERROR = "LOGIN_TIME_OUT_ERROR";
        /*** 當前用戶信息修改失敗*/
        public static final String SYS_USER_UPDATE_ERROR = "SYS_USER_UPDATE_ERROR";
        /*** 請至少選擇一個所屬部門*/
        public static final String SYS_USER_DEPT_NOT_CHOOSE_ERROR = "SYS_USER_DEPT_NOT_CHOOSE_ERROR";
        /*** 郵箱驗證失敗,請檢查郵箱格式*/
//        public static final String EMAIL_VALIDATION_ERROR = "EMAIL_VALIDATION_ERROR";
        /*** 平臺職員信息獲取失敗*/
//        public static final String SYS_USER_GET_ERROR = "SYS_USER_GET_ERROR";
    }
    /* *********************  登入相關提示訊息 END  ******************* */


    /* *********************  審核主檔相關提示信息  BEGIN  ******************* */
    public static class AuditMasterMessage {
        /*** 當前訊息已存在相關審核事件，無法進行相關操作，請確認*/
        public static final String AUDIT_DELETE = "AUDIT_DELETE";
        /*** 未傳遞審核狀態ID*/
        public static final String NO_HAVE_AUDIT_STATE_ID = "NO_HAVE_AUDIT_STATE_ID";
        /*** 審核狀態表沒有此條數據*/
        public static final String NO_HAVE_AUDIT_STATE_DATA = "NO_HAVE_AUDIT_STATE_DATA";
        /*** 審核狀態信息已刪除*/
        public static final String AUDIT_STATE_DATA_DELETE = "AUDIT_STATE_DATA_DELETE";
        /*** 數據庫不存在此審核主檔ID*/
        public static final String NO_HAVE_AUDIT_MASTER_ID = "NO_HAVE_AUDIT_MASTER_ID";
        /*** 此審核數據已被刪除*/
        public static final String THIS_DATA_DELETE = "THIS_DATA_DELETE";
        /*** 未查詢到工作分派信息*/
        public static final String NO_HAVE_CASE_ASSIGNMENT_DATA = "NO_HAVE_CASE_ASSIGNMENT_DATA";
        /*** 工作分派信息已刪除*/
        public static final String CASE_ASSIGNMENT_DATA_DELETE = "CASE_ASSIGNMENT_DATA_DELETE";
        /*** 數據庫不存在此審核主檔ID*/
        public static final String DATABASE_NO_HAVE_AUDIT_STATE_ID = "DATABASE_NO_HAVE_AUDIT_STATE_ID";
        /*** ID為空*/
        public static final String NOT_HAVE_ID = "NOT_HAVE_ID";
        /*** 審核主檔信息更新失敗*/
        public static final String AUDIT_MASTER_UPDATE_ERROR = "AUDIT_MASTER_UPDATE_ERROR";
        /*** 審核狀態信息更新失敗*/
        public static final String AUDIT_STATE_UPDATE_ERROR = "AUDIT_STATE_UPDATE_ERROR";
        /*** 工作分派信息更新失敗*/
        public static final String CASE_ASSIGNMENT_DATA_UPDATE_ERROR = "CASE_ASSIGNMENT_DATA_UPDATE_ERROR";
        /*** 審核通過履歷信息添加失敗*/
        public static final String AUDIT_YES_CV_SAVE_ERROR = "AUDIT_YES_CV_SAVE_ERROR";
        /*** 未查詢到相應的案件信息*/
        public static final String NOT_HAVE_CASE_DATA = "NOT_HAVE_CASE_DATA";
        /*** 案件信息已被刪除*/
        public static final String CASE_DATA_DELETE = "CASE_DATA_DELETE";
        /*** 審核拒絕履歷信息添加失敗*/
        public static final String AUDIT_NO_CV_SAVE_ERROR = "AUDIT_NO_CV_SAVE_ERROR";
        /*** 客戶平臺客戶狀態信息修改失敗*/
        public static final String MERCHANT_PLATFORM_MERCHANT_STATE_UPDATE_ERROR = "MERCHANT_PLATFORM_MERCHANT_STATE_UPDATE_ERROR";
        /*** 審核補件履歷信息添加失敗*/
        public static final String AUDIT_PATCH_CV_SAVE_ERROR = "AUDIT_PATCH_CV_SAVE_ERROR";
        /*** 未查詢到相應的審核主檔數據*/
        public static final String AUDIT_MASTER_GET_ERROR = "AUDIT_MASTER_GET_ERROR";
        /*** 案件訊息添加失敗*/
//        public static final String CASE_DATA_SAVE_ERROR = "CASE_DATA_SAVE_ERROR";
    }
    /* *********************  審核主檔相關提示信息 END  ******************* */


    /* *********************  審核權限設定相關提示訊息  BEGIN  ******************* */
    public static class AuditPermissionSettingMessage {
        /*** 客戶银行卡綁定失敗*/
        public static final String MERCHANT_BANK_BINDING_ERROR = "MERCHANT_BANK_BINDING_ERROR";
        /*** 保存審核權限設定表失敗*/
        public static final String AUDIT_PERMISSION_SETTING_SAVE_ERROR = "AUDIT_PERMISSION_SETTING_SAVE_ERROR";
    }
    /* *********************  審核權限設定相關提示訊息  END  ******************* */


    /* *********************  審核設定管理API相關提示訊息  BEGIN  ******************* */
    public static class AuditSettingMasterMessage {
        /*** 保存失敗*/
        public static final String SAVE_ERROR = "SAVE_ERROR";
        /*** 修改全部失敗*/
        public static final String UPDATE_ALL_ERROR = "UPDATE_ALL_ERROR";
        /*** 修改狀態失敗*/
        public static final String UPDATE_STATE_ERROR = "UPDATE_STATE_ERROR";
        /*** 刪除失敗*/
        public static final String DELETE_ERROR = "DELETE_ERROR";
        /*** 審核設定詳細數據查詢失敗*/
        public static final String AUDIT_SET_DETAILED_DATA_SELECT_ERROR = "AUDIT_SET_DETAILED_DATA_SELECT_ERROR";
        /*** 案件主分類為空*/
        public static final String AUDIT_DEMAND_TYPE_EMPTY = "AUDIT_DEMAND_TYPE_EMPTY";
        /*** 傳入審核編碼為空*/
        public static final String AUDIT_CODE_EMPTY = "AUDIT_CODE_EMPTY";
        /*** 傳入審核事件名稱為空*/
        public static final String AUDIT_NAME_EMPTY = "AUDIT_NAME_EMPTY";
        /*** 傳入審核流程類型為空*/
        public static final String AUDIT_PROCESS_TYPE_EMPTY = "AUDIT_PROCESS_TYPE_EMPTY";
        /*** 傳入開啓狀態為空*/
        public static final String STATUS_EMPTY = "STATUS_EMPTY";
        /*** 傳入審核設定ID為空*/
        public static final String STETTING_ID_EMPTY = "STETTING_ID_EMPTY";
        /*** 沒有對應數據ID或已被刪除*/
        public static final String NOT_HAVE_STETTING_ID_OR_DELETED = "NOT_HAVE_STETTING_ID_OR_DELETED";
        /*** 沒有對應數據ID*/
        public static final String NOT_HAVE_STETTING_ID = "NOT_HAVE_STETTING_ID";
        /*** 已被刪除*/
        public static final String ALREADY_DELETED = "ALREADY_DELETED";
        /*** 傳入審核編碼重複*/
        public static final String AUDIT_CODE_REPEAT = "AUDIT_CODE_REPEAT";
    }
    /* *********************  審核設定管理API相關提示訊息  END  ******************* */


    /* *********************  新建用戶申請，生成審核事件相關提示信息 BEGIN  ******************* */
    public static class AuditMA0001Message {
        /*** 未查詢到客戶申請信息*/
        public static final String NOT_FIND_MERCHANT_DATA = "NOT_FIND_MERCHANT_DATA";
        /*** 客戶申請數據更新失敗*/
        public static final String MERCHANT_APPLY_FOR_UPDATE_ERROR = "MERCHANT_APPLY_FOR_UPDATE_ERROR";
        /*** 審核主檔數據添加失敗*/
        public static final String AUDIT_MASTER_SAVE_ERROR = "AUDIT_MASTER_SAVE_ERROR";
        /*** 新建案件信息履歷信息添加失敗*/
        public static final String NEW_CASE_INFORMATION_CV_SAVE_ERROR = "NEW_CASE_INFORMATION_CV_SAVE_ERROR";
        /*** 人員審核狀態數據添加失敗*/
        public static final String PERSONNEL_AUDIT_STATE_SAVE_ERROR = "PERSONNEL_AUDIT_STATE_SAVE_ERROR";
        /*** 工作分派信息數據添加失敗*/
        public static final String CASE_ASSIGNMENT_DATA_SAVE_ERROR = "CASE_ASSIGNMENT_DATA_SAVE_ERROR";
        /*** 新建工作信息履歷信息添加失敗*/
        public static final String NEW_CASE_ASSIGNMENT_CV_DATA_SAVE_ERROR = "NEW_CASE_ASSIGNMENT_CV_DATA_SAVE_ERROR";
    }
    /* *********************  新建用戶申請，生成審核事件相關提示信息  END  ******************* */

    /* *********************  新建聯絡人申請，生成審核事件相關提示信息 BEGIN  ******************* */
    public static class AuditMA0002Message {
        /*** 未查詢到客戶主檔信息*/
        public static final String NOT_FIND_MERCHANT_MASTER_DATA = "NOT_FIND_MERCHANT_MASTER_DATA";
        /*** 新建案件信息履歷信息添加失敗*/
        public static final String NEW_CASE_CASE_CV_DATA_SAVE_ERROR = "NEW_CASE_CASE_CV_DATA_SAVE_ERROR";
    }
    /* *********************  新建聯絡人申請，生成審核事件相關提示信息  END  ******************* */

    /* *********************  業務/業務工程師申請License提示信息 BEGIN  ******************* */
    public static class AuditLC0003Message {
        /*** 新建案件信息履歷信息添加失敗*/
        public static final String NEW_CASE_CASE_CV_DATA_SAVE_ERROR = "NEW_CASE_CASE_CV_DATA_SAVE_ERROR";
        /*** 人員審核狀態數據添加失敗*/
        public static final String PERSONNEL_AUDIT_STATE_SAVE_ERROR = "PERSONNEL_AUDIT_STATE_SAVE_ERROR";
        /*** 工作分派信息數據添加失敗*/
        public static final String CASE_ASSIGNMENT_DATA_SAVE_ERROR = "CASE_ASSIGNMENT_DATA_SAVE_ERROR";
        /*** 新建工作信息履歷信息添加失敗*/
        public static final String NEW_CASE_ASSIGNMENT_CV_DATA_SAVE_ERROR = "NEW_CASE_ASSIGNMENT_CV_DATA_SAVE_ERROR";
    }
    /* *********************  業務/業務工程師申請License提示信息  END  ******************* */


    /* *********************  客戶轉正式申請，生成審核事件相關提示信息 BEGIN  ******************* */
    public static class AuditME0001Message {
        /*** 請補全用戶資料*/
//        public static final String SUPPLEMENT_USER_DATA = "SUPPLEMENT_USER_DATA";
    }
    /* *********************  客戶轉正式申請，生成審核事件相關提示信息  END  ******************* */


    /* *********************  銀行相關提示訊息 BEGIN  ******************* */
    public static class BankMessage {
        /*** 傳入的銀行ID爲空*/
        public static final String BANK_ID_EMPTY = "BANK_ID_EMPTY";
        /*** 通過傳入的銀行ID未在銀行分行信息表中獲取對象數據*/
        public static final String BRANCH_ENTITY_LIST_EMPTY = "BRANCH_ENTITY_LIST_EMPTY";
        /*** BIN碼格式異常,只能為數字*/
//        public static final String BIN_CODE_FORMAT_ERROR = "BIN_CODE_FORMAT_ERROR";
        /*** 匯款銀行信息保存失敗*/
//        public static final String BANK_MASTER_SAVE_ERROR = "BANK_MASTER_SAVE_ERROR";
        /*** 匯款分行信息修改失敗*/
//        public static final String BANK_BRANCH_UPDATE_ERROR = "BANK_BRANCH_UPDATE_ERROR";
        /*** 匯款分行信息保存失敗*/
//        public static final String BANK_BRANCH_SAVE_ERROR = "BANK_BRANCH_SAVE_ERROR";
        /*** 當前銀行ID下有相同分行編碼的數據了,請檢查數據*/
//        public static final String BANK_ID_HAVE_BRANCH_CODE_SAVE_ERROR = "BANK_ID_HAVE_BRANCH_CODE_SAVE_ERROR";
        /*** 匯款銀行信息刪除失敗*/
//        public static final String BANK_MASTER_DELETE_ERROR = "BANK_MASTER_DELETE_ERROR";
        /*** 匯款分行信息刪除失敗*/
//        public static final String BANK_BRANCH_DELETE_ERROR = "BANK_BRANCH_DELETE_ERROR";
        /*** 未填寫銀行ID，請重新輸入*/
//        public static final String BANK_CODE_PARAM_ERROR = "BANK_CODE_PARAM_ERROR";
        /*** 未填寫分行ID，請重新輸入*/
//        public static final String BANK_BRANCH_ID_PARAM_ERROR = "BANK_BRANCH_ID_PARAM_ERROR";
        /*** 當前銀行ID無對應銀行信息，請重新輸入*/
//        public static final String BANK_CODE_NOT_EXIST_ERROR = "BANK_CODE_NOT_EXIST_ERROR";
        /*** 請輸入銀行編碼*/
//        public static final String PLEASE_ENTER_BANK_CODING = "PLEASE_ENTER_BANK_CODING";
        /*** 保存銀行LOGO信息失敗*/
//        public static final String BANK_FILE_RESOURCE_SAVE_ERROR = "BANK_FILE_RESOURCE_SAVE_ERROR";
        /*** 銀行LOGO信息不能爲空*/
//        public static final String BANK_FILE_RESOURCE_PARAM_ERROR = "BANK_FILE_RESOURCE_PARAM_ERROR";
    }
    /* *********************  銀行相關提示訊息 END  ******************* */

    /* *********************  共同數據相關提示信息 BEGIN  ******************* */
    public static class CommonDataMessage {
    }
    /* *********************  共同數據相關提示信息 END  ******************* */


    /* *********************  信用卡分期設定相關提示訊息 BEGIN  ******************* */
    public static class CreditInstallmentSettingMessage {
        /*** 信用卡分期設定保存失敗*/
        public static final String CREDIT_INSTALLMENT_SETTING_SAVE_ERROR = "CREDIT_INSTALLMENT_SETTING_SAVE_ERROR";
        /*** 請輸入銀行名稱*/
        public static final String CREDIT_INSTALLMENT_SETTING_BANK_ID_EMPTY = "CREDIT_INSTALLMENT_SETTING_BANK_ID_EMPTY";
        /*** 請輸入相關内容后再進行保存*/
        public static final String DATA_EMPTY = "DATA_EMPTY";
        /*** 傳入的客戶ID爲空*/
        public static final String CREDIT_INSTALLMENT_SETTING_MERCHANT_ID_EMPTY = "CREDIT_INSTALLMENT_SETTING_MERCHANT_ID_EMPTY";
        /*** 傳入的銀行ID爲空*/
        public static final String INCOMING_BANK_ID_EMPTY = "INCOMING_BANK_ID_EMPTY";
        /*** 新增銀行失敗*/
        public static final String BANK_SAVE_ERROR = "BANK_SAVE_ERROR";
        /*** 此銀行已經保存*/
        public static final String BANK_ALREADY_SAVE_ERROR = "BANK_ALREADY_SAVE_ERROR";
        /**
         * 最低手續費不能大於最高手續費
         */
        public static final String MIN_BIG_TO_MAX = "MIN_BIG_TO_MAX";
        /*** 客戶信用卡分期設定表同步失敗*/
//        public static final String MERCHANT_CREDIT_INSTALLMENT_SETTING_SAVE_ERROR = "MERCHANT_CREDIT_INSTALLMENT_SETTING_SAVE_ERROR";
        /*** 未找到需要同步的數據(信用卡分期設定沒有數據)*/
//        public static final String NOT_HAVE_NEED_SYNCHRONOUS_DATA = "NOT_HAVE_NEED_SYNCHRONOUS_DATA";
        /*** 請選擇需要同步的銀行信息*/
//        public static final String CHOOSE_SYNCHRONOUS_BANK = "CHOOSE_SYNCHRONOUS_BANK";
    }
    /* *********************  信用卡分期設定相關提示訊息 END  ******************* */

    /* *********************  資源服務接口相關提示信息 BEGIN  ******************* */
    public static class CommonResourceMessage {
        /*** 上傳的文件大小不能超過10MB*/
        public static final String UPLOAD_PHOTO_MEMORY_MUCH = "UPLOAD_PHOTO_MEMORY_MUCH";
        /*** 文件為空*/
        public static final String FILE_EMPTY = "FILE_EMPTY";
        /*** 刪除文件失敗*/
        public static final String DELETE_FILE_ERROR = "DELETE_FILE_ERROR";
        /*** 資源ID為空*/
        public static final String RESOURCES_ID_EMPTY = "RESOURCES_ID_EMPTY";
        /*** 此資源已刪除*/
        public static final String RESOURCES_DELETE = "RESOURCES_DELETE";
        /*** 該文件格式錯誤*/
        public static final String FILE_FORMAT_ERROR = "FILE_FORMAT_ERROR";

    }
    /* *********************  資源服務接口相關提示信息 END  ******************* */

    /* *********************  系統碼表相關提示信息 BEGIN  ******************* */
    public static class CommonSysCodeMessage {
        /*** 未查詢到對應的系統語言内容，請確認，pcItemId=*/
        public static final String NOT_HAVE_SYS_LANGUAGE = "NOT_HAVE_SYS_LANGUAGE";
        /*** 未查詢到對應的系統項目内容，請確認，itemKey=*/
        public static final String NOT_HAVE_SYS_PROJECT_CONTENT = "NOT_HAVE_SYS_PROJECT_CONTENT";
        /*** 未查詢到對應的系統碼表内容，請確認，type=*/
        public static final String NOT_HAVE_SYS_CLOCK_CONTENT = "NOT_HAVE_SYS_CLOCK_CONTENT";

    }
    /* *********************  系統碼表相關提示信息 END  ******************* */


    /* *********************  發送登入信箱驗證碼 BEGIN  ******************* */
    public static class VerificationCodeMessage {
        /*** 發送登錄郵箱驗證碼失敗*/
        public static final String LOGIN_EMAIL_VALIDATION_FAILURE = "LOGIN_EMAIL_VALIDATION_FAILURE";
        /*** 發送手機登錄驗證碼失敗*/
        public static final String MOBILE_PHONE_VALIDATION_FAILURE = "MOBILE_PHONE_VALIDATION_FAILURE";

    }
    /* *********************  發送登入信箱驗證碼 END  ******************* */


    /* *********************  獲取年齡相關提示信息 BEGIN  ******************* */
    public static class CommonAgeMessage {
        /*** 生日在現在之前，真是難以置信*/
        public static final String BIRTHDAY_IS_BEFORE = "BIRTHDAY_IS_BEFORE";
    }
    /* *********************  獲取年齡相關提示信息 END  ******************* */

    /* *********************  工作分派表 前端控制器相關提示訊息  BEGIN  ******************* */
    public static class CaseAssignmentMessage {
        /*** 案件信息爲空*/
        public static final String CASE_INFORMATION_EMPTY = "CASE_INFORMATION_EMPTY";
        /*** 工作信息爲空*/
        public static final String WORK_INFORMATION_EMPTY = "WORK_INFORMATION_EMPTY";
        /*** 創建工作分派時，添加工作失敗*/
        public static final String WORK_SAVE_ERROR = "WORK_SAVE_ERROR";
        /*** 請輸入工作id*/
        public static final String WORK_ID_EMPTY = "WORK_ID_EMPTY";
        /*** 該工作不存在*/
        public static final String THIS_WORK_NOT_HAVE = "THIS_WORK_NOT_HAVE";
        /*** 更新工作狀態出錯，工作id：*/
        public static final String UPDATE_WORK_STATE_ERROR = "UPDATE_WORK_STATE_ERROR";
        /*** 請輸入案件id*/
        public static final String PLEASE_ENTER_CASE_ID = "PLEASE_ENTER_CASE_ID";
        /*** 請選擇工作狀態*/
        public static final String PLEASE_CHOOSE_WORK_STATE = "PLEASE_CHOOSE_WORK_STATE";
        /*** 請選擇權限設定*/
        public static final String PLEASE_CHOOSE_ACCESS = "PLEASE_CHOOSE_ACCESS";
        /*** 父id不存在*/
        public static final String FATHER_ID_NOT = "FATHER_ID_NOT";

    }
    /* *********************  工作分派表 前端控制器相關提示訊息  END  ******************* */


    /* ********************* 創建案件溝通記錄相關提示訊息 BEGIN  ******************* */
    public static class CaseCommunicationRecordMessage {
        /*** 請選擇發生時間*/
        public static final String CHOOSE_HAPPEN_TIME = "CHOOSE_HAPPEN_TIME";
        /*** 案件溝通記錄id為空*/
        public static final String CASE_COMMUNICATION_RECORD_ID_EMPTY = "CASE_COMMUNICATION_RECORD_ID_EMPTY";
        /*** 處理方式為空*/
        public static final String TREATMENT_METHOD_EMPTY = "TREATMENT_METHOD_EMPTY";
        /*** 客服帳號類型為空*/
        public static final String SERVICE_ACCOUNT_TYPE_EMPTY = "SERVICE_ACCOUNT_TYPE_EMPTY";
        /*** 客服帳號為空*/
        public static final String SERVICE_ACCOUNT_EMPTY = "SERVICE_ACCOUNT_EMPTY";
        /*** 護膚內容、客服反饋、備註至少需填寫一項內容*/
        public static final String CONTENT_MISSING = "CONTENT_MISSING";
        /*** 回復內容字數超過規定限制*/
        public static final String REPLY_CONTENT_TOO_LONG = "REPLY_CONTENT_TOO_LONG";
        /*** 客戶反饋字數超過規定限制*/
        public static final String DIGITAL_TOO_LONG = "DIGITAL_TOO_LONG";
        /*** 備註字數超過規定限制*/
        public static final String NOTE_DIGITAL_TOO_LONG = "NOTE_DIGITAL_TOO_LONG";

    }
    /* *********************  創建案件溝通記錄相關提示訊息 END  ******************* */

    /* ********************* 案件管理相關提示信息 BEGIN  ******************* */
    public static class CasesMessage {
        /*** 修改案件信息失败*/
        public static final String UPDATE_CASE_INFORMATION_ERROR = "UPDATE_CASE_INFORMATION_ERROR";
        /*** 修改案件信息的備注失败*/
        public static final String UPDATE_CASE_INFORMATION_NOTE_ERROR = "UPDATE_CASE_INFORMATION_NOTE_ERROR";
        /*** 案件ID為空*/
        public static final String CASE_ID_EMPTY = "CASE_ID_EMPTY";
        /*** 案件ID不存在*/
        public static final String NOT_HAVE_CASE_ID = "NOT_HAVE_CASE_ID";
        /*** 履歷添加失敗*/
        public static final String CV_SAVE_ERROR = "CV_SAVE_ERROR";
        /*** 未查詢到相應數據*/
        public static final String NOT_HAVE_DATA = "NOT_HAVE_DATA";
        /*** 此數據已被刪除*/
        public static final String THIS_DATA_NOT_HAVE = "THIS_DATA_NOT_HAVE";
        /*** 更新案件狀態出錯，案件ID：*/
        public static final String UPDATE_CASE_STATE_ERROR = "UPDATE_CASE_STATE_ERROR";
        /*** 案件主旨為空*/
        public static final String CASE_KEYNOTE_EMPTY = "CASE_KEYNOTE_EMPTY";
        /*** 回報通道為空*/
        public static final String RETURN_CHANNEL_EMPTY = "RETURN_CHANNEL_EMPTY";
        /*** 問題回報時間為空*/
        public static final String PROBLEM_RETURN_TIME_EMPTY = "PROBLEM_RETURN_TIME_EMPTY";
        /*** 回報人名字爲空*/
        public static final String RETURN_NAME_EMPTY = "RETURN_NAME_EMPTY";
        /*** 回報人身分爲空*/
        public static final String RETURN_IDENTITY_EMPTY = "RETURN_IDENTITY_EMPTY";
        /*** 回報人email聯係方式爲空*/
        public static final String CONTACT_EMAIL_EMPTY = "CONTACT_EMAIL_EMPTY";
        /*** 客戶名稱描述字數超過規定限制*/
        public static final String CUSTOMER_NAME_WORD_TOO_LONG = "CUSTOMER_NAME_WORD_TOO_LONG";
        /*** 客戶聯係方式帳號字數超過規定限制*/
        public static final String CUSTOMER_CONTACT_NUMBER_WORD_TOO_LONG = "CUSTOMER_CONTACT_NUMBER_WORD_TOO_LONG";
        /*** 問題類型為空*/
        public static final String QUESTIONS_TYPE_EMPTY = "QUESTIONS_TYPE_EMPTY";
        /*** 發生時間爲空*/
        public static final String HAPPEN_TIME_EMPTY = "HAPPEN_TIME_EMPTY";
        /*** 問題描述爲空*/
        public static final String QUESTIONS_DESCRIBE_EMPTY = "QUESTIONS_DESCRIBE_EMPTY";
        /*** 問題描述字數超過規定限制*/
        public static final String QUESTIONS_DESCRIBE_WORD_TOO_LONG = "QUESTIONS_DESCRIBE_WORD_TOO_LONG";
        /*** 未查詢到相應的案件信息*/
        public static final String CASES_GET_ERROR = "CASES_GET_ERROR";
        /*** 案件信息已被刪除*/
        public static final String CASES_DELETED_ERROR = "CASES_DELETED_ERROR";
    }
    /* *********************  案件管理相關提示信息 END  ******************* */


    /* ********************* CRM問題管理相關提示信息 BEGIN  ******************* */
    public static class CrmQuestionMessage {
        /*** 新增問題失敗*/
        public static final String NEW_PROBLEM_ERROR = "NEW_PROBLEM_ERROR";
        /*** 保存問題失敗*/
        public static final String SAVE_PROBLEM_ERROR = "SAVE_PROBLEM_ERROR";
        /*** 删除问题失敗*/
        public static final String DELETE_PROBLEM_ERROR = "DELETE_PROBLEM_ERROR";
        /*** 删除失败！需要先删除该主问题下的副问题！*/
        public static final String DELETE_DATA_ERROR = "DELETE_DATA_ERROR";
        /*** 輸入的案件問題編碼為空*/
        public static final String QUESTION_CODE_EMPTY = "QUESTION_CODE_EMPTY";
    }
    /* *********************  CRM問題管理相關提示信息 END  ******************* */


    /* *********************  審核拒絕,設置相關數據相關提示信息 BEGIN  ******************* */
    public static class CrmAuditCheckOverruleMessage {
        /*** 未查詢審核主檔信息*/
        public static final String NOT_HAVE_REVIEW_MASTER = "NOT_HAVE_REVIEW_MASTER";
        /*** 審核主檔信息已刪除*/
        public static final String REVIEW_MASTER_DELETE = "REVIEW_MASTER_DELETE";
        /*** 審核主檔ID不能為空，請確認*/
        public static final String AUDIT_MASTER_ID_PARAM_ERROR = "AUDIT_MASTER_ID_PARAM_ERROR";
        /*** 審核編碼信息錯誤，請確認*/
        public static final String AUDIT_CODE_ERROR = "AUDIT_CODE_ERROR";
        /*** 未查詢到審核設定信息，請確認*/
        public static final String AUDIT_SETTING_GET_ERROR = "AUDIT_SETTING_GET_ERROR";
        /*** 審核設定信息已被刪除，請確認*/
        public static final String AUDIT_SETTING_DELETED_ERROR = "AUDIT_SETTING_DELETED_ERROR";
        /*** 審核設定信息未設置審核編碼，請確認*/
        public static final String AUDIT_CODE_LACK_ERROR = "AUDIT_CODE_LACK_ERROR";
        /*** 審核人備注為空*/
//        public static final String REVIEWER_EMPTY = "REVIEWER_EMPTY";
        /*** 審核主檔信息更新失敗*/
//        public static final String REVIEW_MASTER_UPDATE_ERROR = "REVIEW_MASTER_UPDATE_ERROR";
        /*** 未查詢審核狀態信息*/
//        public static final String NOT_HAVE_REVIEW_STATUS_DATA = "NOT_HAVE_REVIEW_STATUS_DATA";
        /*** 審核狀態信息已刪除*/
//        public static final String REVIEW_STATUS_DATA_DELETE = "REVIEW_STATUS_DATA_DELETE";
        /*** 審核狀態信息更新失敗*/
//        public static final String REVIEW_STATUS_DATA_UPDATE_ERROR = "REVIEW_STATUS_DATA_UPDATE_ERROR";
        /*** 未查詢到工作分派信息*/
//        public static final String NOT_HAVE_WORK_DISPATCH_DATA = "NOT_HAVE_WORK_DISPATCH_DATA";
        /*** 工作分派信息已刪除*/
//        public static final String WORK_DISPATCH_DATA_DELETE = "WORK_DISPATCH_DATA_DELETE";
        /*** 工作分派信息更新失敗*/
//        public static final String WORK_DISPATCH_DATA_UPDATE_ERROR = "WORK_DISPATCH_DATA_UPDATE_ERROR";
    }
    /* *********************  審核拒絕,設置相關數據相關提示信息  END  ******************* */


    /* *********************  國際化相關提示信息 BEGIN  ******************* */
    public static class SysLanguageMessage {
        /*** 沒有對應的系統語言項目，請確認*/
        public static final String SYS_LANGUAGE_CONTENTS_ITEM_NOT_EXIST_ERROR = "SYS_LANGUAGE_CONTENTS_ITEM_NOT_EXIST_ERROR";
        /*** 已有相同的系統語言項目，請確認*/
        public static final String SYS_LANGUAGE_CONTENTS_ITEM_EXIST_ERROR = "SYS_LANGUAGE_CONTENTS_ITEM_EXIST_ERROR";
        /*** 已有相同的系統語言内容，請確認*/
        public static final String SYS_LANGUAGE_CONTENTS_CONTENT_EXIST_ERROR = "SYS_LANGUAGE_CONTENTS_CONTENT_EXIST_ERROR";
        /*** 獲得的系統語言項目信息數量不符，請確認*/
        public static final String SYS_LANGUAGE_CONTENTS_ITEM_COUNT_ERROR = "SYS_LANGUAGE_CONTENTS_ITEM_COUNT_ERROR";
        /*** 未填寫功能代碼，請重新輸入*/
        public static final String FUNCTION_CODE_PARAM_ERROR = "FUNCTION_CODE_PARAM_ERROR";
        /*** 未填寫項目類型，請重新輸入*/
        public static final String ITEM_TYPE_PARAM_ERROR = "ITEM_TYPE_PARAM_ERROR";
        /*** 未填寫項目編號，請重新輸入*/
        public static final String ITEM_KEY_PARAM_ERROR = "ITEM_KEY_PARAM_ERROR";
        /*** 系統語言項目信息保存失敗，請確認*/
//        public static final String SYS_LANGUAGE_CONTENTS_ITEM_SAVE_ERROR = "SYS_LANGUAGE_CONTENTS_ITEM_SAVE_ERROR";
        /*** 系統語言内容信息保存失敗，請確認*/
//        public static final String SYS_LANGUAGE_CONTENTS_CONTENT_SAVE_ERROR = "SYS_LANGUAGE_CONTENTS_CONTENT_SAVE_ERROR";
    }
    /* *********************  國際化相關提示信息 END  ******************* */


    /* *********************  碼表相關提示信息 BEGIN  ******************* */
    public static class SysCodeMessage {
        /*** 系統碼表信息保存失敗，請確認*/
        public static final String SYS_CODE_SAVE_ERROR = "SYS_CODE_SAVE_ERROR";
        /*** 沒有對應的系統碼表信息，請確認*/
        public static final String SYS_CODE_NOT_EXIST_ERROR = "SYS_CODE_NOT_EXIST_ERROR";
        /*** 已有相同的系統碼表信息，請確認*/
        public static final String SYS_CODE_EXIST_ERROR = "SYS_CODE_EXIST_ERROR";
        /*** 系統碼表信息刪除失敗，請確認*/
        public static final String SYS_CODE_DELETE_ERROR = "SYS_CODE_DELETE_ERROR";
        /*** 已有相同的[詞彙編碼]存在，請確認*/
        public static final String SYS_CODE_CODE_EXIST_ERROR = "SYS_CODE_CODE_EXIST_ERROR";
        /*** 已有相同的[詞彙表KEY]存在，請確認*/
        public static final String SYS_CODE_TYPE_EXIST_ERROR = "SYS_CODE_TYPE_EXIST_ERROR";
        /*** 未填寫詞彙編碼，請重新輸入*/
        public static final String CODE_PARAM_ERROR = "CODE_PARAM_ERROR";
        /*** 詞彙編碼最大長度為10，請重新輸入*/
        public static final String CODE_LENGTH_PARAM_ERROR = "CODE_LENGTH_PARAM_ERROR";
        /*** 未填寫詞彙KEY，請重新輸入*/
        public static final String NAME_KEY_PARAM_ERROR = "NAME_KEY_PARAM_ERROR";
        /*** 詞彙KEY最大長度為100，請重新輸入*/
        public static final String NAME_KEY_LENGTH_PARAM_ERROR = "NAME_KEY_LENGTH_PARAM_ERROR";
        /*** 未填寫詞彙類型，請重新輸入*/
        public static final String TYPE_PARAM_ERROR = "TYPE_PARAM_ERROR";
        /*** 詞彙類型最大長度為100，請重新輸入*/
        public static final String TYPE_LENGTH_PARAM_ERROR = "TYPE_LENGTH_PARAM_ERROR";
        /*** 名稱最大長度為180，請重新輸入*/
        public static final String NAME_LENGTH_PARAM_ERROR = "NAME_LENGTH_PARAM_ERROR";
    }
    /* *********************  碼表相關提示信息 END  ******************* */


    /* *********************  選單相關提示信息 BEGIN  ******************* */
    public static class MenuMessage {
        /*** 選單ID不能為空，請確認*/
        public static final String MENU_ID_PARAM_ERROR = "MENU_ID_PARAM_ERROR";
        /*** 選單編碼不能為空，請確認*/
        public static final String MENU_CODE_PARAM_ERROR = "MENU_CODE_PARAM_ERROR";
        /*** 選單類型不能為空，請確認*/
        public static final String MENU_TYPE_PARAM_ERROR = "MENU_TYPE_PARAM_ERROR";
        /*** 未填寫選單名稱，請重新輸入*/
        public static final String MENU_NAME_PARAM_ERROR = "MENU_NAME_PARAM_ERROR";
        /*** 未填寫上級選單，請重新輸入*/
        public static final String PARENT_ID_PARAM_ERROR = "PARENT_ID_PARAM_ERROR";
        /*** 未填寫選單URL，請重新輸入*/
        public static final String MENU_URL_PARAM_ERROR = "MENU_URL_PARAM_ERROR";
        /*** 無對應的選單信息，請確認*/
        public static final String SYS_MENU_NOT_EXIST_ERROR = "SYS_MENU_NOT_EXIST_ERROR";
        /*** 當前選單信息已被刪除*/
        public static final String SYS_MENU_REMOVE_ERROR = "SYS_MENU_REMOVE_ERROR";
        /*** 選單信息保存失敗，請確認*/
        public static final String SYS_MENU_SAVE_ERROR = "SYS_MENU_SAVE_ERROR";
        /*** 請先刪除子選單或按鈕*/
        public static final String DELETE_SUBMENU_OR_BUTTON_ERROR = "DELETE_SUBMENU_OR_BUTTON_ERROR";
        /*** 上級選單只能為目錄類型，請確認*/
        public static final String PARENT_DIRECTORY_TYPE_ERROR = "PARENT_DIRECTORY_TYPE_ERROR";
        /*** 上級選單只能為選單類型，請確認*/
        public static final String PARENT_MENU_TYPE_ERROR = "PARENT_MENU_TYPE_ERROR";
        /*** 菜單ID信息錯誤，請確認*/
        public static final String MENU_ID_ERROR = "MENU_ID_ERROR";
        /*** 未查詢到初始選單信息，請確認*/
        public static final String INITIAL_MENU_GET_ERROR = "INITIAL_MENU_GET_ERROR";
        /*** 未查詢到初始選單的父級信息，請確認*/
        public static final String PARENT_INITIAL_MENU_GET_ERROR = "PARENT_INITIAL_MENU_GET_ERROR";
        /*** 默認父菜單在客戶菜單中無對應信息，請確認*/
        public static final String PARENT_INITIAL_MENU_CORRESPOND_ERROR = "PARENT_INITIAL_MENU_CORRESPOND_ERROR";
        /*** 未通過選單KEY設置多語言信息，請確認*/
        public static final String CONTENT_LIST_PARAM_ERROR = "CONTENT_LIST_PARAM_ERROR";
    }
    /* *********************  選單相關提示信息 END  ******************* */


    /* *********************  角色相關提示信息 BEGIN  ******************* */
    public static class RoleMessage {
        /*** 角色ID不能為空，請確認*/
        public static final String ROLE_ID_PARAM_ERROR = "ROLE_ID_PARAM_ERROR";
        /*** 無對應的角色信息，請確認*/
        public static final String SYS_ROLE_NOT_EXIST_ERROR = "SYS_ROLE_NOT_EXIST_ERROR";
        /*** 當前角色信息已被刪除*/
        public static final String SYS_ROLE_REMOVE_ERROR = "SYS_ROLE_REMOVE_ERROR";
        /*** 保存角色信息失敗，請確認*/
        public static final String SYS_ROLE_SAVE_ERROR = "SYS_ROLE_SAVE_ERROR";
        /*** 刪除角色信息失敗，請確認*/
        public static final String SYS_ROLE_DELETE_ERROR = "SYS_ROLE_DELETE_ERROR";
        /*** 角色ID信息錯誤，請確認*/
        public static final String ROLE_ID_ERROR = "ROLE_ID_ERROR";
        /*** 未查詢到初始角色信息，請確認*/
        public static final String INITIAL_ROLE_GET_ERROR = "INITIAL_ROLE_GET_ERROR";
        /*** 初始角色ID不能為空，請確認*/
        public static final String INITIAL_ROLE_ID_PARAM_ERROR = "INITIAL_ROLE_ID_PARAM_ERROR";
        /*** 此角色未完成審核事件，不允許切換部門*/
//        public static final String NOT_COMPLETE_AUDIT_NOT_SWITCH_DEPT = "NOT_COMPLETE_AUDIT_NOT_SWITCH_DEPT";
        /*** 此角色未完成審核事件，不允許刪除此角色*/
//        public static final String NOT_COMPLETE_AUDIT_NOT_DELETED_ROLE = "NOT_COMPLETE_AUDIT_NOT_DELETED_ROLE";
        /*** 當前角色已正在進行審核*/
//        public static final String AUDIT_ROLE_ID_AUDITING = "AUDIT_ROLE_ID_AUDITING";
    }
    /* *********************  角色相關提示信息 END  ******************* */


    /* *********************  付款通道提示信息 BEGIN  ******************* */
    public static class PaymentChannelMessage {
        /*** 對帳單編號爲空*/
//        public static final String RECONCILIATION_ID_EMPTY = "RECONCILIATION_ID_EMPTY";
        /*** 對帳單信息表更新失敗*/
//        public static final String RECONCILIATION_MASTER_UPDATE_ERROR = "RECONCILIATION_MASTER_UPDATE_ERROR";
        /*** 帳務處理費爲空*/
//        public static final String FINANCE_FEE_AMOUNT_EMPTY = "FINANCE_FEE_AMOUNT_EMPTY";
        /*** 未詢到對帳單信息表中數據*/
//        public static final String MASTER_ENTITY_EMPTY = "MASTER_ENTITY_EMPTY";
        /*** 關係ID為空*/
//        public static final String RELATION_ID_EMPTY = "RELATION_ID_EMPTY";
        /***未詢到對帳單与支付方式关系信息表中數據 */
//        public static final String RELATION_ENTITY_EMPTY = "RELATION_ENTITY_EMPTY";
        /***對帳單与支付方式关系信息表保存失敗 */
//        public static final String RECONCILIATION_PAYMENT_MODE_RELATION_SAVE_ERROR = "RECONCILIATION_PAYMENT_MODE_RELATION_SAVE_ERROR";
        /***支付方式編碼爲空 */
//        public static final String RELATION_MODE_CODE_EMPTY = "RELATION_MODE_CODE_EMPTY";
        /***對帳單信息表中沒有此對帳單編號 */
//        public static final String RECONCILIATION_MASTER_NOT_HAVE_RECONCILIATION_ID = "RECONCILIATION_MASTER_NOT_HAVE_RECONCILIATION_ID";
        /***平臺支付方式編碼表中沒有此對應的支付方式編碼 */
//        public static final String PAYMENT_MODE_NOT_HAVE_MODE_CODE = "PAYMENT_MODE_NOT_HAVE_MODE_CODE";
    }
    /* *********************  付款通道提示信息 END  ******************* */

    /* *********************  通道與支付方式關係提示信息 BEGIN  ******************* */
    public static class PlatformCodeRelationMessage {
        /*** 通道與對賬單關係編號爲空*/
//        public static final String PAY_PLATFORM_ID_EMPTY = "PAY_PLATFORM_ID_EMPTY";
        /*** 通道與支付方式關係表保存失敗*/
//        public static final String PLATFORM_CODE_RELATION_SAVE_ERROR = "PLATFORM_CODE_RELATION_SAVE_ERROR";
        /*** 支付方式爲空*/
//        public static final String MODE_NAME_EMPTY = "MODE_NAME_EMPTY";
        /*** 最大支付金額爲空*/
//        public static final String PAYMENT_MAX_AMOUNT_EMPTY = "PAYMENT_MAX_AMOUNT_EMPTY";
        /*** 最小支付金額爲空*/
//        public static final String PAYMENT_MIN_AMOUNT_EMPTY = "PAYMENT_MIN_AMOUNT_EMPTY";
        /*** 當月支付總限額爲空*/
//        public static final String MONTH_PAYMENT_AMOUNT_EMPTY = "MONTH_PAYMENT_AMOUNT_EMPTY";
        /*** 通道與支付方式關係表修改失敗*/
//        public static final String PLATFORM_CODE_RELATION_UPDATE_ERROR = "PLATFORM_CODE_RELATION_UPDATE_ERROR";
        /*** 通道與支付方式關係表沒有對應數據*/
//        public static final String CODE_RELATION_ENTITY_EMPTY = "CODE_RELATION_ENTITY_EMPTY";
        /*** 通道與支付方式關係表刪除失敗*/
//        public static final String PLATFORM_CODE_RELATION_DELETE_ERROR = "PLATFORM_CODE_RELATION_DELETE_ERROR";
        /*** 這條數據已被刪除*/
//        public static final String NOT_HAVA_RELATION_ENTITY = "NOT_HAVA_RELATION_ENTITY";
        /*** 支付方式表無對應數據*/
//        public static final String PAYMENT_MODE_ENTITY_EMPTY = "PAYMENT_MODE_ENTITY_EMPTY";
        /*** 通道信息表無對應數據*/
//        public static final String PAYMENT_PLATFORM_MASTER_ENTITY_EMPTY = "PAYMENT_PLATFORM_MASTER_ENTITY_EMPTY";
        /*** 當前通道已設置過相同的支付方式*/
//        public static final String PAYMENT_PLATFORM_CODE_RELATION_REPEAT_ERROR = "PAYMENT_PLATFORM_CODE_RELATION_REPEAT_ERROR";
        /*** 判斷手續費類型否爲空*/
//        public static final String PAYMENT_FEE_TYPE_EMPTY = "PAYMENT_FEE_TYPE_EMPTY";
        /*** 判斷手續費否爲空*/
//        public static final String PAYMENT_FEE_EMPTY = "PAYMENT_FEE_EMPTY";
        /*** 判斷最高手續費是否爲空*/
//        public static final String PAYMENT_FEE_MAX_AMOUNT_EMPTY = "PAYMENT_FEE_MAX_AMOUNT_EMPTY";
        /*** 判斷最低手續費是否爲空*/
//        public static final String PAYMENT_FEE_MIN_AMOUNT_EMPTY = "PAYMENT_FEE_MIN_AMOUNT_EMPTY";
        /*** 通道報送編碼訊息爲空，請確認*/
//        public static final String PAYMENT_PLATFORM_SUBMIT_CODE_ID_EMPTY = "PAYMENT_PLATFORM_SUBMIT_CODE_ID_EMPTY";

    }
    /* *********************  通道與支付方式關係提示信息 END  ******************* */

    /* *********************  客戶組與支付通道關係提示信息 BEGIN  ******************* */
    public static class MerchantGroupPlatformRelationMessage {
        /*** 客戶通道組ID為空*/
        public static final String MERCHANT_GROUP_PLATFORM_RELATION_GROUP_ID_EMPTY = "MERCHANT_GROUP_PLATFORM_RELATION_GROUP_ID_EMPTY";
        /*** 客戶組沒有對應的客戶組ID*/
        public static final String MERCHANT_GROUP_PLATFORM_RELATION_DEPLOY_GROUP_EMPTY = "MERCHANT_GROUP_PLATFORM_RELATION_DEPLOY_GROUP_EMPTY";
        /*** 客戶組與支付通道關係沒有對應數據*/
        public static final String MERCHANT_GROUP_PLATFORM_RELATION_EMPTY = "MERCHANT_GROUP_PLATFORM_RELATION_EMPTY";
        /*** 支付通道編號為空*/
        public static final String MERCHANT_GROUP_PLATFORM_RELATION_PAY_PLATFORM_ID_EMPTY = "MERCHANT_GROUP_PLATFORM_RELATION_PAY_PLATFORM_ID_EMPTY";
        /*** 客戶組與支付通道關係表保存異常*/
        public static final String SAVE_MERCHANT_GROUP_PLATFORM_RELATION_ERROR = "SAVE_MERCHANT_GROUP_PLATFORM_RELATION_ERROR";
        /*** 客戶組與支付通道關係表修改異常*/
        public static final String MERCHANT_GROUP_PLATFORM_RELATION_UPDATE_ERROR = "MERCHANT_GROUP_PLATFORM_RELATION_UPDATE_ERROR";
        /*** 客戶組可用通道訊息已存在，請確認*/
        public static final String MERCHANT_GROUP_PLATFORM_RELATION_ERROR = "MERCHANT_GROUP_PLATFORM_RELATION_ERROR";

    }
    /* *********************  客戶組與支付通道關係提示信息 END  ******************* */


    /* *********************  客戶相關提示信息 BEGIN  ******************* */
        public static class MerchantMessage {
        /*** 客戶組設定客戶保存失敗，請確認*/
        public static final String MERCHANT_GROUP_SAVE_ERROR = "MERCHANT_GROUP_SAVE_ERROR";
        /*** 當前客戶組下有客戶信息無法刪除，請確認*/
        public static final String MERCHANT_GROUP_HAVING_MERCHANT_DELETE_ERROR = "MERCHANT_GROUP_HAVING_MERCHANT_DELETE_ERROR";
        /*** 客戶組設定客戶刪除失敗，請確認*/
        public static final String MERCHANT_GROUP_DELETE_ERROR = "MERCHANT_GROUP_DELETE_ERROR";
        /*** 客戶銀行卡保存失敗，請確認*/
        public static final String MERCHANT_ACCOUNT_SAVE_ERROR = "MERCHANT_ACCOUNT_SAVE_ERROR";
        /*** 客戶銀行卡狀態保存失敗，請確認*/
        public static final String MERCHANT_ACCOUNT_STATUS_SAVE_ERROR = "MERCHANT_ACCOUNT_STATUS_SAVE_ERROR";
        /*** 傳入的uuid爲空，請確認*/
        public static final String MERCHANT_ACCOUNT_UUID_ERROR = "MERCHANT_ACCOUNT_UUID_ERROR";
        /*** 客戶銀行卡刪除失敗，請確認*/
        public static final String MERCHANT_ACCOUNT_DELETE_ERROR = "MERCHANT_ACCOUNT_DELETE_ERROR";
        /**
         * 客戶银行卡审核信息查询失败
         */
        public static final String MERCHANT_BANK_CARD_AUDIT_SELECT_ERROR = "MERCHANT_BANK_CARD_AUDIT_SELECT_ERROR";
        /**
         * 修改客戶银行卡表信息失敗
         */
        public static final String UPDATE_MERCHANT_BANK_CARD_TABLE_ERROR = "UPDATE_MERCHANT_BANK_CARD_TABLE_ERROR";
        /**
         * 修改客戶银行卡审核表信息失敗
         */
        public static final String UPDATE_MERCHANT_BANK_CARD_AUDIT_TABLE_ERROR = "UPDATE_MERCHANT_BANK_CARD_AUDIT_TABLE_ERROR";
        /*** 客戶银行卡信息審核中不能進行解綁操作*/
        public static final String MERCHANT_BANK_STATUS_ERROR = "MERCHANT_BANK_STATUS_ERROR";
        /*** 保存聯絡人失敗，請確認*/
        public static final String MERCHANT_CONTACT_SAVE_ERROR = "MERCHANT_CONTACT_SAVE_ERROR";
        /*** 刪除聯絡人失敗，請確認*/
        public static final String MERCHANT_CONTACT_DELETE_ERROR = "MERCHANT_CONTACT_DELETE_ERROR";
        /*** 修改聯絡人信息狀態失敗，請確認*/
        public static final String MERCHANT_CONTACT_STATUS_SAVE_ERROR = "MERCHANT_CONTACT_STATUS_SAVE_ERROR";
        /*** 客戶合約保存失敗，請確認*/
        public static final String MERCHANT_CONTRACT_SAVE_ERROR = "MERCHANT_CONTRACT_SAVE_ERROR";
        /*** 客戶合約狀態保存失敗，請確認*/
        public static final String MERCHANT_CONTRACT_STATUS_SAVE_ERROR = "MERCHANT_CONTRACT_STATUS_SAVE_ERROR";
        /*** 審核並修改狀態失敗，請確認*/
        public static final String MERCHANT_CONFIRM_SUBMIT_ERROR = "MERCHANT_CONFIRM_SUBMIT_ERROR";
        /*** 客戶基本資料審核信息獲取失敗，請確認*/
        public static final String MERCHANT_DETAILS_AUDIT_GET_ERROR = "MERCHANT_DETAILS_AUDIT_GET_ERROR";
        /*** 客戶基本資料審核信息獲取失敗*/
        public static final String MERCHANT_DETAILS_AUDIT_UPDATE_ERROR = "MERCHANT_DETAILS_AUDIT_UPDATE_ERROR";
        /*** 客戶及银行卡信息保存失敗，請確認*/
        public static final String MERCHANT_UPDATE_BASICS_ERROR = "MERCHANT_UPDATE_BASICS_ERROR";
        /*** 保存文件資料失敗，請確認*/
        public static final String MERCHANT_FILE_RESOURCE_SAVE_ERROR = "MERCHANT_FILE_RESOURCE_SAVE_ERROR";
        /*** 保存客戶組設定失敗，請確認*/
        public static final String SAVE_MERCHANT_GROUP_ERROR = "SAVE_MERCHANT_GROUP_ERROR";
        /*** 保存客戶組狀態失敗，請確認*/
        public static final String SAVE_MERCHANT_GROUP_STATUS_ERROR = "SAVE_MERCHANT_GROUP_STATUS_ERROR";
        /*** 刪除客戶組設定失敗，請確認*/
        public static final String DELETE_MERCHANT_GROUP_ERROR = "DELETE_MERCHANT_GROUP_ERROR";
        /*** 客戶初始選單數據保存失敗，請確認*/
        public static final String MERCHANT_INITIAL_MENU_SAVE_ERROR = "MERCHANT_INITIAL_MENU_SAVE_ERROR";
        /*** 客戶初始選單刪除失敗，請確認*/
        public static final String MERCHANT_INITIAL_MENU_DELETE_ERROR = "MERCHANT_INITIAL_MENU_DELETE_ERROR";
        /*** 客戶默認選單同步失敗，請確認*/
        public static final String MERCHANT_INITIAL_MENU_SYNCHRONIZE_ERROR = "MERCHANT_INITIAL_MENU_SYNCHRONIZE_ERROR";
        /*** 客戶系統初始角色保存失敗，請確認*/
        public static final String MERCHANT_INITIAL_ROLE_SAVE_ERROR = "MERCHANT_INITIAL_ROLE_SAVE_ERROR";
        /*** 客戶系統初始角色刪除失敗，請確認*/
        public static final String MERCHANT_INITIAL_ROLE_DELETE_ERROR = "MERCHANT_INITIAL_ROLE_DELETE_ERROR";
        /*** 客戶系統默認角色同步失敗，請確認*/
        public static final String MERCHANT_INITIAL_ROLE_SYNCHRONIZE_ERROR = "MERCHANT_INITIAL_ROLE_SYNCHRONIZE_ERROR";
        /*** 未查詢到對應的客戶密鑰信息，請確認*/
        public static final String MERCHANT_KEY_GET_ERROR = "MERCHANT_KEY_GET_ERROR";
        /*** 客戶密鑰保存失敗，請確認*/
        public static final String MERCHANT_KEY_SAVE_ERROR = "MERCHANT_KEY_SAVE_ERROR";
        /*** 客戶部門數據保存失敗，請確認*/
        public static final String MERCHANT_SYS_DEPT_SAVE_ERROR = "MERCHANT_SYS_DEPT_SAVE_ERROR";
        /*** 客戶選單數據保存失敗，請確認*/
        public static final String MERCHANT_SYS_MENU_SAVE_ERROR = "MERCHANT_SYS_MENU_SAVE_ERROR";
        /*** 客戶選單刪除失敗，請確認*/
        public static final String MERCHANT_SYS_MENU_DELETE_ERROR = "MERCHANT_SYS_MENU_DELETE_ERROR";
        /*** 客戶角色數據保存失敗，請確認*/
        public static final String MERCHANT_SYS_ROLE_SAVE_ERROR = "MERCHANT_SYS_ROLE_SAVE_ERROR";
        /*** 客戶角色刪除失敗，請確認*/
        public static final String MERCHANT_SYS_ROLE_DELETE_ERROR = "MERCHANT_SYS_ROLE_DELETE_ERROR";
        /*** 客戶子帳號信息保存失敗，請確認*/
        public static final String MERCHANT_SYS_USER_SAVE_ERROR = "MERCHANT_SYS_USER_SAVE_ERROR";
        /*** 客戶子帳號刪除失敗，請確認*/
        public static final String MERCHANT_SYS_USER_DELETE_ERROR = "MERCHANT_SYS_USER_DELETE_ERROR";
        /*** 客戶子帳號-修改狀態失敗，請確認*/
        public static final String MERCHANT_USER_STATUS_SAVE_ERROR = "MERCHANT_USER_STATUS_SAVE_ERROR";
        /*** 輸入組名不能為空，請確認*/
        public static final String GROUP_ID_PARAM_ERROR = "GROUP_ID_PARAM_ERROR";
        /*** 組名ID和客戶ID不能為空，請確認*/
        public static final String GROUP_AND_MERCHANT_ID_PARAM_ERROR = "GROUP_AND_MERCHANT_ID_PARAM_ERROR";
        /*** 當前組名ID和客戶ID已經綁定，請確認*/
        public static final String GROUP_AND_MERCHANT_ID_BIND_ERROR = "GROUP_AND_MERCHANT_ID_BIND_ERROR";
        /*** 請輸入正確的組名ID和客戶ID*/
        public static final String GROUP_AND_MERCHANT_ID_VERIFY_ERROR = "GROUP_AND_MERCHANT_ID_VERIFY_ERROR";
        /*** 客戶銀行卡綁定失敗，請確認*/
        public static final String MERCHANT_ACCOUNT_BIND_ERROR = "MERCHANT_ACCOUNT_BIND_ERROR";
        /*** 客戶銀行卡審核信息保存失敗，請確認*/
        public static final String MERCHANT_ACCOUNT_AUDIT_SAVE_ERROR = "MERCHANT_ACCOUNT_AUDIT_SAVE_ERROR";
        /*** 客戶銀行卡異動信息保存失敗，請確認*/
        public static final String MERCHANT_ACCOUNT_LOG_SAVE_ERROR = "MERCHANT_ACCOUNT_LOG_SAVE_ERROR";
        /*** 更新申請狀態失敗請聯係管理員*/
        public static final String MERCHANT_APPLY_UPDATE_ERROR = "MERCHANT_APPLY_UPDATE_ERROR";
        /*** 客戶申請信息保存失敗*/
        public static final String MERCHANT_APPLY_SAVE_ERROR = "MERCHANT_APPLY_SAVE_ERROR";
        /*** 客戶銀行卡信息獲取失敗*/
        public static final String MERCHANT_ACCOUNT_GET_ERROR = "MERCHANT_ACCOUNT_GET_ERROR";
        /*** 客戶銀行卡信息已被刪除*/
        public static final String MERCHANT_ACCOUNT_DELETED_ERROR = "MERCHANT_ACCOUNT_DELETED_ERROR";
        /*** 客戶銀行卡審核信息獲取失敗*/
        public static final String MERCHANT_ACCOUNT_AUDIT_GET_ERROR = "MERCHANT_ACCOUNT_AUDIT_GET_ERROR";
        /*** 提款密碼生成失敗*/
        public static final String WITHDRAW_PW_GENERATE_ERROR = "WITHDRAW_PW_GENERATE_ERROR";
        /*** 新建聯絡人信息獲取失敗*/
        public static final String MERCHANT_CONTACT_GET_ERROR = "MERCHANT_CONTACT_GET_ERROR";
        /*** 新建聯絡人信息已被刪除*/
        public static final String MERCHANT_CONTACT_DELETED_ERROR = "MERCHANT_CONTACT_DELETED_ERROR";
        /*** 客戶平臺客戶狀態信息保存失敗*/
        public static final String MERCHANT_PLATFORM_INFO_SAVE_ERROR = "MERCHANT_PLATFORM_INFO_SAVE_ERROR";
        /*** 未檢索到客戶平臺數據*/
        public static final String MERCHANT_PLATFORM_INFO_GET_ERROR = "MERCHANT_PLATFORM_INFO_GET_ERROR";
        /*** 客戶數據已提交申請，無法進行再次確認提交*/
        public static final String MERCHANT_REPEAT_SUBMIT_ERROR = "MERCHANT_REPEAT_SUBMIT_ERROR";
        /*** 客戶主檔信息查詢失敗*/
        public static final String MERCHANT_GET_ERROR = "MERCHANT_GET_ERROR";
        /*** 客戶詳情信息查詢失敗*/
        public static final String MERCHANT_DETAILS_GET_ERROR = "MERCHANT_DETAILS_GET_ERROR";
        /*** 客戶詳情信息審核中不能進行修改操作*/
        public static final String MERCHANT_DETAILS_STATUS_ERROR = "MERCHANT_DETAILS_STATUS_ERROR";
        /*** 客戶主賬戶信息保存失敗*/
        public static final String MERCHANT_MAIN_SYS_USER_SAVE_ERROR = "MERCHANT_MAIN_SYS_USER_SAVE_ERROR";
        /*** 客戶頂級部門信息保存失敗*/
        public static final String MERCHANT_MAIN_SYS_DEPT_SAVE_ERROR = "MERCHANT_MAIN_SYS_DEPT_SAVE_ERROR";
        /*** 客戶職員部門關係數據保存失敗*/
        public static final String MERCHANT_SYS_USER_DEPT_SAVE_ERROR = "MERCHANT_SYS_USER_DEPT_SAVE_ERROR";
        /*** 客戶職員角色關係信息保存失敗*/
        public static final String MERCHANT_SYS_USER_ROLE_SAVE_ERROR = "MERCHANT_SYS_USER_ROLE_SAVE_ERROR";
        /*** 客戶選單角色關係信息保存失敗*/
        public static final String MERCHANT_SYS_ROLE_MENU_SAVE_ERROR = "MERCHANT_SYS_ROLE_MENU_SAVE_ERROR";
        /*** 客戶選單角色關係信息刪除失敗*/
        public static final String MERCHANT_SYS_ROLE_MENU_DELETE_ERROR = "MERCHANT_SYS_ROLE_MENU_DELETE_ERROR";
        /*** 輸入的客戶申請ID不能為空，請確認*/
        public static final String MERCHANT_APPLY_ID_PARAM_ERROR = "MERCHANT_APPLY_ID_PARAM_ERROR";
        /*** 未查詢到對應的客戶申請信息，請確認*/
        public static final String MERCHANT_APPLY_GET_ERROR = "MERCHANT_APPLY_GET_ERROR";
        /*** 未查詢到當前客戶聯絡人信息，請確認*/
        public static final String MERCHANT_CONTENT_GET_ERROR = "MERCHANT_CONTENT_GET_ERROR";
        /*** 當前客戶聯絡人信息已被刪除，請確認*/
        public static final String MERCHANT_CONTENT_DELETED_ERROR = "MERCHANT_CONTENT_DELETED_ERROR";
        /*** 客戶聯絡人類別不能爲空，請確認*/
        public static final String MERCHANT_CONTENT_TYPE_PARAM_ERROR = "MERCHANT_CONTENT_TYPE_PARAM_ERROR";
        /*** 客戶ID不能爲空，請確認*/
        public static final String MERCHANT_ID_PARAM_ERROR = "MERCHANT_ID_PARAM_ERROR";
        /*** 客戶聯絡人ID不能爲空，請確認*/
        public static final String MERCHANT_CONTENT_ID_PARAM_ERROR = "MERCHANT_CONTENT_ID_PARAM_ERROR";
        /*** 當前聯絡人為最後一個主要聯絡人，不能刪除*/
        public static final String MERCHANT_CONTENT_DELETE_ERROR = "MERCHANT_CONTENT_DELETE_ERROR";
        /*** 請添加一個主要聯係人並審核通過時,再修改此聯係人*/
        public static final String MERCHANT_CONTENT_UPDATE_ERROR = "MERCHANT_CONTENT_UPDATE_ERROR";
        /*** 客戶詳情信息保存失敗*/
        public static final String MERCHANT_DETAILS_SAVE_ERROR = "MERCHANT_DETAILS_SAVE_ERROR";
        /*** 姓名不能爲空，請確認*/
        public static final String MERCHANT_NAME_PARAM_ERROR = "MERCHANT_NAME_PARAM_ERROR";
        /*** 職稱不能爲空，請確認*/
        public static final String MERCHANT_JOB_PARAM_ERROR = "MERCHANT_JOB_PARAM_ERROR";
        /*** 電話不能爲空，請確認*/
        public static final String MERCHANT_PHONE_PARAM_ERROR = "MERCHANT_PHONE_PARAM_ERROR";
        /*** Email不能爲空，請確認*/
        public static final String MERCHANT_EMAIL_PARAM_ERROR = "MERCHANT_EMAIL_PARAM_ERROR";
        /*** 未查詢到當前客戶合約信息，請確認*/
        public static final String MERCHANT_CONTRACT_GET_ERROR = "MERCHANT_CONTRACT_GET_ERROR";
        /*** 未查詢到當前文件資源信息，請確認*/
        public static final String MERCHANT_FILE_RESOURCE_GET_ERROR = "MERCHANT_FILE_RESOURCE_GET_ERROR";
        /*** 當前文件資源信息已被刪除，請確認*/
        public static final String MERCHANT_FILE_RESOURCE_DELETED_ERROR = "MERCHANT_FILE_RESOURCE_DELETED_ERROR";
        /*** 客戶組名稱未設置，請確認*/
        public static final String MERCHANT_GROUP_NAME_PARAM_ERROR = "MERCHANT_GROUP_NAME_PARAM_ERROR";
        /*** 當前輸入的客戶組名重複，請確認*/
        public static final String MERCHANT_GROUP_NAME_REPEAT_ERROR = "MERCHANT_GROUP_NAME_REPEAT_ERROR";
        /*** 未查詢到當前客戶組信息，請確認*/
        public static final String MERCHANT_GROUP_GET_ERROR = "MERCHANT_GROUP_GET_ERROR";
        /*** 客戶支付方式明細信息保存失敗*/
        public static final String MERCHANT_PAYMENT_ITEM_SAVE_ERROR = "MERCHANT_PAYMENT_ITEM_SAVE_ERROR";
        /*** 客戶支付方式主信息保存失敗*/
        public static final String MERCHANT_PAYMENT_MASTER_SAVE_ERROR = "MERCHANT_PAYMENT_MASTER_SAVE_ERROR";
        /*** 客戶支付方式明細信息修改失敗*/
        public static final String MERCHANT_PAYMENT_ITEM_UPDATE_ERROR = "MERCHANT_PAYMENT_ITEM_UPDATE_ERROR";
        /*** 客戶支付方式主信息獲取失敗*/
        public static final String MERCHANT_PAYMENT_MASTER_GET_ERROR = "MERCHANT_PAYMENT_MASTER_GET_ERROR";
        /*** 客戶支付方式主信息已被刪除*/
        public static final String MERCHANT_PAYMENT_MASTER_DELETED_ERROR = "MERCHANT_PAYMENT_MASTER_DELETED_ERROR";
        /*** 請至少選擇一位客戶進行同步*/
        public static final String MERCHANT_INITIAL_SYNCHRONIZE_PARAM_ERROR = "MERCHANT_INITIAL_SYNCHRONIZE_PARAM_ERROR";
        /*** 已存在相同的客戶初始選單信息，請確認*/
        public static final String MERCHANT_INITIAL_MENU_REPEAT_ERROR = "MERCHANT_INITIAL_MENU_REPEAT_ERROR";
        /*** 客戶初始選單ID不能爲空*/
        public static final String MERCHANT_INITIAL_MENU_ID_PARAM_ERROR = "MERCHANT_INITIAL_MENU_ID_PARAM_ERROR";
        /*** 未查詢到客戶初始選單的對應數據*/
        public static final String MERCHANT_INITIAL_MENU_ID_GET_ERROR = "MERCHANT_INITIAL_MENU_ID_GET_ERROR";
        /*** 客戶主檔信息保存失敗*/
        public static final String MERCHANT_SAVE_ERROR = "MERCHANT_SAVE_ERROR";
        /*** 客戶賬戶餘額信息保存失敗*/
        public static final String MERCHANT_BALANCE_SAVE_ERROR = "MERCHANT_BALANCE_SAVE_ERROR";
        /*** 公司名稱不能爲空，請確認*/
        public static final String MERCHANT_COMPANY_NAME_PARAM_ERROR = "MERCHANT_COMPANY_NAME_PARAM_ERROR";
        /*** 公司登記地址不能爲空，請確認*/
        public static final String MERCHANT_REGISTERED_ADDRESS_PARAM_ERROR = "MERCHANT_REGISTERED_ADDRESS_PARAM_ERROR";
        /*** 戶籍地址不能爲空，請確認*/
        public static final String MERCHANT_CENSUS_REGISTER_ADDRESS_PARAM_ERROR = "MERCHANT_CENSUS_REGISTER_ADDRESS_PARAM_ERROR";
        /*** 公司負責人身分證不能爲空，請確認*/
        public static final String MERCHANT_OWNER_ID_PARAM_ERROR = "MERCHANT_OWNER_ID_PARAM_ERROR";
        /*** 發證年份不能爲空，請確認*/
        public static final String MERCHANT_DATE_OF_ISSUE_PARAM_ERROR = "MERCHANT_DATE_OF_ISSUE_PARAM_ERROR";
        /*** 公司代表電話不能爲空，請確認*/
        public static final String MERCHANT_PHONE_NUMBER_PARAM_ERROR = "MERCHANT_PHONE_NUMBER_PARAM_ERROR";
        /*** 公司營業地址不能爲空，請確認*/
        public static final String MERCHANT_BUSINESS_ADDRESS_PARAM_ERROR = "MERCHANT_BUSINESS_ADDRESS_PARAM_ERROR";
        /*** 公司產業別不能爲空，請確認*/
        public static final String MERCHANT_INDUSTRY_CATEGORY_PARAM_ERROR = "MERCHANT_INDUSTRY_CATEGORY_PARAM_ERROR";
        /*** 匯款銀行名稱不能爲空，請確認*/
        public static final String MERCHANT_BANK_CODE_PARAM_ERROR = "MERCHANT_BANK_CODE_PARAM_ERROR";
        /*** 匯款分行名稱不能爲空，請確認*/
        public static final String MERCHANT_BANK_NAME_PARAM_ERROR = "MERCHANT_BANK_NAME_PARAM_ERROR";
        /*** 匯款帳戶名稱不能爲空，請確認*/
        public static final String MERCHANT_ACCOUNT_NAME_PARAM_ERROR = "MERCHANT_ACCOUNT_NAME_PARAM_ERROR";
        /*** 匯款帳號不能爲空，請確認*/
        public static final String MERCHANT_ACCOUNT_ID_PARAM_ERROR = "MERCHANT_ACCOUNT_ID_PARAM_ERROR";
        /*** 聯絡人姓名不能爲空，請確認*/
        public static final String MERCHANT_CONTACT_NAME_PARAM_ERROR = "MERCHANT_CONTACT_NAME_PARAM_ERROR";
        /*** 文件圖片資源不能爲空，請確認*/
        public static final String MERCHANT_FILE_RESOURCE_ID_PARAM_ERROR = "MERCHANT_FILE_RESOURCE_ID_PARAM_ERROR";
        /*** 客戶圖片類型不能爲空，請確認*/
        public static final String MERCHANT_IMAGE_TYPE_PARAM_ERROR = "MERCHANT_IMAGE_TYPE_PARAM_ERROR";
        /*** 合約編號不能爲空，請確認*/
        public static final String MERCHANT_CONTRACT_NUMBER_PARAM_ERROR = "MERCHANT_CONTRACT_NUMBER_PARAM_ERROR";
        /*** 合約版號不能爲空，請確認*/
        public static final String MERCHANT_CONTRACT_VERSION_NUMBER_PARAM_ERROR = "MERCHANT_CONTRACT_VERSION_NUMBER_PARAM_ERROR";
        /*** 專案類型不能爲空，請確認*/
        public static final String MERCHANT_CONTRACT_PROJECT_TYPE_PARAM_ERROR = "MERCHANT_CONTRACT_PROJECT_TYPE_PARAM_ERROR";
        /*** 幣別不能爲空，請確認*/
        public static final String MERCHANT_CURRENCY_ID_PARAM_ERROR = "MERCHANT_CURRENCY_ID_PARAM_ERROR";
        /*** 應付金額不能爲空，請確認*/
        public static final String MERCHANT_AMOUNTS_PAYABLE_PARAM_ERROR = "MERCHANT_AMOUNTS_PAYABLE_PARAM_ERROR";
        /*** 繳費方案不能爲空，請確認*/
        public static final String MERCHANT_PAYMENT_PLAN_PARAM_ERROR = "MERCHANT_PAYMENT_PLAN_PARAM_ERROR";
        /*** 付款日期不能爲空，請確認*/
        public static final String MERCHANT_PAYMENT_DATE_PARAM_ERROR = "MERCHANT_PAYMENT_DATE_PARAM_ERROR";
        /*** 合約開始日與結束日不能爲空，請確認*/
        public static final String MERCHANT_CONTRACT_START_AND_END_PARAM_ERROR = "MERCHANT_CONTRACT_START_AND_END_PARAM_ERROR";
        /*** 當前客戶已有相同的合約編號存在，請勿重複添加*/
        public static final String CONTRACT_NUMBER_REPEAT_ERROR = "CONTRACT_NUMBER_REPEAT_ERROR";
        /*** 當前客戶已有相同的合約版號存在，請勿重複添加*/
        public static final String CONTRACT_VERSION_NUMBER_REPEAT_ERROR = "CONTRACT_VERSION_NUMBER_REPEAT_ERROR";
        /*** 部門資訊已被刪除，請確認*/
        public static final String MERCHANT_DEPT_IS_DELETE_ERROR = "MERCHANT_DEPT_IS_DELETE_ERROR";
        /*** 未查詢到部門信息，請確認*/
        public static final String MERCHANT_DEPT_GET_ERROR = "MERCHANT_DEPT_GET_ERROR";
        /*** 最高級部門不可刪除，請確認*/
        public static final String MERCHANT_DEPT_SUPER_DEPT_ERROR = "MERCHANT_DEPT_SUPER_DEPT_ERROR";
        /*** 請先刪除相關子部門資訊*/
        public static final String MERCHANT_DEPT_HAVE_SUB_DEPT_ERROR = "MERCHANT_DEPT_HAVE_SUB_DEPT_ERROR";
        /*** 已存在相同的客戶選單信息，請確認*/
        public static final String MERCHANT_SYS_MENU_REPEAT_ERROR = "MERCHANT_SYS_MENU_REPEAT_ERROR";
        /*** 未查詢到客戶選單信息，請確認*/
        public static final String MERCHANT_SYS_MENU_GET_ERROR = "MERCHANT_SYS_MENU_GET_ERROR";
        /*** 更新密碼失敗，請確認*/
        public static final String MERCHANT_SYS_USER_PASSWORD_SAVE_ERROR = "MERCHANT_SYS_USER_PASSWORD_SAVE_ERROR";
        /*** 客戶職員ID不能爲空，請確認*/
        public static final String MERCHANT_USER_ID_PARAM_ERROR = "MERCHANT_USER_ID_PARAM_ERROR";
        /*** 未查詢到客戶職員信息，請確認*/
        public static final String MERCHANT_SYS_USER_GET_ERROR = "MERCHANT_SYS_USER_GET_ERROR";
        /*** 當前客戶已存在相同的匯款帳號，請勿重複添加*/
        public static final String MERCHANT_ACCOUNT_ID_REPEAT_ERROR = "MERCHANT_ACCOUNT_ID_REPEAT_ERROR";
        /*** 當前客戶匯款帳號正在審核中或已駁回，請勿重複添加*/
        public static final String MERCHANT_ACCOUNT_ID_STATUS_ERROR = "MERCHANT_ACCOUNT_ID_STATUS_ERROR";
        /*** 業務聯絡人和保證人不能相同*/
        public static final String CONTACT_NAME_AND_ENSURE_NAME_NOT_THE_SAME = "CONTACT_NAME_AND_ENSURE_NAME_NOT_THE_SAME";
        /*** 當前客戶聯絡人為最後一個主要聯絡人，禁止停用*/
        public static final String MERCHANT_CONTENT_STATUS_ERROR = "MERCHANT_CONTENT_STATUS_ERROR";
        /*** 客戶網址付及3D授權設定保存失敗*/
        public static final String QUICKPAY_AND_SETTING_SAVE_ERROR = "QUICKPAY_AND_SETTING_SAVE_ERROR";
        /*** 客戶URL設定審核訊息已被刪除，請確認*/
        public static final String MERCHANT_URL_SETTING_AUDIT_DELETE_ERROR = "MERCHANT_URL_SETTING_AUDIT_DELETE_ERROR";
        /*** 客戶URL設定訊息已被刪除，請確認*/
        public static final String MERCHANT_URL_SETTING_DELETE_ERROR = "MERCHANT_URL_SETTING_DELETE_ERROR";
        /*** 客戶URL設定訊息修改失敗。*/
        public static final String MERCHANT_URL_SETTING_UPDATE_ERROR = "MERCHANT_URL_SETTING_UPDATE_ERROR";
        /*** 客戶URL設定審核中不能進行修改操作*/
        public static final String MERCHANT_URL_SETTING_STATUS_ERROR = "MERCHANT_URL_SETTING_STATUS_ERROR";
        /*** 客戶URL設定表新增url設定失敗,請檢測數據*/
        public static final String MERCHANT_URL_SETTING_INSERT_ERROR = "MERCHANT_URL_SETTING_INSERT_ERROR";
        /*** 客戶URL設定審核表新增url設定審核失敗,請檢測數據*/
        public static final String MERCHANT_URL_SETTING_AUDIT_INSERT_ERROR = "MERCHANT_URL_SETTING_AUDIT_INSERT_ERROR";
        /*** 當前銀行卡是客戶最後一個可用銀行卡，禁止解綁*/
        public static final String MERCHANT_ACCOUNT_UNBINDING_PROHIBIT_ERROR = "MERCHANT_ACCOUNT_UNBINDING_PROHIBIT_ERROR";
        /*** 當前銀行卡是客戶最後一個可用銀行卡，禁止停用*/
        public static final String MERCHANT_ACCOUNT_ENABLED_STATUS_ERROR = "MERCHANT_ACCOUNT_ENABLED_STATUS_ERROR";
        /**
         * 客戶可用通道訊息已存在，請確認
         */
        public static final String MERCHANT_PLATFORM_RELATION_ERROR = "MERCHANT_PLATFORM_RELATION_ERROR";
        /**
         * 客戶可用通道訊息添加失敗，請確認
         */
        public static final String MERCHANT_PLATFORM_RELATION_SAVE_ERROR = "MERCHANT_PLATFORM_RELATION_SAVE_ERROR";
        /**
         * 客戶可用通道訊息修改失敗，請確認
         */
        public static final String MERCHANT_PLATFORM_RELATION_UPDATE_ERROR = "MERCHANT_PLATFORM_RELATION_UPDATE_ERROR";
        /**
         * 客戶可用通道訊息查詢失敗，請確認
         */
        public static final String MERCHANT_PLATFORM_RELATION_SELECT_ERROR = "MERCHANT_PLATFORM_RELATION_SELECT_ERROR";
        /**
         * 當前選擇的MccCode為大項,請選擇MccCode細項
         */
        public static final String MERCHANT_DETAILS_MCC_CODE_CHOOSE_ERROR = "MERCHANT_DETAILS_MCC_CODE_CHOOSE_ERROR";
        /**
         * 當前選擇的營業類別大項,請選擇營業類別小項
         */
        public static final String MERCHANT_DETAILS_BUSINESS_CATEGORY_MAJOR_CHOOSE_ERROR = "MERCHANT_DETAILS_BUSINESS_CATEGORY_MAJOR_CHOOSE_ERROR";
        /**
         * 當前選擇的營業類別中項,請選擇營業類別小項
         */
        public static final String MERCHANT_DETAILS_BUSINESS_CATEGORY_MEDIUM_CHOOSE_ERROR = "MERCHANT_DETAILS_BUSINESS_CATEGORY_MEDIUM_CHOOSE_ERROR";
        /**
         * 營養類別最多只能選擇三個,不能選擇超過三個
         */
        public static final String MERCHANT_DETAILS_BUSINESS_CATEGORY_CHOOSE_MUCH_ERROR = "MERCHANT_DETAILS_BUSINESS_CATEGORY_CHOOSE_MUCH_ERROR";
        /***當前客戶申請未綁定指派業務負責人*/
        public static final String THIS_MERCHANT_NOT_BIND_ASSIGN_BUSINESS_USER = "THIS_MERCHANT_NOT_BIND_ASSIGN_BUSINESS_USER";
        /***當前登錄人不是指派業務負責人*/
        public static final String ASSIGN_BUSINESS_USER_NO_LOGIN_USER = "ASSIGN_BUSINESS_USER_NO_LOGIN_USER";
        /***  客戶地址詳情审核訊息保存失敗。*/
        public static final String MERCHANT_DETAILS_ADDRESS_AUDIT_SAVE_ERROR = "MERCHANT_DETAILS_ADDRESS_AUDIT_SAVE_ERROR";
        /***  客戶地址詳情訊息修改失敗。*/
        public static final String MERCHANT_DETAILS_ADDRESS_UPDATE_ERROR = "MERCHANT_DETAILS_ADDRESS_UPDATE_ERROR";
        /***  客戶地址詳情审核訊息修改失敗。*/
        public static final String MERCHANT_DETAILS_ADDRESS_AUDIT_UPDATE_ERROR = "MERCHANT_DETAILS_ADDRESS_AUDIT_UPDATE_ERROR";
        /***  客戶地址詳情訊息保存失敗。*/
        public static final String MERCHANT_DETAILS_ADDRESS_SAVE_ERROR = "MERCHANT_DETAILS_ADDRESS_SAVE_ERROR";
        /***  客戶客戶報送編碼表插入數據失敗,請檢查數據。*/
        public static final String MERCHANT_SUBMIT_CODE_INSERT_ERROR = "MERCHANT_SUBMIT_CODE_INSERT_ERROR";
        /***  只有客戶資料審核狀態為審核通過時才能進行客戶狀態修改,請確認數據。*/
        public static final String MERCHANT_PLATFORM_INFO_AUDIT_STATUS_ERROR = "MERCHANT_PLATFORM_INFO_AUDIT_STATUS_ERROR";
        /***  客戶修改狀態與客戶當前狀態一致,請確認數據。*/
        public static final String MERCHANT_PLATFORM_INFO_MERCHANT_STATUS_ERROR = "MERCHANT_PLATFORM_INFO_MERCHANT_STATUS_ERROR";
        /***  客戶報送編碼表刪除數據失敗,請檢查數據。*/
        public static final String MERCHANT_SUBMIT_CODE_DELETE_ERROR = "MERCHANT_SUBMIT_CODE_DELETE_ERROR";
        /**
         * 當前選擇的MccCode中項,未查到對應分類名稱
         */
        public static final String MERCHANT_DETAILS_MCC_CODE_SELECT_CATEGORY_NAME_ERROR = "MERCHANT_DETAILS_MCC_CODE_SELECT_CATEGORY_NAME_ERROR";
        /***  客戶保證人訊息查詢失敗,請確認數據。*/
        public static final String MERCHANT_GUARANTOR_SELECT_ERROR = "MERCHANT_GUARANTOR_SELECT_ERROR";
        /***  當前客戶保證人訊息已被刪除,請確認數據。*/
        public static final String MERCHANT_GUARANTOR_IS_DELETE_ERROR = "MERCHANT_GUARANTOR_IS_DELETE_ERROR";
        /***  客戶保證人訊息保存失敗,請確認數據。*/
        public static final String MERCHANT_GUARANTOR_SAVE_ERROR = "MERCHANT_GUARANTOR_SAVE_ERROR";
        /***  客戶保證人訊息修改失敗,請確認數據。*/
        public static final String MERCHANT_GUARANTOR_UPDATE_ERROR = "MERCHANT_GUARANTOR_UPDATE_ERROR";
        /*** 當前客戶支付方式下支付工具已存在一個審核事件，請審核后再進行修改*/
        public static final String MERCHANT_PAYMENT_MASTER_TOOLS_TYPE_ALREADY_AUDIT_ERROR = "MERCHANT_PAYMENT_MASTER_TOOLS_TYPE_ALREADY_AUDIT_ERROR";
        /*** IP地址數量最多5條，請重新輸入*/
        public static final String MERCHANT_SYS_USER_IP_ADDRESS_QUANTITY_ERROR = "MERCHANT_SYS_USER_IP_ADDRESS_QUANTITY_ERROR";
        /*** 當前職員郵箱已存在，請重新輸入*/
        public static final String MERCHANT_SYS_USER_EMAIL_REPEAT_ERROR = "MERCHANT_SYS_USER_EMAIL_REPEAT_ERROR";
        /*** 當前職員登錄郵箱已在客戶审核中，請確認*/
        public static final String MERCHANT_APPLY_EMAIL_REPEAT_ERROR = "MERCHANT_APPLY_EMAIL_REPEAT_ERROR";
        /*** 當前公司編碼已存在，請重新輸入*/
        public static final String SAVE_ENTERPRISE_CODE_HAVE_ERROR = "SAVE_ENTERPRISE_CODE_HAVE_ERROR";
        /*** 公司訊息保存失敗，請確認數據*/
        public static final String SAVE_ENTERPRISE_ERROR = "SAVE_ENTERPRISE_ERROR";
        /*** 客戶銀行卡審核通過失敗，請確認*/
//        public static final String MERCHANT_ACCOUNT_EXAMINE_ALLOW_ERROR = "MERCHANT_ACCOUNT_EXAMINE_ALLOW_ERROR";
        /*** 客戶銀行卡審核驳回失敗，請確認*/
//        public static final String MERCHANT_ACCOUNT_EXAMINE_REJECT_ERROR = "MERCHANT_ACCOUNT_EXAMINE_REJECT_ERROR";
        /*** 客戶銀行卡修改標識失敗，請確認*/
//        public static final String MERCHANT_ACCOUNT_UPDATE_TAG_ERROR = "MERCHANT_ACCOUNT_UPDATE_TAG_ERROR";
        /*** 保存客戶公告語言信息表失敗，請確認*/
//        public static final String MERCHANT_BULLETIN_CONTENT_SAVE_ERROR = "MERCHANT_BULLETIN_CONTENT_SAVE_ERROR";
        /*** 保存客戶公告信息失敗，請確認*/
//        public static final String MERCHANT_BULLETIN_SAVE_ERROR = "MERCHANT_BULLETIN_SAVE_ERROR";
        /*** 刪除客戶公告信息失敗，請確認*/
//        public static final String MERCHANT_BULLETIN_DELETE_ERROR = "MERCHANT_BULLETIN_DELETE_ERROR";
        /*** 客戶合約刪除失敗，請確認*/
//        public static final String MERCHANT_CONTRACT_DELETE_ERROR = "MERCHANT_CONTRACT_DELETE_ERROR";
        /*** 刪除文件資料失敗，請確認*/
//        public static final String MERCHANT_FILE_RESOURCE_DELETE_ERROR = "MERCHANT_FILE_RESOURCE_DELETE_ERROR";
        /*** 客戶初始部門數據保存失敗，請確認*/
//        public static final String MERCHANT_INITIAL_DEPT_SAVE_ERROR = "MERCHANT_INITIAL_DEPT_SAVE_ERROR";
        /*** 客戶初始部門刪除失敗，請確認*/
//        public static final String MERCHANT_INITIAL_DEPT_DELETE_ERROR = "MERCHANT_INITIAL_DEPT_DELETE_ERROR";
        /*** 客戶IP地址不能爲空，請確認*/
//        public static final String MERCHANT_IP_ADDRESS_PARAM_ERROR = "MERCHANT_IP_ADDRESS_PARAM_ERROR";
        /*** 客戶IP綁定申請失敗，請確認*/
//        public static final String MERCHANT_IPS_SAVE_ERROR = "MERCHANT_IPS_SAVE_ERROR";
        /*** 客戶IP修改-解除綁定失敗，請確認*/
//        public static final String MERCHANT_IPS_UPDATE_ERROR = "MERCHANT_IPS_UPDATE_ERROR";
        /*** 此客戶下的IP不存在,請檢測數據*/
//        public static final String MERCHANT_IPS_NOT_HAVE_ERROR = "MERCHANT_IPS_NOT_HAVE_ERROR";
        /*** 當前客戶下已存在相同IP,請檢測數據*/
//        public static final String MERCHANT_IPS_ALREADY_HAVE_ERROR = "MERCHANT_IPS_ALREADY_HAVE_ERROR";
        /*** 客戶IP綁定申請-審核通過失敗，請確認*/
//        public static final String MERCHANT_IPS_THROUGH_ERROR = "MERCHANT_IPS_THROUGH_ERROR";
        /*** 客戶IP綁定申請-審核駁回失敗，請確認*/
//        public static final String MERCHANT_IPS_REJECT_ERROR = "MERCHANT_IPS_REJECT_ERROR";
        /*** 客戶帳號登錄記錄保存失敗，請確認*/
//        public static final String MERCHANT_LOGIN_LOG_SAVE_ERROR = "MERCHANT_LOGIN_LOG_SAVE_ERROR";
        /*** 客戶手機綁定申請保存失敗，請確認*/
//        public static final String MERCHANT_PHONE_SAVE_ERROR = "MERCHANT_PHONE_SAVE_ERROR";
        /*** 客戶手機綁定申請-審核允許通過失敗，請確認*/
//        public static final String MERCHANT_PHONE_ALLOW_ERROR = "MERCHANT_PHONE_ALLOW_ERROR";
        /*** 客戶手機綁定申請-審核駁回失敗，請確認*/
//        public static final String MERCHANT_PHONE_REJECT_ERROR = "MERCHANT_PHONE_REJECT_ERROR";
        /*** 客戶部門刪除失敗，請確認*/
//        public static final String MERCHANT_SYS_DEPT_DELETE_ERROR = "MERCHANT_SYS_DEPT_DELETE_ERROR";
        /*** 客戶子帳號-修改密碼失敗，請確認*/
//        public static final String MERCHANT_LOGIN_PW_SAVE_ERROR = "MERCHANT_LOGIN_PW_SAVE_ERROR";
        /*** 更新審核狀態失敗請聯係管理員*/
//        public static final String MERCHANT_AUDIT_UPDATE_ERROR = "MERCHANT_AUDIT_UPDATE_ERROR";
        /*** 審批數據不符合，請刷新重試*/
//        public static final String AUDIT_DATA_ERROR = "AUDIT_DATA_ERROR";
        /*** 銀行卡數據不符合，請刷新重試*/
//        public static final String ACCOUNT_DATA_ERROR = "ACCOUNT_DATA_ERROR";
        /*** 當前客戶銀行卡申請狀態為修改或解綁,請檢查客戶銀行卡狀態*/
//        public static final String MERCHANT_ACCOUNT_STATUS_ERROR = "MERCHANT_ACCOUNT_STATUS_ERROR";
        /*** 客戶平臺信息保存失敗*/
//        public static final String MERCHANT_PLATFORM_SAVE_ERROR = "MERCHANT_PLATFORM_SAVE_ERROR";
        /*** 客戶公告語言信息主鍵不能爲空，請確認*/
//        public static final String MERCHANT_BULLETIN_CONTENT_ID_ERROR = "MERCHANT_BULLETIN_CONTENT_ID_ERROR";
        /*** 未查詢到當前客戶公告語言信息，請確認*/
//        public static final String MERCHANT_BULLETIN_CONTENT_GET_ERROR = "MERCHANT_BULLETIN_CONTENT_GET_ERROR";
        /*** 客戶公告信息主鍵不能爲空，請確認*/
//        public static final String MERCHANT_BULLETIN_ID_ERROR = "MERCHANT_BULLETIN_ID_ERROR";
        /*** 未查詢到當前客戶公告信息，請確認*/
//        public static final String MERCHANT_BULLETIN_GET_ERROR = "MERCHANT_BULLETIN_GET_ERROR";
        /*** 資源ID不能为空，請確認*/
//        public static final String MERCHANT_FILE_ID_PARAM_ERROR = "MERCHANT_FILE_ID_PARAM_ERROR";
        /*** 傳入圖片不能爲空，請確認*/
//        public static final String MERCHANT_IMAGE_PARAM_ERROR = "MERCHANT_IMAGE_PARAM_ERROR";
        /*** 客戶支付方式結算設置信息保存失敗*/
//        public static final String MERCHANT_PAYMENT_SETTLEMENT_SAVE_ERROR = "MERCHANT_PAYMENT_SETTLEMENT_SAVE_ERROR";
        /*** 客戶支付方式結算設置信息修改失敗*/
//        public static final String MERCHANT_PAYMENT_SETTLEMENT_UPDATE_ERROR = "MERCHANT_PAYMENT_SETTLEMENT_UPDATE_ERROR";
        /*** 客戶支付方式主信息審核狀態不正確，請確認*/
//        public static final String MERCHANT_PAYMENT_MASTER_STATUS_TYPE_ERROR = "MERCHANT_PAYMENT_MASTER_STATUS_TYPE_ERROR";
        /*** 客戶初始化部門ID不能為空*/
//        public static final String MERCHANT_INITIAL_DEPT_ID_PARAM_ERROR = "MERCHANT_INITIAL_DEPT_ID_PARAM_ERROR";
        /*** 未查詢到客戶初始化部門的對應數據*/
//        public static final String MERCHANT_INITIAL_DEPT_ID_GET_ERROR = "MERCHANT_INITIAL_DEPT_ID_GET_ERROR";
        /*** 客戶初始化部門數據删除失敗，請確認*/
//        public static final String MERCHANT_INITIAL_DEPT_DELETED_ERROR = "MERCHANT_INITIAL_DEPT_DELETED_ERROR";
        /*** 客戶審核綁定手機信息保存失敗*/
//        public static final String MERCHANT_PHONE_AUDIT_SAVE_ERROR = "MERCHANT_PHONE_AUDIT_SAVE_ERROR";
        /*** 客戶審核綁定手機信息刪除失敗*/
//        public static final String MERCHANT_PHONE_AUDIT_DELETE_ERROR = "MERCHANT_PHONE_AUDIT_DELETE_ERROR";
        /*** 客戶綁定手機異動履歷信息保存失敗*/
//        public static final String MERCHANT_PHONE_LOG_SAVE_ERROR = "MERCHANT_PHONE_LOG_SAVE_ERROR";
        /*** 客戶審核綁定手機ID不能爲空*/
//        public static final String MERCHANT_PHONE_AUDIT_ID_PARAM_ERROR = "MERCHANT_PHONE_AUDIT_ID_PARAM_ERROR";
        /*** 當前客戶是否已將全部信息轉到正式機，請確認*/
//        public static final String MERCHANT_ERROR = "MERCHANT_ERROR";
        /*** 客戶部門ID不能爲空，請確認*/
//        public static final String MERCHANT_DEPT_ID_PARAM_ERROR = "MERCHANT_DEPT_ID_PARAM_ERROR";
        /*** 未查詢到客戶部門信息，請確認*/
//        public static final String MERCHANT_SYS_DEPT_GET_ERROR = "MERCHANT_SYS_DEPT_GET_ERROR";
        /*** 當前職員登錄ID已存在，請重新輸入*/
//        public static final String MERCHANT_SYS_USER_REPEAT_ERROR = "MERCHANT_SYS_USER_REPEAT_ERROR";
        /*** 角色取消參與審核失敗，請先修改審核設定*/
//        public static final String MERCHANT_SYS_ROLE_UPDATE_AUDIT_QUALIFICATION_ERROR = "MERCHANT_SYS_ROLE_UPDATE_AUDIT_QUALIFICATION_ERROR";
        /*** 角色刪除失敗，請先修改審核設定*/
//        public static final String SYS_ROLE_DELETED_AUDIT_QUALIFICATION_ERROR = "SYS_ROLE_DELETED_AUDIT_QUALIFICATION_ERROR";
        /*** 此IP地址被拉入黑名單*/
//        public static final String IP_IN_BLACK_LIST = "IP_IN_BLACK_LIST";
        /*** 此銀行卡號地址被拉入黑名單*/
//        public static final String BANK_NUMBER_IN_BLACK_LIST = "BANK_NUMBER_IN_BLACK_LIST";
        /*** 此手機號地址被拉入黑名單*/
//        public static final String MOBILE_PHONE_IN_BLACK_LIST = "MOBILE_PHONE_IN_BLACK_LIST";
        /*** 此身份證地址被拉入黑名單*/
//        public static final String ID_NUMBER_IN_BLACK_LIST = "ID_NUMBER_IN_BLACK_LIST";
        /*** 此統編地址被拉入黑名單*/
//        public static final String UNIFORM_CODE_IN_BLACK_LIST = "UNIFORM_CODE_IN_BLACK_LIST";
        /*** 當前客戶ID在客戶餘額信息沒有數據,請檢查數據*/
//        public static final String MERCHANT_BALANCE_NOT_HAVE_BY_MERCHANT_ID = "MERCHANT_BALANCE_NOT_HAVE_BY_MERCHANT_ID";
        /*** 當前客戶餘額信息表賬戶餘額不滿足實際撥款金額,請檢查數據*/
//        public static final String MERCHANT_BALANCE_ACCOUNT_BALANCE_NOT_HAVE = "MERCHANT_BALANCE_ACCOUNT_BALANCE_NOT_HAVE";
        /*** 當前客戶餘額信息表截留餘額不滿足實際撥款金額,請檢查數據*/
//        public static final String MERCHANT_BALANCE_FREEZE_BALANCE_NOT_HAVE = "MERCHANT_BALANCE_FREEZE_BALANCE_NOT_HAVE";
        /*** 客戶餘額信息表修改失敗*/
//        public static final String MERCHANT_BALANCE_UPDATE_ERROR = "MERCHANT_BALANCE_UPDATE_ERROR";
        /*** 客戶餘額異動信息表保存失敗*/
//        public static final String MERCHANT_BALANCE_LOG_INSERT_ERROR = "MERCHANT_BALANCE_LOG_INSERT_ERROR";
        /*** 客戶餘額不足，無法將當前訂單轉成失敗單 */
//        public static final String MERCHANT_BALANCE_UPDATE_TRADE_STATUS_ERROR = "MERCHANT_BALANCE_UPDATE_TRADE_STATUS_ERROR";
        /*** 客戶平臺訂單訊息查詢失敗，請確認*/
//        public static final String MERCHANT_ORDER_SELECT_ERROR = "MERCHANT_ORDER_SELECT_ERROR";
        /*** 參數錯誤,請檢查傳入的訂單ID是否爲空*/
//        public static final String MERCHANT_ORDER_ORDER_ID_ERROR = "MERCHANT_ORDER_ORDER_ID_ERROR";
        /*** 參數錯誤,請檢查傳入的請款時間是否爲空*/
//        public static final String MERCHANT_ORDER_PLATFORM_SETTLE_AMOUNT_TIME_ERROR = "MERCHANT_ORDER_PLATFORM_SETTLE_AMOUNT_TIME_ERROR";
        /*** 客戶平臺訂單訊息修改失敗，請確認*/
//        public static final String MERCHANT_ORDER_UPDATE_ERROR = "MERCHANT_ORDER_UPDATE_ERROR";
        /*** 訂單退款次數不能超過兩次，請確認*/
//        public static final String ORDER_REFUND_COUNT_ERROR = "ORDER_REFUND_COUNT_ERROR";
        /*** 訂單退款記錄訊息添加失敗，請確認*/
//        public static final String ORDER_REFUND_RECORD_SAVE_ERROR = "ORDER_REFUND_RECORD_SAVE_ERROR";
        /*** 訂單退款記錄訊息修改失敗，請確認*/
//        public static final String ORDER_REFUND_RECORD_UPDATE_ERROR = "ORDER_REFUND_RECORD_UPDATE_ERROR";
        /*** 訂單退款記錄訊息查詢失敗，請確認*/
//        public static final String ORDER_REFUND_RECORD_SELECT_ERROR = "ORDER_REFUND_RECORD_SELECT_ERROR";
        /*** 狀態異常，不能進行退款，請重新查詢數據*/
//        public static final String ORDER_REFUND_RECORD_REFUND_STATUS_ERROR = "ORDER_REFUND_RECORD_REFUND_STATUS_ERROR";
        /*** 僅有“180天内”的訂單能通過管理後臺進行退款操作。*/
//        public static final String ORDER_REFUND_RECORD_REFUND_TIME_ERROR = "ORDER_REFUND_RECORD_REFUND_TIME_ERROR";
        /*** 當前訂單支付通道不支持退款操作。*/
//        public static final String ORDER_REFUND_RECORD_PAYMENT_PLATFORM_ERROR = "ORDER_REFUND_RECORD_PAYMENT_PLATFORM_ERROR";
        /*** 當前訂單支付方式編碼不支持退款操作。*/
//        public static final String ORDER_REFUND_RECORD_PAYMENT_MODE_CODE_ERROR = "ORDER_REFUND_RECORD_PAYMENT_MODE_CODE_ERROR";
        /*** 客戶平臺訂單手續費訊息查詢失敗，請確認*/
//        public static final String MERCHANT_ORDER_FEE_SELECT_ERROR = "MERCHANT_ORDER_FEE_SELECT_ERROR";
        /*** 當前訂單未交易成功無法進行退款，請確認*/
//        public static final String TRADE_STATUS_REFUND_ERROR = "TRADE_STATUS_REFUND_ERROR";
        /*** 訂單退款金額必須大於0，請確認*/
//        public static final String REFUND_AMOUNT_ZERO_ERROR = "REFUND_AMOUNT_ZERO_ERROR";
        /*** 訂單退款記錄表訊息添加失敗，請確認*/
//        public static final String ORDER_REFUND_RECORD_INSERT_ERROR = "ORDER_REFUND_RECORD_INSERT_ERROR";
        /*** 當前支付方式一天只能退款一次，請確認*/
//        public static final String ORDER_REFUND_TWO_TODAY_ERROR = "ORDER_REFUND_TWO_TODAY_ERROR";
        /*** 當前退款金額大於可退款金額，請確認*/
//        public static final String REFUND_AMOUNT_TOO_BIG_ERROR = "REFUND_AMOUNT_TOO_BIG_ERROR";
        /*** 當前退款單退款狀態不為申請退款，無法進行退款單處理*/
//        public static final String REFUND_NOTE_STATUS_ERROR = "REFUND_NOTE_STATUS_ERROR";
        /*** 當前退款單退款手續費未計算完,請五分鐘之後再進行操作*/
//        public static final String ORDER_REFUND_FEE_ERROR = "ORDER_REFUND_FEE_ERROR";
        /*** 訂單轉換前後交易狀態一致，請確認*/
//        public static final String MERCHANT_ORDER_TRADE_STATUS_ERROR = "MERCHANT_ORDER_TRADE_STATUS_ERROR";
        /*** 初始化狀態的訂單不能進行狀態轉換，請確認*/
//        public static final String MERCHANT_ORDER_ORDER_STATUS_ERROR = "MERCHANT_ORDER_ORDER_STATUS_ERROR";
        /** 申請失敗 */
//        public static final String APPLY_FOR_ERROR = "APPLY_FOR_ERROR";
        /** 業務指派負責人ID不能爲空*/
//        public static final String ASSIGN_BUSINESS_USER_ID_PARAM_ERROR = "ASSIGN_BUSINESS_USER_ID_PARAM_ERROR";
        /** 客戶轉正業務指派失敗*/
//        public static final String MERCHANT_APPLY_ASSIGN_BUSINESS_ERROR = "MERCHANT_APPLY_ASSIGN_BUSINESS_ERROR";
        /** 客戶平臺訂單狀態變更履歷訊息添加失敗，請確認 */
//        public static final String MERCHANT_ORDER_LOG_RECORD_SAVE_ERROR = "MERCHANT_ORDER_LOG_RECORD_SAVE_ERROR";
        /***支付方式對應的費用情況信息表數據不存在*/
//        public static final String PAYMENT_ITEM_ENTITY_EMPTY = "PAYMENT_ITEM_ENTITY_EMPTY";
        /***客戶平臺訂單手續費信息表保存失敗*/
//        public static final String ORDER_FEE_SAVE_ERROR = "ORDER_FEE_SAVE_ERROR";
        /***客戶支付方式主信息表沒有此客戶ID*/
//        public static final String NOT_HAVE_MERCHANT_ID = "NOT_HAVE_MERCHANT_ID";
        /*** 修改前後結算時間相同，請確認*/
//        public static final String SETTLEMENT_TIME_ERROR = "SETTLEMENT_TIME_ERROR";
        /*** 客戶平臺訂單銀行卡訊息查詢失敗，請確認*/
//        public static final String MERCHANT_ORDER_CREDIT_CARD_SELECT_ERROR = "MERCHANT_ORDER_CREDIT_CARD_SELECT_ERROR";
        /*** 該訂單尚存在進行中的退款，不能進行再次退款*/
//        public static final String MERCHANT_ORDER_REFUND_PROGRESS_NOT_REFUND = "MERCHANT_ORDER_REFUND_PROGRESS_NOT_REFUND";
        /*** 申請退貨失敗，非信用卡交易不接受退貨*/
//        public static final String FAILED_TO_APPLY_FOR_RETURN = "FAILED_TO_APPLY_FOR_RETURN";
        /*** 當前訂單退款處理中，請不要進行退款操作*/
//        public static final String ORDER_REFUND_RECORD_ERROR = "ORDER_REFUND_RECORD_ERROR";
        /***  第二次申請退款時，須退還剩下所有金額TWD。*/
//        public static final String ORDER_REFUND_AMOUNT_SECOND_REFUND_AMOUNT_ERROR = "ORDER_REFUND_AMOUNT_SECOND_REFUND_AMOUNT_ERROR";
        /***  當前客戶報送功能執行前,客戶客戶報送編碼表不應該存在數據,請檢查數據。*/
//        public static final String MERCHANT_SUBMIT_CODE_HAVE_MESSAGE_ERROR = "MERCHANT_SUBMIT_CODE_HAVE_MESSAGE_ERROR";
        /***  當前客戶重新報送功能執行,客戶客戶報送編碼表應該有數據,請檢查數據。*/
//        public static final String MERCHANT_SUBMIT_CODE_NOT_HAVE_MESSAGE_ERROR = "MERCHANT_SUBMIT_CODE_NOT_HAVE_MESSAGE_ERROR";
        /***  客戶客戶報送編碼表修改數據失敗,請檢查數據。*/
//        public static final String MERCHANT_SUBMIT_CODE_UPDATE_ERROR = "MERCHANT_SUBMIT_CODE_UPDATE_ERROR";
        /***  客戶客戶報送排程表插入數據失敗,請檢查數據。*/
//        public static final String MERCHANT_SUBMIT_TASK_INSERT_ERROR = "MERCHANT_SUBMIT_TASK_INSERT_ERROR";
        /***  當前通道不存在客戶報送訊息,請確認。*/
//        public static final String MERCHANT_SUBMIT_FILE_PATH_ERROR = "MERCHANT_SUBMIT_FILE_PATH_ERROR";
        /***客戶訂單交易失敗異常*/
//        public static final String TRANSACTION_FAILURE_ERROR = "TRANSACTION_FAILURE_ERROR";
        /***  客戶保證人訊息刪除失敗,請確認數據。*/
//        public static final String MERCHANT_GUARANTOR_DELETE_ERROR = "MERCHANT_GUARANTOR_DELETE_ERROR";
    }
    /* *********************  客戶相關提示信息 END  ******************* */

    /* *********************  定時任務相關提示信息 BEGIN  ******************* */
    public static class ScheduleJobMessage {
        /*** 任務id爲空*/
//        public static final String JOB_ID_EMPTY = "JOB_ID_EMPTY";
        /*** 定時任務表數據爲空*/
//        public static final String JOB_ENTITY_EMPTY = "JOB_ENTITY_EMPTY";
        /*** 定時任務保存失敗*/
//        public static final String JOB_ENTITY_SAVE_ERROR = "JOB_ENTITY_SAVE_ERROR";
        /*** 定時任務修改失敗*/
//        public static final String JOB_ENTITY_UPDATE_ERROR = "JOB_ENTITY_UPDATE_ERROR";
        /*** 定時任務刪除失敗*/
//        public static final String JOB_ENTITY_DELETE_ERROR = "JOB_ENTITY_DELETE_ERROR";
        /*** 定時任務日志爲空*/
//        public static final String JOB_LOG_ENTITY_EMPTY = "JOB_LOG_ENTITY_EMPTY";
    }
    /* *********************  定時任務相關提示信息 END  ******************* */


    /* *********************  通知相關提示信息 BEGIN  ******************* */
    public static class NoticeMessage {
        /*** 保存通知主檔失敗，請確認*/
        public static final String NOTICE_MASTER_SAVE_ERROR = "NOTICE_MASTER_SAVE_ERROR";
        /*** 保存通知對象失敗，請確認*/
        public static final String NOTICE_TARGET_SAVE_ERROR = "NOTICE_TARGET_SAVE_ERROR";
        /*** 保存通知内容失敗，請確認*/
        public static final String NOTICE_CONTENT_SAVE_ERROR = "NOTICE_CONTENT_SAVE_ERROR";
        /*** 保存通知參數失敗，請確認*/
        public static final String NOTICE_PARAM_SAVE_ERROR = "NOTICE_PARAM_SAVE_ERROR";
        /*** 通知發送臨時主表保存信息失敗，請確認*/
        public static final String NOTICE_SEND_TEMP_MASTER_SAVE_ERROR = "NOTICE_SEND_TEMP_MASTER_SAVE_ERROR";
        /*** 重新發送通知失敗，請確認*/
        public static final String NOTICE_RESEND_ERROR = "NOTICE_RESEND_ERROR";
        /*** 向選擇的人員列表發送通知失敗*/
        public static final String NOTICE_CHOOSE_SEND_ERROR = "NOTICE_CHOOSE_SEND_ERROR";
        /*** 向全部人員列表發送通知失敗*/
        public static final String NOTICE_ALL_SEND_ERROR = "NOTICE_ALL_SEND_ERROR";
        /*** 修改推送開關狀態失敗*/
        public static final String NOTICE_SWITCHES_SAVE_ERROR = "NOTICE_SWITCHES_SAVE_ERROR";
        /*** 修改通知對象發送語系失敗*/
        public static final String NOTICE_LANGUAGE_SAVE_ERROR = "NOTICE_LANGUAGE_SAVE_ERROR";
        /*** 通知内容不能為空，請確認*/
        public static final String NOTICE_CONTENT_ID_PARAM_ERROR = "NOTICE_CONTENT_ID_PARAM_ERROR";
        /*** 内容格式有誤，{}内必須爲數字0~29之間*/
        public static final String NOTICE_CONTENT_PARAM_ERROR = "NOTICE_CONTENT_PARAM_ERROR";
        /*** 未查詢到通知主檔信息，請確認*/
        public static final String NOTICE_MASTER_GET_ERROR = "NOTICE_MASTER_GET_ERROR";
        /*** 未查詢到通知對象信息，請確認*/
        public static final String NOTICE_TARGET_GET_ERROR = "NOTICE_TARGET_GET_ERROR";
        /*** 未查詢到通知記錄信息，請確認*/
        public static final String NOTICE_SEND_RECORD_GET_ERROR = "NOTICE_SEND_RECORD_GET_ERROR";
        /*** 已設置過相同參數，請確認*/
        public static final String NOTICE_PARAM_KEY_ERROR = "NOTICE_PARAM_KEY_ERROR";
        /*** 通知編碼不能為空，請確認*/
        public static final String NOTICE_CODE_PARAM_ERROR = "NOTICE_CODE_PARAM_ERROR";
        /*** 内容描述不能為空，請確認*/
        public static final String CONTENT_DESCRIPTION_PARAM_ERROR = "CONTENT_DESCRIPTION_PARAM_ERROR";
        /*** 已有相同通知編碼的信息，請確認*/
        public static final String NOTICE_CODE_REPEAT_ERROR = "NOTICE_CODE_REPEAT_ERROR";
        /*** 通知對象類型異常，請確認*/
        public static final String NOTICE_TARGET_TYPE_ERROR = "NOTICE_TARGET_TYPE_ERROR";
        /*** 未檢索到符合條件的人員列表*/
        public static final String NOTICE_PERSONNEL_LIST_ERROR = "NOTICE_PERSONNEL_LIST_ERROR";
        /*** 請選擇通知主檔*/
        public static final String NOTICE_MASTER_ID_PARAM_ERROR = "NOTICE_MASTER_ID_PARAM_ERROR";
        /*** 請選擇通知對象*/
        public static final String NOTICE_TARGET_ID_PARAM_ERROR = "NOTICE_TARGET_ID_PARAM_ERROR";
        /*** 已有相同的通知對象信息，請確認*/
        public static final String NOTICE_TARGET_REPEAT_ERROR = "NOTICE_TARGET_REPEAT_ERROR";
        /*** 自定義通知地址發送失敗，請確認*/
        public static final String NOTICE_CUSTOM_SEND_ERROR = "NOTICE_CUSTOM_SEND_ERROR";
    }
    /* *********************  通知相關提示信息 END  ******************* */


    /* *********************  其他提示信息 BEGIN  ******************* */
    public static class OtherMessage {
        /*** UUID不能為空，請確認*/
        public static final String UUID_PARAM_ERROR = "UUID_PARAM_ERROR";
        /*** 當前操作已超出您的增加角色權限範圍*/
        public static final String ADD_ROLE_PERMISSIONS_ERROR = "ADD_ROLE_PERMISSIONS_ERROR";
        /*** 新增用戶所選角色，不是本人創建，請確認*/
        public static final String ADD_USER_ROLE_PERMISSIONS_ERROR = "ADD_USER_ROLE_PERMISSIONS_ERROR";
        /*** 此項目編號在系統語言項目表-内容管理已有數據,請重新輸入。*/
        public static final String SERIAL_NUMBER_REPEAT = "SERIAL_NUMBER_REPEAT";
        /*** 插入系統語言項目表-内容管理失敗。*/
        public static final String SYS_LANGUAGE_SAVE_ERROR = "SYS_LANGUAGE_SAVE_ERROR";
        /*** 插入系統語言項目表-項目編號已存在。*/
        public static final String SYS_LANGUAGE_ITEM_KEY_EXIST = "SYS_LANGUAGE_ITEM_KEY_EXIST";
        /*** 修改系統語言項目表-内容管理失敗。*/
        public static final String SYS_LANGUAGE_UPDATE_ERROR = "SYS_LANGUAGE_UPDATE_ERROR";
        /*** 請至少輸入一個檢索條件*/
        public static final String LEAST_ONE_QUERY_CONDITION_ERROR = "LEAST_ONE_QUERY_CONDITION_ERROR";
        /*** 公司名稱不能爲空，請確認*/
        public static final String ENTERPRISE_NAME_EMPTY = "ENTERPRISE_NAME_EMPTY";
        /*** 公司的上級公司不能爲空，請確認*/
        public static final String ENTERPRISE_PARENT_CODE_EMPTY = "ENTERPRISE_PARENT_CODE_EMPTY";
        /*** 公司編號不能爲空，請確認*/
        public static final String ENTERPRISE_CODE_EMPTY = "ENTERPRISE_CODE_EMPTY";
        /*** 刪除公司下有子公司，無法刪除，請確認*/
        public static final String SUB_ENTERPRISE_IS_EXIST = "SUB_ENTERPRISE_IS_EXIST";
        /*** 公司無法刪除，請確認*/
        public static final String ENTERPRISE_DELETE_ERROR = "ENTERPRISE_DELETE_ERROR";
        /*** 公司無法修改，請確認*/
        public static final String ENTERPRISE_UPDATE_ERROR = "ENTERPRISE_UPDATE_ERROR";
        /*** 總公司無法刪除，請確認*/
        public static final String MAIN_ENTERPRISE_DELETE_ERROR = "MAIN_ENTERPRISE_DELETE_ERROR";
        /*** 設備類型不能爲空，請確認*/
        public static final String EQUIPMENT_SCRIPT_MASTER_TYPE_EMPTY_ERROR = "EQUIPMENT_SCRIPT_MASTER_TYPE_EMPTY_ERROR";
        /*** 脚本編號，請確認*/
        public static final String EQUIPMENT_SCRIPT_MASTER_CODE_EMPTY_ERROR = "EQUIPMENT_SCRIPT_MASTER_CODE_EMPTY_ERROR";
        /*** 脚本主檔信息查詢失敗，請確認*/
        public static final String EQUIPMENT_SCRIPT_MASTER_INFO_ERROR = "EQUIPMENT_SCRIPT_MASTER_INFO_ERROR";
        /*** 脚本主檔主鍵不能爲空，請確認*/
        public static final String EQUIPMENT_SCRIPT_MASTER_ID_EMPTY_ERROR = "EQUIPMENT_SCRIPT_MASTER_ID_EMPTY_ERROR";
        /*** 脚本主檔下有内容，不能刪除，請確認*/
        public static final String EQUIPMENT_SCRIPT_CONTENT_EXIST_ERROR = "EQUIPMENT_SCRIPT_CONTENT_EXIST_ERROR";
        /*** 脚本編碼不能重複，請確認*/
        public static final String EQUIPMENT_SCRIPT_MASTER_CODE_EXIST_ERROR = "EQUIPMENT_SCRIPT_MASTER_CODE_EXIST_ERROR";
        /*** 脚本内容執行順序不能爲空，請確認*/
        public static final String EQUIPMENT_SCRIPT_CONTENT_STEP_EMPTY_ERROR = "EQUIPMENT_SCRIPT_CONTENT_STEP_EMPTY_ERROR";
        /*** 脚本内容執行順序不能重複，請確認*/
        public static final String EQUIPMENT_SCRIPT_CONTENT_STEP_EXIST_ERROR = "EQUIPMENT_SCRIPT_CONTENT_STEP_EXIST_ERROR";
        /*** 脚本内容信息查詢失敗，請確認*/
        public static final String EQUIPMENT_SCRIPT_CONTENT_INFO_ERROR = "EQUIPMENT_SCRIPT_CONTENT_INFO_ERROR";
        /*** 脚本内容信息刪除失敗，請確認*/
        public static final String EQUIPMENT_SCRIPT_CONTENT_DETELE_ERROR = "EQUIPMENT_SCRIPT_CONTENT_DETELE_ERROR";
        /*** 脚本内容信息更新失敗，請確認*/
        public static final String EQUIPMENT_SCRIPT_CONTENT_UPDATE_ERROR = "EQUIPMENT_SCRIPT_CONTENT_UPDATE_ERROR";
        /*** 脚本内容信息保存失敗，請確認*/
        public static final String EQUIPMENT_SCRIPT_CONTENT_SAVE_ERROR = "EQUIPMENT_SCRIPT_CONTENT_SAVE_ERROR";
        /*** 脚本主檔信息保存失敗，請確認*/
        public static final String EQUIPMENT_SCRIPT_MASTER_SAVE_ERROR = "EQUIPMENT_SCRIPT_MASTER_SAVE_ERROR";
        /*** 脚本主檔信息更新失敗，請確認*/
        public static final String EQUIPMENT_SCRIPT_MASTER_UPDATE_ERROR = "EQUIPMENT_SCRIPT_MASTER_UPDATE_ERROR";
        /*** 脚本主檔信息刪除失敗，請確認*/
        public static final String EQUIPMENT_SCRIPT_MASTER_DETELE_ERROR = "EQUIPMENT_SCRIPT_MASTER_DETELE_ERROR";
        /*** 脚本主檔信息狀態更新失敗，請確認*/
        public static final String EQUIPMENT_SCRIPT_MASTER_UPDATE_STATUS_ERROR = "EQUIPMENT_SCRIPT_MASTER_UPDATE_STATUS_ERROR";
        /*** 脚本執行順序不能小於0，請確認*/
        public static final String EQUIPMENT_SCRIPT_CONTENT_STEP_NEGATIVE_ERROR = "EQUIPMENT_SCRIPT_CONTENT_STEP_NEGATIVE_ERROR";
        /*** 刪除公司下有用戶綁定，無法刪除，請確認*/
        public static final String ENTERPRISE_USER_IS_EXIST = "ENTERPRISE_USER_IS_EXIST";
        /*** 脚本執行編碼首條必須為1，請確認*/
        public static final String EQUIPMENT_SCRIPT_CONTENT_EXECUTE_CODE_FIRST_ERROR = "EQUIPMENT_SCRIPT_CONTENT_EXECUTE_CODE_FIRST_ERROR";
        /*** 脚本刪除失敗，存在執行編碼不爲1的其他數據，請確認*/
        public static final String EQUIPMENT_SCRIPT_CONTENT_DETELE_MAIN_ERROR = "EQUIPMENT_SCRIPT_CONTENT_DETELE_MAIN_ERROR";
        /*** 脚本參數信息保存失敗*/
        public static final String EQUIPMENT_PARAM_SETTING_SAVE_ERROR = "EQUIPMENT_PARAM_SETTING_SAVE_ERROR";
        /*** 脚本參數信息更新失敗*/
        public static final String EQUIPMENT_PARAM_SETTING_UPDATE_ERROR = "EQUIPMENT_PARAM_SETTING_UPDATE_ERROR";
        /*** 脚本參數不全，更新失敗*/
        public static final String EQUIPMENT_PARAM_SETTING_UPDATE_PARAM_EMPTY_ERROR = "EQUIPMENT_PARAM_SETTING_UPDATE_PARAM_EMPTY_ERROR";
        /*** 脚本參數信息查詢失敗*/
        public static final String EQUIPMENT_PARAM_SETTING_INFO_ERROR = "EQUIPMENT_PARAM_SETTING_INFO_ERROR";
        /*** 脚本參數信息刪除失敗*/
        public static final String EQUIPMENT_PARAM_SETTING_DELETE_ERROR = "EQUIPMENT_PARAM_SETTING_DELETE_ERROR";
        /*** 脚本返回訊息執行設定更新失敗*/
        public static final String EQUIPMENT_RETURN_MESSAGE_EXECUTION_UPDATE_ERROR = "EQUIPMENT_RETURN_MESSAGE_EXECUTION_UPDATE_ERROR";
        /*** 脚本返回訊息執行設定查詢失敗*/
        public static final String EQUIPMENT_RETURN_MESSAGE_EXECUTION_INFO_ERROR = "EQUIPMENT_RETURN_MESSAGE_EXECUTION_INFO_ERROR";
        /*** 脚本返回訊息執行設定保存失敗*/
        public static final String EQUIPMENT_RETURN_MESSAGE_EXECUTION_SAVE_ERROR = "EQUIPMENT_RETURN_MESSAGE_EXECUTION_SAVE_ERROR";
        /*** 脚本返回訊息執行設定刪除失敗*/
        public static final String EQUIPMENT_RETURN_MESSAGE_EXECUTION_DELETE_ERROR = "EQUIPMENT_RETURN_MESSAGE_EXECUTION_DELETE_ERROR";
        /*** 縣市編號不能爲空，請確認*/
//        public static final String CODE_ID_PARAM_ERROR = "CODE_ID_PARAM_ERROR";
        /*** 數據文檔導出EXCEL失敗。*/
//        public static final String DOCUMENTATION_EXPORT_ERROR = "DOCUMENTATION_EXPORT_ERROR";
        /*** 當前文檔詳細内容長度不足168,無法解析。*/
//        public static final String DAT_DETAILS_LENGTH_ERROR = "DAT_DETAILS_LENGTH_ERROR";
        /*** 當前文檔檔頭内容長度不足270,無法解析。*/
//        public static final String DAT_LENGTH_ERROR = "DAT_LENGTH_ERROR";
    }
    /* *********************  其他提示信息 END  ******************* */

    /* *********************  支付方式預設值信息相關提示信息  BEGIN  ******************* */
    public static class PaymentPresetInfoMessage {
        /*** 修改支付方式預設值信息表失敗,請檢測*/
//        public static final String PAYMENT_PRESET_INFO_UPDATE_ERROR = "PAYMENT_PRESET_INFO_UPDATE_ERROR";
        /*** 插入支付方式預設值信息表失敗,請檢測*/
//        public static final String PAYMENT_PRESET_INFO_INSERT_ERROR = "PAYMENT_PRESET_INFO_INSERT_ERROR";
    }
    /* *********************  支付方式預設值信息相關提示信息  END  ******************* */

    /* ********************* 客戶支付方式相關提示信息  BEGIN  ******************* */
    public static class MerchantPaymentItemAuditMessage {
        /*** 客戶支付方式明細信息表(審核)保存失敗*/
        public static final String MERCHANT_PAYMENT_ITEM_AUDIT_SAVE_ERROR = "MERCHANT_PAYMENT_ITEM_AUDIT_SAVE_ERROR";
        /*** 傳入參數異常*/
//        public static final String INPUT_ERROR = "INPUT_ERROR";
        /*** 保存失敗*/
//        public static final String MERCHANT_PAYMENT_SAVE_ERROR = "MERCHANT_PAYMENT_SAVE_ERROR";
        /*** 客戶支付方式結算設置表(審核)保存失敗*/
//        public static final String MERCHANT_PAYMENT_SETTLEMENT_AUDIT_SAVE_ERROR = "MERCHANT_PAYMENT_SETTLEMENT_AUDIT_SAVE_ERROR";
    }
    /* *********************  客戶支付方式明細相關提示信息  END  ******************* */

    /* *********************  平臺支付方式結算設置表相關提示信息  BEGIN  ******************* */
    public static class PaymentSettlementMessage {
        /*** 傳入參數異常*/
        public static final String INPUT_ERROR = "INPUT_ERROR";
        /*** 新增平臺支付方式結算設置表信息失敗。*/
//        public static final String PAYMENT_SETTLEMENT_INSERT_ERROR = "PAYMENT_SETTLEMENT_INSERT_ERROR";
        /*** 修改平臺支付方式結算設置表信息失敗。*/
//        public static final String PAYMENT_SETTLEMENT_UPDATE_ERROR = "PAYMENT_SETTLEMENT_UPDATE_ERROR";
        /*** 刪除平臺支付方式結算設置表信息失敗。*/
//        public static final String PAYMENT_SETTLEMENT_DELETE_ERROR = "PAYMENT_SETTLEMENT_DELETE_ERROR";
        /*** 平臺支付方式結算設置表沒有此條數據。*/
//        public static final String PAYMENT_SETTLEMENT_NOT_FOUND_ERROR = "PAYMENT_SETTLEMENT_NOT_FOUND_ERROR";
        /*** 設置排序失敗,請確認。*/
//        public static final String SETTLEMENT_SORT_UPDATE_ERROR = "SETTLEMENT_SORT_UPDATE_ERROR";
        /*** 結算撥款設置編號不能為空，請確認*/
//        public static final String SETTLEMENT_ID_PARAM_ERROR = "SETTLEMENT_ID_PARAM_ERROR";
    }
    /* *********************  平臺支付方式結算設置表相關提示信息  END  ******************* */

    /* *********************  黑名單主檔相關提示信息  BEGIN  ******************* */
    public static class BlackList {
        /*** 限制内容传参錯誤。*/
        public static final String RESTRICTED_CONTENT_ERROR = "RESTRICTED_CONTENT_ERROR";
        /*** 修改黑名單主檔失敗。*/
//        public static final String BLACK_LIST_UPDATE_ERROR = "BLACK_LIST_UPDATE_ERROR";
        /*** 黑名單ID為空。*/
//        public static final String BLACK_LIST_ID_EMPTY = "BLACK_LIST_ID_EMPTY";
        /*** 黑名單主檔表沒有此條數據。*/
//        public static final String BLACK_LIST_SETTLEMENT_NOT_FOUND_ERROR = "BLACK_LIST_SETTLEMENT_NOT_FOUND_ERROR";
        /*** 刪除黑名單主檔表信息失敗。*/
//        public static final String BLACK_LIST_SETTLEMENT_DELETE_ERROR = "BLACK_LIST_SETTLEMENT_DELETE_ERROR";
        /*** 刪除黑名單主檔表出現錯誤。*/
//        public static final String BLACK_LIST_DELETE_ERROR = "BLACK_LIST_DELETE_ERROR";
        /*** 黑名單類型传参錯誤。*/
//        public static final String BLACK_LIST_TYPE_ERROR = "BLACK_LIST_TYPE_ERROR";
        /*** 限制内容传参錯誤。*/
//        public static final String RESTRICTED_CONTENT_LENGTH_ERROR = "RESTRICTED_CONTENT_LENGTH_ERROR";
        /*** "限制内容"不正確，只允許輸入數字和IP地址，並用‘;’號分割。。*/
//        public static final String RESTRICTED_CONTENT_INPUT_ERROR = "RESTRICTED_CONTENT_INPUT_ERROR";
        /*** 解析的Excel文件為空*/
//        public static final String EXCEL_EMPTY = "EXCEL_EMPTY";
    }
    /* *********************  黑名單主檔相關提示信息  END  ******************* */

    /* *********************  警示單相關提示信息  BEGIN  ******************* */
    public static class AlertList {
        /*** 警示單主檔添加失敗。*/
//        public static final String ALERT_LIST_MASTER_INPUT_ERROR = "ALERT_LIST_MASTER_INPUT_ERROR";
        /*** 未查詢到警示單主檔信息，請確認*/
//        public static final String ALERT_LIST_MASTER_GET_ERROR = "ALERT_LIST_MASTER_GET_ERROR";
        /*** 當前警示單主檔信息已被刪除，請確認*/
//        public static final String ALERT_LIST_MASTER_DELETED_ERROR = "ALERT_LIST_MASTER_DELETED_ERROR";
        /*** 警示單主檔信息啓用狀態修改失敗*/
//        public static final String ALERT_LIST_MASTER_STATUS_UPDATE_ERROR = "ALERT_LIST_MASTER_STATUS_UPDATE_ERROR";
        /*** 警示單主檔信息順序修改失敗*/
//        public static final String ALERT_LIST_MASTER_SORT_UPDATE_ERROR = "ALERT_LIST_MASTER_SORT_UPDATE_ERROR";
        /*** 警示單主檔信息删除失敗*/
//        public static final String ALERT_LIST_MASTER_UPDATE_ERROR = "ALERT_LIST_MASTER_UPDATE_ERROR";
        /*** 警示單主檔信息修改失敗*/
//        public static final String ALERT_LIST_MASTER_UPDATE_DELETED_ERROR = "ALERT_LIST_MASTER_UPDATE_DELETED_ERROR";
        /*** 警示單影響特店類型信息添加失敗。*/
//        public static final String ALERT_LIST_AFFECT_STORE_INPUT_ERROR = "ALERT_LIST_AFFECT_STORE_INPUT_ERROR";
        /*** 警示單影響特店類型信息獲取失敗。*/
//        public static final String ALERT_LIST_AFFECT_STORE_SELECT_ERROR = "ALERT_LIST_AFFECT_STORE_SELECT_ERROR";
        /*** 警示單影響特店類型信息刪除失敗。*/
//        public static final String ALERT_LIST_AFFECT_STORE_DELETE_ERROR = "ALERT_LIST_AFFECT_STORE_DELETE_ERROR";
        /*** 警示單影響交易方式信息添加失敗。*/
//        public static final String ALERT_LIST_AFFECT_PAYMENT_INPUT_ERROR = "ALERT_LIST_AFFECT_PAYMENT_INPUT_ERROR";
        /*** 警示單影響交易方式信息獲取失敗。*/
//        public static final String ALERT_LIST_AFFECT_PAYMENT_SELECT_ERROR = "ALERT_LIST_AFFECT_PAYMENT_SELECT_ERROR";
        /*** 警示單影響交易方式信息刪除失敗。*/
//        public static final String ALERT_LIST_AFFECT_PAYMENT_DELETE_ERROR = "ALERT_LIST_AFFECT_PAYMENT_DELETE_ERROR";
        /*** 警示訂單信息添加失敗。*/
//        public static final String ALERT_ORDER_INFO_INPUT_ERROR = "ALERT_ORDER_INFO_INPUT_ERROR";
        /*** 警示訂單信息修改失敗。*/
//        public static final String ALERT_ORDER_INFO_UPDATE_ERROR = "ALERT_ORDER_INFO_UPDATE_ERROR";
        /*** 警示訂單信息刪除失敗。*/
//        public static final String ALERT_ORDER_INFO_DELETE_ERROR = "ALERT_ORDER_INFO_DELETE_ERROR";
        /*** 警示訂單信息未查詢到數據，請確認*/
//        public static final String ALERT_ORDER_INFO_NOT_HAVE_ERROR = "ALERT_ORDER_INFO_NOT_HAVE_ERROR";
        /*** 警示客戶信息添加失敗。*/
//        public static final String ALERT_MERCHANT_INFO_INPUT_ERROR = "ALERT_MERCHANT_INFO_INPUT_ERROR";
        /*** 警示客戶額度信息不能超过100%。*/
//        public static final String ALERT_MERCHANT_INFO_ERROR = "ALERT_MERCHANT_INFO_ERROR";
        /*** 警示客戶信息修改失敗。*/
//        public static final String ALERT_MERCHANT_INFO_UPDATE_ERROR = "ALERT_MERCHANT_INFO_UPDATE_ERROR";
        /*** 警示客戶信息刪除失敗。*/
//        public static final String ALERT_MERCHANT_INFO_DELETE_ERROR = "ALERT_MERCHANT_INFO_DELETE_ERROR";
        /*** 警示客戶信息未查詢到數據，請確認。*/
//        public static final String ALERT_MERCHANT_INFO_NOT_HAVE_ERROR = "ALERT_MERCHANT_INFO_NOT_HAVE_ERROR";
        /*** 警示單修改履歷信息添加失敗。*/
//        public static final String ALERT_LIST_MODIFY_RESUME_INPUT_ERROR = "ALERT_LIST_MODIFY_RESUME_INPUT_ERROR";
        /*** 警示單已發生列表此IDList有錯誤ID數據。*/
//        public static final String ALERT_HAPPENED_LIST_ID_NOT_HAVE_ERROR = "ALERT_HAPPENED_LIST_ID_NOT_HAVE_ERROR";
        /*** 警示單已發生列表修改失敗。*/
//        public static final String UPDATE_HAPPENED_LIST_ERROR = "UPDATE_HAPPENED_LIST_ERROR";

    }

    /* *********************  警示單相關提示信息  END  ******************* */


    /* *********************  通道相關提示信息  BEGIN  ******************* */
    public static class PlatformMessage {
        /*** 支付通道編號不能為空 */
        public static final String PAY_PLATFORM_ID_PARAM_ERROR = "PAY_PLATFORM_ID_PARAM_ERROR";
        /*** 保存通道上游配置信息失敗 */
//        public static final String PAYMENT_PLATFORM_SETTING_SAVE_ERROR = "PAYMENT_PLATFORM_SETTING_SAVE_ERROR";
        /*** 保存通道聯絡人信息失敗 */
//        public static final String PAYMENT_CONTACT_SAVE_ERROR = "PAYMENT_CONTACT_SAVE_ERROR";
        /*** 修改通道聯絡人信息失敗 */
//        public static final String PAYMENT_CONTACT_UPDATE_ERROR = "PAYMENT_CONTACT_UPDATE_ERROR";
        /*** 支付通道名稱不能為空 */
//        public static final String PAY_PLATFORM_NAME_PARAM_ERROR = "PAY_PLATFORM_NAME_PARAM_ERROR";
        /*** 通道聯絡人ID不能為空 */
//        public static final String PAYMENT_CONTACT_ID_PARAM_ERROR = "PAYMENT_CONTACT_ID_PARAM_ERROR";
        /*** 該聯係人ID在通道聯係人表沒有對應信息 */
//        public static final String CONTACT_ID_NOT_HAVE_IN_PAYMENT_CONTACT_TABLE = "CONTACT_ID_NOT_HAVE_IN_PAYMENT_CONTACT_TABLE";
        /*** 該聯係人在通道聯係人表沒有可用信息 */
//        public static final String CONTACT_IN_PAYMENT_CONTACT_TABLE_NOT_HAVE_INFORMATION = "CONTACT_IN_PAYMENT_CONTACT_TABLE_NOT_HAVE_INFORMATION";
        /*** 支付方式編號不能為空 */
//        public static final String PAYMENT_CODE_PARAM_ERROR = "PAYMENT_CODE_PARAM_ERROR";
        /*** 配置类型不能為空 */
//        public static final String SETTING_TYPE_PARAM_ERROR = "SETTING_TYPE_PARAM_ERROR";
        /*** 配置内容不能為空 */
//        public static final String SETTING_VALUE_PARAM_ERROR = "SETTING_VALUE_PARAM_ERROR";
        /*** 當前支付通道下已有相同的支付方式 */
//        public static final String PAYMENT_PLATFORM_SETTING_REPEAT_ERROR = "PAYMENT_PLATFORM_SETTING_REPEAT_ERROR";
        /*** 已有相同編號的通道信息 */
//        public static final String PAYMENT_PLATFORM_MASTER_REPEAT_ERROR = "PAYMENT_PLATFORM_MASTER_REPEAT_ERROR";
        /*** 配置編號不能為空 */
//        public static final String SETTING_ID_PARAM_ERROR = "SETTING_ID_PARAM_ERROR";
        /*** 未查詢到通道上游配置信息 */
//        public static final String PAYMENT_PLATFORM_SETTING_GET_ERROR = "PAYMENT_PLATFORM_SETTING_GET_ERROR";
        /*** 未查詢到通道信息 */
//        public static final String PAYMENT_PLATFORM_MASTER_GET_ERROR = "PAYMENT_PLATFORM_MASTER_GET_ERROR";
        /*** 未查詢到通道帳號餘額信息 */
//        public static final String PAYMENT_PLATFORM_BALANCE_GET_ERROR = "PAYMENT_PLATFORM_BALANCE_GET_ERROR";
        /*** 傳入的聯絡人姓名為空 */
//        public static final String INPUT_CONTACT_NAME_EMPTY = "INPUT_CONTACT_NAME_EMPTY";
        /*** 傳入的聯絡人Email為空 */
//        public static final String INPUT_CONTACT_EMAIL_EMPTY = "INPUT_CONTACT_EMAIL_EMPTY";
        /*** 傳入的聯絡人職位為空 */
//        public static final String INPUT_JOB_TITLE_EMPTY = "INPUT_JOB_TITLE_EMPTY";
        /*** 傳入的電話號碼為空 */
//        public static final String INPUT_CONTACT_PHONE_NUMBER_EMPTY = "INPUT_CONTACT_PHONE_NUMBER_EMPTY";
        /*** 輸入的聯絡人類別為空 */
//        public static final String INPUT_CONTACT_TYPE_EMPTY = "INPUT_CONTACT_TYPE_EMPTY";
        /*** 保存通道信息失敗 */
//        public static final String PAYMENT_PLATFORM_MASTER_SAVE_ERROR = "PAYMENT_PLATFORM_MASTER_SAVE_ERROR";
        /*** 通道啓用狀態修改失敗 */
//        public static final String PAYMENT_PLATFORM_MASTER_STATUS_ERROR = "PAYMENT_PLATFORM_MASTER_STATUS_ERROR";
        /*** 實付金額不能爲空 */
//        public static final String ACTUALLY_PAY_AMOUNT_PARAM_ERROR = "ACTUALLY_PAY_AMOUNT_PARAM_ERROR";
        /*** 通道帳號餘額信息更新失敗 */
//        public static final String PAYMENT_PLATFORM_BALANCE_UPDATE_ERROR = "PAYMENT_PLATFORM_BALANCE_UPDATE_ERROR";
        /*** 通道帳號餘額異動信息保存失敗 */
//        public static final String PAYMENT_PLATFORM_BALANCE_LOG_SAVE_ERROR = "PAYMENT_PLATFORM_BALANCE_LOG_SAVE_ERROR";
        /*** 平臺利潤單訊息保存失敗 */
//        public static final String PLATFORM_PROFIT_RECORD_SAVE_ERROR = "PLATFORM_PROFIT_RECORD_SAVE_ERROR";
        /*** 通道帳號餘額不足，無法將當前訂單轉成失敗單 */
//        public static final String PAYMENT_PLATFORM_BALANCE_UPDATE_TRADE_STATUS_ERROR = "PAYMENT_PLATFORM_BALANCE_UPDATE_TRADE_STATUS_ERROR";
    }
    /* *********************  通道相關提示信息  END  ******************* */


    /* *********************  通道與對賬單關係表相關提示信息  BEGIN  ******************* */
    public static class PaymentReconciliationRelationMessage {
        /*** 插入通道與對賬單關係表失敗。*/
//        public static final String PAYMENT_RECONCILIATION_RELATION_INSERT_ERROR = "PAYMENT_RECONCILIATION_RELATION_INSERT_ERROR";
        /*** 插入通道與對賬單撥款周期表失敗。*/
//        public static final String PAYMENT_RECONCILIATION_PERIOD_INSERT_ERROR = "PAYMENT_RECONCILIATION_PERIOD_INSERT_ERROR";
        /*** 刪除通道與對賬單撥款周期表失敗。*/
//        public static final String PAYMENT_RECONCILIATION_PERIOD_DELETE_ERROR = "PAYMENT_RECONCILIATION_PERIOD_DELETE_ERROR";
        /*** 刪除通道與對賬單關係表失敗。*/
//        public static final String PAYMENT_RECONCILIATION_RELATION_DELETE_ERROR = "PAYMENT_RECONCILIATION_RELATION_DELETE_ERROR";
        /*** 修改通道與對賬單關係表失敗。*/
//        public static final String PAYMENT_RECONCILIATION_RELATION_UPDATE_ERROR = "PAYMENT_RECONCILIATION_RELATION_UPDATE_ERROR";
        /*** 修改通道與對賬單關係表啓用狀態失敗。*/
//        public static final String PAYMENT_RECONCILIATION_RELATION_UPDATE_STATUS_ERROR = "PAYMENT_RECONCILIATION_RELATION_UPDATE_STATUS_ERROR";
        /*** 修改通道與對賬單關係表自動勾稽標識失敗。*/
//        public static final String PAYMENT_RECONCILIATION_RELATION_UPDATE_FLAG_ERROR = "PAYMENT_RECONCILIATION_RELATION_UPDATE_FLAG_ERROR";
        /*** 修改通道與對賬單撥款周期表失敗。*/
//        public static final String PAYMENT_RECONCILIATION_PERIOD_UPDATE_ERROR = "PAYMENT_RECONCILIATION_PERIOD_UPDATE_ERROR";
        /*** 傳入關係編號參數爲空,請確認。*/
//        public static final String PAYMENT_RECONCILIATION_RELATION_RELATION_ID_NOT_HAVE_ERROR = "PAYMENT_RECONCILIATION_RELATION_RELATION_ID_NOT_HAVE_ERROR";
        /*** 當前關係編號在通道與對賬單關係表沒有數據，請確認*/
//        public static final String PAYMENT_RECONCILIATION_RELATION_RELATION_ID_NOT_HAVE_MESSAGE_ERROR = "PAYMENT_RECONCILIATION_RELATION_RELATION_ID_NOT_HAVE_MESSAGE_ERROR";
        /*** 當前關係編號在銀行BIN碼與銀行對應關於表沒有數據，請確認*/
//        public static final String BANK_BIN_CODE_RELATION_NOT_HAVE_MESSAGE_ERROR = "BANK_BIN_CODE_RELATION_NOT_HAVE_MESSAGE_ERROR";
        /*** 新增銀行BIN碼與銀行對應關於表失敗。*/
//        public static final String BANK_BIN_CODE_RELATION_INSERT_ERROR = "BANK_BIN_CODE_RELATION_INSERT_ERROR";
        /*** 修改銀行BIN碼與銀行對應關於表失敗。*/
//        public static final String BANK_BIN_CODE_RELATION_UPDATE_ERROR = "BANK_BIN_CODE_RELATION_UPDATE_ERROR";
        /*** 刪除銀行BIN碼與銀行對應關於表失敗。*/
//        public static final String BANK_BIN_CODE_RELATION_DELETE_ERROR = "BANK_BIN_CODE_RELATION_DELETE_ERROR";
        /*** 已存在相同的bin碼數據,請確認。*/
//        public static final String SAVE_BATCH_BIN_CODE_ALREADY_HAVE_ERROR = "SAVE_BATCH_BIN_CODE_ALREADY_HAVE_ERROR";
        /*** 已存在相同的bin碼數據,請確認BIN码。*/
//        public static final String SAVE_BIN_CODE_ALREADY_HAVE_ERROR = "SAVE_BIN_CODE_ALREADY_HAVE_ERROR";
        /*** 輸入的bin碼和類型不能爲空,請檢測數據並重新輸入*/
//        public static final String BIN_CODE_AND_TYPE_NOT_HAVE_ERROR = "BIN_CODE_AND_TYPE_NOT_HAVE_ERROR";
        /*** 對賬單類別ID不能爲空*/
//        public static final String PA_STATEMENT_CATEGORY_ID_PARAM_ERROR = "PA_STATEMENT_CATEGORY_ID_PARAM_ERROR";
        /*** 自動勾稽標識不能爲空*/
//        public static final String AUTO_CROSS_CHECK_FLG_PARAM_ERROR = "AUTO_CROSS_CHECK_FLG_PARAM_ERROR";
        /*** 列表中存在BIN碼重複數據*/
//        public static final String BIN_CODE_REPEAT_ERROR = "BIN_CODE_REPEAT_ERROR";
    }
    /* *********************  通道與對賬單關係表相關提示信息  END  ******************* */

    /* *********************  爭議單相關提示信息  BEGIN  ******************* */
    public static class DisputeMessage {
        /*** 新增爭議單主檔表失敗。*/
//        public static final String DISPUTE_MASTER_INSERT_ERROR = "DISPUTE_MASTER_INSERT_ERROR";
        /*** 修改爭議單主檔失敗。*/
//        public static final String DISPUTE_MASTER_UPDATE_ERROR = "DISPUTE_MASTER_UPDATE_ERROR";
        /*** 爭議單主檔信息查詢失敗。*/
//        public static final String DISPUTE_MASTER_SELECT_ERROR = "DISPUTE_MASTER_SELECT_ERROR";
        /*** 爭議單主檔信息已被刪除，請確認。*/
//        public static final String DISPUTE_MASTER_DELETED_ERROR = "DISPUTE_MASTER_DELETED_ERROR";
        /*** 新增爭議單附件表失敗。*/
//        public static final String DISPUTE_ATTACHMENT_INSERT_ERROR = "DISPUTE_ATTACHMENT_INSERT_ERROR";
        /*** 新增爭議訂單表失敗。*/
//        public static final String DISPUTE_ORDER_INSERT_ERROR = "DISPUTE_ORDER_INSERT_ERROR";
        /*** 修改爭議訂單表失敗。*/
//        public static final String DISPUTE_ORDER_UPDATE_ERROR = "DISPUTE_ORDER_UPDATE_ERROR";
        /*** 傳遞參數錯誤，同一訂單不能綁定兩個爭議事件。*/
//        public static final String DISPUTE_ORDER_PARAM_ERROR = "DISPUTE_ORDER_PARAM_ERROR";
        /*** 爭議訂單ID不能爲空*/
//        public static final String DISPUTE_ORDER_ID_PARAM_ERROR = "DISPUTE_ORDER_ID_PARAM_ERROR";
        /*** 爭議單ID不能爲空*/
//        public static final String DISPUTE_ID_PARAM_ERROR = "DISPUTE_ID_PARAM_ERROR";
        /*** 爭議訂單風控狀態保存失敗*/
//        public static final String DISPUTE_ORDER_DISPUTE_STATUS_SAVE_ERROR = "DISPUTE_ORDER_DISPUTE_STATUS_SAVE_ERROR";
        /*** 風控狀態值不能爲空*/
//        public static final String DISPUTE_STATUS_PARAM_ERROR = "DISPUTE_STATUS_PARAM_ERROR";
        /*** 未查詢到待修改的爭議訂單，請確認*/
//        public static final String DISPUTE_ORDER_GET_ERROR = "DISPUTE_ORDER_GET_ERROR";
    }
    /* *********************  爭議單相關提示信息  END  ******************* */

    /* *********************  財務相關提示信息  BEGIN  ******************* */
    public static class FinanceMessage {
        /*** 當前帳戶號碼已存在，請確認。*/
//        public static final String RESERVE_ACCOUNT_ID_SELECT_ERROR = "RESERVE_ACCOUNT_ID_SELECT_ERROR";
        /*** 備付金賬戶主檔訊息保存失敗。*/
//        public static final String RESERVE_ACCOUNT_MASTER_SAVE_ERROR = "RESERVE_ACCOUNT_MASTER_SAVE_ERROR";
        /*** 備付金帳戶餘額訊息保存失敗。*/
//        public static final String RESERVE_ACCOUNT_BALANCE_SAVE_ERROR = "RESERVE_ACCOUNT_BALANCE_SAVE_ERROR";
        /*** 備付金帳戶餘額訊息查詢失敗，請確認。*/
//        public static final String RESERVE_ACCOUNT_BALANCE_SELECT_ERROR = "RESERVE_ACCOUNT_BALANCE_SELECT_ERROR";
        /*** 調撥金額不能爲0，請確認。*/
//        public static final String WITHDRAWALS_BALANCE_ZERO_ERROR = "WITHDRAWALS_BALANCE_ZERO_ERROR";
        /*** 出款帳戶與入款帳戶不能為同一個帳戶,請選擇其他帳戶。*/
//        public static final String DISBURSEMENT_ACCOUNT_NOT_EQUALS_DEPOSITS_ACCOUNT = "DISBURSEMENT_ACCOUNT_NOT_EQUALS_DEPOSITS_ACCOUNT";
        /*** 賬戶有多少錢，要付出總計多少錢，差額是多少錢*/
//        public static final String GRANT_AMOUNT_ERROR = "GRANT_AMOUNT_ERROR";
        /*** 手續費不能大於或等於撥款金額，請確認。*/
//        public static final String ALLOCATE_BALANCE_ERROR = "ALLOCATE_BALANCE_ERROR";
        /*** 備付金帳戶餘額訊息修改失敗。*/
//        public static final String RESERVE_ACCOUNT_BALANCE_UPDATE_ERROR = "RESERVE_ACCOUNT_BALANCE_UPDATE_ERROR";
        /*** 出款賬戶可用餘額不足以滿足當前調撥金額，請確認。*/
//        public static final String AVAILABLE_BALANCE_ERROR = "AVAILABLE_BALANCE_ERROR";
        /*** 當前備付金帳戶餘額信息表可用餘額不足扣除撥金額,請確認數據。*/
//        public static final String RESERVE_ACCOUNT_BALANCE_AVAILABLE_BALANCE_NOT_HAVE = "RESERVE_ACCOUNT_BALANCE_AVAILABLE_BALANCE_NOT_HAVE";
        /*** 當前備付金帳戶餘額信息表縂餘額不足扣除撥金額,請確認數據。*/
//        public static final String RESERVE_ACCOUNT_BALANCE_ACCOUNT_BALANCE_NOT_HAVE = "RESERVE_ACCOUNT_BALANCE_ACCOUNT_BALANCE_NOT_HAVE";
        /*** 備付金帳戶餘額異動訊息保存失敗。*/
//        public static final String RESERVE_ACCOUNT_BALANCE_LOG_SAVE_ERROR = "RESERVE_ACCOUNT_BALANCE_LOG_SAVE_ERROR";
        /*** 參數錯誤,請檢測傳入的銀行ID是否爲空*/
//        public static final String RESERVE_ACCOUNT_BANK_ID_NOT_HAVING = "RESERVE_ACCOUNT_BANK_ID_NOT_HAVING";
        /*** 參數錯誤,請檢測傳入的幣別ID是否爲空*/
//        public static final String RESERVE_ACCOUNT_CURRENCY_ID_NOT_HAVING = "RESERVE_ACCOUNT_CURRENCY_ID_NOT_HAVING";
        /***備付金賬戶主檔查詢失敗，請確認數據*/
//        public static final String RESERVE_ACCOUNT_MASTER_NOT_HAVING = "RESERVE_ACCOUNT_MASTER_NOT_HAVING";
        /***備付金賬戶主檔修改狀態失敗，請確認數據*/
//        public static final String RESERVE_ACCOUNT_MASTER_UPDATE_STATUS_ERROR = "RESERVE_ACCOUNT_MASTER_UPDATE_STATUS_ERROR";
        /***備付金賬戶主檔訊息已被刪除失敗，請確認數據*/
//        public static final String RESERVE_ACCOUNT_MASTER_DELETE_ERROR = "RESERVE_ACCOUNT_MASTER_DELETE_ERROR";
        /***當前賬戶ID在備付金賬戶主檔表沒有數據，請確認賬戶ID*/
//        public static final String RESERVE_ACCOUNT_MASTER_NOT_HAVING_BY_ACCOUNT_ID_ERROR = "RESERVE_ACCOUNT_MASTER_NOT_HAVING_BY_ACCOUNT_ID_ERROR";
        /*** 客戶應收應付費用主檔訊息保存失敗。*/
//        public static final String MERCHANT_FEE_MASTER_SAVE_ERROR = "MERCHANT_FEE_MASTER_SAVE_ERROR";
        /*** 客戶應收應付費用主檔訊息查詢失敗。*/
//        public static final String MERCHANT_FEE_MASTER_SELECT_ERROR = "MERCHANT_FEE_MASTER_SELECT_ERROR";
        /*** 客戶應收應付費用主檔訊息已被刪除，請確認。*/
//        public static final String MERCHANT_FEE_MASTER_IS_DELETE_ERROR = "MERCHANT_FEE_MASTER_IS_DELETE_ERROR";
        /*** 客戶應收應付費用主檔訊息修改失敗。*/
//        public static final String MERCHANT_FEE_MASTER_UPDATE_ERROR = "MERCHANT_FEE_MASTER_UPDATE_ERROR";
        /*** 當前客戶應收應付費用ID下已綁定客戶日結賬單編號。*/
//        public static final String MERCHANT_FEE_MASTER_ALREADY_BINDING = "MERCHANT_FEE_MASTER_ALREADY_BINDING";
        /*** 當前客戶應收應付費用ID下沒有綁定客戶日結賬單編號。*/
//        public static final String MERCHANT_FEE_MASTER_ALREADY_UNBIND = "MERCHANT_FEE_MASTER_ALREADY_UNBIND";
        /*** 此應收應付單訊息不能進行當前操作，請確認。*/
//        public static final String MERCHANT_FEE_MASTER_ERROR = "MERCHANT_FEE_MASTER_ERROR";
        /*** 客戶應收應付費用主檔訊息刪除失敗。*/
//        public static final String MERCHANT_FEE_MASTER_DELETE_ERROR = "MERCHANT_FEE_MASTER_DELETE_ERROR";
        /*** 綁定通道備付金帳戶失敗。*/
//        public static final String PAYMENT_PLATFORM_RESERVE_ACCOUNT_SAVE_ERROR = "PAYMENT_PLATFORM_RESERVE_ACCOUNT_SAVE_ERROR";
        /*** 解綁通道備付金帳戶失敗。*/
//        public static final String PAYMENT_PLATFORM_RESERVE_ACCOUNT_DELETE_ERROR = "PAYMENT_PLATFORM_RESERVE_ACCOUNT_DELETE_ERROR";
        /*** 備付金帳戶號碼不能爲空。*/
//        public static final String RESERVE_ACCOUNT_ID_PARAM_ERROR = "RESERVE_ACCOUNT_ID_PARAM_ERROR";
        /*** 未查詢到待刪除的通道備付金數據。*/
//        public static final String PAYMENT_PLATFORM_RESERVE_ACCOUNT_GET_ERROR = "PAYMENT_PLATFORM_RESERVE_ACCOUNT_GET_ERROR";
        /*** 已有相同的通道備付金帳戶，請勿重複添加。*/
//        public static final String PAYMENT_PLATFORM_RESERVE_ACCOUNT_REPEAT_ERROR = "PAYMENT_PLATFORM_RESERVE_ACCOUNT_REPEAT_ERROR";
        /*** 備付金與對賬單分類項目關聯失敗。*/
//        public static final String RESERVE_AND_STATEMENT_ITEM_SAVE_ERROR = "RESERVE_AND_STATEMENT_ITEM_SAVE_ERROR";
        /*** 備付金與對賬單分類項目關聯訊息查詢失敗，請確認。*/
//        public static final String RESERVE_AND_STATEMENT_ITEM_SELECT_ERROR = "RESERVE_AND_STATEMENT_ITEM_SELECT_ERROR";
        /*** 客戶對帳單主檔查詢失敗。*/
//        public static final String ME_STATEMENT_MASTER_SELECT_ERROR = "ME_STATEMENT_MASTER_SELECT_ERROR";
        /*** 更新備付金與對賬單分類項目關聯表數據失敗,請檢查數據。*/
//        public static final String RESERVE_AND_STATEMENT_ITEM_UPDATE_ERROR = "RESERVE_AND_STATEMENT_ITEM_UPDATE_ERROR";
        /*** 當前關係ID在備付金與對賬單分類項目關聯表沒有數據,請檢查關係ID。*/
//        public static final String THIS_RELATION_ID_NOT_HAVE_MESSAGE_IN_RESERVE_AND_STATEMENT_ITEM = "THIS_RELATION_ID_NOT_HAVE_MESSAGE_IN_RESERVE_AND_STATEMENT_ITEM";
        /*** 當前對帳單分類項id在客戶對帳單分類項目沒有數據,請檢查對帳單分類項id。*/
//        public static final String ME_STATEMENT_CATEGORY_ITEM_NOT_HAVE_BY_FINAL_STATEMENT_CATEGORY_ID = "ME_STATEMENT_CATEGORY_ITEM_NOT_HAVE_BY_FINAL_STATEMENT_CATEGORY_ID";
        /*** 客戶對帳單分類項目表修改失敗*/
//        public static final String ME_STATEMENT_CATEGORY_ITEM_UPDATE_ERROR = "ME_STATEMENT_CATEGORY_ITEM_UPDATE_ERROR";
        /*** 客戶對帳單主檔表修改對賬單狀態失敗*/
//        public static final String ME_STATEMENT_MASTER_UPDATE_STATUS_ERROR = "ME_STATEMENT_MASTER_UPDATE_STATUS_ERROR";
        /*** 當前對帳單編號在客戶對帳單主檔表裏沒有數據,請檢查數據*/
//        public static final String ME_STATEMENT_MASTER_NOT_HAVE_ERROR = "ME_STATEMENT_MASTER_NOT_HAVE_ERROR";
        /*** 客戶對帳單編號不能爲空*/
//        public static final String FINAL_STATEMENT_CODE_PARAM_ERROR = "FINAL_STATEMENT_CODE_PARAM_ERROR";
        /*** 未查詢到客戶對帳單分類項目信息*/
//        public static final String ME_STATEMENT_CATEGORY_ITEM_GET_ERROR = "ME_STATEMENT_CATEGORY_ITEM_GET_ERROR";
        /*** 參數錯誤,請檢測傳入的客戶日結賬單編號是否爲空*/
//        public static final String MERCHANT_DAILY_BILL_CODE_NOT_HAVING = "MERCHANT_DAILY_BILL_CODE_NOT_HAVING";
        /*** 根據客戶日結算編碼查詢客戶日結算統計表沒有詞條數據,請檢查數據*/
//        public static final String MERCHANT_DAILY_SETTLEMENT_NOT_HAVING_BY_CODE = "MERCHANT_DAILY_SETTLEMENT_NOT_HAVING_BY_CODE";
        /*** 當前日結算單餘額不足,請綁定其他日結算單*/
//        public static final String MERCHANT_DAILY_SETTLEMENT_INSUFFICIENT_BALANCE = "MERCHANT_DAILY_SETTLEMENT_INSUFFICIENT_BALANCE";
        /*** 當前日結算單餘額不足,請先解綁其他日結算單*/
//        public static final String MERCHANT_DAILY_SETTLEMENT_INSUFFICIENT_BALANCE_UNBIND_OTHER = "MERCHANT_DAILY_SETTLEMENT_INSUFFICIENT_BALANCE_UNBIND_OTHER";
        /*** 當前數據不是最新訊息，請刷新后再進行當前操作*/
//        public static final String UPDATE_TIME_ERROR = "UPDATE_TIME_ERROR";
        /*** 參數錯誤,請檢查傳入的通道日結算ID是否爲空*/
//        public static final String PAY_PLFM_DAILY_ORDER_RELATION_DAILY_SETTLEMENT_ID_ERROR = "PAY_PLFM_DAILY_ORDER_RELATION_DAILY_SETTLEMENT_ID_ERROR";
        /*** 通道日結算統計訊息修改失敗，請確認*/
//        public static final String PAY_PLFM_DAILY_SETTLEMENT_UPDATE_ERROR = "PAY_PLFM_DAILY_SETTLEMENT_UPDATE_ERROR";
        /*** 通道日結算統計訊息保存失敗，請確認*/
//        public static final String PAY_PLFM_DAILY_SETTLEMENT_SAVE_ERROR = "PAY_PLFM_DAILY_SETTLEMENT_SAVE_ERROR";
        /*** 通道日結算單“單號”已勾稽完成，請確認*/
//        public static final String PAY_PLFM_DAILY_SETTLEMENT_SETTLEMENT_STATUS_ERROR = "PAY_PLFM_DAILY_SETTLEMENT_SETTLEMENT_STATUS_ERROR";
        /*** 通道日結算與訂單關聯訊息保存失敗，請確認*/
//        public static final String PAY_PLFM_DAILY_ORDER_RELATION_SAVE_ERROR = "PAY_PLFM_DAILY_ORDER_RELATION_SAVE_ERROR";
        /*** 客戶日結算統計訊息修改失敗，請確認*/
//        public static final String MERCHANT_DAILY_SETTLEMENT_UPDATE_ERROR = "MERCHANT_DAILY_SETTLEMENT_UPDATE_ERROR";
        /*** 客戶日結算統計訊息保存失敗，請確認*/
//        public static final String MERCHANT_DAILY_SETTLEMENT_SAVE_ERROR = "MERCHANT_DAILY_SETTLEMENT_SAVE_ERROR";
        /*** 客戶日結算單“單號”已生成對賬單，請確認*/
//        public static final String MERCHANT_DAILY_SETTLEMENT_SETTLEMENT_STATUS_ERROR = "MERCHANT_DAILY_SETTLEMENT_SETTLEMENT_STATUS_ERROR";
        /*** 客戶日結算與訂單關聯訊息保存失敗，請確認*/
//        public static final String MERCHANT_DAILY_ORDER_RELATION_SAVE_ERROR = "MERCHANT_DAILY_ORDER_RELATION_SAVE_ERROR";
        /*** 平臺收款日不能爲空*/
//        public static final String COLLECTION_DATE_PARAM_ERROR = "COLLECTION_DATE_PARAM_ERROR";
    }
    /* *********************  財務單相關提示信息  END  ******************* */

    /* *********************  應收應付費用設定相關提示信息  BEGIN  ******************* */
    public static class FeeSetting {
        /*** 參數錯誤,請檢測傳入的費用設定id是否爲空*/
//        public static final String FEE_SETTING_ID_NOT_HAVING = "FEE_SETTING_ID_NOT_HAVING";
        /*** 當前費用設定ID下沒有訊息,請檢查參數*/
//        public static final String FEE_SETTING_ID_NOT_HAVING_BY_SETTING_ID = "FEE_SETTING_ID_NOT_HAVING_BY_SETTING_ID";
        /*** 應收應付費用設定表保存失敗,請檢查參數*/
//        public static final String FEE_SETTING_ID_SAVE_ERROR = "FEE_SETTING_ID_SAVE_ERROR";
        /*** 應收應付費用設定表修改失敗,請檢查參數*/
//        public static final String FEE_SETTING_ID_UPDATE_ERROR = "FEE_SETTING_ID_UPDATE_ERROR";
        /*** 當前項目未啓用,請選擇已啓用的項目*/
//        public static final String FEE_STATUS_IS_NOT_ENABLE = "FEE_STATUS_IS_NOT_ENABLE";
        /*** 已有相同的應收應付項目存在，請勿重複保存*/
//        public static final String FEE_SETTING_REPEAT_ERROR = "FEE_SETTING_REPEAT_ERROR";
    }
    /* *********************  應收應付費用設定相關提示信息  END  ******************* */

    /* *********************  發票捐贈單位代碼提示信息  BEGIN  ******************* */
    public static class DonateInvoice {
        /*** 捐贈發票單位代碼不能爲空*/
//        public static final String DONATE_INVOICE_CODE_PARAM_ERROR = "DONATE_INVOICE_CODE_PARAM_ERROR";
        /*** 捐贈發票單位名稱不能爲空*/
//        public static final String DONATE_INVOICE_COMPANY_PARAM_ERROR = "DONATE_INVOICE_COMPANY_PARAM_ERROR";
        /*** 捐贈發票單位代碼添加失敗*/
//        public static final String DONATE_INVOICE__SAVE_ERROR = "DONATE_INVOICE__SAVE_ERROR";
        /*** 捐贈發票單位代碼不存在*/
//        public static final String DONATE_INVOICE_CODE_NOT_EXIST_ERROR = "DONATE_INVOICE_CODE_NOT_EXIST_ERROR";
        /*** 捐贈發票單位代碼修改失敗*/
//        public static final String DONATE_INVOICE_UPDATE_ERROR = "DONATE_INVOICE_UPDATE_ERROR";
        /*** 捐贈發票單位代碼刪除失敗*/
//        public static final String DONATE_INVOICE_DELETE_ERROR = "DONATE_INVOICE_DELETE_ERROR";
        /*** 解析的Excel文件為空*/
//        public static final String DONATE_INVOICE_EXCEL_EMPTY = "DONATE_INVOICE_EXCEL_EMPTY";
        /*** 字符串長度請控制在合理範圍内*/
//        public static final String DONATE_INVOICE_LENGTH_ERROR = "DONATE_INVOICE_LENGTH_ERROR";
        /*** 此捐贈發票單位代碼已存在*/
//        public static final String DONATE_INVOICE_CODE_ALREADY_EXIST_ERROR = "DONATE_INVOICE_CODE_ALREADY_EXIST_ERROR";
        /*** 批量保存捐贈發票單位名稱不能爲空*/
//        public static final String BATCH_DONATE_INVOICE_COMPANY_PARAM_ERROR = "BATCH_DONATE_INVOICE_COMPANY_PARAM_ERROR";
        /*** 捐贈發票單位狀態值不能爲空*/
//        public static final String DONATE_INVOICE_STATUS_PARAM_ERROR = "DONATE_INVOICE_STATUS_PARAM_ERROR";
        /*** 捐贈發票單位排序值非数字*/
//        public static final String DONATE_INVOICE_SORT_PARAM_ERROR = "DONATE_INVOICE_SORT_PARAM_ERROR";
    }
    /* *********************  發票捐贈單位代碼提示信息  END  ******************* */

    /* *********************  項目分類表  BEGIN  ******************* */
    public static class CommonCategory {
        /*** 父項ID不能爲空*/
        public static final String COMMON_CATEGORY_CODE_PARAM_ERROR = "COMMON_CATEGORY_CODE_PARAM_ERROR";
        /*** 保存新的分類失敗，請確認*/
        public static final String COMMON_CATEGORY_SAVE_ERROR = "COMMON_CATEGORY_SAVE_ERROR";
        /*** 更新分類失敗，請確認*/
        public static final String COMMON_CATEGORY_UPDATE_ERROR = "COMMON_CATEGORY_UPDATE_ERROR";
        /*** 分類ID已存在*/
        public static final String COMMON_CATEGORY_ID_DATA_EXISTS = "COMMON_CATEGORY_ID_DATA_EXISTS";
        /*** 分類ID信息不存在*/
        public static final String COMMON_CATEGORY_GET_ERROR = "COMMON_CATEGORY_GET_ERROR";
        /*** 刪除分類失敗，請確認*/
        public static final String COMMON_CATEGORY_DELETE_ERROR = "COMMON_CATEGORY_DELETE_ERROR";
        /*** 分類ID不能爲空*/
        public static final String COMMON_CATEGORY_ID_CODE_PARAM_ERROR = "COMMON_CATEGORY_ID_CODE_PARAM_ERROR";
        /*** 父項名稱不存在*/
//        public static final String PARENT_NAME_CODE_PARAM_ERROR = "PARENT_NAME_CODE_PARAM_ERROR";
    }

    public static class CommonCurrency {
        /*** 未找到符合条件的信息 */
        public static final String COMMON_CURRENCY_CONDITION_NULL = "COMMON_CURRENCY_CONDITION_NULL";
        /*** 货币表插入失败 */
        public static final String COMMON_CURRENCY_INSERT_ERROR = "COMMON_CURRENCY_INSERT_ERROR";
        /*** 货币表更新失败 */
        public static final String COMMON_CURRENCY_UPDATE_ERROR = "COMMON_CURRENCY_UPDATE_ERROR";
        /*** 货币表刪除失败 */
        public static final String COMMON_CURRENCY_DELETED_ERROR = "COMMON_CURRENCY_DELETED_ERROR";
        /*** 货币ID不能爲空 */
        public static final String COMMON_CURRENCY_CURRENCY_ID_NULL = "COMMON_CURRENCY_CURRENCY_ID_NULL";
        /*** 信息已存在 */
        public static final String COMMON_CURRENCY_CONTENT_EXIST = "COMMON_CURRENCY_CONTENT_EXIST";
        /*** 货币名称不能爲空 ...*/
        public static final String COMMON_CURRENCY_CURRENCY_NAME_NULL = "COMMON_CURRENCY_CURRENCY_NAME_NULL";
        /*** 货币名称id不能爲空 ...*/
        public static final String COMMON_CURRENCY_CURRENCY_NAME_ID_NULL = "COMMON_CURRENCY_CURRENCY_NAME_ID_NULL";
        /*** 货币符号不能爲空 ...*/
        public static final String COMMON_CURRENCY_CURRENCY_SYMBOL_NULL = "COMMON_CURRENCY_CURRENCY_SYMBOL_NULL";
        /*** 虚拟货币不能爲空 ...*/
        public static final String COMMON_CURRENCY_CURRENCY_VIRTUALITY_NULL = "COMMON_CURRENCY_CURRENCY_VIRTUALITY_NULL";
        /*** 是否取整不能爲空 ...*/
        public static final String COMMON_CURRENCY_ROUNDING_NULL = "COMMON_CURRENCY_ROUNDING_NULL";
        /*** 货币名称词汇表键值不能爲空 */
        public static final String COMMON_CURRENCY_ITEM_KEY_NULL = "COMMON_CURRENCY_ITEM_KEY_NULL";
        /*** 项目类型不能爲空 */
        public static final String COMMON_CURRENCY_ITEM_TYPE_NULL = "COMMON_CURRENCY_ITEM_TYPE_NULL";
        /*** 功能代碼不能爲空 */
        public static final String COMMON_CURRENCY_FUCTION_CODE_NULL = "COMMON_CURRENCY_FUCTION_CODE_NULL";
        /*** 詞彙語系種類不能爲空 */
        public static final String COMMON_CURRENCY_LANG_TYPE_ID_NULL = "COMMON_CURRENCY_LANG_TYPE_ID_NULL";
    }
    /* *********************  項目分類表  END  ******************* */

    /* *********************  系統公司相關提示信息 BEGIN  ******************* */
    public static class SysEnterpriseMessage {
        /*** 公司創建失敗*/
//        public static final String SYS_ENTERPRISE_SAVE_ERROR = "SYS_ENTERPRISE_SAVE_ERROR";

    }
    /* *********************  系統公司相關提示信息 END  ******************* */

    /* *********************  授權相關提示信息 BEGIN  ******************* */
    public static class LicenseMessage {
        /*** 授權id為空*/
        public static final String LICENSE_ID_EMPTY = "LICENSE_ID_EMPTY";
        /*** 狀態修改失敗*/
        public static final String LICENSE_UPDATE_STATUS_ERROR = "LICENSE_UPDATE_STATUS_ERROR";
        /*** 审核未通过,狀態修改失敗*/
        public static final String LICENSE_UPDATE_AUDIT_STATUS_ERROR = "LICENSE_UPDATE_AUDIT_STATUS_ERROR";
        /*** 狀態修改失敗,License已過有效期*/
        public static final String LICENSE_UPDATE_STATUS_ERROR_EXPIRATION = "LICENSE_UPDATE_STATUS_ERROR_EXPIRATION";
        /*** 指派者修改失敗*/
        public static final String LICENSE_UPDATE_ASSIGN_USER_ERROR = "LICENSE_UPDATE_ASSIGN_USER_ERROR";
        /*** 新增授權參數有誤，請確認*/
        public static final String LICENSE_SAVE_PARAM_ERROR = "LICENSE_SAVE_PARAM_ERROR";
        /*** 新增授權參數有誤，選擇VolumeLicensing時請填寫CompanyName(限8位英文)*/
        public static final String LICENSE_SAVE_PARAM_ERROR_COMPANY_NAME = "LICENSE_SAVE_PARAM_ERROR_COMPANY_NAME";
        /*** 新增授權參數有誤，VolumeLicensing 與 SM2 不能同時選擇*/
        public static final String LICENSE_SAVE_PARAM_ERROR_SM2 = "LICENSE_SAVE_PARAM_ERROR_SM2";
        /*** 新增授權參錯誤，請重試*/
        public static final String LICENSE_SAVE_ERROR = "LICENSE_SAVE_ERROR";
        /*** 查詢詳細授權參數有誤，請確認*/
        public static final String LICENSE_INFO_PARAM_ERROR = "LICENSE_INFO_PARAM_ERROR";
        /*** 查詢詳細授權錯誤，請重試*/
        public static final String LICENSE_INFO_ERROR = "LICENSE_INFO_ERROR";
        /*** 補償天數新增錯誤，請重試*/
        public static final String LICENSE_BUFFER_DAY_INSTER_ERROR = "LICENSE_BUFFER_DAY_INSTER_ERROR";
        /*** 天数范围已存在，請确认*/
        public static final String LICENSE_BUFFER_DAY_INSTER_ERROR_DAY_EXIST = "LICENSE_BUFFER_DAY_INSTER_ERROR_DAY_EXIST";
        /*** 補償天數更新錯誤，請重試*/
        public static final String LICENSE_BUFFER_DAY_UPDATE_ERROR = "LICENSE_BUFFER_DAY_UPDATE_ERROR";
        /*** 補償天數刪除錯誤，請重試*/
        public static final String LICENSE_BUFFER_DAY_DELETE_ERROR = "LICENSE_BUFFER_DAY_DELETE_ERROR";
        /*** 補償天數查詢錯誤，請重試*/
        public static final String LICENSE_BUFFER_DAY_SELECT_ERROR = "LICENSE_BUFFER_DAY_SELECT_ERROR";
        /*** 補償天數參數範圍錯誤，請重試*/
        public static final String LICENSE_BUFFER_DAY_INSTER_SCOPE_ERROR = "LICENSE_BUFFER_DAY_INSTER_SCOPE_ERROR";
        /*** 補償天數參數不能為空，請重試*/
        public static final String LICENSE_BUFFER_DAY_PARAM_NULL_ERROR = "LICENSE_BUFFER_DAY_PARAM_NULL_ERROR";
        /*** 生成授權失敗，模型code爲空*/
        public static final String LICENSE_CODE_MODEL_CODE_NULL = "LICENSE_CODE_MODEL_CODE_NULL";
        /*** 生成授權失敗，鏈接設備失敗*/
        public static final String LICENSE_CODE_ERROR = "LICENSE_CODE_ERROR";
        /*** 生成授權失敗，發生未知錯誤，請確認License功能與特性*/
        public static final String LICENSE_CODE_GENERATE_ERROR = "LICENSE_CODE_GENERATE_ERROR";
//AG Series
        /*** max sessions數字範圍錯誤，請重試*/
        public static final String MAX_SESSIONS_SCOPE_ERROR = "MAX_SESSIONS_SCOPE_ERROR";
        /*** max virtual portals範圍錯誤(1-256)，請重試*/
        public static final String MAX_VIRTUAL_PORTALS_SCOPE_ERROR = "MAX_VIRTUAL_PORTALS_SCOPE_ERROR";
        /*** site2site_max_tunnels範圍錯誤(0-1000000)，請重試*/
        public static final String SITE2SITE_MAX_TUNNELS_SCOPE_ERROR = "SITE2SITE_MAX_TUNNELS_SCOPE_ERROR";
        /*** pre-paid flex credit days範圍錯誤(1-9999)，請重試*/
        public static final String PRE_PAID_FLEX_CREDIT_DAYS_SCOPE_ERROR = "PRE_PAID_FLEX_CREDIT_DAYS_SCOPE_ERROR";
        /*** cm_max_device範圍錯誤(1-9999)，請重試*/
        public static final String CM_MAX_DEVICE_SCOPE_ERROR = "CM_MAX_DEVICE_SCOPE_ERROR";
    }
    /* *********************  授權相關提示信息 END  ******************* */


    /* *********************  產品相關提示訊息 BEGIN  ******************* */
    public static class ProductMessage {
        /*** 產品類別id為空*/
        public static final String PRODUCT_CATEGORY_ID_EMPTY = "PRODUCT_CATEGORY_ID_EMPTY";
        /*** 產品模型id為空*/
        public static final String PRODUCT_MODEL_ID_EMPTY = "PRODUCT_MODEL_ID_EMPTY";
        /*** 產品版本id為空*/
        public static final String PRODUCT_VERSION_ID_EMPTY = "PRODUCT_VERSION_ID_EMPTY";
        /*** 產品名稱為空*/
        public static final String PRODUCT_MASTER_NAME_EMPTY = "PRODUCT_MASTER_NAME_EMPTY";
        /*** 產品名稱重複*/
        public static final String PRODUCT_MASTER_NAME_EXIST = "PRODUCT_MASTER_NAME_EXIST";
        /*** 請填選是否可視*/
        public static final String VIEW_STATUS_EMPTY = "VIEW_STATUS_EMPTY";
        /*** 產品主表修改失敗*/
        public static final String PRODUCT_MASTER_ENTITY_UPDATE_ERROR = "PRODUCT_MASTER_ENTITY_UPDATE_ERROR";
        /**
         * 同型號產品已存在
         */
        public static final String PRODUCT_MASTER_ENTITY_ALREADY_EXISTS = "PRODUCT_MASTER_ENTITY_ALREADY_EXISTS";
        /*** 產品價格保存失敗*/
        public static final String PRODUCT_PRICE_ENTITY_SAVE_ERROR = "PRODUCT_PRICE_ENTITY_SAVE_ERROR";
        /*** 產品信息保存失敗*/
        public static final String PRODUCT_MASTER_ENTITY_SAVE_ERROR = "PRODUCT_MASTER_ENTITY_SAVE_ERROR";
        /*** 產品種類編碼為空*/
        public static final String PRODUCT_KIND_CODE_EMPTY = "PRODUCT_KIND_CODE_EMPTY";
        /*** 產品狀態修改失敗*/
        public static final String PRODUCT_MASTER_STATUS_UPDATE_ERROR = "PRODUCT_MASTER_STATUS_UPDATE_ERROR";
        /*** 產品ID為空*/
        public static final String PRODUCT_MASTER_ID_EMPTY = "PRODUCT_MASTER_ID_EMPTY";
        /*** 請選擇貨幣*/
        public static final String PRODUCT_MASTER_PRICE_EMPTY = "PRODUCT_MASTER_PRICE_EMPTY";
        /*** 對應價格不存在*/
        public static final String PRODUCT_MASTER_PRICE_IS_NULL = "PRODUCT_MASTER_PRICE_IS_NULL";
        /*** 新增產品規格參數有誤，請重新輸入*/
        public static final String PRODUCT_SPECIFICATION_SAVE_PARAM_ERROR = "PRODUCT_SPECIFICATION_SAVE_PARAM_ERROR";
        /*** 新增產品規格錯誤，請重試*/
        public static final String PRODUCT_SPECIFICATION_SAVE_ERROR = "PRODUCT_SPECIFICATION_SAVE_ERROR";
        /*** 產品規格名稱已存在，請重新輸入*/
        public static final String PRODUCT_SPECIFICATION_NAME_EXIST = "PRODUCT_SPECIFICATION_NAME_EXIST";
        /*** 修改狀態產品規格參數有誤，請重新輸入*/
        public static final String PRODUCT_SPECIFICATION_EDIT_STATUS_PARAM_ERROR = "PRODUCT_SPECIFICATION_EDIT_STATUS_PARAM_ERROR";
        /*** 修改狀態產品規格錯誤，請重試*/
        public static final String PRODUCT_SPECIFICATION_EDIT_STATUS_ERROR = "PRODUCT_SPECIFICATION_EDIT_STATUS_ERROR";
        /*** 修改產品規格參數有誤，請重新輸入*/
        public static final String PRODUCT_SPECIFICATION_EDIT_PARAM_ERROR = "PRODUCT_SPECIFICATION_EDIT_PARAM_ERROR";
        /*** 修改產品規格錯誤，請重試*/
        public static final String PRODUCT_SPECIFICATION_EDIT_ERROR = "PRODUCT_SPECIFICATION_EDIT_ERROR";
        /*** 刪除產品規格參數有誤，請重新輸入*/
        public static final String PRODUCT_SPECIFICATION_DELETE_PARAM_ERROR = "PRODUCT_SPECIFICATION_DELETE_PARAM_ERROR";
        /*** 刪除產品規格錯誤，請重試*/
        public static final String PRODUCT_SPECIFICATION_DELETE_ERROR = "PRODUCT_SPECIFICATION_DELETE_ERROR";
        /*** 刪除產品規格存在關聯*/
        public static final String PRODUCT_SPECIFICATION_DELETE_CATEGORY_ERROR = "PRODUCT_SPECIFICATION_DELETE_CATEGORY_ERROR";
        /*** 刪除產品規格存在關聯*/
        public static final String PRODUCT_SPECIFICATION_DELETE_VERSION_ERROR = "PRODUCT_SPECIFICATION_DELETE_VERSION_ERROR";
        /*** 查詢詳細產品規格參數有誤，請重新輸入*/
        public static final String PRODUCT_SPECIFICATION_INFO_ERROR = "PRODUCT_SPECIFICATION_INFO_ERROR";

        /*** 產品類別規格參數失敗，請重新輸入*/
        public static final String PRODUCT_CATEGORY_SPECIFICATION_EDIT_PARAM_ERROR = "PRODUCT_CATEGORY_SPECIFICATION_EDIT_PARAM_ERROR";
        /*** 產品類別規格錯誤，請重試*/
        public static final String PRODUCT_CATEGORY_SPECIFICATION_EDIT_ERROR = "PRODUCT_CATEGORY_SPECIFICATION_EDIT_ERROR";
        /*** 查询產品類別規格參數失敗，請重新輸入*/
        public static final String PRODUCT_CATEGORY_SPECIFICATION_LIST_PARAM_ERROR = "PRODUCT_CATEGORY_SPECIFICATION_LIST_PARAM_ERROR";

        /*** 產品版本規格錯誤，請重試*/
        public static final String PRODUCT_VERSION_SPECIFICATION_EDIT_ERROR = "PRODUCT_VERSION_SPECIFICATION_EDIT_ERROR";
        /*** 產品版本規格參數失敗，請重新輸入*/
        public static final String PRODUCT_VERSION_SPECIFICATION_EDIT_PARAM_ERROR = "PRODUCT_VERSION_SPECIFICATION_EDIT_PARAM_ERROR";

        /*** 查询產品版本規格參數失敗，請重新輸入*/
        public static final String PRODUCT_VERSION_SPECIFICATION_LIST_PARAM_ERROR = "PRODUCT_VERSION_SPECIFICATION_LIST_PARAM_ERROR";

        /*** 新增產品版本參數有誤，請重新輸入*/
        public static final String PRODUCT_VERSION_SAVE_PARAM_ERROR = "PRODUCT_VERSION_SAVE_PARAM_ERROR";
        /*** 新增產品版本參數失敗，請重試*/
        public static final String PRODUCT_VERSION_SAVE_ERROR = "PRODUCT_VERSION_SAVE_ERROR";
        /*** 產品版本名稱已存在，請重新輸入*/
        public static final String PRODUCT_VERSION_NAME_EXIST = "PRODUCT_VERSION_NAME_EXIST";
        /*** 修改產品版本狀態參數有誤，請重新輸入*/
        public static final String PRODUCT_VERSION_EDIT_STATUS_PARAM_ERROR = "PRODUCT_VERSION_EDIT_STATUS_PARAM_ERROR";
        /*** 修改產品版本狀態失敗，請重試*/
        public static final String PRODUCT_VERSION_EDIT_STATUS_ERROR = "PRODUCT_VERSION_EDIT_STATUS_ERROR";
        /*** 修改產品版本參數有誤，請重新輸入*/
        public static final String PRODUCT_VERSION_EDIT_PARAM_ERROR = "PRODUCT_VERSION_EDIT_PARAM_ERROR";
        /*** 修改產品版本失敗，請重試*/
        public static final String PRODUCT_VERSION_EDIT_ERROR = "PRODUCT_VERSION_EDIT_ERROR";
        /*** 刪除產品版本參數有誤，請重新輸入*/
        public static final String PRODUCT_VERSION_DELETE_PARAM_ERROR = "PRODUCT_VERSION_DELETE_PARAM_ERROR";
        /*** 刪除產品版本失敗，請重試*/
        public static final String PRODUCT_VERSION_DELETE_ERROR = "PRODUCT_VERSION_DELETE_ERROR";
        /*** 分頁查詢產品版本失敗，請重試*/
        public static final String PRODUCT_VERSION_PAGE_ERROR = "PRODUCT_VERSION_PAGE_ERROR";
        /*** 查詢詳細產品版本失敗，請重試*/
        public static final String PRODUCT_VERSION_INFO_ERROR = "PRODUCT_VERSION_INFO_ERROR";
        /*** 列表查詢產品版本失敗，請重試*/
        public static final String PRODUCT_VERSION_LIST_ERROR = "PRODUCT_VERSION_LIST_ERROR";


        /*** 新增產品綫參數有誤，請重新輸入*/
        public static final String PRODUCT_LINE_SAVE_PARAM_ERROR = "PRODUCT_LINE_SAVE_PARAM_ERROR";
        /*** 產品綫名稱已存在，請重新輸入*/
        public static final String PRODUCT_LINE_PARAM_NAME_EXIST = "PRODUCT_LINE_PARAM_NAME_EXIST";
        /*** 新增產品綫失敗，請重新輸入*/
        public static final String PRODUCT_LINE_SAVE_ERROR = "PRODUCT_LINE_SAVE_ERROR";
        /*** 修改產品綫狀態參數有誤，請重新輸入*/
        public static final String PRODUCT_LINE_EDIT_STATUS_PARAM_ERROR = "PRODUCT_LINE_EDIT_STATUS_PARAM_ERROR";
        /*** 修改產品綫狀態有誤，請重新輸入*/
        public static final String PRODUCT_LINE_EDIT_STATUS_ERROR = "PRODUCT_LINE_EDIT_STATUS_ERROR";
        /*** 產品綫詳情參數有誤，請重新輸入*/
        public static final String PRODUCT_LINE_INFO_PARAM_ERROR = "PRODUCT_LINE_INFO_PARAM_ERROR";
        /*** 產品綫刪除參數有誤，請重新輸入*/
        public static final String PRODUCT_LINE_DELETE_PARAM_ERROR = "PRODUCT_LINE_DELETE_PARAM_ERROR";
        /*** 產品綫刪除有誤，請重新輸入*/
        public static final String PRODUCT_LINE_DELETE_ERROR = "PRODUCT_LINE_DELETE_ERROR";
        /*** 產品綫修改參數有誤，請重新輸入*/
        public static final String PRODUCT_LINE_EDIT_PARAM_ERROR = "PRODUCT_LINE_EDIT_PARAM_ERROR";
        /*** 產品綫修改有誤，請重新輸入*/
        public static final String PRODUCT_LINE_EDIT_ERROR = "PRODUCT_LINE_EDIT_ERROR";
        /*** 產品綫刪除有誤，有產品類別擁有產品綫，請重新輸入*/
        public static final String PRODUCT_LINE_DELETE_CATEGORY_ERROR = "PRODUCT_LINE_DELETE_CATEGORY_ERROR";

        /*** 新增產品類別參數有誤，請重新輸入*/
        public static final String PRODUCT_CATEGORY_SAVE_PARAM_ERROR = "PRODUCT_CATEGORY_SAVE_PARAM_ERROR";
        /*** 新增產品類別失敗，請重新輸入*/
        public static final String PRODUCT_CATEGORY_SAVE_ERROR = "PRODUCT_CATEGORY_SAVE_ERROR";
        /*** 產品類別名稱已存在，請重新輸入*/
        public static final String PRODUCT_CATEGORY_NAME_EXIST = "PRODUCT_CATEGORY_NAME_EXIST";
        /*** 修改產品類別狀態參數有誤，請重新輸入*/
        public static final String PRODUCT_CATEGORY_EDIT_STATUS_PARAM_ERROR = "PRODUCT_CATEGORY_EDIT_STATUS_PARAM_ERROR";
        /*** 修改產品類別狀態有誤，請重新輸入*/
        public static final String PRODUCT_CATEGORY_EDIT_STATUS_ERROR = "PRODUCT_CATEGORY_EDIT_STATUS_ERROR";
        /*** 產品類別詳情參數有誤，請重新輸入*/
        public static final String PRODUCT_CATEGORY_INFO_PARAM_ERROR = "PRODUCT_CATEGORY_INFO_PARAM_ERROR";
        /*** 產品類別刪除參數有誤，請重新輸入*/
        public static final String PRODUCT_CATEGORY_DELETE_PARAM_ERROR = "PRODUCT_CATEGORY_DELETE_PARAM_ERROR";
        /*** 產品類別刪除有誤，請重新輸入*/
        public static final String PRODUCT_CATEGORY_DELETE_ERROR = "PRODUCT_CATEGORY_DELETE_ERROR";
        /*** 產品類別修改參數有誤，請重新輸入*/
        public static final String PRODUCT_CATEGORY_EDIT_PARAM_ERROR = "PRODUCT_CATEGORY_EDIT_PARAM_ERROR";
        /*** 產品類別修改有誤，請重新輸入*/
        public static final String PRODUCT_CATEGORY_EDIT_ERROR = "PRODUCT_CATEGORY_EDIT_ERROR";
        /*** 產品類別刪除有誤，有產品模型擁有產品類別，請重新輸入*/
        public static final String PRODUCT_CATEGORY_DELETE_MODEL_ERROR = "PRODUCT_CATEGORY_DELETE_MODEL_ERROR";


        /*** 新增產品功能參數有誤，請重新輸入*/
        public static final String PRODUCT_FUNCTION_SAVE_PARAM_ERROR = "PRODUCT_FUNCTION_SAVE_PARAM_ERROR";
        /*** 新增產品功能失敗，請重新輸入*/
        public static final String PRODUCT_FUNCTION_SAVE_ERROR = "PRODUCT_FUNCTION_SAVE_ERROR";
        /*** 產品功能名稱已存在，請重新輸入*/
        public static final String PRODUCT_FUNCTION_NAME_EXIST = "PRODUCT_FUNCTION_NAME_EXIST";
        /*** 修改產品功能狀態參數有誤，請重新輸入*/
        public static final String PRODUCT_FUNCTION_EDIT_STATUS_PARAM_ERROR = "PRODUCT_FUNCTION_EDIT_STATUS_PARAM_ERROR";
        /*** 修改產品功能狀態有誤，請重新輸入*/
        public static final String PRODUCT_FUNCTION_EDIT_STATUS_ERROR = "PRODUCT_FUNCTION_EDIT_STATUS_ERROR";
        /*** 產品功能詳情參數有誤，請重新輸入*/
        public static final String PRODUCT_FUNCTION_INFO_PARAM_ERROR = "PRODUCT_FUNCTION_INFO_PARAM_ERROR";
        /*** 產品功能刪除參數有誤，請重新輸入*/
        public static final String PRODUCT_FUNCTION_DELETE_PARAM_ERROR = "PRODUCT_FUNCTION_DELETE_PARAM_ERROR";
        /*** 產品功能刪除有誤，請重新輸入*/
        public static final String PRODUCT_FUNCTION_DELETE_ERROR = "PRODUCT_FUNCTION_DELETE_ERROR";
        /*** 產品功能修改參數有誤，請重新輸入*/
        public static final String PRODUCT_FUNCTION_EDIT_PARAM_ERROR = "PRODUCT_FUNCTION_EDIT_PARAM_ERROR";
        /*** 產品功能修改有誤，請重新輸入*/
        public static final String PRODUCT_FUNCTION_EDIT_ERROR = "PRODUCT_FUNCTION_EDIT_ERROR";
        /*** 產品類別刪除有誤，有產品類別擁有產品功能，請重新輸入*/
        public static final String PRODUCT_FUNCTION_DELETE_CATEGORY_ERROR = "PRODUCT_FUNCTION_DELETE_CATEGORY_ERROR";
        /*** 產品功能刪除有誤，有產品版本擁有產品功能，請重新輸入*/
        public static final String PRODUCT_FUNCTION_DELETE_VERSION_ERROR = "PRODUCT_FUNCTION_DELETE_VERSION_ERROR";

        /*** 新增產品類別功能參數有誤，請重新輸入*/
        public static final String PRODUCT_CATEGORY_FUNCTION_EDIT_PARAM_ERROR = "PRODUCT_CATEGORY_FUNCTION_EDIT_PARAM_ERROR";
        /*** 新增產品類別功能參數失敗，請重新輸入*/
        public static final String PRODUCT_CATEGORY_FUNCTION_EDIT_ERROR = "PRODUCT_CATEGORY_FUNCTION_EDIT_ERROR";
        /*** 新增產品類別功能參數有誤，產品類別不存在，請重新輸入*/
        public static final String PRODUCT_CATEGORY_FUNCTION_EDIT_CATEGORY_NULL = "PRODUCT_CATEGORY_FUNCTION_EDIT_CATEGORY_NULL";
        /*** 新增產品類別功能參數失敗，產品功能不存在，請重新輸入*/
        public static final String PRODUCT_CATEGORY_FUNCTION_EDIT_FUNCTION_NULL = "PRODUCT_CATEGORY_FUNCTION_EDIT_FUNCTION_NULL";
        /*** 新增產品類別功能參數失敗,產品類別功能以存在，請重新輸入*/
        public static final String PRODUCT_CATEGORY_FUNCTION_EDIT_IS_EXIST = "PRODUCT_CATEGORY_FUNCTION_EDIT_IS_EXIST";
        /*** 刪除產品類別功能參數失敗，請重新輸入*/
        public static final String PRODUCT_CATEGORY_FUNCTION_DELETE_PARAM_ERROR = "PRODUCT_CATEGORY_FUNCTION_DELETE_PARAM_ERROR";
        /*** 查询產品類別功能列表參數失敗，請重新輸入*/
        public static final String PRODUCT_CATEGORY_FUNCTION_LIST_PARAM_ERROR = "PRODUCT_CATEGORY_FUNCTION_LIST_PARAM_ERROR";
        /*** 刪除產品類別功能參數失敗，請重新輸入*/
        public static final String PRODUCT_CATEGORY_FUNCTION_DELETE_ERROR = "PRODUCT_CATEGORY_FUNCTION_DELETE_ERROR";

        /*** 新增模型類別參數有誤，請重新輸入*/
        public static final String PRODUCT_MODEL_SAVE_PARAM_ERROR = "PRODUCT_MODEL_SAVE_PARAM_ERROR";
        /*** 新增模型類別失敗，請重新輸入*/
        public static final String PRODUCT_MODEL_SAVE_ERROR = "PRODUCT_MODEL_SAVE_ERROR";
        /*** 產品模型名稱已存在，請重新輸入*/
        public static final String PRODUCT_MODEL_NAME_EXIST = "PRODUCT_MODEL_NAME_EXIST";
        /*** 修改模型類別狀態參數有誤，請重新輸入*/
        public static final String PRODUCT_MODEL_EDIT_STATUS_PARAM_ERROR = "PRODUCT_MODEL_EDIT_STATUS_PARAM_ERROR";
        /*** 修改模型類別狀態有誤，請重新輸入*/
        public static final String PRODUCT_MODEL_EDIT_STATUS_ERROR = "PRODUCT_MODEL_EDIT_STATUS_ERROR";
        /*** 模型類別詳情參數有誤，請重新輸入*/
        public static final String PRODUCT_MODEL_INFO_PARAM_ERROR = "PRODUCT_MODEL_INFO_PARAM_ERROR";
        /*** 模型類別刪除參數有誤，請重新輸入*/
        public static final String PRODUCT_MODEL_DELETE_PARAM_ERROR = "PRODUCT_MODEL_DELETE_PARAM_ERROR";
        /*** 模型類別刪除有誤，請重新輸入*/
        public static final String PRODUCT_MODEL_DELETE_ERROR = "PRODUCT_MODEL_DELETE_ERROR";
        /*** 模型類別修改參數有誤，請重新輸入*/
        public static final String PRODUCT_MODEL_EDIT_PARAM_ERROR = "PRODUCT_MODEL_EDIT_PARAM_ERROR";
        /*** 模型類別修改有誤，請重新輸入*/
        public static final String PRODUCT_MODEL_EDIT_ERROR = "PRODUCT_MODEL_EDIT_ERROR";
        /*** 模型類別刪除有誤，有模型模型擁有模型類別，請重新輸入*/
        public static final String PRODUCT_MODEL_DELETE_VERSION_ERROR = "PRODUCT_MODEL_DELETE_VERSION_ERROR";


        /*** 查询產品版本功能相關列表參數失敗，請重新輸入*/
        public static final String PRODUCT_VERSION_FUNCTIONALITY_RELATED_LIST_PARAM_ERROR = "PRODUCT_VERSION_FUNCTIONALITY_RELATED_LIST_PARAM_ERROR";
        /*** 修改產品版本功能失敗，請重新輸入*/
        public static final String PRODUCT_VERSION_FUNCTIONALITY_RELATED_FUNCTION_INSERT_ERROR = "PRODUCT_VERSION_FUNCTIONALITY_RELATED_FUNCTION_INSERT_ERROR";
    }
    /* *********************  產品相關提示訊息 END  ******************* */


    /*** 請先創建默認語言對應的數據*/
    public static final String NORMAL_LANGUAGE_ERROR = "NORMAL_LANGUAGE_ERROR";

    /* *********************  BLOG相關提示信息  BEGIN  ******************* */
    public static class BlogMessage {
        /*** BLOG主檔讯息查询失败，請确认*/
        public static final String BLOG_MASTER_SELECT_ERROR = "BLOG_MASTER_SELECT_ERROR";
        /*** BLOG主檔讯息保存失败，請确认*/
        public static final String BLOG_MASTER_SAVE_ERROR = "BLOG_MASTER_SAVE_ERROR";
        /*** BLOG内容讯息保存失败，請确认*/
        public static final String BLOG_CONTENT_SAVE_ERROR = "BLOG_CONTENT_SAVE_ERROR";
        /*** BLOG標簽讯息保存失败，請确认*/
        public static final String BLOG_TAG_SAVE_ERROR = "BLOG_TAG_SAVE_ERROR";
        /*** BLOG主檔讯息修改失败，請确认*/
        public static final String BLOG_MASTER_UPDATE_ERROR = "BLOG_MASTER_UPDATE_ERROR";
        /*** BLOG内容讯息保存失败，請确认*/
        public static final String BLOG_CONTENT_UPDATE_ERROR = "BLOG_CONTENT_UPDATE_ERROR";
        /*** BLOG歸屬機構修改失败，請确认*/
        public static final String BLOG_MASTER_AFFILIATED_BY_COMPANY_UPDATE_ERROR = "BLOG_MASTER_AFFILIATED_BY_COMPANY_UPDATE_ERROR";
        /*** BLOG主檔排序重複，請确认*/
        public static final String BLOG_MASTER_SORT_ERROR = "BLOG_MASTER_SORT_ERROR";
        /*** BLOG主檔狀態修改有誤，請确认*/
        public static final String BLOG_MASTER_EDIT_STATUS_ERROR = "BLOG_MASTER_EDIT_STATUS_ERROR";
        /*** BLOG主檔狀態查詢有誤，請确认*/
        public static final String BLOG_MASTER_EDIT_STATUS_SELECT_ERROR = "BLOG_MASTER_EDIT_STATUS_SELECT_ERROR";
        /*** BLOG主檔狀態參數有誤，請确认*/
        public static final String BLOG_MASTER_EDIT_STATUS_PARAMS_ERROR = "BLOG_MASTER_EDIT_STATUS_PARAMS_ERROR";
        /*** 請先創建英文的BLOG*/
        public static final String BLOG_MASTER_LANGUAGE_ERROR = "BLOG_MASTER_LANGUAGE_ERROR";
    }
    /* *********************  BLOG相關提示信息  END  ******************* */

    /* *********************  Tag相關提示信息  BEGIN  ******************* */
    public static class TagMessage {
        /*** Tag新增參數錯誤，請确认*/
        public static final String TAG_INSERT_PARAM_ERROR = "TAG_INSERT_PARAM_ERROR";
        /*** Tag新增键值不能为空*/
        public static final String TAG_INSERT_KEY_NULL = "TAG_INSERT_KEY_NULL";
        /*** Tag新增名稱不能为空*/
        public static final String TAG_INSERT_NAME_NULL = "TAG_INSERT_NAME_NULL";
        /*** Tag新增國際化語言内容不能为空*/
        public static final String TAG_INSERT_LANGUAGE_CONSTANT_NULL = "TAG_INSERT_LANGUAGE_CONSTANT_NULL";
        /*** Tag修改键值不能为空*/
        public static final String TAG_UPDATE_KEY_NULL = "TAG_UPDATE_KEY_NULL";
        /*** Tag lang_type_id不能为空*/
        public static final String LANG_TYPE_ID_NULL = "LANG_TYPE_ID_NULL";
        /*** Tag新增錯誤，請确认*/
        public static final String TAG_INSERT_ERROR = "TAG_INSERT_ERROR";
        /*** Tag刪除錯誤，請确认*/
        public static final String TAG_DELETE_ERROR = "TAG_DELETE_ERROR";
        /*** Tag更新錯誤，請确认*/
        public static final String TAG_UPDATE_ERROR = "TAG_UPDATE_ERROR";
        /*** Tag查詢錯誤，請确认*/
        public static final String TAG_SELECT_ERROR = "TAG_SELECT_ERROR";
        /*** 符合條件的Tag不存在*/
        public static final String TAG_IS_NULL = "TAG_IS_NULL";
        /*** Tag修改ID不能爲空*/
        public static final String TAG_UPDATE_ID_NULL = "TAG_UPDATE_ID_NULL";
        /*** Tag修改名稱不能爲空*/
        public static final String TAG_UPDATE_NAME_NULL = "TAG_UPDATE_NAME_NULL";
        /*** Tag修改國際化語言内容不能爲空*/
        public static final String TAG_UPDATE_LANGUAGE_CONSTANT_NULL = "TAG_UPDATE_LANGUAGE_CONSTANT_NULL";
        /*** Tag修改參數錯誤*/
        public static final String TAG_UPDATE_PARAM_ERROR = "TAG_UPDATE_PARAM_ERROR";
    }
    /* *********************  Tag相關提示信息  END  ******************* */

    /* *********************  Webinars相關提示信息  BEGIN  ******************* */
    public static class WebinarsMessage {
        /*** WEBINARS主檔讯息查询失败，請确认*/
        public static final String WEBINARS_MASTER_SELECT_ERROR = "WEBINARS_MASTER_SELECT_ERROR";
        /*** WEBINARS主檔讯息保存失败，請确认*/
        public static final String WEBINARS_MASTER_SAVE_ERROR = "WEBINARS_MASTER_SAVE_ERROR";
        /*** WEBINARS内容讯息保存失败，請确认*/
        public static final String WEBINARS_CONTENT_SAVE_ERROR = "WEBINARS_CONTENT_SAVE_ERROR";
        /*** WEBINARS標簽讯息保存失败，請确认*/
        public static final String WEBINARS_TAG_SAVE_ERROR = "WEBINARS_TAG_SAVE_ERROR";
        /*** WEBINARS主檔讯息修改失败，請确认*/
        public static final String WEBINARS_MASTER_UPDATE_ERROR = "WEBINARS_MASTER_UPDATE_ERROR";
        /*** WEBINARS内容讯息保存失败，請确认*/
        public static final String WEBINARS_CONTENT_UPDATE_ERROR = "WEBINARS_CONTENT_UPDATE_ERROR";
        /*** WEBINARS歸屬機構修改失败，請确认*/
        public static final String WEBINARS_MASTER_AFFILIATED_BY_COMPANY_UPDATE_ERROR = "WEBINARS_MASTER_AFFILIATED_BY_COMPANY_UPDATE_ERROR";
        /*** WEBINARS主檔排序重複，請确认*/
        public static final String WEBINARS_MASTER_SORT_ERROR = "WEBINARS_MASTER_SORT_ERROR";
        /*** WEBINARS主檔狀態修改有誤，請确认*/
        public static final String WEBINARS_MASTER_EDIT_STATUS_ERROR = "WEBINARS_MASTER_EDIT_STATUS_ERROR";
        /*** WEBINARS主檔狀態查詢有誤，請确认*/
        public static final String WEBINARS_MASTER_EDIT_STATUS_SELECT_ERROR = "WEBINARS_MASTER_EDIT_STATUS_SELECT_ERROR";
        /*** WEBINARS主檔狀態參數有誤，請确认*/
        public static final String WEBINARS_MASTER_EDIT_STATUS_PARAMS_ERROR = "WEBINARS_MASTER_EDIT_STATUS_PARAMS_ERROR";
        /*** WEBINARS標題不能爲空，請确认*/
        public static final String WEBINARS_TITLE_PARAM_ERROR = "WEBINARS_TITLE_PARAM_ERROR";
    }
    /* *********************  WEBINARS相關提示信息  END  ******************* */

    /* *********************  EVENTS相關提示信息  BEGIN  ******************* */
    public static class EventsMessage {
        /*** EVENTS主檔讯息查询失败，請确认*/
        public static final String EVENTS_MASTER_SELECT_ERROR = "EVENTS_MASTER_SELECT_ERROR";
        /*** EVENTS主檔讯息保存失败，請确认*/
        public static final String EVENTS_MASTER_SAVE_ERROR = "EVENTS_MASTER_SAVE_ERROR";
        /*** EVENTS内容讯息保存失败，請确认*/
        public static final String EVENTS_CONTENT_SAVE_ERROR = "EVENTS_CONTENT_SAVE_ERROR";
        /*** EVENTS標簽讯息保存失败，請确认*/
        public static final String EVENTS_TAG_SAVE_ERROR = "EVENTS_TAG_SAVE_ERROR";
        /*** EVENTS主檔讯息修改失败，請确认*/
        public static final String EVENTS_MASTER_UPDATE_ERROR = "EVENTS_MASTER_UPDATE_ERROR";
        /*** EVENTS内容讯息保存失败，請确认*/
        public static final String EVENTS_CONTENT_UPDATE_ERROR = "EVENTS_CONTENT_UPDATE_ERROR";
        /*** EVENTS主檔狀態查詢有誤，請确认*/
        public static final String EVENTS_MASTER_EDIT_STATUS_SELECT_ERROR = "EVENTS_MASTER_EDIT_STATUS_SELECT_ERROR";
        /*** EVENTS主檔显示狀態參數有誤，請确认*/
        public static final String EVENTS_MASTER_EDIT_STATUS_PARAMS_ERROR = "EVENTS_MASTER_EDIT_STATUS_PARAMS_ERROR";
    }
    /* *********************  EVENTS相關提示信息  END  ******************* */

    /* *********************  NEWS相關提示信息  BEGIN  ******************* */
    public static class NewsMessage {
        /*** NEWS主檔讯息查询失败，請确认*/
        public static final String NEWS_MASTER_SELECT_ERROR = "NEWS_MASTER_SELECT_ERROR";
        /*** NEWS主檔讯息保存失败，請确认*/
        public static final String NEWS_MASTER_SAVE_ERROR = "NEWS_MASTER_SAVE_ERROR";
        /*** NEWS内容讯息保存失败，請确认*/
        public static final String NEWS_CONTENT_SAVE_ERROR = "NEWS_CONTENT_SAVE_ERROR";
        /*** NEWS標簽讯息保存失败，請确认*/
        public static final String NEWS_TAG_SAVE_ERROR = "NEWS_TAG_SAVE_ERROR";
        /*** NEWS主檔讯息修改失败，請确认*/
        public static final String NEWS_MASTER_UPDATE_ERROR = "NEWS_MASTER_UPDATE_ERROR";
        /*** NEWS内容讯息保存失败，請确认*/
        public static final String NEWS_CONTENT_UPDATE_ERROR = "NEWS_CONTENT_UPDATE_ERROR";
        /*** NEWS主檔狀態查詢有誤，請确认*/
        public static final String NEWS_MASTER_EDIT_STATUS_SELECT_ERROR = "NEWS_MASTER_EDIT_STATUS_SELECT_ERROR";
        /*** NEWS主檔显示狀態參數有誤，請确认*/
        public static final String NEWS_MASTER_EDIT_STATUS_PARAMS_ERROR = "NEWS_MASTER_EDIT_STATUS_PARAMS_ERROR";
        /*** 請先創建英文的NEWS*/
        public static final String NEWS_MASTER_LANGUAGE_ERROR = "NEWS_MASTER_LANGUAGE_ERROR";
    }
    /* *********************  NEWS相關提示信息  END  ******************* */

    /* *********************  RELEASES相關提示信息  BEGIN  ******************* */
    public static class ReleasesMessage {
        /*** RELEASES主檔讯息查询失败，請确认*/
        public static final String RELEASES_MASTER_SELECT_ERROR = "RELEASES_MASTER_SELECT_ERROR";
        /*** RELEASES主檔讯息保存失败，請确认*/
        public static final String RELEASES_MASTER_SAVE_ERROR = "RELEASES_MASTER_SAVE_ERROR";
        /*** RELEASES内容讯息保存失败，請确认*/
        public static final String RELEASES_CONTENT_SAVE_ERROR = "RELEASES_CONTENT_SAVE_ERROR";
        /*** RELEASES標簽讯息保存失败，請确认*/
        public static final String RELEASES_TAG_SAVE_ERROR = "RELEASES_TAG_SAVE_ERROR";
        /*** RELEASES主檔讯息修改失败，請确认*/
        public static final String RELEASES_MASTER_UPDATE_ERROR = "RELEASES_MASTER_UPDATE_ERROR";
        /*** RELEASES内容讯息保存失败，請确认*/
        public static final String RELEASES_CONTENT_UPDATE_ERROR = "RELEASES_CONTENT_UPDATE_ERROR";
        /*** RELEASES主檔狀態查詢有誤，請确认*/
        public static final String RELEASES_MASTER_EDIT_STATUS_SELECT_ERROR = "RELEASES_MASTER_EDIT_STATUS_SELECT_ERROR";
        /*** RELEASES主檔显示狀態參數有誤，請确认*/
        public static final String RELEASES_MASTER_EDIT_STATUS_PARAMS_ERROR = "RELEASES_MASTER_EDIT_STATUS_PARAMS_ERROR";
        /*** 請先創建英文的RELEASES*/
        public static final String RELEASES_MASTER_LANGUAGE_ERROR = "RELEASES_MASTER_LANGUAGE_ERROR";
    }
    /* *********************  RELEASES相關提示信息  END  ******************* */

    /* *********************  LEADERSHIP相關提示信息  BEGIN  ******************* */
    public static class LeadershipMessage {
        /*** Leadership主檔讯息查询失败，請确认*/
        public static final String LEADERSHIP_MASTER_SELECT_ERROR = "LEADERSHIP_MASTER_SELECT_ERROR";
        /*** Leadership主檔讯息保存失败，請确认*/
        public static final String LEADERSHIP_MASTER_SAVE_ERROR = "LEADERSHIP_MASTER_SAVE_ERROR";
        /*** Leadership内容讯息保存失败，請确认*/
        public static final String LEADERSHIP_CONTENT_SAVE_ERROR = "LEADERSHIP_CONTENT_SAVE_ERROR";
        /*** Leadership標簽讯息保存失败，請确认*/
        public static final String LEADERSHIP_TAG_SAVE_ERROR = "LEADERSHIP_TAG_SAVE_ERROR";
        /*** Leadership主檔讯息修改失败，請确认*/
        public static final String LEADERSHIP_MASTER_UPDATE_ERROR = "LEADERSHIP_MASTER_UPDATE_ERROR";
        /*** Leadership内容讯息保存失败，請确认*/
        public static final String LEADERSHIP_CONTENT_UPDATE_ERROR = "LEADERSHIP_CONTENT_UPDATE_ERROR";
        /*** Leadership主檔狀態查詢有誤，請确认*/
        public static final String LEADERSHIP_MASTER_EDIT_STATUS_SELECT_ERROR = "LEADERSHIP_MASTER_EDIT_STATUS_SELECT_ERROR";
        /*** Leadership主檔显示狀態參數有誤，請确认*/
        public static final String LEADERSHIP_MASTER_EDIT_STATUS_PARAMS_ERROR = "LEADERSHIP_MASTER_EDIT_STATUS_PARAMS_ERROR";
    }
    /* *********************  LEADERSHIP相關提示信息  END  ******************* */


    /* *********************  CERTIFICATIONS相關提示信息  BEGIN  ******************* */
    public static class CertificationsMessage {
        /*** CERTIFICATIONS主檔讯息查询失败，請确认*/
        public static final String CERTIFICATIONS_MASTER_SELECT_ERROR = "CERTIFICATIONS_MASTER_SELECT_ERROR";
        /*** CERTIFICATIONS主檔讯息保存失败，請确认*/
        public static final String CERTIFICATIONS_MASTER_SAVE_ERROR = "CERTIFICATIONS_MASTER_SAVE_ERROR";
        /*** CERTIFICATIONS内容讯息保存失败，請确认*/
        public static final String CERTIFICATIONS_CONTENT_SAVE_ERROR = "CERTIFICATIONS_CONTENT_SAVE_ERROR";
        /*** CERTIFICATIONS標簽讯息保存失败，請确认*/
        public static final String CERTIFICATIONS_TAG_SAVE_ERROR = "CERTIFICATIONS_TAG_SAVE_ERROR";
        /*** CERTIFICATIONS主檔讯息修改失败，請确认*/
        public static final String CERTIFICATIONS_MASTER_UPDATE_ERROR = "CERTIFICATIONS_MASTER_UPDATE_ERROR";
        /*** CERTIFICATIONS内容讯息保存失败，請确认*/
        public static final String CERTIFICATIONS_CONTENT_UPDATE_ERROR = "CERTIFICATIONS_CONTENT_UPDATE_ERROR";
        /*** CERTIFICATIONS主檔狀態查詢有誤，請确认*/
        public static final String CERTIFICATIONS_MASTER_EDIT_STATUS_SELECT_ERROR = "CERTIFICATIONS_MASTER_EDIT_STATUS_SELECT_ERROR";
        /*** CERTIFICATIONS主檔显示狀態參數有誤，請确认*/
        public static final String CERTIFICATIONS_MASTER_EDIT_STATUS_PARAMS_ERROR = "CERTIFICATIONS_MASTER_EDIT_STATUS_PARAMS_ERROR";
    }
    /* *********************  CERTIFICATIONS相關提示信息  END  ******************* */

    /* *********************  AGPORTAL相關提示信息  BEGIN  ******************* */
    public static class AgPortalMessage {
        /*** PORTAL_ID參數不能爲空*/
        public static final String PORTAL_ID_PARAMS_ERROR = "PORTAL_ID_PARAMS_ERROR";
        /*** 新增PORTAL失敗*/
        public static final String PORTAL_INSERT_ERROR = "PORTAL_INSERT_ERROR";
        /*** 狀態參數非法*/
        public static final String PORTAL_EDIT_STATUS_PARAMS_ERROR = "PORTAL_EDIT_STATUS_PARAMS_ERROR";
        /*** 展示參數非法*/
        public static final String PORTAL_EDIT_DISPLAY_PARAMS_ERROR = "PORTAL_EDIT_DISPLAY_PARAMS_ERROR";
        /*** 此PORTAL_ID不存在*/
        public static final String PORTAL_SELECT_ERROR = "PORTAL_SELECT_ERROR";
        /*** 修改狀態失敗*/
        public static final String PORTAL_EDIT_STATUS_ERROR = "PORTAL_EDIT_STATUS_ERROR";
        /*** 修改展示失敗*/
        public static final String PORTAL_EDIT_DISPLAY_ERROR = "PORTAL_EDIT_DISPLAY_ERROR";
        /*** 更新PORTAL失敗*/
        public static final String PORTAL_UPDATE_ERROR = "PORTAL_UPDATE_ERROR";
        /*** 刪除PORTAL失敗*/
        public static final String PORTAL_DELETE_ERROR = "PORTAL_DELETE_ERROR";
    }
    /* *********************  AGPORTAL相關提示信息  END  ******************* */

    /* *********************  Stage相關提示信息  STAGE  ******************* */
    public static class StageMessage {
        /*** 請先刪除此文件再進行上傳 */
        public static final String ERROR_01 = "ERROR_01";
        /*** 缺少參數：請選擇PathType*/
        public static final String ERROR_02 = "ERROR_02";
        /*** 缺少參數：請選擇locationType*/
        public static final String ERROR_03 = "ERROR_03";
        /*** 缺少參數：stageId*/
        public static final String ERROR_04 = "ERROR_04";
        /*** 缺少參數：langType*/
        public static final String ERROR_05 = "ERROR_05";
        /*** 文件上傳中,暫時不可操作*/
        public static final String ERROR_06 = "ERROR_06";
        /*** 文件上傳路徑表參數異常，請檢查文件上傳參數設定*/
        public static final String COMMON_UPLOAD_PATH_ERROR = "COMMON_UPLOAD_PATH_ERROR";
        /*** 參數異常，請選擇路徑分類*/
        public static final String COMMON_UPLOAD_PATH_TYPE_EMPTY = "COMMON_UPLOAD_PATH_TYPE_EMPTY";
        /*** 參數異常，請輸入目錄路徑*/
        public static final String COMMON_UPLOAD_DIRECTORY_PATH_EMPTY = "COMMON_UPLOAD_DIRECTORY_PATH_EMPTY";
        /*** 參數異常，請選擇管道*/
        public static final String COMMON_UPLOAD_LOCATION_TYPE_EMPTY = "COMMON_UPLOAD_LOCATION_TYPE_EMPTY";
        /*** 該類型的管道參數已經維護過，請前往修改*/
        public static final String COMMON_UPLOAD_PATH_SETTING_EXIST = "COMMON_UPLOAD_PATH_SETTING_EXIST";
        /*** 參數異常，請選擇SettingCode*/
        public static final String COMMON_UPLOAD_PATH_SETTING_SETTING_CODE_EMPTY = "COMMON_UPLOAD_PATH_SETTING_SETTING_CODE_EMPTY";
        /*** 修改STAGE_FILE表失败：缺少参数FILE_STATUS*/
        public static final String STAGE_FILE_STATUS_EMPTY = "STAGE_FILE_STATUS_EMPTY";

        public static final String STAGE_ID_NOT_EXIST = "stage_id_not_exist";
    }
    /* *********************  Stage相關提示信息  END  ******************* */

    /* *********************  CAREERS相關提示信息  STAGE  ******************* */
    public static class CareersMessage {
        /*** Careers新增錯誤，請确认*/
        public static final String CAREERS_INSERT_ERROR = "CAREERS_INSERT_ERROR";
        /*** Careers内容讯息保存失败，請确认*/
        public static final String CAREERS_CONTENT_SAVE_ERROR = "CAREERS_CONTENT_SAVE_ERROR";
        /*** Careers標簽讯息保存失败，請确认*/
        public static final String CAREERS_TAG_SAVE_ERROR = "CAREERS_TAG_SAVE_ERROR";
        /*** Careers主檔讯息查询失败，請确认*/
        public static final String CAREERS_MASTER_SELECT_ERROR = "CAREERS_MASTER_SELECT_ERROR";
        /*** Careers主檔讯息修改失败，請确认*/
        public static final String CAREERS_MASTER_UPDATE_ERROR = "CAREERS_MASTER_UPDATE_ERROR";
        /*** Careers内容讯息保存失败，請确认*/
        public static final String CAREERS_CONTENT_UPDATE_ERROR = "CAREERS_CONTENT_UPDATE_ERROR";
        /*** CAREERS_ID參數不能爲空*/
        public static final String CAREERS_ID_PARAMS_ERROR = "CAREERS_ID_PARAMS_ERROR";
        /*** 狀態參數非法*/
        public static final String CAREERS_EDIT_STATUS_PARAMS_ERROR = "CAREERS_EDIT_STATUS_PARAMS_ERROR";
        /*** 此CAREERS_ID不存在*/
        public static final String CAREERS_SELECT_ERROR = "CAREERS_SELECT_ERROR";
        /*** 修改狀態失敗*/
        public static final String CAREERS_EDIT_STATUS_ERROR = "CAREERS_EDIT_STATUS_ERROR";
        /*** 請先創建英文的CAREERS*/
        public static final String CAREERS_MASTER_LANGUAGE_ERROR = "CAREERS_MASTER_LANGUAGE_ERROR";
    }
    /* *********************  CAREERS相關提示信息  END  ******************* */

    /* *********************  LDAP登入相關提示訊息 BEGIN  ******************* */
    public static class LdapLoginMessage {
        /*** 驗證失敗，請重新輸入帳號密碼*/
        public static final String LDAP_ACCOUNT_ERROR = "LDAP_ACCOUNT_ERROR";
        /*** LDAP鏈接失敗*/
        public static final String LDAP_LINK_ERROR = "LDAP_LINK_ERROR";
        /*** LDAP登錄失敗*/
        public static final String LDAP_LOGIN_ERROR = "LDAP_LOGIN_ERROR";

    }
    /* *********************  LDAP登入相關提示訊息 END  ******************* */


    /* *********************  系統參數配置相關提示信息 BEGIN  ******************* */
    public static class SysCommonParamSettingMessage{
        /*** 項目名稱為空*/
        public static final String PROJECT_NAME_EMPTY = "PROJECT_NAME_EMPTY";
        /*** 參數名稱為空*/
        public static final String PARAM_NAME_EMPTY = "PARAM_NAME_EMPTY";
        /*** 参数值為空*/
        public static final String PARAM_VALUE_EMPTY = "PARAM_VALUE_EMPTY";
        /*** 當前參數已存在該項目中*/
        public static final String THIS_DATA_ALREADY_EXISTS = "THIS_DATA_ALREADY_EXISTS";
        /*** 系統參數配置保存失敗*/
        public static final String COMMON_PARAM_SETTING_ENTITY_SAVE_ERROR = "COMMON_PARAM_SETTING_ENTITY_SAVE_ERROR";
        /*** 系統參數配置修改失敗*/
        public static final String COMMON_PARAM_SETTING_ENTITY_UPDATE_ERROR = "COMMON_PARAM_SETTING_ENTITY_UPDATE_ERROR";
        /*** 系統參數配置刪除失敗*/
        public static final String COMMON_PARAM_SETTING_ENTITY_DELETE_ERROR = "COMMON_PARAM_SETTING_ENTITY_DELETE_ERROR";
        /*** 系統參數配置獲取失敗*/
        public static final String COMMON_PARAM_SETTING_ENTITY_GET_ERROR = "COMMON_PARAM_SETTING_ENTITY_GET_ERROR";
    }
    /* *********************  系統參數配置相關提示信息 END  ******************* */

    /* *********************  訂單管理提示信息 BEGIN  ******************* */
    public static class OrderMessage {
        /*** 訂單編號爲空，請重新輸入*/
        public static final String ORDER_NUMBER_NULL = "ORDER_NUMBER_NULL";
        /*** 該賬單還沒有收據，請確認付款*/
        public static final String ORDER_INVOICE_IS_NULL = "ORDER_INVOICE_IS_NULL";
        /*** 客戶編號爲空，請確認*/
        public static final String ORDER_MASTER_CUSTOMER_CODE_EMPTY = "ORDER_MASTER_CUSTOMER_CODE_EMPTY";
        /*** 請輸入有效起始日期*/
        public static final String ORDER_MASTER_VALID_FROM_EMPTY = "ORDER_MASTER_VALID_FROM_EMPTY";
    }
    /* *********************  訂單管理提示信息 END  ******************* */

    /* *********************  CaseShow相關提示信息  BEGIN  ******************* */
    public static class CaseShowMessage{
        /*** CaseShow主檔讯息查询失败，請确认*/
        public static final String CaseShow_MASTER_SELECT_ERROR = "CaseShow_MASTER_SELECT_ERROR";
        /*** CaseShow主檔讯息保存失败，請确认*/
        public static final String CaseShow_MASTER_SAVE_ERROR = "CaseShow_MASTER_SAVE_ERROR";
        /*** CaseShow内容讯息保存失败，請确认*/
        public static final String CaseShow_CONTENT_SAVE_ERROR = "CaseShow_CONTENT_SAVE_ERROR";
        /*** CaseShow標簽讯息保存失败，請确认*/
        public static final String CaseShow_TAG_SAVE_ERROR = "CaseShow_TAG_SAVE_ERROR";
        /*** CaseShow主檔讯息修改失败，請确认*/
        public static final String CaseShow_MASTER_UPDATE_ERROR = "CaseShow_MASTER_UPDATE_ERROR";
        /*** CaseShow内容讯息保存失败，請确认*/
        public static final String CaseShow_CONTENT_UPDATE_ERROR = "CaseShow_CONTENT_UPDATE_ERROR";
        /*** CaseShow歸屬機構修改失败，請确认*/
        public static final String CaseShow_MASTER_AFFILIATED_BY_COMPANY_UPDATE_ERROR = "CaseShow_MASTER_AFFILIATED_BY_COMPANY_UPDATE_ERROR";
        /*** CaseShow主檔排序重複，請确认*/
        public static final String CaseShow_MASTER_SORT_ERROR = "CaseShow_MASTER_SORT_ERROR";
        /*** CaseShow主檔狀態修改有誤，請确认*/
        public static final String CaseShow_MASTER_EDIT_STATUS_ERROR = "CaseShow_MASTER_EDIT_STATUS_ERROR";
        /*** CaseShow主檔狀態查詢有誤，請确认*/
        public static final String CaseShow_MASTER_EDIT_STATUS_SELECT_ERROR = "CaseShow_MASTER_EDIT_STATUS_SELECT_ERROR";
        /*** CaseShow主檔狀態參數有誤，請确认*/
        public static final String CaseShow_MASTER_EDIT_STATUS_PARAMS_ERROR = "CaseShow_MASTER_EDIT_STATUS_PARAMS_ERROR";
        /*** 請先創建英文的CaseShow*/
        public static final String CaseShow_MASTER_LANGUAGE_ERROR = "CaseShow_MASTER_LANGUAGE_ERROR";
    }
    /* *********************  CaseShow相關提示信息  END  ******************* */

    /* *********************  客戶相關提示信息 BEGIN  ******************* */
    public static class TempMerchantMessage {
        /*** 客戶ERP編號不能爲空，請確認*/
        public static final String MERCHANT_ERP_CODE_PARAM_ERROR = "MERCHANT_ERP_CODE_PARAM_ERROR";
        /*** 客戶全名不能爲空，請確認*/
        public static final String MERCHANT_NAME_PARAM_ERROR = "MERCHANT_NAME_PARAM_ERROR";
        /*** 統一編號不能爲空，請確認*/
        public static final String MERCHANT_UNIFORM_CODE_PARAM_ERROR = "MERCHANT_UNIFORM_CODE_PARAM_ERROR";
        /*** 設立日期不能爲空，請確認*/
        public static final String MERCHANT_SETTING_DATE_PARAM_ERROR = "MERCHANT_SETTING_DATE_PARAM_ERROR";
        /*** 國際區號不能爲空，請確認*/
        public static final String MERCHANT_PHONE_PREFIX_PARAM_ERROR = "MERCHANT_PHONE_PREFIX_PARAM_ERROR";
        /*** 電話號碼不能爲空，請確認*/
        public static final String MERCHANT_PHONE_NUMBER_PARAM_ERROR = "MERCHANT_PHONE_NUMBER_PARAM_ERROR";
        /*** 負責人不能爲空，請確認*/
        public static final String MERCHANT_OWNER_NAME_PARAM_ERROR = "MERCHANT_OWNER_NAME_PARAM_ERROR";
        /*** 公司類別不能爲空，請確認*/
        public static final String MERCHANT_COMPANY_TYPE_CODE_PARAM_ERROR = "MERCHANT_COMPANY_TYPE_CODE_PARAM_ERROR";
        /*** 付款方式不能爲空，請確認*/
        public static final String MERCHANT_PAY_TYPE_CODE_PARAM_ERROR = "MERCHANT_PAY_TYPE_CODE_PARAM_ERROR";
        /*** 交易條件不能爲空，請確認*/
        public static final String MERCHANT_TRADE_TERM_CODE_PARAM_ERROR = "MERCHANT_TRADE_TERM_CODE_PARAM_ERROR";
        /*** 日期必須在1-31之間*/
        public static final String MERCHANT_CHECKOUT_DATE_PARAM_ERROR = "MERCHANT_CHECKOUT_DATE_PARAM_ERROR";
        /*** 客戶详细信息保存失敗*/
        public static final String MERCHANT_DETAIL_SAVE_ERROR = "MERCHANT_DETAIL_SAVE_ERROR";
        /*** 客戶详细信息修改失敗*/
        public static final String MERCHANT_DETAIL_UPDATE_ERROR = "MERCHANT_DETAIL_UPDATE_ERROR";
        /*** 主檔信息查詢失敗*/
        public static final String MERCHANT_SELECT_ERROR = "MERCHANT_SELECT_ERROR";
        /*** 客戶銀行信息保存失敗*/
        public static final String MERCHANT_BANK_SAVE_ERROR = "MERCHANT_BANK_SAVE_ERROR";
        /*** 客戶聯係人信息保存失敗*/
        public static final String MERCHANT_CONTACT_SAVE_ERROR = "MERCHANT_CONTACT_SAVE_ERROR";
        /*** 客戶文件信息保存失敗*/
        public static final String MERCHANT_FILE_SAVE_ERROR = "MERCHANT_FILE_SAVE_ERROR";
        /*** 客戶文件信息修改失敗*/
        public static final String MERCHANT_FILE_UPDATE_ERROR = "MERCHANT_FILE_UPDATE_ERROR";
        /*** 客戶評鑑信息保存失敗*/
        public static final String MERCHANT_CREDIT_SAVE_ERROR = "MERCHANT_CREDIT_SAVE_ERROR";
        /*** 客戶評鑑信息送出失敗*/
        public static final String MERCHANT_CREDIT_SEND_ERROR = "MERCHANT_CREDIT_SEND_ERROR";
        /*** 客戶評鑑信息修改失敗*/
        public static final String MERCHANT_CREDIT_UPDATE_ERROR = "MERCHANT_CREDIT_UPDATE_ERROR";
    }
}
