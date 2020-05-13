package com.nanjolono.test.bean;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ApplyCertificationBean {
    private String channeId;
    private String businessCode;
    private Map<String,String> contactInfo;
    private SubjectInfo subjectInfo;
    private Map<String,String> identificationInfo = new TreeMap<>();

    public ApplyCertificationBean(){
    }

    @JSONField( name = "channe_id")
    public String getChanneId() {
        return channeId;
    }

    @JSONField( name = "channe_id")
    public void setChanneId(String channeId) {
        this.channeId = channeId;
    }

    @JSONField( name = "business_code")
    public String getBusinessCode() {
        return businessCode;
    }

    @JSONField( name = "business_code")
    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    @JSONField( name = "contact_info")
    public void setContactInfo(Map<String,String> contactInfo) {
        this.contactInfo = contactInfo;
    }

    @JSONField( name = "contact_info")
    public Map<String, String> getContactInfo() { return contactInfo;}

    @JSONField( name = "subject_info")
    public void setSubjectInfo(SubjectInfo subjectInfo) {
        this.subjectInfo = subjectInfo;
    }


    @JSONField( name = "subject_info")
    public SubjectInfo getSubjectInfo() {return subjectInfo; }

    @JSONField( name = "identification_info")
    public Map<String,String> getIdentificationInfo() {
        return identificationInfo;
    }

    @JSONField( name = "identification_info")
    public void setIdentificationInfo(Map<String,String> identificationInfo) {
        this.identificationInfo = identificationInfo;
    }
}
