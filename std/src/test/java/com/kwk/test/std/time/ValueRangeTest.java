/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.time;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

/**
 * @author yanwei.cyw
 * @version $Id:ValueRangeTest.java, v0.1 2017-04-24 15:59 yanwei.cyw Exp $
 */
public class ValueRangeTest {
    @Test
    public void basicTest() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.range(ChronoField.DAY_OF_MONTH));
    }
}
