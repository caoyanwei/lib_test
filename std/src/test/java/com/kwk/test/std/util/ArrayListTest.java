/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.util;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author yanwei.cyw
 * @version $Id:ArrayListTest.java, v0.1 2017-04-10 14:29 yanwei.cyw Exp $
 */
public class ArrayListTest {
    @Test
    public void iteratorTest() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);

        System.out.println(arrayList.iterator().next());
        System.out.println(arrayList.iterator().next());
    }
}
