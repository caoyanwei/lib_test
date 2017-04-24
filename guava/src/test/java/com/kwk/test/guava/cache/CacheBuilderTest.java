/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.guava.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;
import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author yanwei.cyw
 * @version $Id:CacheBuilderTest.java, v0.1 2017-04-18 17:13 yanwei.cyw Exp $
 */
public class CacheBuilderTest {
    @Test
    public void basicTest() throws ExecutionException, InterruptedException {
        LoadingCache<Integer, String> cache = CacheBuilder.newBuilder().maximumSize(10).recordStats().removalListener(new RemovalListener<Integer, String>() {
            @Override
            public void onRemoval(RemovalNotification<Integer, String> removalNotification) {
                System.out.println("remove" + removalNotification.getKey());
            }
        }).expireAfterWrite(5, TimeUnit.SECONDS).build(new CacheLoader<Integer, String>() {
            @Override
            public String load(Integer s) throws Exception {
                if (s < 3) {
                    throw new IllegalArgumentException("" + s);
                }
                System.out.println("loading: " + s);
                return Integer.toString(s) + "-cache";
            }
        });

        for (int i = 0; i < 15; i++) {
            cache.get(i);
        }

        System.out.println("1111: " + cache.get(8));
        TimeUnit.SECONDS.sleep(6);
        System.out.println("2222: " + cache.get(8));

        System.out.println(cache.stats());
        TimeUnit.SECONDS.sleep(10);
    }
}
