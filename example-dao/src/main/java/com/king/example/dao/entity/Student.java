package com.king.example.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by jianxin.wang on 2017/5/5.
 *
 * 学生实体类
 */

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Long id;

    private String name;

    private Byte age;


    private Byte status;

    private Date createTime;

    private Date updateTime;

}
