/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.guava.xml;

import com.google.common.xml.XmlEscapers;
import org.junit.Test;

/**
 * @author yanwei.cyw
 * @version $Id:XmlEscapersTest.java, v0.1 2017-04-21 14:12 yanwei.cyw Exp $
 */
public class XmlEscapersTest {
    @Test
    public void basicTest() {
        System.out.println(XmlEscapers.xmlContentEscaper().escape("<a=abc>"));
    }
}
