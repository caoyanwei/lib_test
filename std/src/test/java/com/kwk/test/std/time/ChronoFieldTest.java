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
 * @version $Id:ChronoFieldTest.java, v0.1 2017-04-24 15:35 yanwei.cyw Exp $
 */
public class ChronoFieldTest {
    @Test
    public void basicTest() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.get(ChronoField.DAY_OF_MONTH));
        System.out.println(now.get(ChronoField.HOUR_OF_DAY));
    }
}
