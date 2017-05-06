package com.king.example.dao.mapper;

import com.king.example.dao.entity.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jianxin.wang on 2017/5/5.
 *
 * StudentMapper 单元测试类
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentMapperTest {


    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void insert() throws Exception {
        Student student = Student.builder()
                .name("哈哈哈")
                .age((byte) 22)
                .status((byte) 1)
                .build();
        int row = studentMapper.insert(student);

        Assert.assertEquals(1, row);
    }

}