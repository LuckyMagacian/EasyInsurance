package com.lanxi.EasyInsurance.utils;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtils {

    /**
     * yyyyMMddHHmmss日期格式
     */
    public static SimpleDateFormat sdfYmdHms = new SimpleDateFormat("yyyyMMddHHmmss");
    public static String getCurrentyyyyMMddHHmmss() {
        return sdfYmdHms.format(new Date());
    }

    /**
     * yyyyMMdd日期格式
     */
    public static SimpleDateFormat sdfYmd = new SimpleDateFormat("yyyyMMdd");
    public static String getCurrentyyyyMMdd() {
        return sdfYmd.format(new Date());
    }

    /**
     * HHmmss日期格式
     */
    public static SimpleDateFormat sdfHms = new SimpleDateFormat("HHmmss");
    public static String getCurrentHHmmss() {
        return sdfHms.format(new Date());
    }

}
