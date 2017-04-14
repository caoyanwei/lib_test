/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.springboot.a;

/**
 * @author yanwei.cyw
 * @version $Id:MyService.java, v0.1 2017-04-14 16:16 yanwei.cyw Exp $
 */
public class MyService {
    private String name;

    public MyService(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "say hello: " + name;
    }
}
