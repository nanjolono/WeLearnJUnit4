package com.nanjolono.test.service.impl;

import com.nanjolono.test.bean.OldSchoolStudent;
import com.nanjolono.test.bean.Student;
import com.nanjolono.test.utils.WxHttpUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class TestServiceImplTest {

    //@InjectMocks
    @InjectMocks
    TestServiceImpl testService;

    @Mock
    WxHttpUtils wxHttpUtils;


    /**
     * mock静态方法
     * @throws NoSuchAlgorithmException
     * @throws SignatureException
     * @throws InvalidKeyException
     */
    @Test
    @PrepareForTest(WxHttpUtils.class)
    @Ignore
    public void staticTest() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        //given
        mockStatic(WxHttpUtils.class);
        PowerMockito.when(WxHttpUtils.sign("!23".getBytes(StandardCharsets.UTF_8))).thenReturn("null");
        //when
        List<Student> sth = testService.getSth();
        //then
        Assert.notNull(sth);
    }

    @Test
    public void staticGetStudent() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        //when
        List<Student> sth = testService.getSth();
        //then
        Assert.notEmpty(sth,"查询无消息");
    }

    @Test
    public void getStudet(){
        Student s = new Student();
        OldSchoolStudent oldSchoolStudent = new OldSchoolStudent();
        List<? super Student> students = new ArrayList<>();
        students.add(s);
        students.add(oldSchoolStudent);
        List<? super Student> student = testService.getStudent(students);
        System.out.println(student.toString());
        assertNotNull(student);
    }
}