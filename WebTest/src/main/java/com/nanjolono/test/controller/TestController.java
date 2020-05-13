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
       /* Map<String,Object> map = new TreeMap<>();
        map.put("business_code","222");
        map.put("channel_id","111");
        Map<String,String> contactInfo = new HashMap<>();
        contactInfo.put("name","zhangsan");
        contactInfo.put("mobile","17654324567");
        contactInfo.put("id_card_number","990088578294");
        map.put("contact_info",contactInfo);
        Map<String,Object> subjectInfo = new TreeMap<>();
        subjectInfo.put("subject_type","6");
        Map<String,String> businessLicenceInfo = new TreeMap<>();
        businessLicenceInfo.put("licence_number","914201123033363296");
        businessLicenceInfo.put("licence_copy","0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo");
        businessLicenceInfo.put("merchant_name","李四网络有限公司");
        businessLicenceInfo.put("legal_person","李四");
        businessLicenceInfo.put("company_address","广东省深圳市南山区xx路xx号");
        businessLicenceInfo.put("licence_valid_date","\\\"1970-01-01\\\",\\\"forever\\\"]");
        subjectInfo.put("business_licence_info",subjectInfo);
        map.put("subject_info",subjectInfo);*/
        String jsonStr = JSON.toJSONString(applyCertificationBean);
        return jsonStr;
    }

}
