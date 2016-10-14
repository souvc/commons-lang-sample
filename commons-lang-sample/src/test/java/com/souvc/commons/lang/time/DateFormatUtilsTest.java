package com.souvc.commons.lang.time;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateFormatUtils;

public class DateFormatUtilsTest {

	public static void main(String[] args) {

		
		/**
		 * 常用日期格式的格式化操作
		 */
		
		//例1: 以 yyyy-MM-dd 格式化  如 ：2016-08-25
		System.out.println(DateFormatUtils.ISO_DATE_FORMAT.format(new Date()));
		
		//例2: 以 yyyy-MM-ddZZ 格式化     如：2016-08-25+08:00
		System.out.println(DateFormatUtils.ISO_DATE_TIME_ZONE_FORMAT.format(new Date()));
		
		//例3: 以 yyyy-MM-dd'T'HH:mm:ss 格式化     如：2016-08-25T11:13:47
		System.out.println(DateFormatUtils.ISO_DATETIME_FORMAT.format(new Date()));
		
		//例4: 以 yyyy-MM-dd'T'HH:mm:ssZZ 格式化  如：2016-08-25T11:15:11+08:00
		System.out.println(DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.format(new Date()));
		
		//例5: 以 'T'HH:mm:ss 格式化: 如：T11:16:53
		System.out.println(DateFormatUtils.ISO_TIME_FORMAT.format(new Date()));
		
        //例6: 以 HH:mm:ss 格式化:  11:17:32
		System.out.println(DateFormatUtils.ISO_TIME_NO_T_FORMAT.format(new Date()));
		
		//例7: 以 HH:mm:ssZZ 格式化: 11:18:43+08:00
		System.out.println(DateFormatUtils.ISO_TIME_NO_T_TIME_ZONE_FORMAT.format(new Date()));

		//例8: 以 'T'HH:mm:ssZZ 格式化:  T11:19:35+08:00
		System.out.println(DateFormatUtils.ISO_TIME_TIME_ZONE_FORMAT.format(new Date()));

		
		
		/**
		 * 自定义日期格式的格式化操作：
		 */
		//例1: 以 yyyy-MM-dd HH:mm:ss 格式化Date对象: 2016-08-25 11:20:39
		System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
		
		//例2: 以 yyyy-MM-dd HH:mm:ss 格式化Calendar对象: 2016-08-25 11:21:37
		System.out.println(DateFormatUtils.format(Calendar.getInstance(), "yyyy-MM-dd HH:mm:ss"));
		
		//例3: 以 yyyy-MM-dd HH:mm:ss 格式化TimeInMillis: 2016-08-25 11:22:22
		System.out.println(DateFormatUtils.format(Calendar.getInstance().getTimeInMillis(), "yyyy-MM-dd HH:mm:ss"));
	
		
	}

}