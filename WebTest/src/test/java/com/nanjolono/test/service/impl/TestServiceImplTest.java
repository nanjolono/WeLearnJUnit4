package com.nanjolono.test.service.impl;

import com.nanjolono.test.controller.WxHttpUtils;
import com.nanjolono.test.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.util.Assert;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

import static org.junit.Assert.*;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

@RunWith(PowerMockRunner.class)
public class TestServiceImplTest {

    @InjectMocks
    TestServiceImpl testService;

    @Mock
    WxHttpUtils wxHttpUtils;

    /**
     * mock静态方法
     * @throws NoSuchAlgorithmException
     * @throws SignatureException
     * @throws InvalidKeyException
     */
    @Test
    @PrepareForTest(WxHttpUtils.class)
    public void staticTest() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        //given
        mockStatic(WxHttpUtils.class);
        PowerMockito.when(WxHttpUtils.sign("!23".getBytes(StandardCharsets.UTF_8))).thenReturn("null");
        //when
        String sth = testService.getSth();
        //then
        Assert.notNull(sth);
    }

}