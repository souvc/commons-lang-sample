
package com.souvc.commons.lang.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;

/**
 * 类名: DateUtilsTest.java</br> 
 * 包名：  org.apache.commons.lang.sample.time </br> 
 * 描述: org.apache.commons.lang.time.DateUtils(常用的一些函数）</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：souvc </br>
 * 创建时间： 2016年10月14日</br>
 */
public class DateUtilsTest {

	
	/**
	 * 日期对象的加减   ---- 年月日 ，时分秒  ，星期
	 */
	//一个日期对象＋N年
	@Test
	public void addYears(){
		System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
		Date newdate=DateUtils.addYears(new Date(), 1);
		System.out.println(DateFormatUtils.format(newdate, "yyyy-MM-dd HH:mm:ss"));
	}
	
	//一个日期对象＋n月
	@Test
	public void addMonths(){
		System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
		Date newdate=DateUtils.addMonths(new Date(), 1);
		System.out.println(DateFormatUtils.format(newdate, "yyyy-MM-dd HH:mm:ss"));
	}
	
	//一个日期对象＋n天增加n天
	@Test
	public void addDays(){
		System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
		Date newdate=DateUtils.addDays(new Date(), 1);
		System.out.println(DateFormatUtils.format(newdate, "yyyy-MM-dd HH:mm:ss"));
	}
	
	
	//一个日期对象＋n小时
	@Test
	public void addHours(){
		System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
		Date newdate=DateUtils.addHours(new Date(), 1);
		System.out.println(DateFormatUtils.format(newdate, "yyyy-MM-dd HH:mm:ss"));
	}
	
	
	//一个日期对象+n分
	@Test
	public void addMinutes(){
		System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
		Date newdate=DateUtils.addMinutes(new Date(), 1);
		System.out.println(DateFormatUtils.format(newdate, "yyyy-MM-dd HH:mm:ss"));
	}
	
	
	//一个日期对象＋n秒
	@Test
	public void addSeconds(){
		System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
		Date newdate=DateUtils.addSeconds(new Date(), 1);
		System.out.println(DateFormatUtils.format(newdate, "yyyy-MM-dd HH:mm:ss"));
	}
	
	//一个日期对象+n毫秒
	@Test
	public void addMilliseconds(){
		System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
		Date newdate=DateUtils.addMilliseconds(new Date(), 100);
		System.out.println(DateFormatUtils.format(newdate, "yyyy-MM-dd HH:mm:ss"));
	}
	
	
	//一个日期对象＋N个星期
	@Test
	public void addWeeks(){
		System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
		Date newdate=DateUtils.addWeeks(new Date(), 1);
		System.out.println(DateFormatUtils.format(newdate, "yyyy-MM-dd HH:mm:ss"));
	}
	
	
	/**
	 * 如果是日期相减的话  其他以此类推
	 */
	
	@Test
	public void subtractYears(){
		System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
		Date newdate=DateUtils.addYears(new Date(), -1);
		System.out.println(DateFormatUtils.format(newdate, "yyyy-MM-dd HH:mm:ss"));
	}
	
	
	//一个日期对象＋n月
	@Test
	public void subtractMonths(){
		System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
		Date newdate=DateUtils.addMonths(new Date(), -1);
		System.out.println(DateFormatUtils.format(newdate, "yyyy-MM-dd HH:mm:ss"));
	}
	
	
	//一个日期对象＋n天增加n天
	@Test
	public void subtractDays(){
		System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
		Date newdate=DateUtils.addDays(new Date(), -1);
		System.out.println(DateFormatUtils.format(newdate, "yyyy-MM-dd HH:mm:ss"));
	}
	
	
	/**
	 * 演示truncate截取日期的用法
	 */
	@Test
	public void truncate(){
		Date date = new Date();
	    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//截取到分钟
		System.out.println(dateFormat.format(DateUtils.truncate(date, Calendar.MINUTE)));//2016-08-15 16:45:00
		//截取到秒
		System.out.println(dateFormat.format(DateUtils.truncate(date, Calendar.SECOND))); //2016-08-15 16:45:08
		//截取到小时
		System.out.println(dateFormat.format(DateUtils.truncate(date, Calendar.HOUR_OF_DAY)));//2016-08-15 16:00:00
		//截取到日
	    System.out.println(dateFormat.format(DateUtils.truncate(date, Calendar.DAY_OF_MONTH))); //2016-08-15 00:00:00
		//截取到月份
	    System.out.println(dateFormat.format(DateUtils.truncate(date, Calendar.MONTH))); //2016-08-01 00:00:00
		//截取到年份
	    System.out.println(dateFormat.format(DateUtils.truncate(date, Calendar.YEAR))); //2016-01-01 00:00:00
	}
	
	
	
	//转换日期
	@Test
	public void parseDate() throws ParseException{
		String[] format={"yyyy-MM-dd"};
		System.out.println(DateUtils.parseDate("2009-10-20",format));
	}
		
	
	
	//两个日期对象是否相等（只比较年－月－日）
	
	
	//比较两个日期是否完全相等（精确到毫秒）
	
	
	@Test
	public void isSameDay() throws ParseException{
		String[] format={"yyyy-MM-dd HH:mm:ss"};
		Date date1=DateUtils.parseDate("2016-10-26 12:31:54",format);
		Date date2=DateUtils.parseDate("2016-10-26 12:31:55",format);
		System.out.println("date1:"+date1);
		System.out.println("date2:"+date2);
		System.out.println(DateUtils.isSameDay(date1, date2));
	}
	
	@Test
	public void isSameInstant() throws ParseException{
		String[] format={"yyyy-MM-dd HH:mm:ss"};
		Date date1=DateUtils.parseDate("2016-10-26 12:31:54",format);
		Date date2=DateUtils.parseDate("2016-10-26 12:31:55",format);
		System.out.println(DateUtils.isSameInstant(date1, date2));
	}
	
	
	
	
   /**
     * 截取比较两个日历对象的field处的值是否相同 。
     * 
     * @param cal1 第一个日历对象，非null
     * @param cal2 第二个日历对象，非null
     * @param field Calendar中的阈值
     */
    public  void truncatedEquals(){
    	
    }

    /**
     * 截取比较两个日期对象的field处的值是否相同 。
     * 
     * @param date1 第一个日期对象，非null
     * @param date2 第二个日期对象，非null
     * @param field Calendar中的阈值
     */
    public  void truncatedEquals2(){
    	
    }

	
	/**
     * 截取比较两个日期对象的field处的值是否相同 。
     * @param date1 第一个日期对象，非null
     * @param date2 第二个日期对象，非null
     * @param field Calendar中的阈值
     */
	@Test
	public void truncatedCompareTo(){
		Date nowdate=new Date();
		System.out.println("nowdate："+DateFormatUtils.format(nowdate,"yyyy-MM-dd HH:mm:ss"));
		Date newdate=DateUtils.addDays(new Date(), 1);
		System.out.println("newdate："+DateFormatUtils.format(newdate,"yyyy-MM-dd HH:mm:ss"));

		//比较2018-03-06 16:27:38 与 2018-03-07 16:27:38 大小  加一天
		System.out.println("----->"+DateUtils.truncatedCompareTo(nowdate, newdate, Calendar.SECOND));

		//比较2018-03-06 16:27:38  与 2018-03-06 16:27:38 大小  相同日期
		System.out.println("----->"+DateUtils.truncatedCompareTo(nowdate, nowdate, Calendar.SECOND));

		//2018-03-07 16:27:38 与 2018-03-06 16:27:38 比较大小
		System.out.println("----->"+DateUtils.truncatedCompareTo(newdate, nowdate, Calendar.SECOND));
	}

	/**
	 * 测试截取到日的时间
	 */
	@Test
	public void truncatedCompareTo1() throws ParseException {
		String[] parsePatterns=new String[]{"yyyy-MM-dd HH:mm:ss"};
		Date firstDay=DateUtils.parseDate("2018-03-06 16:27:38",parsePatterns);
		System.out.println("firstDay："+DateFormatUtils.format(firstDay,"yyyy-MM-dd HH:mm:ss"));

		Date secondDay=DateUtils.addDays(firstDay, 1);
		System.out.println("secondDay："+DateFormatUtils.format(secondDay,"yyyy-MM-dd HH:mm:ss"));

		//比较2018-03-06 16:27:38 与 2018-03-07 16:27:38 大小  加一天
		System.out.println("----->"+DateUtils.truncatedCompareTo(firstDay, secondDay, Calendar.DAY_OF_MONTH));

		//比较2018-03-06 16:27:38  与 2018-03-06 16:27:38 大小  相同日期
		System.out.println("----->"+DateUtils.truncatedCompareTo(firstDay, firstDay, Calendar.DAY_OF_MONTH));

		//2018-03-07 16:27:38 与 2018-03-06 16:27:38 比较大小
		System.out.println("----->"+DateUtils.truncatedCompareTo(secondDay, firstDay, Calendar.DAY_OF_MONTH));
	}
	
	
	 /**
     * 截取比较两个日历对象的field处的值 。
     * 如果第一个日历小于、等于、大于第二个，则对应返回负整数、0、正整数
     * @param cal1 第一个日历对象，非null
     * @param cal2 第二个日历对象，非null
     * @param field Calendar中的阈值
     */
	@Test
	public void truncatedCompareTo2(){
		Calendar calendar = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		System.out.println("----->"+DateUtils.truncatedCompareTo(calendar, calendar2, Calendar.SECOND));
		
	}
	
	
	
}

