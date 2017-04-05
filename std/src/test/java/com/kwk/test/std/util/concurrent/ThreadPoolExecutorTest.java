/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.util.concurrent;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author yanwei.cyw
 * @version $Id:ThreadPoolExecutorTest.java, v0.1 2017-04-05 16:36 yanwei.cyw Exp $
 */
public class ThreadPoolExecutorTest {
    @Test
    public void basicTest() throws InterruptedException {
        int maxSize = 2;
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(1), new CustomNameThreadFactory("basicTest"), new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                System.out.println("rejectedExecution");
            }
        });

        for(int i = 0; i< 10; ++i) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("run");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        executor.awaitTermination(3, TimeUnit.SECONDS);
    }
}
