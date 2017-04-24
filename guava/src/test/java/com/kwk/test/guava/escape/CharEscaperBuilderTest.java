/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.guava.escape;

import com.google.common.escape.CharEscaperBuilder;
import com.google.common.escape.Escaper;
import org.junit.Test;

/**
 * @author yanwei.cyw
 * @version $Id:CharEscaperBuilderTest.java, v0.1 2017-04-21 14:21 yanwei.cyw Exp $
 */
public class CharEscaperBuilderTest {
    @Test
    public void basicTest() {
        CharEscaperBuilder builder = new CharEscaperBuilder();
        Escaper escaper = builder.addEscape('%', "%%").toEscaper();
        System.out.println(escaper.escape("abc 10%."));
    }
}
