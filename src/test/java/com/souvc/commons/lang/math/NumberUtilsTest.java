package com.souvc.commons.lang.math;

import org.apache.commons.lang.math.NumberUtils;
import org.junit.Test;

import java.math.BigDecimal;

public class NumberUtilsTest {

    /**
     * 判断字符串是否是数字,小数点也包括,浮点型数据也是通过的，全是数字也是通过的
     */
    @Test
	public void  isNumber(){
        System.out.println(NumberUtils.isNumber("2.34f"));//true
        System.out.println(NumberUtils.isNumber("2.34d"));//true

        System.out.println(NumberUtils.isNumber("5.96"));//true
        System.out.println(NumberUtils.isNumber("2.23c"));//false
        System.out.println(NumberUtils.isNumber("s5"));//false

        System.out.println(NumberUtils.isNumber("0000000000596"));//true
    }

    /**
     * 判断字符串中是否全为数字,小数点也不行
     */
    @Test
    public void  isDigits(){
        System.out.println(NumberUtils.isDigits("2.34"));//false,必须全为数字才为true
        System.out.println(NumberUtils.isDigits("234"));//true

        System.out.println(NumberUtils.isDigits("0000000000.596"));//false
        System.out.println(NumberUtils.isDigits("0000000000596"));//true
    }

    //to 系列转换,toFloat,toInt,toDouble,toLong

    /**
     * 类型安全转换，还可以设置默认值
     */
    @Test
    public void  to(){

        System.out.println(NumberUtils.toInt("5"));
        System.out.println(NumberUtils.toLong("5"));
        System.out.println(NumberUtils.toByte("3"));
        System.out.println(NumberUtils.toFloat(""));
        System.out.println(NumberUtils.toDouble("4"));
        System.out.println(NumberUtils.toShort("3"));

        //主要可以做安全转换工作
        System.out.println(NumberUtils.toDouble(null));

        //默认值
        Float f1=NumberUtils.toFloat("2.35f",0f);
        System.out.println(f1);//2.35

        //自定义默认值
        Float f2=NumberUtils.toFloat(null,2f);
        System.out.println(f2);//2.0

        //0.0空指针安全， 如果不写默认值，将默认转换成0.0f
        System.out.println(NumberUtils.toFloat(null));

    }


    /**
     * 类型安全转换
     * @throws Exception
     */
    @Test
    public void create() throws Exception {
        //create 基本类型系列
        Double d1=NumberUtils.createDouble("3.43d");
        System.out.println(d1);//3.43

        Integer i1=NumberUtils.createInteger("234");
        System.out.println(i1);//234

        System.out.println(NumberUtils.createInteger("1"));

        System.out.println(NumberUtils.createLong("1"));

        //BigDecimal类型
        BigDecimal bigDecimal = NumberUtils.createBigDecimal("1");
        System.out.println(bigDecimal);

        //注意这个没有给默认值，如果是null的话，还是null值
        BigDecimal bigDecimal2 = NumberUtils.createBigDecimal(null);
        System.out.println(bigDecimal2);

        //浮点型测试
        BigDecimal bigDecimal3 = NumberUtils.createBigDecimal("1.2");
        System.out.println(bigDecimal3);

        //注意不能直接写浮点
        //BigDecimal bigDecimal4 = NumberUtils.createBigDecimal("1.2d");//NumberFormatException
        //System.out.println(bigDecimal4);

        //错误写法
       // BigDecimal bigDecimal5 = NumberUtils.createBigDecimal("1.2f");//NumberFormatException
        //System.out.println(bigDecimal5);
        Double aDouble = NumberUtils.createDouble("12.1d");
        BigDecimal bigDecimal5 = NumberUtils.createBigDecimal(aDouble.toString());//NumberFormatException
        System.out.println(bigDecimal5);

    }

    /**
     * 找出最大值
     * @throws Exception
     */
    @Test
    public void max() throws Exception {
        Float f3=NumberUtils.max(new float[]{2.34f,1.21f,4.55f,6.55f});
        System.out.println(f3);//6.55

        System.out.println(NumberUtils.max(new int[]{3, 5, 6}));//6
        System.out.println(NumberUtils.max(3, 1, 7));//7
    }


    /**
     * 找出最小值
     * @throws Exception
     */
    @Test
    public void min() throws Exception {
        Integer i2=NumberUtils.min(new int[]{1, 3, 4, 2});
        System.out.println(i2);//1

        System.out.println(NumberUtils.min(new int[]{3, 5, 6}));
        System.out.println(NumberUtils.min(3, 1, 7));
    }
}

