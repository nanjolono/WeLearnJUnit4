package com.nanjolono.test.junitTest;

import org.junit.Assert;
import org.junit.Test;

/**
 * 断言测试
 */
public class TestMethodOfAssert {

    /**
     * 判断两个对象是否相等
     */
    @Test
    public void testAssertEquals(){
        String word = "HelloWorld";
        Assert.assertEquals("HelloWorld",word);
    }

    /**
     * 判断两个数组是否相等
     */
    @Test
    public void testArraryEquals(){
        int[] a = {15,3,8};
        int[] b = {15,3,8};
        Assert.assertArrayEquals(a,b);
    }

    /**
     * 测试结果是否为false
     * 在本案例中，我们定义的结果为true
     * 但是在执行报告中返回的是失败
     * 因为这个是以是否为false为基础做判断的
     */
    @Test
    public void testAssertFalse(){
        boolean result = true;
        Assert.assertFalse(result);
    }

    /**
     * 判断对象是否为空
     * 如果不为空的话则返回成功
     * 反之为失败
     */
    @Test
    public void testAssertNull(){
        TestMethodOfAssert asserts = null;
        Assert.assertNotNull(asserts);
    }
    
}
