package com.spring.demo.springbootdemo;

import cn.hutool.cron.CronUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
        //支持秒级别定时任务
//        CronUtil.setMatchSecond(true);
        CronUtil.start();

    }

}
