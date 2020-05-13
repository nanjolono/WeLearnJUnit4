package com.nanjolono.test.controller;
import okhttp3.HttpUrl;

import java.io.UnsupportedEncodingException;
import java.security.*;
import java.util.Base64;
public class WxHttpUtils {
    static String yourMerchantId = "";
    static String yourCertificateSerialNo = "";
    static String url = "";
    static PrivateKey yourPrivateKey ;
    String schema = "WECHATPAY2-SHA256-RSA2048";
    HttpUrl httpurl = HttpUrl.parse(url);

    static String sign(byte[] message) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Signature sign = Signature.getInstance("SHA256withRSA");
        sign.initSign(yourPrivateKey);
        sign.update(message);

        return Base64.getEncoder().encodeToString(sign.sign());
    }

    public static String getToken(String method, HttpUrl url, String body) throws UnsupportedEncodingException, SignatureException, NoSuchAlgorithmException, InvalidKeyException {
        String nonceStr = "your nonce string";
        long timestamp = System.currentTimeMillis() / 1000;
        String message = buildMessage(method, url, timestamp, nonceStr, body);
        String signature = sign(message.getBytes("utf-8"));

        return "mchid=\"" + yourMerchantId + "\","
                + "nonce_str=\"" + nonceStr + "\","
                + "timestamp=\"" + timestamp + "\","
                + "serial_no=\"" + yourCertificateSerialNo + "\","
                + "signature=\"" + signature + "\"";
    }

    static String buildMessage(String method, HttpUrl url, long timestamp, String nonceStr, String body) {
        String canonicalUrl = url.encodedPath();
        if (url.encodedQuery() != null) {
            canonicalUrl += "?" + url.encodedQuery();
        }

        return method + "\n"
                + canonicalUrl + "\n"
                + timestamp + "\n"
                + nonceStr + "\n"
                + body + "\n";
    }
}
