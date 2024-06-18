package com.system.service.common.utils;

import com.system.service.common.pojo.dto.DateDto;
import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * 日期處理
 *
 * @author Mark sunlightcs@gmail.com
 */
public class DateUtils {
	/** 時間格式(yyyy-MM-dd) */
	public final static String DATE_PATTERN = "yyyy-MM-dd";
	/** 時間格式(yyyy-MM-dd HH:mm:ss) */
	public final static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    /** 時間格式(yyyy-MM-ddHHmmss) */
    public final static String DATE_TIME_PATTERN_YMDHMS = "yyyyMMddHHmmss";

    /** 時間格式（yyyy/MM/dd HH:mm:ss） */
    public static final String FORMAT_DATE_TIME = "yyyy/MM/dd HH:mm:ss";
    /**
     * 時間格式（yyyy/MM/dd HH:mm:ss）
     */
    public static final String DATE_PATTERN_LINK = "yyyyMMdd";
    /**
     * 時間格式（yyyy/MM/dd HH:mm:ss）
     */
    public static final String FORMAT_DATE_LINK = "yyyy/MM/dd";

    /**
     * 日期格式化 日期格式为：yyyy-MM-dd
     * @param date  日期
     * @return  返回yyyy-MM-dd格式日期
     */
	public static String format(Date date) {
        return format(date, DATE_PATTERN);
    }

    /**
     * 日期格式化 日期格式为：yyyy-MM-dd
     * @param date  日期
     * @param pattern  格式，如：DateUtils.DATE_TIME_PATTERN
     * @return  返回yyyy-MM-dd格式日期
     */
    public static String format(Date date, String pattern) {
        if(date != null){
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            return df.format(date);
        }
        return null;
    }

    /**
     * 字符串轉換成日期
     * @param strDate 日期字符串
     * @param pattern 日期的格式，如：DateUtils.DATE_TIME_PATTERN
     */
    public static Date stringToDate(String strDate, String pattern) {
        if (StringUtils.isBlank(strDate)){
            return null;
        }

        DateTimeFormatter fmt = DateTimeFormat.forPattern(pattern);
        return fmt.parseLocalDateTime(strDate).toDate();
    }

    /**
     * 根據周數，獲取開始日期、結束日期
     * @param week  周期  0本周，-1上周，-2上上周，1下周，2下下周
     * @return  返回date[0]開始日期、date[1]結束日期
     */
    public static Date[] getWeekStartAndEnd(int week) {
        DateTime dateTime = new DateTime();
        LocalDate date = new LocalDate(dateTime.plusWeeks(week));

        date = date.dayOfWeek().withMinimumValue();
        Date beginDate = date.toDate();
        Date endDate = date.plusDays(6).toDate();
        return new Date[]{beginDate, endDate};
    }

    /**
     * 對日期的【秒】進行加/減
     *
     * @param date 日期
     * @param seconds 秒数，負數為減
     * @return 加/减几秒后的日期
     */
    public static Date addDateSeconds(Date date, int seconds) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusSeconds(seconds).toDate();
    }

    /**
     * 對日期的【分鐘】進行加/减
     *
     * @param date 日期
     * @param minutes 分鐘數，負數為減
     * @return 加/减幾分鐘后的日期
     */
    public static Date addDateMinutes(Date date, int minutes) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusMinutes(minutes).toDate();
    }

    /**
     * 對日期的【小时】進行加/减
     *
     * @param date 日期
     * @param hours 小時數，負數為減
     * @return 加/減幾小時後的日期
     */
    public static Date addDateHours(Date date, int hours) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusHours(hours).toDate();
    }

    /**
     * 對日期的【天】進行加/减
     *
     * @param date 日期
     * @param days 天數，負數為減
     * @return 加/減幾天後的日期
     */
    public static Date addDateDays(Date date, int days) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusDays(days).toDate();
    }

    /**
     * 對日期的【周】進行加/减
     *
     * @param date 日期
     * @param weeks 周数，負數為減
     * @return 加/減幾周後的日期
     */
    public static Date addDateWeeks(Date date, int weeks) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusWeeks(weeks).toDate();
    }

    /**
     * 對日期的【月】進行加/减
     *
     * @param date 日期
     * @param months 月数，負數為減
     * @return 加/減幾月後的日期
     */
    public static Date addDateMonths(Date date, int months) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusMonths(months).toDate();
    }

    /**
     * 對日期的【年】進行加/减
     *
     * @param date 日期
     * @param years 年数，負數為減
     * @return 加/減幾年後的日期
     */
    public static Date addDateYears(Date date, int years) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusYears(years).toDate();
    }

    /**
     * 字符串轉換日期
     *
     * @author: fbi-protal
     * @param str
     * @return: java.util.Date
     * @Exception
     */
    public static Date getDate(String str){
        if(StringUtils.isBlank(str)){
            return null;
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = null;
        try {
            parse = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }

    /**
     * String to LocalDateTime
     *
     * @param str
     * @return
     */
    public static LocalDateTime parseString2LocalDateTime(String str){
        if(org.springframework.util.StringUtils.isEmpty(str)){
            return null;
        }
        str = str.replaceAll("/","-");
        str = str.replaceAll("T"," ");
        String[] dateTime = str.split(" ");
        String[] date = dateTime[0].split("-");
        String[] time = dateTime.length > 1 ? dateTime[1].split(":") : new String[0];
        int day = date.length >= 3 ? Integer.valueOf(date[2]) : 0;
        int month = date.length >= 2 ? Integer.valueOf(date[1]) : 0;
        int year = date.length >= 1 ? Integer.valueOf(date[0]) : 0;

        /* liwencheng 2019-08-23 修改開始 原因：返現特殊時間格式，需要截取second */
        String[] seconds = time.length >= 3 ? time[2].split("\\.") : new String[0];
        int second = seconds.length >= 1 ? Integer.valueOf(seconds[0]) : 0;
        /* liwencheng 2019-08-23 修改結束 */
        int minute = time.length >= 2 ? Integer.valueOf(time[1]) : 0;
        int hour = time.length >= 1 ? Integer.valueOf(time[0]) : 0;
        return LocalDateTime.of(year, month, day, hour, minute, second);
    }

    public static String parseLocalDateTime2String(LocalDateTime localDateTime, String pattern){
        if(localDateTime == null){
            return "";
        }
        java.time.format.DateTimeFormatter dateTimeFormatter = java.time.format.DateTimeFormatter.ofPattern(pattern, Locale.US);
        return dateTimeFormatter.format(localDateTime);
    }

    public static String parseLocalDateTime2String(LocalDateTime localDateTime){
        return parseLocalDateTime2String(localDateTime, FORMAT_DATE_TIME);
    }

    /**
     * 獲得一個日期段內的目標日期*
     * @param startDateStr
     * @param endDateStr
     * @param target
     * @return
     */
    public static List<DateDto> getDatesBetween(String startDateStr, String endDateStr, String target) {
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd");
        java.time.LocalDate startDate = java.time.LocalDate.parse(startDateStr, formatter);
        java.time.LocalDate endDate = java.time.LocalDate.parse(endDateStr, formatter);
        List<DateDto> dates = new ArrayList<>();
        String changeDate = startDateStr;
        //这里是判断开始日期是否在结束日期之后或者=结束日期
        while (startDate .isBefore(endDate) || startDate .isEqual(endDate)) {
            String add = startDate .format(formatter);
            //判斷是否是這天
            if(com.system.service.common.utils.StringUtils.isEmpty(changeDate)){
                changeDate = add;
            }
            if(target.equals(add.substring(8))){
                DateDto dateDto = new DateDto();
                dateDto.setStartDateStr(changeDate);
                dateDto.setEndStartDate(add);
                dates.add(dateDto);
                changeDate = "";
            }
            startDate = startDate .plusDays(1);
        }
        DateDto dateDto = new DateDto();
        dateDto.setStartDateStr(changeDate);
        dateDto.setEndStartDate(endDateStr);
        dates.add(dateDto);
        return dates;
    }

}
