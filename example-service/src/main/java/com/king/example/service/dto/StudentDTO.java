package com.king.example.service.dto;

import com.king.example.service.enums.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by jianxin.wang on 2017/5/6.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

    private Long id;

    private String name;

    private Byte age;


    private StatusEnum status;

    private Date createTime;

    private Date updateTime;

}
