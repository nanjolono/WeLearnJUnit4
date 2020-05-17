package com.nanjolono.test.junitTest;

import org.junit.Ignore;
import org.junit.Test;

/**
 *  @Describe 如果我们对于某些方法暂时不去测试，
 *            可以添加@Ignore注解进行忽略，
 *            在执行生成的测试报告中，将不会统计被@Ignore忽略的测试案例结果
 */

/**
 * 在套件测试中（多个类执行测试案例中），
 * 如果想忽略掉某个类中的测试案例，
 * 也可以添加到类上面，
 * 这样整个类都会被忽略掉
 */
//@Ignore(value = "这里可以忽略整个类")
public class TestAnnotationOfIgnore {

    /**
     * @Describe @Ignore注解测试
     */
    @Test
    public void TestFirstMethod() {

    }

    /**
     * @Describe 加上了@Ignore之后测试案例就会被忽略掉啦
     */
    @Test
    @Ignore
    public void TestIgnoreMethod() {

    }

    /**
     * @Describe 当然，你也可以使用value表明这个测试案例被忽略掉的原因
     */
    @Test
    @Ignore(value = "由于某种原因我不想测试这个方法")
    public void TestIgnoreMethodWithReason(){

    }

}
