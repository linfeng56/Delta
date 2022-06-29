package com.github.delta.mfh.entity;

import com.github.delta.mfh.annotations.ExcelAnno;
import com.github.delta.mfh.poi.ExcelExport;
import com.github.delta.mfh.poi.ExcelTitle;

import java.util.Date;

/**
 * @author 马飞海
 * @version Copyright(C)2022 一站网版权所有  V1.0
 * @since 2022/6/20 下午2:13
 */
@ExcelTitle(title = "测试标题", colWidth = 5000)
public class DataEntity {
    @ExcelExport(cellName = "住址")
    private String address;
    @ExcelExport(cellName = "年龄")
    private Integer age;
    @ExcelExport(cellName = "姓名")
    private String name;
    @ExcelExport(cellName = "性别")
    private Integer sex;
    @ExcelExport(cellName = "生日")
    private Date birth;

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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
