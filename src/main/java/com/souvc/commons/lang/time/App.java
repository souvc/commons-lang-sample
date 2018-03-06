
package com.souvc.commons.lang.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App {

	public static void main(String[] args) {
		System.out.println("欢迎学习commons.lang");

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int hour=cal.get(Calendar.HOUR);
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		int dom = cal.get(Calendar.DAY_OF_MONTH);
		int doy = cal.get(Calendar.DAY_OF_YEAR);

		System.out.println("当期时间: " + cal.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateNowStr = sdf.format(cal.getTime());
		System.out.println("格式化的当期时间: " + dateNowStr);

		System.out.println("年份: " + year);
		System.out.println("月份: " + month);
		System.out.println("日期: " + day);
		System.out.println("时: " + hour);
		System.out.println("一周的第几天: " + dow);  // 星期日为一周的第一天输出为 1，星期一输出为 2，以此类推
		System.out.println("一月中的第几天: " + dom);
		System.out.println("一年的第几天: " + doy);

		/*
		欢迎学习commons.lang
		当期时间: Tue Mar 06 17:00:38 CST 2018
		格式化的当期时间: 2018-03-06 17:00:38
		日期: 6
		月份: 3
		年份: 2018
		一周的第几天: 3
		一月中的第几天: 6
		一年的第几天: 65
		*/
	}

}

