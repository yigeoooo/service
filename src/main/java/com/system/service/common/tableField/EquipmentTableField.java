package com.system.service.common.tableField;

/**
 * @Author: congdandan
 * @Date: 2022-3-16 11:18
 */
public class EquipmentTableField extends TableField {

    public static class EquipmentScriptMaster extends CommonField {
        /**
         * 脚本描述
         */
        public static final String MEMO = "memo";
        /**
         * 脚本編號
         */
        public static final String SCRIPT_CODE = "script_code";
        /**
         * 狀態
         */
        public static final String STATUS = "status";
    }

    public static class EquipmentScriptContent extends CommonField {
        /**
         * 脚本編號
         */
        public static final String SCRIPT_CODE = "script_code";
        /**
         * 執行编码
         */
        public static final String EXECUTE_CODE = "execute_code";
        /**
         * 脚本内容id
         */
        public static final String SCRIPT_CONTENT_ID = "script_content_id";
        /**
         * 設備類型 10 slb/ 20 waf
         */
        public static final String EQUIPMENT_TYPE = "equipment_type";
        /**
         * 指令語法 10 cli/20 restful
         */
        public static final String INSTRUCTION_SYNTAX = "instruction_syntax";
    }

    public static class EquipmentParamSetting extends CommonField {
        /**
         * 參數名稱
         */
        public static final String PARAM_NAME = "param_name";
        /**
         * 執行編碼
         */
        public static final String EXECUTE_CODE = "execute_code";
        /**
         * 脚本編碼
         */
        public static final String SCRIPT_CODE = "script_code";
    }

    public static class EquipmentReturnMessageExecution extends CommonField {
        /**
         * 執行編碼(當前)
         */
        public static final String EXECUTE_CODE = "execute_code";
        /**
         * 執行編碼(下一步)
         */
        public static final String NEXT_EXECUTE_CODE = "next_execute_code";
        /**
         * 返回狀態碼
         */
        public static final String RESULT_CODE = "result_code";
        /**
         * 脚本編碼
         */
        public static final String SCRIPT_CODE = "script_code";
    }

}
