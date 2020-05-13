package com.nanjolono.test.TestClass;

import java.util.HashMap;

public class Test {
    public static void main(String args[]){
        String mchntId = new HashMap<String,String>(){{
            put("111","222");
            put("333","444");
        }}.get("111");
        System.out.println(mchntId);
    }
}
