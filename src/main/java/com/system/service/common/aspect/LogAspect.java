package com.system.service.common.aspect;

import com.alibaba.fastjson.JSONObject;
import com.system.service.common.utils.IPUtils;
import com.system.service.common.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * @author yigeoooo
 */
@Aspect
@Component
@Slf4j
public class LogAspect {

    /**
     * ..表示包及子包 該方法代表controller層的所有方法
     */
    @Pointcut("execution(public * com.system.service.modules.*.controller.*.*(..))")
    public void controllerMethod() {
    }

    /**
     * 方法執行前
     *
     * @param joinPoint
     * @throws Exception
     */
    @Before("controllerMethod()")
    public void LogRequestInfo(JoinPoint joinPoint) throws Exception {
        try {
            MDC.put("TRACE_ID", StringUtils.getUUID());
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            assert attributes != null;
            HttpServletRequest request = attributes.getRequest();

            StringBuilder requestLog = new StringBuilder();
            Signature signature = joinPoint.getSignature();
            requestLog.append("請求信息：").append("URL = {").append(request.getRequestURI()).append("},\t");
            requestLog.append("請求方式 = {").append(request.getMethod()).append("},\t");
            requestLog.append("請求IP = {").append(IPUtils.getIpAddr(request)).append("},\t");
            requestLog.append("請求SERVER_NAME = {").append(request.getServerName()).append("},\t");
            requestLog.append("請求PORT = {").append(request.getServerPort()).append("}\t");
            // 處理請求參數
            String[] paramNames = ((MethodSignature) signature).getParameterNames();
            Object[] paramValues = joinPoint.getArgs();
            int paramLength = null == paramNames ? 0 : paramNames.length;
            if (paramLength == 0) {
                requestLog.append("請求參數 = {} ");
            } else {
                requestLog.append("請求參數 = [");
                List<Object> args = Arrays.asList(paramValues);
                requestLog.append(args).append("]");
            }

            log.info(requestLog.toString());
        } catch (Exception e){
            log.error("切面日誌輸出失敗！",e);
        }
    }


    /**
     * 方法執行後
     *
     * @param resultInfo
     * @throws Exception
     */
    @AfterReturning(returning = "resultInfo", pointcut = "controllerMethod()")
    public void logResultInfo(Object resultInfo) {
        String js =  JSONObject.toJSONString(resultInfo);
        log.info("請求結果：{}", js);
//        log.info("請求結果：" + JSONObject.parseObject(js));
    }

}
