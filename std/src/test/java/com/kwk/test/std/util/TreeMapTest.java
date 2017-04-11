/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.util;

import org.junit.Test;

import java.util.TreeMap;

/**
 * @author yanwei.cyw
 * @version $Id:TreeMapTest.java, v0.1 2017-04-10 10:45 yanwei.cyw Exp $
 */
public class TreeMapTest {
    @Test
    public void ceilingTest() {
        TreeMap<Integer, String> treeMap = genTreeMap();

        System.out.println(treeMap.ceilingEntry(4));
        System.out.println(treeMap.floorEntry(4));
    }

    private TreeMap<Integer, String> genTreeMap() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(0, "aaa");
        treeMap.put(100, "bbb");
        treeMap.put(200, "ccc");
        treeMap.put(300, "ddd");
        return treeMap;
    }

    @Test
    public void subMapTest() {
        TreeMap<Integer, String> treeMap = genTreeMap();

        System.out.println(treeMap.subMap(5, 222));

        System.out.println(treeMap.subMap(0, true, 200, false));
    }
}
