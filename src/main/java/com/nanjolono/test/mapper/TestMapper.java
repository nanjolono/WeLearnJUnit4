package com.nanjolono.test.mapper;

import com.nanjolono.test.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestMapper {

    List<Student> getStudentList();

}
