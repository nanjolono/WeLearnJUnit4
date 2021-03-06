package com.nanjolono.test.service.impl;

import com.nanjolono.test.bean.Student;
import com.nanjolono.test.mapper.TestMapper;
import com.nanjolono.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Student> getSth() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return testMapper.getStudentList();
    }

    @Override
    public List<? super Student> getStudent(List<? super Student> students) {
        return students;
    }

    private static StringBuffer getStr(){
        ReentrantLock reentrantLock = new ReentrantLock();
        return null;
    }
}
