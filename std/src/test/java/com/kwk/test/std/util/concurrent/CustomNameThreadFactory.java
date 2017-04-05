/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.util.concurrent;

import com.google.common.base.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yanwei.cyw
 * @version $Id:CustomNameThreadFactory.java, v0.1 2017-01-16 17:24 yanwei.cyw Exp $
 */
public class CustomNameThreadFactory implements ThreadFactory {
    private static final Logger LOG = LoggerFactory.getLogger(CustomNameThreadFactory.class);

    private static final AtomicInteger POOL_NUMBER = new AtomicInteger(1);

    private final ThreadGroup group;
    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private final String namePrefix;

    private Thread.UncaughtExceptionHandler handler;

    public CustomNameThreadFactory(String prefix) {
        this(prefix, null);
    }


    public CustomNameThreadFactory(String prefix, Thread.UncaughtExceptionHandler handler) {
        if (Strings.isNullOrEmpty(prefix)) {
            throw new IllegalArgumentException("invalid prefix");
        }

        SecurityManager s = System.getSecurityManager();
        group = (s != null) ? s.getThreadGroup() : Thread.currentThread().getThreadGroup();
        namePrefix = prefix + POOL_NUMBER.getAndIncrement() + "-thread-";

        if (handler != null) {
            this.handler = handler;
        } else {
            this.handler = new Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(Thread t, Throwable e) {
                    LOG.error("uncaughtException: " + t.getName(), e);
                }
            };
        }
    }

    public Thread newThread(Runnable r) {
        Thread t = new Thread(group, r, namePrefix + threadNumber.getAndIncrement(), 0);
        if (t.isDaemon()) {
            t.setDaemon(false);
        }

        if (t.getPriority() != Thread.NORM_PRIORITY) {
            t.setPriority(Thread.NORM_PRIORITY);
        }

        if (handler != null) {
            t.setUncaughtExceptionHandler(handler);
        }

        return t;
    }
}
