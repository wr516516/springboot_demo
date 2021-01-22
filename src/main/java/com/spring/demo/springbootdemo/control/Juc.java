/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.spring.demo.springbootdemo.control;

import cn.hutool.json.JSONUtil;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author wb-wr893656
 * @version : Juc.java, v 0.1 2020年12月22日 14:00 wb-wr893656 Exp $
 */
public class Juc {
    public static void main(String[] args) throws InterruptedException {

        //new BB();
        //
        //new AA();
        //BB.test("bb");


      //new A2().hei();

      //Map<Object,Object> map=new HashMap<>(8);
      //  map.put("1","a");
      //  map.put("2","b");
      //  map.put("3","c");
      //  Collection<Object> values = map.values();
      //  System.out.println(values);
      //  System.out.println(JSONUtil.toJsonStr(values));
      //  values.stream().forEach(System.out::println);

        //Optional<String> s = Optional.ofNullable("1");
        //System.out.println(s);
        //
        //String str=null;
        //Optional<String> s1 = Optional.ofNullable(str);
        //System.out.println(s1);
        //boolean equals = s1.equals("");
        //System.out.println(equals);

        System.out.printf("======================");

        Optional<String> s3 = Optional.ofNullable("");
        System.out.println(s3);
        Optional<Object> str1 = s3.map(str -> "str");
        System.out.println(str1);

    }



}