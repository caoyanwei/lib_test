/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.time;

import org.junit.Test;

import java.time.Clock;

/**
 * @author yanwei.cyw
 * @version $Id:ClockTest.java, v0.1 2017-04-25 14:15 yanwei.cyw Exp $
 */
public class ClockTest {
    @Test
    public void basicTest() {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);
    }
}
