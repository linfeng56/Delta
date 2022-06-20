package com.github.delta.mfh.entity;

import com.github.delta.mfh.annotations.ExcelAnno;

/**
 * @author 马飞海
 * @version Copyright(C)2022 一站网版权所有  V1.0
 * @since 2022/6/20 下午2:13
 */
public class DataEntity {

    @ExcelAnno(fieldName = "姓名")
    private String name;
    @ExcelAnno(fieldName = "住址")
    private String address;
    @ExcelAnno(fieldName = "年龄")
    private Integer age;
    @ExcelAnno(fieldName = "性别")
    private Integer sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
