package com.king.example.service;

import com.king.example.service.dto.StudentDTO;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jianxin.wang on 2017/5/5.
 */

public interface StudentService {

    @Transactional
    int save(StudentDTO student);

}
