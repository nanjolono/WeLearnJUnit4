package com.nanjolono.test.junitTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldOfJunit {
    //第一个测试用例
    @Test
    public void testNum() {
        //测试数据
        String str = "Hello World";
        assertEquals("Hello World", str);
    }
}
