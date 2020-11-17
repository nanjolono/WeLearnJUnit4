package com.nanjolono.test.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.nanjolono.test.bean.ApplyCertificationBean;
import com.nanjolono.test.bean.SubjectInfo;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@RestController
public class TestController {

    @GetMapping(name = "testBean")
    public Object getBean(){
        ApplyCertificationBean applyCertificationBean = new ApplyCertificationBean();
        applyCertificationBean.setChanneId("123123");
        applyCertificationBean.setBusinessCode("122343112");
        SubjectInfo subjectInfo = new SubjectInfo();
        subjectInfo.setCompanyProveCopy("123123");
        subjectInfo.setSubjectType("123123dasd");
        HashMap<String,String> map = new HashMap<>();
        map.put("cxajsda","asdasdasd");
        subjectInfo.setAssistProveInfo(map);
        applyCertificationBean.setSubjectInfo(subjectInfo);
        String jsonStr = JSON.toJSONString(applyCertificationBean);
        return jsonStr;
    }

}
