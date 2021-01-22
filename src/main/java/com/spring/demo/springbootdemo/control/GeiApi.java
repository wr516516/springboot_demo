package com.spring.demo.springbootdemo.control;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

@RestController
//@RequestMapping()
public class GeiApi {
    private final static String QUEUE_NAME = "hello";

    static Logger logger = LoggerFactory.getLogger(GeiApi.class);

    static {

    }

    @GetMapping("get")
    @ResponseBody
    public String getInfo() {
        return "测试在别的分支上push是否会触发构建";
    }

    @GetMapping("mq")
    @ResponseBody
    public void mq(String message) throws IOException, TimeoutException {
        logger.info("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        Channel channel = Util.getChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        if (StringUtils.isEmpty(message)) {
            message = "Hello World!";

        }
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());

    }

    @GetMapping("receiving")
    @ResponseBody
    public void receiving() throws IOException, TimeoutException {

        while (true) {
            Channel channel = Util.getChannel();
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);

            DeliverCallback deliverCallback = (consumerTag, delivery) -> {
                String message = new String(delivery.getBody(), StandardCharsets.UTF_8);
                System.out.println(" [x] Received '" + message + "'");
            };
            channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> {
                System.out.println(consumerTag + "a");
            });
        }

    }

    @GetMapping("a")
    @ResponseBody
    public void a() throws IOException, TimeoutException {
        Consumer consumer = a -> {

            a = 5;
        };

        consumer.accept(1);
        System.out.println();
    }

    interface InterfaceTest {
        default void test() {
            System.out.println("嘿嘿嘿");
        }
    }
}

