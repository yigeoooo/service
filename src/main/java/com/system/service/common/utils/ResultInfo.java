package com.system.service.common.utils;

/**
 * @author yigeoooo
 */
public class ResultInfo<T> {

    private int resultCode;

    private String resultMessage;

    private String messageCode;

    private String[] messageParams;

    private T body = null;

    private String link = "";

    public ResultInfo() {
        this.resultCode = ResultCode.SUCCESS.getCode();
        this.resultMessage = ResultCode.SUCCESS.getMessage();
        this.messageCode = ResultCode.SUCCESS.getName();
    }

    private ResultInfo(int resultCode, String messageCode, String resultMessage, T body, String link, String ... params) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.messageCode = messageCode;
        this.body = body;
        this.link = link;
        this.messageParams = params;
    }

    public static <T> ResultInfo<T> build() {
        return new ResultInfo(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getName(),ResultCode.SUCCESS.getMessage(), (Object)null,"",null);
    }

    public boolean isSuccess() {
        return ResultCode.SUCCESS.getCode().equals(this.resultCode);
    }

    public static <T> T ofNullable(ResultInfo<T> result) {
        return result != null && result.isSuccess() ? result.getBody() : null;
    }

    public static <T> T ofNullable(ResultInfo<T> result, T value) {
        return result != null && result.isSuccess() ? result.getBody() : value;
    }

    public static <T> ResultInfo<T> build(Code code) {
        return new ResultInfo(code.getCode(), code.getName(), code.getMessage() ,(Object)null,"",null);
    }

    public static <T> ResultInfo<T> link(String link) {
        return new ResultInfo(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getName(),ResultCode.SUCCESS.getMessage(), (Object)null,link,null);
    }

    public static <T> ResultInfo<T> build(int resultCode, String messageCode, String message, T body, String ... params) {
        return new ResultInfo(resultCode, messageCode, message ,(Object)body,"",params);
    }

    public static <T> ResultInfo<T> build(T body) {
        return new ResultInfo(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getName(), ResultCode.SUCCESS.getMessage() , body,"",null);
    }

    public T getBody() {
        return this.body;
    }

    public ResultInfo<T> setBody(T body) {
        this.body = body;
        return this;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String[] getMessageParams() {
        return messageParams;
    }

    public void setMessageParams(String[] messageParams) {
        this.messageParams = messageParams;
    }

}
