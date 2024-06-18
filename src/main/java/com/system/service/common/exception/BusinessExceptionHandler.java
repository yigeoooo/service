package com.system.service.common.exception;

import com.system.service.common.utils.LanguageCode;
import com.system.service.common.utils.ResultCode;
import com.system.service.common.utils.ResultInfo;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.core.MethodParameter;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.text.MessageFormat;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * 異常處理器
 *
 * @author WangJianHui
 */
@RestControllerAdvice(basePackages = {"com.system.service.modules"})
public class BusinessExceptionHandler implements ResponseBodyAdvice<Object> {
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(BusinessExceptionHandler.class);

	@Autowired
	private MessageSource messageSource;

	/**
	 * 攔截自定義的異常
	 */
	@ExceptionHandler(BusinessException.class)
	public ResultInfo handleAppException(BusinessException e) {
		LOGGER.error(e.getMessage(), e);
		return ResultInfo.build(ResultCode.ERROR.getCode(), ResultCode.NOT_FOUND.getName(), e.getMessage(),null,null);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResultInfo handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
		LOGGER.error(e.getMessage(), e);
		StringBuffer str = new StringBuffer();
		List<ObjectError> allErrors = e.getBindingResult().getAllErrors();
		String message = allErrors.stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.joining(";"));
		return ResultInfo.build(ResultCode.ERROR.getCode(), ResultCode.NOT_FOUND.getName(), message,null,null);
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResultInfo handlerNoFoundException(Exception e) {
		LOGGER.error(e.getMessage(), e);
		return ResultInfo.build(ResultCode.NOT_FOUND.getCode(), ResultCode.NOT_FOUND.getName(),getLocaleMessage(ResultCode.NOT_FOUND.getName(), null),null,null);
	}

	@ExceptionHandler(DuplicateKeyException.class)
	public ResultInfo handleDuplicateKeyException(DuplicateKeyException e){
		LOGGER.error(e.getMessage(), e);
		return ResultInfo.build(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getName(), getLocaleMessage(ResultCode.UNAUTHORIZED.getName(), null),null,null);
	}

	@ExceptionHandler(AuthorizationException.class)
	public ResultInfo handleAuthorizationException(AuthorizationException e){
		LOGGER.error(e.getMessage(), e);
		return ResultInfo.build(ResultCode.DATA_EXIST.getCode(), ResultCode.DATA_EXIST.getName(), getLocaleMessage(ResultCode.DATA_EXIST.getName(), null),null,null);
	}
	/**
	 * 處理其他拋出的異常
	 */
	@ExceptionHandler(Exception.class)
	public ResultInfo handleException(Exception e) {
		LOGGER.warn(e.getMessage(), e);
		return ResultInfo.build(ResultCode.ERROR.getCode(), ResultCode.ERROR.getName(), getLocaleMessage(ResultCode.ERROR.getName(), null),null,null);
	}
	/**
	 * 獲取國際化信息異常
	 */
	private String getLocaleMessage(String code, Object[] params) {
		Locale locale = new Locale(LanguageCode.S_CHINESE.getLanguage());
		String pattern = messageSource.getMessage(code, null, locale);
		if (StringUtils.isNotEmpty(pattern)) {
			return MessageFormat.format(pattern, params);
		} else {
			return "";
		}
	}

	@Override
	public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
		return true;
	}

	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response)  {
		ResultInfo<Object> resultInfo = null;
		if (body instanceof ResultInfo) {
			resultInfo = (ResultInfo)body;
			resultInfo.setResultCode(((ResultInfo) body).getResultCode());
			if (StringUtils.isNotEmpty(((ResultInfo) body).getMessageCode())) {
				resultInfo.setResultMessage("");
			} else {
				resultInfo.setResultMessage("SUCCESS");
			}
			return resultInfo;
		} else {
			resultInfo = new ResultInfo<Object>();
			resultInfo.setResultCode(ResultCode.SUCCESS.getCode());
			resultInfo.setResultMessage(getLocaleMessage(ResultCode.SUCCESS.getName(), null));
			resultInfo.setBody(body);
		}
		return resultInfo;
	}
}
