/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.metrics;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.Gauge;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author yanwei.cyw
 * @version $Id:GetStarted.java, v0.1 2017-04-26 18:49 yanwei.cyw Exp $
 */
public class GetStarted {
    static final MetricRegistry metrics = new MetricRegistry();

    private static List<Integer> idList = Lists.newLinkedList();

    public static void main(String args[]) {
        startReport();
        Meter requests = metrics.meter("requests");
        metrics.register(MetricRegistry.name(GetStarted.class, "idList"), new Gauge<Integer>() {
            @Override
            public Integer getValue() {
                return idList.size();
            }
        });

        requests.mark();
        requests.mark();
        idList.add(1);
        requests.mark();
        idList.add(2);
        wait5Seconds();
    }

    static void startReport() {
        ConsoleReporter reporter = ConsoleReporter.forRegistry(metrics)
                .convertRatesTo(TimeUnit.SECONDS)
                .convertDurationsTo(TimeUnit.MILLISECONDS)
                .build();
        reporter.start(1, TimeUnit.SECONDS);
    }

    static void wait5Seconds() {
        try {
            Thread.sleep(5*1000);
        }
        catch(InterruptedException e) {}
    }
}
