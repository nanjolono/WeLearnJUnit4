package com.nanjolono.test.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import static org.junit.Assert.*;
public class HttpUtilsTest {
    String url = "http://www.baidu.com";
    @Test
    public void test_Get() {
        ResponseEntity responseEntity = HttpUtils.getForHttp(url);
        System.out.println("返回状态码");
        System.out.println(responseEntity.getStatusCode());
        System.out.println("返回报文");
        System.out.println(responseEntity.getBody());
    }

    @Test
    public void test_Post() {
        MultiValueMap multiValueMap = new LinkedMultiValueMap();
        multiValueMap.add("1","2");
        ResponseEntity<String> stringResponseEntity = HttpUtils.postForHttp(url, multiValueMap);
        System.out.println("返回状态码");
        System.out.println(stringResponseEntity.getStatusCode());
        System.out.println("返回报文");
        System.out.println(stringResponseEntity.getBody());
    }
}