package com.nanjolono.test.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;
import org.springframework.util.Assert;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

@RunWith(PowerMockRunner.class)
public class WxHttpUtilsTest {


    @Before
    public void init(){
        PowerMockito.mockStatic(WxHttpUtils.class);
    }

    /**
     * mock私有方法
     * @throws Exception
     */
    @Test
    @PrepareForTest(WxHttpUtils.class)
    public void getPrivate() throws Exception {
        //given
        String te = "test";
        PowerMockito.spy(WxHttpUtils.class);
        PowerMockito.doReturn("test").when(WxHttpUtils.class,"privateTest",te);
        //when
        String sth = WxHttpUtils.getPrivate(te);
        //then
        assertEquals(sth,te);
    }
}