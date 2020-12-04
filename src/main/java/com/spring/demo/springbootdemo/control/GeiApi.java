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
        return "测试在别的分支上push是否会触发构建";
    }
}
