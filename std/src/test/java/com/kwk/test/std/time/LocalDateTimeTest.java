/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

/**
 * @author yanwei.cyw
 * @version $Id:LocalDateTimeTest.java, v0.1 2017-04-25 11:15 yanwei.cyw Exp $
 */
public class LocalDateTimeTest {
    @Test
    public void basicTest() {
        LocalDateTime dateTime = LocalDateTime.of(LocalDate.ofYearDay(2016, 200), LocalTime.ofSecondOfDay(0));
        System.out.println(dateTime);

        System.out.println(ZoneId.systemDefault());
    }
}
