package com.souvc.commons.lang;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

public class RandomStringUtilsTest {

	private static final Random RANDOM = new Random();

	private static final int count = 4;
	private static final int start = 0;

	private static final int end = 3;
	private static final String str = "abcd1234z";
	private static final char[] chars = { 'a', 'b', '1', '2', 'c', 'd', 'e', 'f', '3' };

	public static void main(String[] args) {

		/*
		 * 1.创建一个长度为count的随机字符串. 中文环境下是乱码.
		 */
		System.out.println("random1:" + RandomStringUtils.random(count));

		/*
		 * 2.创建一个长度为count的从指定字符数组chars组合成的随机字符串.
		 */
		System.out.println("random2:" + RandomStringUtils.random(count, chars));

		/*
		 * 3.创建一个长度为count的从指定字符串str抽取字符组合成的随机字符串
		 */
		System.out.println("random3:" + RandomStringUtils.random(count, str));

		/*
		 * 4.根据letters和numbers 创建一个长度为count的随机字符串. 
		 * letters 为true 返回的值包含字母字符
		 * numbers 为true 返回的值包含数字字符
		 */
		System.out.println("random4:" + RandomStringUtils.random(count, true, true));

		/*
		 * <h1>此方法有问题 无法执行</h1>
		 *
		 * 5.根据start,end,letters和numbers 
		 * 创建一个长度为count的随机字符串. 
		 * start 参数字符组开始的位置
		 * end 参数字符组结束的位置 letters 为true 
		 * 返回的值包含字母字符 numbers 为true 返回的值包含数字字符
		 */
		
		 System.out.println("random5:"+RandomStringUtils.random(count, start,end, false, false));

		/*
		 * 6.根据start,end,letters和numbers, 
		 * 创建一个长度为count从指定字符数组chars抽取字符的随机字符串.
		 * start 参数字符组开始的位置 
		 * end 参数字符组结束的位置 letters 为true 
		 * 返回的值包含字母字符 numbers为true 
		 * 返回的值包含数字字符 chars 字符数组
		 */
		System.out.println("random6:" + RandomStringUtils.random(count, start, end, true, true, chars));

		/*
		 * 7.根据start,end,letters和numbers, 
		 * 创建一个长度为count从一个随机数源抽取字符的随机字符串. 
		 * start 参数字符组开始的位置 
		 * end 参数字符组结束的位置 
		 * letters 为true 
		 * 返回的值包含字母字符 numbers 为true
		 * 返回的值包含数字字符 chars 字符数组 RANDOM 随机数源
		 */
		System.out.println("random7:" + RandomStringUtils.random(count, start, end, true, true, chars, RANDOM));

		/*
		 * 8.创建一个长度为count的字母字符随机字符串
		 */
		System.out.println("randomAlphabetic:" + RandomStringUtils.randomAlphabetic(count));

		/*
		 * 9.创建一个长度为count的包含字符字符和数字字符的随机字符串
		 */
		System.out.println("randomAlphanumeric:" + RandomStringUtils.randomAlphanumeric(count));

		/*
		 * 10.创建一个长度为count的从ASCII 32到126 组成的随机字符串
		 */
		System.out.println("randomAscii:" + RandomStringUtils.randomAscii(count));

		/*
		 * 11.创建一个长度为count的数字字符随机字符串
		 */
		System.out.println("randomNumeric:" + RandomStringUtils.randomNumeric(count));

	}

}