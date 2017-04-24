/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.time;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/**
 * @author yanwei.cyw
 * @version $Id:InstantTest.java, v0.1 2017-04-24 11:50 yanwei.cyw Exp $
 */
public class InstantTest {
    @Test
    public void basicTest() throws InterruptedException {
        Date date = new Date();
        System.out.println(date.toInstant().toString());

        Instant instant = Instant.now();
        Thread.sleep(2500);
        Instant instant2 = Instant.now();
        Duration duration = Duration.between(instant, instant2);
        System.out.println(duration.toMillis());
    }
}
