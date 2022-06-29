package com.github.delta.mfh.poi;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author 马飞海
 * @version Copyright(C)2022 一站网版权所有  V1.0
 * @since 2022/6/29 下午4:30
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelTitle {
    String title() default "title";
    int colWidth() default 1000;
}
