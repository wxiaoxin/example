package com.king.example.service.enums;

/**
 * Created by jianxin.wang on 2017/5/6.
 *
 * 状态枚举
 */

public enum StatusEnum {

    DELETED((byte) -1, "删除"),
    INVALID((byte) 0, "无效"),
    VALID((byte) 1, "有效");

    private Byte value;

    private String name;

    StatusEnum(Byte value, String name) {
        this.value = value;
        this.name = name;
    }

    public Byte getValue() {
        return value;
    }

    public void setValue(Byte value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
