package com.system.service.common.utils;


import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字串工具類, 繼承org.apache.commons.lang3.StringUtils類
 */
public class StringUtils extends org.apache.commons.lang.StringUtils {

    private static final char SEPARATOR = '_';
    private static final String CHARSET_NAME = "UTF-8";
    private static AtomicLong id;
    private static final String SYMBOL = "*";

    /**
     * 轉換為字節數組
     *
     * @param bytes
     * @return
     */
    public static String toString(byte[] bytes) {
        try {
            return new String(bytes, CHARSET_NAME);
        } catch (UnsupportedEncodingException e) {
            return EMPTY;
        }
    }

    /**
     * list to string
     *
     * @return
     * @author
     */
    public static String listToString(List<String> list) {

        String str = "";

        if(list != null && !list.isEmpty()){
            for(String item : list){
                if(isEmpty(str)){
                    str = item;
                }else {
                    str = str + "," + item;
                }
            }
        }

        return str;
    }

    /**
     * string to list
     *
     * @return
     * @author
     */
    public static List<String> stringToList(String str) {
        List<String> list = new ArrayList<>();
        if(isNotEmpty(str)){
            String[] arry = str.split(",");
            if(arry.length > 0){
                list.addAll(Arrays.asList(arry));
            }
        }

        return list;
    }

    /**
     * 生成客戶用戶重置密碼方法
     *
     * @param count 密碼長度
     * @return
     */
    public static String getRandomMerchantUserPassword(int count) {
        char[] codeSeq = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z','A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
                'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9','@','!'};
        Random random = new Random();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < count; i++) {
            String r = String.valueOf(codeSeq[random.nextInt(codeSeq.length)]);
            s.append(r);
        }
        return s.toString();
    }



    /**
     * 獲取隨機數字
     *
     * @param count
     * @return
     */
    public static String getRandomNum(int count) {
        char[] codeSeq = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Random random = new Random();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < count; i++) {
            String r = String.valueOf(codeSeq[random.nextInt(codeSeq.length)]);
            s.append(r);
        }
        return s.toString();
    }

    public static String getStringMask(String str,Integer markLen){
        String prefix = str.substring(0,6);
        String suffix = str.substring(str.length()-4);
        StringBuffer markStr = new StringBuffer();
        for (int i=0;i<markLen;i++){
            markStr.append("*");
        }
        return prefix + markStr.toString() + suffix;
    }

    public static String subStringByLength(String str,Integer len){
        String rtn = "";

        if (str.length()>len){
            rtn = str.substring(0,len) + "...";
        }

        return rtn;
    }

    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
    public static String get20UUID() {
        UUID id=UUID.randomUUID();
        String[] idd=id.toString().split("-");
        return idd[0]+idd[1]+idd[2]+idd[3];
    }

    /**
     * 獲取6碼大寫隨機數值
     *
     */
    public static String getRandomOfDailySettlementCode() {
        StringBuffer id = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            char s = 0;
            int j = random.nextInt(2) % 3;
            switch (j) {
                case 0:
                    //隨機生成數字
                    s = (char) (random.nextInt(57) % (57 - 48 + 1) + 48);
                    break;
                case 1:
                    //隨機生成大寫字母
                    s = (char) (random.nextInt(90) % (90 - 65 + 1) + 65);
                    break;
                default:
            }
            id.append(s);
        }
        return id.toString();
    }

    /**
     * 根據原字符串補充mark内容
     * @param original 原字符串
     * @param mark 補充内容
     * @param resultLen 結果長度
     * @param type 補充位置 0：左補齊 1：右補齊
     * @return 補齊後的字符串
     */
    public static String supplementStrByMark(String original,String mark,int resultLen,int type){
        StringBuffer rtn = new StringBuffer();
        int markLen = 0;
        if (StringUtils.isEmpty(original)){
            markLen = resultLen;
        }else {
            if (original.length()>resultLen){
                markLen = 0;
            } else {
                markLen = resultLen - original.length();
            }
        }
//        System.out.println(markLen);
        for (int i=0;i<markLen;i++){
            rtn.append(mark);
        }
//        System.out.println(rtn.toString());
        if (type == 0){
            rtn.append(original);
            return rtn.toString();
        } else {
            return original + rtn.toString();
        }
    }

    public static void main(String[] str) throws Exception{
        System.out.println("<html>\n  <head>\n    <meta charset=\"UTF-8\" />\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1\" />\n    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n    <title>3DS 2.0</title>\n    <SCRIPT LANGUAGE=\"Javascript\">\n        var PaReq=\"\";\n        var TermUrl=\"\";\n        history.pushState(null, document.title, location.href);\n        window.addEventListener('popstate', function (event){  history.pushState(null, document.title, location.href); });\n        function CardHolder(){\n           document.redirectForm.autoNotice.style.display=\"none\";\n           document.redirectForm.menuNotice.style.display=\"\";\n           document.redirectForm.notice.style.display=\"\";\n        }\n    </SCRIPT>\n  </head>\n  <body>\n  <CENTER>\n    <form name=\"redirectForm\"  action=\"https://nccnet-ec.nccc.com.tw/merchant/Method3DS\" method=\"post\">\n         <div id=\"autoNotice\" style=\"position:absolute;top:0;left:0;\">\n             <div style=\"background:repeat-x #ffec9f;text-align:left;width:450px;\">\n                  <div style=\"margin-top:-2px;padding:10px 30px;\">\n                       <div style=\"color:#666;font-size:16px;padding-left:30px;\">\n                           <p>3D 2.0連線處理中,請稍待</p>\n                           <p>3D 2.0 processing, please wait...</p>\n                       </div>\n                  </div>\n             </div>\n         </div>\n         <div id=\"menuNotice\" style=\"display:none;position:absolute;top:0;left:0;\">\n             <div style=\"background:repeat-x #fff;text-align:left;width:450px;\">\n                  <div style=\"margin-top:-2px;padding:10px 30px;\">\n                       <div style=\"color:#666;font-size:16px;padding-left:30px;\">\n                           <p>請按「下一步」以完成資料處理</p>\n                           <p>Please press \"Next\" to complete data processing</p>\n                           <input name=\"notice\" type=submit value=\"下一步(Next)\" onClick=\"this.style.display='none';setTimeout('CardHolderNotice()',20000);\" style=\"display:none\">\n                       </div>\n                  </div>\n             </div>\n         </div>\n         <input type=\"hidden\" name=\"threeDSMethodUrl\"      value='https://3ds.cathaybk.com.tw/acs-auth-web/3dsmethod/collect' />\n         <input type=\"hidden\" name=\"threeDSMethodData\"     value='eyJ0aHJlZURTU2VydmVyVHJhbnNJRCI6IjVmNWVkMThiLTUxYmMtNDgxMC1iZjMzLTcxMTEzMjE3N2NmMyIsInRocmVlRFNNZXRob2ROb3RpZmljYXRpb25VUkwiOiJodHRwczovL25jY25ldC1lYy5uY2NjLmNvbS50dy9tZXJjaGFudC9NZXRob2QzRFMifQ' />\n         <input type=\"hidden\" name=\"action3ds\"             value='APIRETURN' />\n    </form>\n    </CENTER>\n  <script language=\"JavaScript\">\n     document.redirectForm.submit();\n     setTimeout(\"CardHolder()\",30000);     \n </script>\n  </body>\n</html>\n");
    }

    /**
     * 銀行卡號中間部分掩碼處理
     * @param bankCode 銀行卡號
     * @param prefixLength 前部長度
     * @param suffixLength 尾部長度
     * @param markChar 掩碼内容
     * @param markLength 掩碼長度
     * @return 掩碼後的銀行卡號
     */
    public static String markBankCode(String bankCode,Integer prefixLength,Integer suffixLength,String markChar,Integer markLength){
        //判斷銀行卡號是否爲空
        if (isEmpty(bankCode)){
            return "";
        }
        String prefixPartCode = "";
        //判斷銀行卡號長度是否小於前綴長度
        if (bankCode.length()<prefixLength){
            prefixPartCode = bankCode;
        } else {
            prefixPartCode = bankCode.substring(0,prefixLength);
        }

        String suffixPartCode = "";
        //判斷銀行卡號長度是否小於前綴長度
        if (bankCode.length()<suffixLength){
            suffixPartCode = bankCode;
        } else {
            suffixPartCode = bankCode.substring(bankCode.length()-suffixLength);
        }
        StringBuffer middlePartCode = new StringBuffer();
        for (int i=0; i<markLength;i++){
            middlePartCode.append(markChar);
        }
        return prefixPartCode + middlePartCode.toString() + suffixPartCode;
    }

    /**
     * 半角轉全角
     *
     * @param input 輸入内容
     * @return 全角數據
     */
    public static String toSBC(String input) {
        //半角转全角：
        char[] c = input.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 32) {
                c[i] = (char) 12288;
                continue;
            }
            if (c[i] < 127) {
                c[i] = (char) (c[i] + 65248);
            }
        }
        return new String(c);
    }

    /**
     * 把null轉換為""
     * @param str
     * @return
     */
    public static String toConvertNull(String str){
        return str == null ? "" : str;
    }

    /**
     * 生成Long 类型唯一ID
     */
    public synchronized static Long getIdLong() {
        //如果需要更长 或者更大冗余空间, 只需要 time * 10^n   即可
        //当前可保证1毫秒 生成 10000条不重复
        long time = Long.parseLong(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()))*10000;
        if (id == null) {
            id = new AtomicLong(time);
            return id.get();
        }
        if (time <= id.get()) {
            id.addAndGet(1);
        } else {
            id = new AtomicLong(time);
        }
        return id.get();
    }


    /**
     * 生成指定位數的指定字串
     *
     * @param count 指定位數
     * @param Str   要生成的字串
     * @return 指定位數的指定字串
     */
    public static String MakeStrForCount(int count, String Str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < count; i++) {
            newStr.append(Str);
        }
        return newStr.toString();
    }

    /**
     * 將字串補到指定位數
     *
     * @param count     指定位數
     * @param Str       字串資料(原始資料)
     * @param Replenish 要填充的字串 例如 : "0"，"A"
     * @param direction 1:左補 2:右補
     * @return 指定位數的指定字串
     */
    public static String FormatStrForCount(int count, String Str, String Replenish, int direction) {
        int newCount = count - Str.length();
        String NewReplenish = MakeStrForCount(newCount, Replenish);
        StringBuilder newStr = new StringBuilder();

        //判斷要左補還是右補
        if (direction == 1) {
            newStr.append(NewReplenish).append(Str);
        } else {
            newStr.append(Str).append(NewReplenish);
        }

        return newStr.toString();
    }

    /**
     * 數據中間部分掩碼處理
     * @param data 掩碼數據
     * @param prefixLength 前部長度
     * @param suffixLength 尾部長度
     * @return 掩碼數據
     */
    public static String markData(String data,Integer prefixLength,Integer suffixLength){
        //判斷手機號是否爲空
        if (isEmpty(data)){
            return "";
        }
        //如果小於等于7位
        if (data.length() <= 7){
            return data;
        }
        //掩碼長度
        int markLength = data.length() - prefixLength - suffixLength;
        String prefixPartCode = "";
        //判斷銀行卡號長度是否小於前綴長度
        if (data.length()<prefixLength){
            prefixPartCode = data;
        } else {
            prefixPartCode = data.substring(0,prefixLength);
        }

        String suffixPartCode = "";
        //判斷銀行卡號長度是否小於前綴長度
        if (data.length()<suffixLength){
            suffixPartCode = data;
        } else {
            suffixPartCode = data.substring(data.length()-suffixLength);
        }
        StringBuffer middlePartCode = new StringBuffer();
        for (int i=0; i<markLength;i++){
            middlePartCode.append(SYMBOL);
        }
        return prefixPartCode + middlePartCode.toString() + suffixPartCode;
    }



    /**
     * 對傳入名字進行脫敏處理
     * @param value 名字
     * @return 脫敏后的名字
     */
    public static String nameDisplay(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        int len = value.length();
        StringBuilder stringBuilder = new StringBuilder();
        if (isChinese(value)) {
            //中文名字脱敏
            for (int i = 0; i < len; i++) {
                String temp = value.substring(i, i + 1);
                if (i == 0 || (i == len - 1 && len > 2)) {
                    stringBuilder.append(temp);
                } else {
                    stringBuilder.append(SYMBOL);
                }
            }
        } else {
            //英文名字脱敏
            //拼接第一个部分
            int i = 0;
            int strLen = 0;
            while (i < len) {
                String temp = value.substring(i, i + 1);
                if (!" ".equals(temp)) {
                    if (strLen == 0 || (i == len - 1 && len > 2)) {
                        stringBuilder.append(temp);
                    } else {
                        if (!" ".equals(value.substring(i + 1, i + 2))){
                            stringBuilder.append(SYMBOL);
                        }
                    }
                    strLen++;
                }else {
                    strLen = 0;
                    stringBuilder.append(value.charAt(i - 1));
                    stringBuilder.append(temp);
                }
                i++;
            }
        }

        return stringBuilder.toString();
    }

    /**
     * 是否是中文
     *
     * @param
     * @return
     */
    public static boolean isChinese(String str) {

        String regEx = "[\\u4e00-\\u9fa5]+";

        Pattern p = Pattern.compile(regEx);

        Matcher m = p.matcher(str);

        return m.find();
    }
}
