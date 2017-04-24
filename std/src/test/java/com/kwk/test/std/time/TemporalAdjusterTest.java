/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.time;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

/**
 * @author yanwei.cyw
 * @version $Id:TemporalAdjusterTest.java, v0.1 2017-04-24 15:45 yanwei.cyw Exp $
 */
public class TemporalAdjusterTest {
    @Test
    public void basicTest() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime adjustDate = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(adjustDate);
    }
}
