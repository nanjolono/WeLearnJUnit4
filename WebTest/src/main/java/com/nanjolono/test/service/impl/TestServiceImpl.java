package com.nanjolono.test.service.impl;

import com.nanjolono.test.controller.WxHttpUtils;
import com.nanjolono.test.service.TestService;
import okhttp3.HttpUrl;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

public class TestServiceImpl implements TestService {
    @Override
    public String getSth() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return WxHttpUtils.sign("!23".getBytes(StandardCharsets.UTF_8));
    }
}
