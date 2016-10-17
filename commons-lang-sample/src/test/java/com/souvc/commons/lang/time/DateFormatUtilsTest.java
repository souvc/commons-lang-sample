package com.souvc.commons.lang.time;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateFormatUtils;
/**
 * 类名: DateFormatUtilsTest.java</br> 
 * 包名：  com.souvc.commons.lang.time </br> 
 * 描述: DateFormatUtilsTest 测试类 </br> 
 * 发布版本号：V1.0</br>
 * 开发人员：souvc </br>
 * 创建时间： 2016年10月17日</br>
 */
public class DateFormatUtilsTest {

	public static  void main(String[] args) {

		
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
	
		
		
		/**
		 * 个性化日期格式  
		 */
		// 日期格式，年份，例如：2004，2008
		   String DATE_FORMAT_YYYY = "yyyy";

		// 日期格式，年份和月份，例如：200707，200808
		   String DATE_FORMAT_YYYYMM = "yyyyMM";

		// 日期格式，年份和月份，例如：200707，2008-08
		   String DATE_FORMAT_YYYY_MM = "yyyy-MM";

		// 日期格式，年月日，例如：20050630，20080808
		   String DATE_FORMAT_YYYYMMDD = "yyyyMMdd";
		//
		   String DATE_FORMAT_YYYYMMDDHHmm = "yyyyMMddHHmm";

		// 日期格式，年月日，用横杠分开，例如：2006-12-25，2008-08-08
		   String DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd";
		
		/// 日期格式，年月日，用横杠分开，例如：06-12-25，08-08-08
		   String DATE_FORMAT_YY_MM_DD = "yy-MM-dd";

		// 日期格式，年月日时分，例如：20001230 12:00，20080808 20:08
		   String DATE_TIME_FORMAT_YYYYMMDD_HH_MI = "yyyyMMdd HH:mm";

		// 日期格式，年月日时分，例如：2000-12-30 12:00，2008-08-08 20:08
		   String DATE_TIME_FORMAT_YYYY_MM_DD_HH_MI = "yyyy-MM-dd HH:mm";

		// 日期格式，年月日时分秒，例如：20001230120000，20080808200808
		   String DATE_TIME_FORMAT_YYYYMMDDHHMISS = "yyyyMMddHHmmss";

		// 日期格式，年月日时分秒，年月日用横杠分开，时分秒用冒号分开，
		// 例如：2005-05-10 23：20：00，2008-08-08 20:08:08
		String DATE_TIME_FORMAT_YYYY_MM_DD_HH_MI_SS = "yyyy-MM-dd HH:mm:ss";

		// 日期格式，年月日时分秒毫秒，例如：20001230120000123，20080808200808456
		String DATE_TIME_FORMAT_YYYYMMDDHHMISSSSS = "yyyyMMddHHmmssSSS";
	    
		String DATE_TIME_FORMAT_YYYY年MM月DD日 = "yyyy年MM月dd日";
		
	    String DATE_FORMAT_POINTYYYYMMDD = "yyyy.MM.dd";

		
		System.out.println(DateFormatUtils.format(new Date(), DATE_FORMAT_YYYY));
		System.out.println(DateFormatUtils.format(new Date(), DATE_FORMAT_YYYYMM));
		System.out.println(DateFormatUtils.format(new Date(), DATE_FORMAT_YYYY_MM));
		System.out.println(DateFormatUtils.format(new Date(), DATE_FORMAT_YYYYMMDD));
		System.out.println(DateFormatUtils.format(new Date(), DATE_FORMAT_YYYYMMDDHHmm));
		System.out.println(DateFormatUtils.format(new Date(), DATE_FORMAT_YYYY_MM_DD));
		System.out.println(DateFormatUtils.format(new Date(), DATE_FORMAT_YY_MM_DD));
		System.out.println(DateFormatUtils.format(new Date(), DATE_TIME_FORMAT_YYYYMMDD_HH_MI));
		System.out.println(DateFormatUtils.format(new Date(), DATE_TIME_FORMAT_YYYY_MM_DD_HH_MI));
		System.out.println(DateFormatUtils.format(new Date(), DATE_TIME_FORMAT_YYYYMMDDHHMISS));
		System.out.println(DateFormatUtils.format(new Date(), DATE_TIME_FORMAT_YYYY_MM_DD_HH_MI_SS));
		System.out.println(DateFormatUtils.format(new Date(), DATE_TIME_FORMAT_YYYYMMDDHHMISSSSS));
		System.out.println(DateFormatUtils.format(new Date(), DATE_TIME_FORMAT_YYYY年MM月DD日));
		System.out.println(DateFormatUtils.format(new Date(), DATE_FORMAT_POINTYYYYMMDD));
		
	}

}