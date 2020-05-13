package com.nanjolono.test.junitTest;

import junit.framework.TestResult;
import org.junit.*;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class JunitTest extends TestResult {

    @BeforeClass
    public static void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterClass
    public static void afterTest(){
        System.out.println("After Test");
    }

    /**
     * 判断num的数值小于6
     */
    @Test(timeout=1000)
    @Ignore
    public void testNum() {
        //test data
        int num= 5;
        assertFalse(num > 6);
    }

    @Test(timeout=1000)
    public void testNotNull() {
        //test data
        String temp= null;
        assertNotNull(temp);
    }

    @Test
    public void testEquals() {
        //test data
        String str= "Junit is working fine";
        assertEquals("Junit is working fine", str);
    }

    @Test(timeout=100)
    public void infinity() {
        while(true);
    }

}
