/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.springboot.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yanwei.cyw
 * @version $Id:SampleController.java, v0.1 2017-04-14 15:01 yanwei.cyw Exp $
 */
@Controller
public class SampleController {
    private MyService myService2;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return myService2.sayHello();
    }

    @Autowired
    public void setMyService2(MyService myService2) {
        this.myService2 = myService2;
    }
}
