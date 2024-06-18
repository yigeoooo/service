package com.system.service.common.exception;

import lombok.Getter;

/**
 * 自定義異常
 *
 * @author Mark initPlatform
 */
@Getter
public class TokenFailureException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private final String code;
	private Object[] params;

	/**
	 * 支持自定義錯誤碼和提示信息的異常
	 *
	 * @param code 錯誤碼
	 */
	public TokenFailureException(String code, Object... params) {
		super(code);
		this.code = code;
		this.params = params;
	}


	/**
	 * 支持自定義錯誤碼和提示信息的異常
	 *
	 * @param code 錯誤碼
	 */
	public TokenFailureException(String code) {
		super(code);
		this.code = code;
	}
}
