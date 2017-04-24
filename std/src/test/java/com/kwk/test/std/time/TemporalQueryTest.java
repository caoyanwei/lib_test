/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.time;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.chrono.Chronology;
import java.time.temporal.TemporalQueries;

/**
 * @author yanwei.cyw
 * @version $Id:TemporalQueryTest.java, v0.1 2017-04-24 16:01 yanwei.cyw Exp $
 */
public class TemporalQueryTest {
    @Test
    public void basicTest() {
        LocalDateTime now = LocalDateTime.now();
        Chronology chronology = now.query(TemporalQueries.chronology());
        System.out.println(chronology);
    }
}
