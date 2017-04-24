/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.time;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author yanwei.cyw
 * @version $Id:ChronoUnitTest.java, v0.1 2017-04-24 15:37 yanwei.cyw Exp $
 */
public class ChronoUnitTest {
    @Test
    public void basicTest() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.truncatedTo(ChronoUnit.MINUTES).plusSeconds(30));
    }
}
