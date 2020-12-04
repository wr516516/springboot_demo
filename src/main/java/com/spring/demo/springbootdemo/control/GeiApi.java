package com.spring.demo.springbootdemo.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping()
public class GeiApi {

    @GetMapping("get")
    @ResponseBody
    public String getInfo() {
        return "在git添加webhooks后的第一次提交";
    }
}
