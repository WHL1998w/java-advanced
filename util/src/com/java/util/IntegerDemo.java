package com.java.util;

import java.util.Stack;

/**
 * IntegerDemo的练习
 * @author wanghuan le
 * 2019.003.12
 */
public class IntegerDemo {
    public static void main(String[] args) {

     int num = 46;
     //二进制
        String  str2 = Integer.toBinaryString(num);
        System.out.println("46的二进制是：" + str2);
        //十六进制
        String str3 = Integer.toHexString(num);
        System.out.println("46的十六进制是：" + str3);
        //八进制
        String str4 = Integer.toOctalString(num);
        System.out.println("46八进制是：" + str4);
        //十五进制
        String str5 = Integer.toString(num,15);
        System.out.println("46十五进制是：" + str5);
        System.out.println("-----------分割线--------");
        System.out.println("转换7进制：" + cknvert(num,7));
    }



    private static String cknvert(int num,int n){
        //创建一个StringBuffer，用来存放结果字符串
     StringBuffer stringBuffer = new StringBuffer();
     //被除数不为0，做循环
     while (num != 0){
         //求余数
         int a = num % n;
         //更新被除数
         num = num /n;
         //将余数转换为字符串型
         stringBuffer.append(String.valueOf(a));
     }
     //返回结果值
        return stringBuffer.reverse().toString();
    }
}
