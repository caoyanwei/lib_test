/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.springboot.a;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yanwei.cyw
 * @version $Id:MyConfig.java, v0.1 2017-04-14 16:16 yanwei.cyw Exp $
 */
@Configuration
public class MyConfig {
    @Bean("myService1")
    public MyService myService1() {
        return new MyService("myService1");
    }

    @Bean("myService2")
    public MyService myService2() {
        return new MyService("myService2");
    }
}
