package com.king.example.service;

import com.king.example.service.dto.StudentDTO;
import com.king.example.service.enums.StatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jianxin.wang on 2017/5/6.
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void save() throws Exception {

        StudentDTO studentDTO = StudentDTO.builder()
                .name("呵呵呵")
                .age((byte) 12)
                .status(StatusEnum.VALID)
                .build();
        int row = studentService.save(studentDTO);

        Assert.assertEquals(1, row);
    }

}