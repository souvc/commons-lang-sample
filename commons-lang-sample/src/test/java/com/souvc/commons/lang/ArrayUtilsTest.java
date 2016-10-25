
package com.souvc.commons.lang;
 
import java.util.Arrays;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;
 
/**
 * 类名: ArrayUtilsTest.java</br> 
 * 包名：  com.souvc.commons.lang </br> 
 * 描述: 利用ArrayUtils类帮我们完成数组的打印、查找、克隆、倒序、以及值型/对象数组之间的转换等操作</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：souvc </br>
 * 创建时间： 2016年10月25日</br>
 */
public class ArrayUtilsTest {
 
	public static void main(String[] args) {
 
		// 添加测试数据
		//定义数组intArray1
		int[] intArray1 = { 2, 4, 16, 8};
		//定义数组intArray2
		int[][] intArray2 = { { 1, 2 }, { 2, 4 }, { 3, 8 }, { 4, 16 } };
		//定义数组notAMap
		Object[][] notAMap = {
				{ "A", new Double(100) },
				{ "B", new Double(80) },
				{ "C", new Double(60) },
				{ "D", new Double(40) },
				{ "E", new Double(20) }
 
		};
 
		//打印数组
		System.out.println("intArray1:"+intArray1);
		System.out.println("intArray1:"+Arrays.toString(intArray1));
		System.out.println("ArrayUtils.toString(intArray1): " + ArrayUtils.toString(intArray1));
		System.out.println("intArray2: " + ArrayUtils.toString(intArray2));
		System.out.println("notAMap: " + ArrayUtils.toString(notAMap));
		
		//寻找数组元素
		System.out.println("intArray1 contains '8'? "+ ArrayUtils.contains(intArray1, 8));
		System.out.println("intArray1 index of '8'? "+ ArrayUtils.indexOf(intArray1, 8));
		System.out.println("intArray1 last index of '8'? "+ ArrayUtils.lastIndexOf(intArray1, 8));
 
		//复制以及反转
		int[] intArray3 = ArrayUtils.clone(intArray1);
		System.out.println("intArray3: " + ArrayUtils.toString(intArray3));
		ArrayUtils.reverse(intArray3);
		System.out.println("intArray3 reversed: "+ ArrayUtils.toString(intArray3));
 
		//类型转换
		Integer[] integerArray1 = ArrayUtils.toObject(intArray1);
		System.out.println("integerArray1: "+ ArrayUtils.toString(integerArray1));
 
		//二维数组转换成Map
		Map<String, Double> map = ArrayUtils.toMap(notAMap);
		Double res = (Double) map.get("C");
		System.out.println("get 'C' from map: " + res);
 
	}
 
}