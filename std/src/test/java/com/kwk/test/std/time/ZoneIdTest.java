/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.time;

import org.junit.Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * @author yanwei.cyw
 * @version $Id:ZoneIdTest.java, v0.1 2017-04-25 11:23 yanwei.cyw Exp $
 */
public class ZoneIdTest {
    @Test
    public void basicTest() {
        System.out.println(ZoneId.systemDefault());
        System.out.println(ZoneId.getAvailableZoneIds());
        System.out.println(ZoneId.of("Asia/Shanghai"));
        System.out.println(ZoneId.from(ZonedDateTime.now()));

        Instant instant = Instant.now(); //can be LocalDateTime
        ZoneId systemZone = ZoneId.systemDefault(); // my timezone
        ZoneOffset currentOffsetForMyZone = systemZone.getRules().getOffset(instant);
        System.out.println(currentOffsetForMyZone);
    }
}
