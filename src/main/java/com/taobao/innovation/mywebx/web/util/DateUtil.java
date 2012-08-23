/**
 * 
 */
package com.taobao.innovation.mywebx.web.util;

import java.util.Date;

/**
 * @author chenxiong
 *
 * Feb 28, 2009--DateUtil.java
 */
public class DateUtil {
	
	public DateUtil() {}

    private static final long MINUTE_MSEL = 60 * 1000L;//һ���ӵĺ���ֵ
    private static final long HOUR_MSEL = 60 * MINUTE_MSEL;//һСʱ�ĺ���ֵ
    private static final long DATE_MSEL = 24 * HOUR_MSEL;//һ��ĺ���ֵ
	
    /**
     * ��ʽ����������.
     * XX��ǰ
     * XXСʱǰ
     * XX����ǰ
     * 
     * @param date
     * @return
     */
	public static String format(Date date) {
    	long c = date.getTime();//createdDate
        long n = System.currentTimeMillis();//now
        long interval = n - c;
        
        int d = (int)(interval / DATE_MSEL);
        if (d > 0) {
        	return "" + d + "��ǰ";
        } 
        
        int h = (int)(interval / HOUR_MSEL);
        if (h > 0) {
        	return "" + h + "Сʱǰ";
        }
        
        int m = (int)(interval / MINUTE_MSEL);
        if (m > 0) {
        	return "" + m + "����ǰ";
        }
        return "�ո�";
	}

}
