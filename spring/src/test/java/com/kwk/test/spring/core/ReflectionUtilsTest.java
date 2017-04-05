package com.kwk.test.spring.core;

import org.junit.Test;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;

/**
 * Created by kk on 2017/4/2.
 */
public class ReflectionUtilsTest {
    @Test
    public void doWithMethodsTest() {
        ReflectionUtils.doWithMethods(String.class, new ReflectionUtils.MethodCallback() {
            public void doWith(Method method) throws IllegalArgumentException, IllegalAccessException {
                System.out.println(method.getName());
            }
        });
    }
}
