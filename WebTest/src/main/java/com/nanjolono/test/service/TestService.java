package com.nanjolono.test.service;

import com.nanjolono.test.bean.Student;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.List;

public interface TestService {
    List<Student> getSth() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException;
}
