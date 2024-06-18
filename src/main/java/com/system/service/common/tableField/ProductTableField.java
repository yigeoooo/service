package com.system.service.common.tableField;

/**
 * @Author: congdandan
 * @Date: 2022-3-16 11:18
 */
public class ProductTableField extends TableField {


    public static class ProductVersion extends CommonField {
        //==========產品版本規格============//
        /**
         * 产品版本id
         */
        public static final String PRODUCT_VERSION_ID = "product_version_id";
        /**
         * 产品版本名稱
         */
        public static final String PRODUCT_VERSION_NAME = "product_version_name";
        /**
         * 产品版本狀態
         */
        public static final String STATUS = "status";
        /**
         * 可視狀態
         */
        public static final String VISIBLE = "visible";
        /**
         * 排序
         */
        public static final String SORT = "sort";
        /**
         * 產品模型名稱
         */
        public static final String PRODUCT_MODEL_NAME = "product_model_name";
        /**
         * 產品模型ID
         */
        public static final String PRODUCT_MODEL_ID = "product_model_id";
        /**
         * 產品類別:名稱
         */
        public static final String PRODUCT_CATEGORY_NAME = "product_category_name";
        /**
         * 產品綫名稱
         */
        public static final String PRODUCT_LINE_NAME = "product_line_name";
    }
    public static class ProductModelSpecification extends CommonField {
        //==========產品版本規格============//
        /**
         * 产品版本id
         */
        public static final String PRODUCT_MODEL_ID = "product_model_id";
    }
    public static class ProductCategorySpecification extends CommonField {
        //==========產品類別規格關聯============//
        /**
         * 產品類別id
         */
        public static final String PRODUCT_CATEGORY_ID = "product_category_id";
    }
    public static class ProductSpecification extends CommonField {
        //==========產品規格============//
        /**
         * 狀態
         */
        public static final String STATUS = "status";
        /**
         * 排序
         */
        public static final String SORT = "sort";

        /**
         * 產品規格名稱
         */
        public static final String PRODUCT_SPECIFICATION_NAME = "product_specification_name";


        /**
         * 產品規格ID
         */
        public static final String PRODUCT_SPECIFICATION_ID = "product_specification_id";
        /**
        * 產品規格code
        */
        public static final String PRODUCT_SPECIFICATION_CODE = "product_specification_code";


    }

    public static class ProductLine extends CommonField {
        /**
         * 聯表用表明縮寫+.
         */
        public static final String TABLE_JOIN_NAME = "pl.";
        /**
         * 產品綫id
         */
        public static final String PRODUCT_LINE_ID = "product_line_id";
        /**
         * 產品綫名稱Id
         */
        public static final String PRODUCT_LINE_NAME_ID = "product_line_name_id";
        /**
         * 產品綫名稱
         */
        public static final String PRODUCT_LINE_NAME = "product_line_name";
        /**
         * 狀態
         */
        public static final String STATUS = "status";
        /**
         * 排序
         */
        public static final String SORT = "sort";
        /**
         * 備注
         */
        public static final String REMARK = "remark";
    }

    public static class ProductCategory extends CommonField {
        /**
         * 聯表用表明縮寫+.
         */
        public static final String TABLE_JOIN_NAME = "pc.";
        /**
         * 產品類別id
         */
        public static final String PRODUCT_CATEGORY_ID = "product_category_id";
        /**
         * 檢索條件
         */
        public static final String PRODUCT_VERSION_VISIBLE = "visible";
        /**
         * 產品類別名稱
         */
        public static final String PRODUCT_CATEGORY_NAME = "product_category_name";
        /**
         * 產品類別名稱id
         */
        public static final String PRODUCT_CATEGORY_NAME_ID = "product_category_name_id";
        /**
         * 產品綫id
         */
        public static final String PRODUCT_LINE_ID = "product_line_id";
        /**
         * 類型
         */
//        public static final String TYPE = "type";
        /**
         * 狀態
         */
        public static final String STATUS = "status";
        /**
         * 排序
         */
        public static final String SORT = "sort";
        /**
         * 備注
         */
        public static final String REMARK = "remark";
    }

    public static class ProductModel extends CommonField {
        /**
         * 聯表用表明縮寫+.
         */
        public static final String TABLE_JOIN_NAME = "pm.";
        /**
         * 產品類別id
         */
        public static final String PRODUCT_CATEGORY_ID = "product_category_id";

        public static final String PRODUCT_VISIBLE = "visible";
        /**
         * 產品模型名稱
         */
        public static final String PRODUCT_MODEL_NAME = "product_model_name";
        /**
         * 產品模型id
         */
        public static final String PRODUCT_MODEL_ID = "product_model_id";
        /**
         * 排序
         */
        public static final String SORT = "sort";
    }

    public static class ProductModelVersion extends CommonField {
        /**
         * 產品版本id
         */
        public static final String PRODUCT_VERSION_ID = "product_version_id";
        /**
         * 產品模型id
         */
        public static final String PRODUCT_MODEL_ID = "product_model_id";
        /**
         * 產品模型名稱
         */
        public static final String PRODUCT_MODEL_NAME = "product_model_name";
    }

    public static class ProductFunction extends CommonField {
        /**
         * 聯表用表明縮寫+.
         */
        public static final String TABLE_JOIN_NAME = "pf.";
        /**
         * 產品功能名稱
         */
        public static final String PRODUCT_FUNCTION_NAME = "product_function_name";
        /**
         * 產品功能id
         */
        public static final String PRODUCT_FUNCTION_ID = "product_function_id";
        /**
         * 狀態
         */
        public static final String STATUS = "status";
        /**
         * 排序
         */
        public static final String SORT = "sort";
    }

    public static class ProductCategoryFunction extends CommonField {
        /**
         * 聯表用表明縮寫+.
         */
        public static final String TABLE_JOIN_NAME = "pcf.";
        /**
         * 產品類別id
         */
        public static final String PRODUCT_CATEGORY_ID = "product_category_id";
        /**
         * 產品功能id
         */
        public static final String PRODUCT_FUNCTION_ID = "product_function_id";
    }

    public static class ProductVersionFunction extends CommonField {
        /**
         * 聯表用表明縮寫+.
         */
        public static final String TABLE_JOIN_NAME = "pvf.";
        /**
         * 產品版本id
         */
        public static final String PRODUCT_VERSION_ID = "product_version_id";
        /**
         * 產品功能id
         */
        public static final String PRODUCT_FUNCTION_ID = "product_function_id";
    }


    public static class ProductSpecificationFunction extends CommonField {
        /**
         * 聯表用表明縮寫+.
         */
        public static final String TABLE_JOIN_NAME = "psf.";
        /**
         * 產品類別id
         */
        public static final String PRODUCT_CATEGORY_ID = "product_category_id";
        /**
         * 產品規格id
         */
        public static final String PRODUCT_SPECIFICATION_ID = "product_specification_id";
    }

    public static class ProductMaster{
        public static final String PRODUCT_KIND_CODE = "product_kind_code";
        public static final String PRODUCT_LINE_ID = "product_line_id";
        public static final String PRODUCT_CATEGORY_ID = "product_category_id";
        public static final String PRODUCT_MODEL_ID = "product_model_id";
        public static final String PRODUCT_MASTER_NAME = "product_master_name";
        public static final String SORT = "sort";
        public static final String CURRENCY_ID = "currency_id";
        public static final String PRODUCT_MASTER_ID = "product_master_id";
        public static final String DELETED = "deleted";
    }

    public static class License{
        public static final String PRODUCT_LINE_ID = "product_line_id";
        public static final String PRODUCT_CATEGORY_ID = "product_category_id";
        public static final String PRODUCT_VERSION_ID = "product_version_id";
        public static final String PRODUCT_MODEL_ID = "product_model_id";
        public static final String PURPOSE = "purpose";
        public static final String STATUS = "status";
        public static final String EXPIRATION_TYPE = "expiration_type";
        public static final String EXPIRATION_START = "expiration_start";
        public static final String EXPIRATION_END = "expiration_end";
        public static final String UPDATE_TIME = "update_time";
        public static final String INSERT_TIME = "insert_time";
        public static final String DELETED = "deleted";
        public static final String EXPIRATION_END_DATA = "99991231";
        public static final String LICENSE_ID = "license_id";
        public static final String PRODUCT_LINE_NAME = "product_line_name";
        public static final String PRODUCT_CATEGORY_NAME = "product_category_name";
        public static final String PRODUCT_MODEL_NAME = "product_model_name";
        public static final String PRODUCT_VERSION_NAME = "product_version_name";
        public static final String BUFFER_DAY_ID = "buffer_day_id";
        public static final String BUFFER_RANGE_START = "buffer_range_start";
        public static final String BUFFER_RANGE_END = "buffer_range_end";
    }
    public static class Tag extends CommonField{
        public static final String TAGID = "tag_id";
        public static final String NAME = "name";
        public static final String DELECT = "deleted";
        public static final String TAGTYPE = "tag_type";
        public static final String STATUS = "status";
    }
}
