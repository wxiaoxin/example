package com.king.example.dao.mapper;

import com.king.example.dao.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by jianxin.wang on 2017/5/5.
 */

@Mapper
public interface StudentMapper {

    /**
     * 插入学生记录
     *
     * @param student
     * @return
     */
    int insert(Student student);

}
