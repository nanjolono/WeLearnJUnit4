package com.nanjolono.test.utils;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;


public class HttpUtils {
    /**
     * @Description:
     * @Param:
     * @return: 
     * @Author: nanjolono
     * @Date: 2020/10/8
     */
    public static ResponseEntity getForHttp(String url){
        RestTemplate template = new RestTemplate();
        ResponseEntity<String> entity = template.getForEntity(url,String.class);
        return entity;
    }

    public static ResponseEntity<String> postForHttp(String url, Map value){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity(url, value, String.class);
        return stringResponseEntity;
    }

}
