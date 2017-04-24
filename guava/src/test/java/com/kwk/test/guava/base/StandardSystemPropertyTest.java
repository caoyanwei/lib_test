/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.guava.base;

import com.google.common.base.StandardSystemProperty;
import org.junit.Test;

/**
 * @author yanwei.cyw
 * @version $Id:StandardSystemPropertyTest.java, v0.1 2017-04-21 13:51 yanwei.cyw Exp $
 */
public class StandardSystemPropertyTest {
    @Test
    public void basicTest() {
        System.out.println(StandardSystemProperty.JAVA_HOME.value());
    }
}
