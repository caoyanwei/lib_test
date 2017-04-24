/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author yanwei.cyw
 * @version $Id:PeriodTest.java, v0.1 2017-04-24 15:11 yanwei.cyw Exp $
 */
public class PeriodTest {
    @Test
    public void basicTest() {
        LocalDate birth = LocalDate.of(1989, 1, 11);
        LocalDate now = LocalDate.now();
        Period period = Period.between(birth, now);
        System.out.println(period);
    }
}
