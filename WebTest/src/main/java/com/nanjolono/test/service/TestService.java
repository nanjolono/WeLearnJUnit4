package com.nanjolono.test.service;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

public interface TestService {
    String getSth() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException;
}
