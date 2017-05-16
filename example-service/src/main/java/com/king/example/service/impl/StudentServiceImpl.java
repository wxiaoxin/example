package com.king.example.service.impl;

import com.king.example.dao.entity.Student;
import com.king.example.dao.mapper.StudentMapper;
import com.king.example.service.StudentService;
import com.king.example.service.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jianxin.wang on 2017/5/5.
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int save(StudentDTO studentDTO) {
        Student student = Student.builder()
                .age(studentDTO.getAge())
                .name(studentDTO.getName())
                .status(studentDTO.getStatus().getValue())
                .build();
        int row = studentMapper.insert(student);

        int i = 1 / 0;

        return row;
    }
}
