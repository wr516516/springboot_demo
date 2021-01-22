/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.spring.demo.springbootdemo.control;

import org.springframework.util.StringUtils;

import java.util.Optional;

/**
 *
 * @author wb-wr893656
 * @version : StreamDemo.java, v 0.1 2021年01月13日 18:01 wb-wr893656 Exp $
 */
public class StreamDemo {

    public static void main(String[] args) {
        User user = new User();

        Optional.ofNullable(user)
                //包装名称不为空
                .filter(bizInfo -> !StringUtils.isEmpty( bizInfo.getName()))
                //业务需求code
                .filter(bizInfo ->! StringUtils.isEmpty(bizInfo.getAge()));
        System.out.println(user.getAge());
        System.out.println(user.getName());

    }


    static class User{
        String name;

        /**
         * Getter method for property <tt>name</tt>.
         *
         * @return property value of name
         */
        public String getName() {
            return name;
        }

        /**
         * Setter method for property <tt>name</tt>.
         *
         * @param name value to be assigned to property name
         */
        public void setName(String name) {
            this.name = name;
        }

        String age;

        /**
         * Getter method for property <tt>age</tt>.
         *
         * @return property value of age
         */
        public String getAge() {
            return age;
        }

        /**
         * Setter method for property <tt>age</tt>.
         *
         * @param age value to be assigned to property age
         */
        public void setAge(String age) {
            this.age = age;
        }
    }
}