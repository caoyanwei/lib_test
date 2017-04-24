/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.guava.base;

import com.google.common.base.CaseFormat;
import org.junit.Test;

import static com.google.common.base.CaseFormat.LOWER_HYPHEN;

/**
 * @author yanwei.cyw
 * @version $Id:CaseFormatTest.java, v0.1 2017-04-21 13:52 yanwei.cyw Exp $
 */
public class CaseFormatTest {
    @Test
    public void basicTest() {
        System.out.println(CaseFormat.LOWER_CAMEL.to(LOWER_HYPHEN, "changeMyWorld"));

    }
}
