package com.nanjolono.test.bean;

import java.util.Map;

public class SubjectInfo {

    private String subjectType;
    private Map<String,String> businessLicenceInfo;
    private Map<String,String> certificateInfo;
    private String companyProveCopy;
    private Map<String,String> assistProveInfo;

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public Map<String, String> getBusinessLicenceInfo() {
        return businessLicenceInfo;
    }

    public void setBusinessLicenceInfo(Map<String, String> businessLicenceInfo) {
        this.businessLicenceInfo = businessLicenceInfo;
    }

    public Map<String, String> getCertificateInfo() {
        return certificateInfo;
    }

    public void setCertificateInfo(Map<String, String> certificateInfo) {
        this.certificateInfo = certificateInfo;
    }

    public String getCompanyProveCopy() {
        return companyProveCopy;
    }

    public void setCompanyProveCopy(String companyProveCopy) {
        this.companyProveCopy = companyProveCopy;
    }

    public Map<String, String> getAssistProveInfo() {
        return assistProveInfo;
    }

    public void setAssistProveInfo(Map<String, String> assistProveInfo) {
        this.assistProveInfo = assistProveInfo;
    }

}
