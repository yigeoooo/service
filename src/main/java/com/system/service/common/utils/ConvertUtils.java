package com.system.service.common.utils;

import java.math.BigDecimal;

public class ConvertUtils {

	/**
	 * 轉換值為String型。
	 *
	 * @param obj 值
	 * @return String型
	 */
	public static String convertToString(Object obj) {
		if (obj == null) {
			return "";
		}
		if (StringUtils.isEmpty(obj.toString())) {
			return "";
		}
		return obj.toString();
	}

	/**
	 * 轉換值為boolean型。
	 *
	 * @param obj 值
	 * @return boolean型
	 */
	public static boolean convertToBool(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof byte[]) {
			return convertBitToBool((byte[]) obj);
		}
		if ("1".equals(obj.toString())) {
			return true;
		} else if ("0".equals(obj.toString())) {
			return false;
		} else if ("true".equalsIgnoreCase(obj.toString())) {
			return true;
		} else if ("false".equalsIgnoreCase(obj.toString())) {
			return false;
		}
		return false;
	}

	/**
	 * 轉換bit為boolean型。
	 *
	 * @param bytes byte
	 * @return boolean型
	 */
	public static boolean convertBitToBool(byte[] bytes) {
		if (bytes == null) {
			return false;
		}
		return bytes[0] == 0x01;
	}

	/**
	 * 轉換值為int型。
	 *
	 * @param value 值
	 * @return int型
	 */
	public static int convertToInt(Object value) {
		int intValue = 0;
		if (value == null) {
			return intValue;
		} else {
			try {
				intValue = Integer.parseInt(value.toString().trim().replace(",", ""));
			} catch (NumberFormatException ex) {
				return intValue;
			}
		}
		return intValue;
	}

	/**
	 * 轉換值為int型。
	 *
	 * @param value 值
	 * @return int型
	 */
	public static long convertToLong(Object value) {
		long longValue = 0L;
		if (value == null) {
			return longValue;
		} else {
			try {
				longValue = Long.parseLong(value.toString().trim().replace(",", ""));
			} catch (NumberFormatException ex) {
				return longValue;
			}
		}
		return longValue;
	}

	/**
	 * 轉換值為double型。
	 *
	 * @param pValue 值
	 * @return double型
	 */
	public static double convertToDouble(Object pValue) {
		double dblValue = 0D;
		if (pValue == null) {
			return dblValue;
		}
		try {
			dblValue = Double.parseDouble(String.valueOf(pValue).trim().replace(",", ""));
		} catch (Exception ex) {
			return dblValue;
		}
		return dblValue;
	}

	/**
	 * 轉換值為BigDecimal型。
	 *
	 * @param value 值
	 * @return BigDecimal型
	 */
	public static BigDecimal convertToDecimal(Object value) {
		BigDecimal dec = new BigDecimal("0");
		if (value == null) {
			return dec;
		} else if (value instanceof BigDecimal) {
			dec = (BigDecimal) value;
		} else {
			try {
				dec = new BigDecimal(String.valueOf(value).trim().replace(",", ""));
			} catch (Exception ex) {
				return dec;
			}
		}
		return dec;
	}

	public static String convertToMoney(Object pValue) {
		return String.format("%1$,.2f", convertToDecimal(pValue));
	}

	/**
	 * BigDecimal數字類型保留几位小數
	 * @param bigDecimal 數
	 * @param digits 保留位數
	 * @return BigDecimal
	 */
	public static BigDecimal bigDecimalRoundHalfUp(BigDecimal bigDecimal,int digits){
		if (bigDecimal == null){
			return new BigDecimal(0);
		}
		return bigDecimal.setScale(digits,BigDecimal.ROUND_HALF_UP);
	}

	/**
	 * BigDecimal數字類型保留几位小數
	 * @param bigDecimal 數
	 * @param digits 保留位數
	 * @return String
	 */
	public static String bigDecimalRoundHalfUpToString(BigDecimal bigDecimal,int digits){
		if (bigDecimal == null){
			return "0";
		}
		return convertToString(bigDecimalRoundHalfUp(bigDecimal,digits));
	}
}
