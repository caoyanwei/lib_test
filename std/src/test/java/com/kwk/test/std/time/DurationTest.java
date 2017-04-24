/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.time;

import org.junit.Test;

import java.time.Duration;

/**
 * @author yanwei.cyw
 * @version $Id:DurationTest.java, v0.1 2017-04-24 15:11 yanwei.cyw Exp $
 */
public class DurationTest {
    @Test
    public void basicTest() {
        System.out.println(Duration.ofDays(1).plusHours(2));
    }
}
