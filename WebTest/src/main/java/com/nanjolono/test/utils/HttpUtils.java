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
    public static ResponseEntity<Map> getForHttp(String url){
        RestTemplate template = new RestTemplate();
        return template.getForEntity(url,Map.class);
    }

    public static ResponseEntity<Map> postForHttp(String url, Map<Object,Object> value){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(url, value, Map.class);
    }

}
