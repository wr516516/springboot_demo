package com.spring.demo.springbootdemo.control;

import com.rabbitmq.tools.json.JSONUtil;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int intArray2 [] = new int []{1,1,1,1,1};


        int[] a=   runningSum(intArray2);
        System.out.println(Arrays.toString(a));
    }








    public static int[] runningSum(int[] nums) {


        int[] rnums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum = sum(sum, nums[i]);

            rnums[i] = sum;

        }
        return rnums;
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}