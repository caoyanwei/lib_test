/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.netty.utils;

import io.netty.util.NetUtil;
import org.junit.Test;

/**
 * @author yanwei.cyw
 * @version $Id:NetUtilTest.java, v0.1 2017-04-05 15:18 yanwei.cyw Exp $
 */
public class NetUtilTest {

    @Test
    public void createByteArrayFromIpAddressStringTest() {
        byte[] bytes = NetUtil.createByteArrayFromIpAddressString("192.168.0.1");
        System.out.println(bytes);
    }
}
