package com.system.service.common.tableField;


/**
 * @Author: congdandan
 * @Date: 2021-12-23 11:18
 */
public class AdminTableField extends TableField {

    public static class Salutation extends CommonField {
        /**
         * 稱謂ID
         */
        public static final String SALUTATION_ID = "salutation_id";
    }

    public static class MemberInterested extends CommonField {
        /**
         * 興趣愛好語言ID
         */
        public static final String LANGUAGE_ID = "language_id";
    }

    public static class FamilyT extends CommonField {
        /**
         * 子帳號ID
         */
        public static final String CHILD_MEMBER_ID = "child_member_id";
    }

    public static class CommonExpertise extends CommonField {
        /**
         * 專長名稱
         */
        public static final String EXPERTISE_ID = "expertise_id";
        /**
         * 專長名稱
         */
        public static final String NAME = "name";
        /**
         * 詞匯組key
         */
        public static final String NAME_KEY = "name_key";
    }

    public static class CommonInterested extends CommonField {
        /**
         * 狀態
         */
        public static final String STATIC = "status";
    }

    public static class CommonMotherTongue extends CommonField {
        /**
         * 母語id
         */
        public static final String MOTHER_TONGUE_ID = "mother_tongue_id";
        /**
         * 母語名稱
         */
        public static final String NAME = "name";
        /**
         * 詞匯組key
         */
        public static final String NAME_KEY = "name_key";
    }

    public static class CommonRole extends CommonField {
        /**
         * 角色編碼
         * 16 校友
         * 4 老師
         * 2 學生
         * 0 會員
         * 8 測試帳號
         */
        public static final String CODE = "code";
        /**
         * 角色名稱
         */
        public static final String NAME = "name";
        /**
         * 詞匯表key
         */
        public static final String NAME_KEY = "name_key";
        /**
         * 詞匯表key
         */
        public static final String SUMMARY_ID = "summary_id";
    }

    public static class MemberBalance extends CommonField {
        /**
         * 會員餘額鍵值
         */
        public static final String MEMBER_BALANCE_ID = "member_balance_id";
        /**
         * 余額類型 教師帳號為現金 = 2
         */
        public static final String TYPE = "type";
    }

    public static class MemberContacts extends CommonField {
        /**
         * 聯係人信息ID
         */
        public static final String MEMBER_CONTACT_FORM_ID = "member_contact_form_id";
    }

    public static class MemberRole extends CommonField {
        /**
         * 角色ID
         */
        public static final String ROLE_ID = "role_id";
    }

    public static class MemberMaster extends CommonField {
        /**
         * 是否鎖定
         */
        public static final String LOCKOUTENABLED = "lockoutenabled";
        /**
         * 規格化的電子郵箱地址
         */
        public static final String NORMALIZED_EMAIL = "normalized_email";
        /**
         * 電話號碼
         */
        public static final String PHONE_NUMBER = "phone_number";
        /**
         * 國籍
         */
        public static final String NATIONALITYCOUNTRYID = "nationalitycountryid";
        /**
         * 會員帳號類型（0：正式帳號。1：測試帳號）
         */
        public static final String MEMBER_ACCOUNT_TYPE = "member_account_type";
        /**
         * 會員編碼
         */
        public static final String MEMBER_CODE = "member_code";
    }

    public static class CommonParamSetting extends CommonField {
        /**
         * 參數名稱
         */
        public static final String PARAM_NAME = "param_name";
    }

    public static class AgentMaster extends CommonField {
        /**
         * 代理登錄ID
         */
        public static final String LOGIN_ID = "login_id";
    }

    public static class AgentAdviser extends CommonField {
        /**
         * 使用狀態
         */
        public static final String STATUS = "status";
        /**
         * 代理ID
         */
        public static final String AGENT_ID = "agent_id";
        /**
         * 優先級
         */
        public static final String PRIORITY = "priority";
    }

    public static class CommonCurrency extends CommonField {

        public static final String CURRENCY_ID = "currency_id";

        public static final String CURRENCY_NAME = "currency_name";

        public static final String CURRENCY_NAME_ID = "currency_name_id";

        public static final String CURRENCY_SYMBOL = "currency_symbol";

        public static final String CURRENCY_SORT = "currency_sort";
        /**
         * 是否虛擬貨幣
         */
        public static final String CURRENCY_VIRTUALITY = "currency_virtuality";
    }

    public static class CommonCategory extends CommonField {
        /**
         * 分類類型
         */
        public static final String CATEGORY_TYPE = "category_type";
        /**
         * 證書名稱
         */
        public static final String CATEGORY_NAME = "category_name";
        /**
         * 狀態
         */
        public static final String STATUS = "status";
    }

    public static class CoursePackage extends CommonField {
        /**
         * 課程分類ID
         */
        public static final String CATEGORY_ID = "category_id";
        /**
         * 課時包類型0試聽課/1普通
         */
        public static final String COURSE_TYPE = "course_type";
        /**
         * 是否可見
         */
        public static final String VISABLE = "visable";
        /**
         * 適用課程類型uuid(內課/外課/網院課)
         */
        public static final String COURSE_TYPE_ID = "course_type_id";
    }

    public static class ProductCoursePackage extends CommonField {
        /**
         * 課時包id
         */
        public static final String PACKAGE_ID = "package_id";
    }

    public static class CommonMessage extends CommonField {
        /**
         * 消息ID
         */
        public static final String MESSAGE_ID = "message_id";
    }

    public static class MemberDevice extends CommonField {
        /**
         * 設備標示ID
         */
        public static final String DEVICE_ID = "device_id";
        /**
         * 設備令牌
         */
        public static final String DEVICE_TOKEN = "device_token";
    }

    public static class CountryGroup extends CommonField {
        /**
         * 狀態
         */
        public static final String STATUS = "status";
        /**
         * 國家ID
         */
        public static final String COUNTRY_ID = "country_id";
    }

    public static class CommonCoupon extends CommonField {
        /**
         * 可視狀態
         */
        public static final String VISIBLE = "visible";
        /**
         * 是否首購
         */
        public static final String CONDITION_ISFIRSTBUY = "condition_isfirstbuy";
        /**
         * 可使用國家組
         */
        public static final String COUNTRY_GROUP_ID = "country_group_id";
    }

    public static class MemberCoupon extends CommonField {
        /**
         * 優惠卷ID
         */
        public static final String COUPON_ID = "coupon_id";
    }

    public static class ResumeType extends CommonField {
        /**
         * 類型編碼
         */
        public static final String TYPE_CODE = "type_code";
    }

    public static class SchoolMaster extends CommonField {
        /**
         * 學校ID
         */
        public static final String SCHOOL_ID = "school_id";
        /**
         * 是否為線下(0:線上 1:線下)
         */
        public static final String OFFLINE = "offline";
        /**
         * 詞匯表key
         */
        public static final String SCHOOL_NAME_KEY = "school_name_key";
    }

    public static class MemberMaterial extends CommonField {
        /**
         * 教材ID
         */
        public static final String MATERIALID = "materialId";
    }

    public static class CommonLanguage extends CommonField {
        /**
         * 詞匯表key
         */
        public static final String LANGUAGE_NAME_KEY = "language_name_key";
    }

    public static class TeacherAdministrativeExperience extends CommonField {
        /**
         * 起始時間
         */
        public static final String START_TIME = "start_time";
        /**
         * 教師行政經歷id
         */
        public static final String TEACHER_ADMINISTRATIVE_ID = "teacher_administrative_id";
    }

    public static class TeacherLanguageLevel extends CommonField {
        /**
         * 教師ID
         */
        public static final String TEACHER_ID = "teacher_id";
        /**
         * 可教授語言ID
         */
        public static final String LANGUAGE_ID = "language_id";
        /**
         * 文化特性ID
         */
        public static final String CULTURE_ID = "culture_id";
    }

    public static class MemberCourse extends CommonField {
        /**
         * 課程ID
         */
        public static final String COURSE_ID = "course_id";
    }

    public static class MemberReview extends CommonField {
        /**
         * 評價目標會員ID
         */
        public static final String TARGETID = "targetId";
        /**
         * 狀態
         */
        public static final String STATUS = "status";
        /**
         * 給對象評價
         */
        public static final String TARGETRANK = "targetRank";
    }

    public static class MemberCertificate extends CommonField {
        /**
         * 會員證書ID
         */
        public static final String MEMBER_CERTIFICATE_ID = "member_certificate_id";
        /**
         * 證書號碼
         */
        public static final String CODE = "code";
    }

    public static class TeacherEducation extends CommonField {
        /**
         * 學歷ID
         */
        public static final String EDUCATION_BACKGROUND_ID = "education_background_id";
        /**
         * 學校完整名稱
         */
        public static final String SCHOOL_FULL_NAME = "school_full_name";
        /**
         * 主修科系
         */
        public static final String DEPARTMENT_NAME = "department_name";
        /**
         * 學位
         */
        public static final String DEGREE = "degree";
        /**
         * 入學日期
         */
        public static final String START_DATE = "start_date";
    }

    public static class TeacherTeacheringExperience extends CommonField {
        /**
         * 教學經驗ID
         */
        public static final String TEACHING_EXPERIENCE_ID = "TEACHING_EXPERIENCE_ID";
    }

    public static class TeacherSeniority extends CommonField {
        /**
         * 語言ID
         */
        public static final String LANGUAGEID = "languageId";
        /**
         * 文化特性鍵值
         */
        public static final String CULTUREID = "cultureId";
    }

    public static class TeacherCertificate extends CommonField {
        /**
         * 證書名稱
         */
        public static final String CERT_NAME = "cert_name";
    }

    public static class TcsMaterialCategory extends CommonField {
        /**
         * 父級分類ID
         */
        public static final String PARENT_ID = "parent_id";
    }

    public static class MemberBooking extends CommonField {
        /**
         * 起始時間
         */
        public static final String START_TIME = "start_time";
        /**
         * 授課狀態
         */
        public static final String LESSON_STATUS = "lesson_status";
        /**
         * 【1:預定 2：確認 512：取消】
         */
        public static final String BOOKING_STATUS = "booking_status";
        /**
         * 課程類型
         */
        public static final String LESSON_TYPE = "lesson_type";
        /**
         * 課程狀態
         */
        public static final String COURSE_TYPE = "course_type";
    }

    public static class MemberCourseHours extends CommonField {
        /**
         * 課時包類型
         */
        public static final String COURSE_TYPE = "course_type";
        /**
         * 到期日期
         */
        public static final String EXPIRE_DATE = "expire_date";
    }

    public static class OrderMaster extends CommonField {
        /**
         * 付款狀態
         */
        public static final String PAYMENTSTATUS = "paymentStatus";
    }

    public static class CommonLabel extends CommonField {
        /**
         * 標簽id
         */
        public static final String LABEL_ID = "label_id";
        /**
         * 標簽類型
         */
        public static final String LABEL_TYPE = "label_type";
        /**
         * 標簽名稱
         */
        public static final String NAME = "name";
        /**
         * 詞匯表key
         */
        public static final String NAME_KEY = "name_key";
    }

    public static class CommonCountry extends CommonField {
        /**
         * 國家ID
         */
        public static final String COUNTRY_ID = "country_id";

        /**
         * 國家名稱
         */
        public static final String COUNTRY_NAME = "country_name";

    }

    public static class ServerToken extends CommonField {
        /**
         * token
         */
        public static final String TOKEN = "token";

        /**
         * 用戶id
         */
        public static final String USER_ID = "user_id";

        /**
         * 工程類型
         */
        public static final String SERVER_TYPE = "server_type";

    }
}
