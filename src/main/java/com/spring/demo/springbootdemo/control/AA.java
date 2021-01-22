/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.spring.demo.springbootdemo.control;

/**
 * @author wb-wr893656
 * @version : AA.java, v 0.1 2020年12月31日 16:04 wb-wr893656 Exp $
 */
public class AA {
    public static void main(String[] args) {
        f1();
    }

    static {
        System.out.println("1");
    }

    static AA a = new AA();

    {
        System.out.println("2");
    }

    public AA() {
        System.out.println("3   ");
        System.out.println("i:"+i +"j:"+ j);
    }



    private static void f1() {
        System.out.println("4");
    }
    int i = 110;

    static int j = 100;

}