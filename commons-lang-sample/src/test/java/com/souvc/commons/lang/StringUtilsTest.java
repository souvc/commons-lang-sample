package com.souvc.commons.lang;

import org.apache.commons.lang.StringUtils;

public class StringUtilsTest {

	public static void main(String[] args) {

		//设置测试数据
		String str1 = "";
		String str2 = " ";
		String str3 = "\t";
		String str4 = null;
		String str5 = "123";
		String str6 = "ABCDEFG";
		String str7 = "It feels good to use Jakarta Commons.\r\n";

		//测试字符串是否为空
		System.out.println("===========测试字符串是否为空===================");
		System.out.println("Is str1 blank? " + StringUtils.isBlank(str1));
		System.out.println("Is str2 blank? " + StringUtils.isBlank(str2));
		System.out.println("Is str3 blank? " + StringUtils.isBlank(str3));
		System.out.println("Is str4 blank? " + StringUtils.isBlank(str4));

		//测试字符串是否是数字
		System.out.println("===========测试字符串是否是数字===================");
		System.out.println("Is str5 numeric? " + StringUtils.isNumeric(str5));
		System.out.println("Is str6 numeric? " + StringUtils.isNumeric(str6));
		
		 /*StringUtils.isNumeric(null)   = false
		 StringUtils.isNumeric("")     = true
		 StringUtils.isNumeric("  ")   = false
		 StringUtils.isNumeric("123")  = true
		 StringUtils.isNumeric("12 3") = false
		 StringUtils.isNumeric("ab2c") = false
		 StringUtils.isNumeric("12-3") = false
		 StringUtils.isNumeric("12.3") = false*/
		
		System.out.println("StringUtils.isNumeric(null)? "+StringUtils.isNumeric(null));
		System.out.println("StringUtils.isNumeric('') ? "+StringUtils.isNumeric(""));
		System.out.println("StringUtils.isNumeric('   ') ? "+StringUtils.isNumeric("  "));
		System.out.println("StringUtils.isNumeric('123') ? "+StringUtils.isNumeric("123"));
		System.out.println("StringUtils.isNumeric('12 3') ? "+StringUtils.isNumeric("12 3"));
		System.out.println("StringUtils.isNumeric('ab2c') ? "+StringUtils.isNumeric("ab2c"));
		System.out.println("StringUtils.isNumeric('12-3') ? "+StringUtils.isNumeric("12-3"));
		System.out.println("StringUtils.isNumeric('12.3') ? "+StringUtils.isNumeric("12.3"));
		
		System.out.println("===========特别注意的数字，如果这样的数字需要自己写一下条件判断===================");
		System.out.println("StringUtils.isNumeric('-1') ? "+StringUtils.isNumeric("-1"));
		System.out.println("StringUtils.isNumeric('+1') ? "+StringUtils.isNumeric("+1"));
		
		//测试字符串反转
		System.out.println("===============测试字符串反转==========================");
		System.out.println("str6: " + str6);
		System.out.println("str6 reversed: " + StringUtils.reverse(str6));
		System.out.println("str7: " + str7);
		String str8 = StringUtils.chomp(str7);
		str8 = StringUtils.reverseDelimited(str8, ' ');
		System.out.println("str7 reversed whole words : \r\n" + str8);

		// build header (useful to print log messages that are easy to locate)
		System.out.println("==============================");
		System.out.println("print header:");
		String padding = StringUtils.repeat("|", 50);
		String msg = StringUtils.center(" Customised Header ", 50, "%");
		
		Object[] raw = new Object[] { padding, msg, padding };
		String header = StringUtils.join(raw, "\r\n");
		System.out.println(header);
		
		System.out.println(StringUtils.right("Customised Header2", 50));
		
		System.out.println(StringUtils.left("Customised Header2", 50));
		
		//如何统计指定字符在字符串中出现的频率
                int n = StringUtils.countMatches("11112222", "1");
                System.out.println(n);

	}

}