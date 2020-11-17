package com.nanjolono.test.junitTest;

import junit.framework.TestResult;
import org.junit.*;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Describe Test注解示例Demo
 *          在JUNIT4中@Test注解只能添加在声明为 public void 方法上
 *          当注解的方法中时抛出任何异常（Exception）会使测试案例失败，
 *          反之，如果没有抛出异常，则会成功
 */
public class TestAnnotationOfTest extends TestResult {

    /**
     * @Describe 在一个方法上加上@Test这样就是一个测试案例啦
     */
    @Test
    public void method() {

    }

    /**
     * 在改方法中，我们未对ArrayList进行初始化，就获得其中的值，
     * 代码段中会抛出OutOfBoundsException,
     * 在expected设定预计捕获的指定异常，将会返回成功
     */
    @Test(expected=IndexOutOfBoundsException.class)
    public void TestOutOfBounds() {
        new ArrayList<Object>().get(1);
    }

    /**
     * @Describe while(true)会导致代码一直循环，无法执行下面的语句，
     * 在Test注解中加上timeout超时时间后，
     * 运行JUNIT时会进行判断，功能模块运行时间超过设定时间后会返回测试失败报告
     */
    @Test(timeout=100)
    public void infinity() {
        while(true);
    }

}
