/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.spring.demo.springbootdemo.control;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.slf4j.Logger;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author wb-wr893656
 * @version : Util.java, v 0.1 2020年12月16日 13:37 wb-wr893656 Exp $
 */

public class Util {

    private volatile static Channel channel;


    private Util() {}



    /**
     * Getter method for property <tt>channel</tt>.
     *
     * @return property value of channel
     */
    public static Channel getChannel() throws IOException, TimeoutException {
        if (channel == null) {
            synchronized (Util.class) {
                if (channel == null) {
                    ConnectionFactory factory = new ConnectionFactory();
                    factory.setHost("42.192.88.190");
                    factory.setPort(5672);
                    factory.setUsername("wr516516");
                    factory.setPassword("wr516516");
                    factory.setVirtualHost("test");
                    Connection connection = factory.newConnection();
                    channel = connection.createChannel();

                }
            }
        }

        return channel;
    }

    /**
     * Setter method for property <tt>channel</tt>.
     *
     * @param channel value to be assigned to property channel
     */
    public static void setChannel(Channel channel) {
        Util.channel = channel;
    }
}