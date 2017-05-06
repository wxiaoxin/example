package com.king.example.web;

import com.king.example.service.StudentService;
import com.king.example.service.dto.StudentDTO;
import com.king.example.service.enums.StatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jianxin.wang on 2017/5/5.
 */

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/test")
    public ResponseEntity test() {
        StudentDTO studentDTO = StudentDTO.builder()
                .name("哈哈哈")
                .age((byte) 12)
                .status(StatusEnum.VALID)
                .build();
        studentService.save(studentDTO);

        return new ResponseEntity(HttpStatus.OK);
    }


}
