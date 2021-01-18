package com.spring.demo.springbootdemo.control;

import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpCookie;
import java.util.HashMap;
import java.util.List;

@RestController
//@RequestMapping()
public class GeiApi {


    public void getInfo() {
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("email", "276411794@qq.com");
        paramMap.put("passwd", "wr516516");
        //链式构建请求
        HttpResponse hutool_http = HttpRequest.post("https://renzhe.cloud/auth/login")
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .form(paramMap)//表单内容
                .timeout(20000)//超时，毫秒
                .execute();
        List<HttpCookie> cookies = hutool_http.getCookies();
        System.out.println(hutool_http.body());


        HttpResponse hutool_http1 = HttpRequest.post("https://renzhe.cloud/user/checkin")
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .timeout(20000)//超时，毫秒
                .cookie(cookies)
                .execute();

        System.out.println("------");
        System.out.println(hutool_http1.body());

    }
    public void test(){
        System.out.println("我是 test");
    }

}
