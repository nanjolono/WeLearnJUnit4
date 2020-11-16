package com.nanjolono.test.utils;

/**
 * @program: test
 * @description: reg
 * @author: nanjolono
 * @create: 2020-11-16 14:28
 **/
public class RegTest {
    public static void main(String[] args) {
        String reg = "^([0-9]+\\.*[0-9]{1,12}\\,)*([0-9]+(\\.){0,1}[0-9]{1,12})*$";
        String[] s = {"0"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].matches(reg));
        }
    }
}
