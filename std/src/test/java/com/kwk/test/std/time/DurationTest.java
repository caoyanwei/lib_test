/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.time;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author yanwei.cyw
 * @version $Id:DurationTest.java, v0.1 2017-04-24 15:11 yanwei.cyw Exp $
 */
public class DurationTest {
    @Test
    public void basicTest() {
        Duration duration = Duration.ofDays(1).plusHours(2);
        System.out.println(duration);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.plus(duration));
    }
}
