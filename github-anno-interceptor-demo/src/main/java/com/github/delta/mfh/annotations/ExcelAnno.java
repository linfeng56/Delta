package com.github.delta.mfh.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author 马飞海
 * @version Copyright(C)2022 一站网版权所有  V1.0
 * @since 2022/6/20 下午2:15
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelAnno {
    String fieldName() default "";
    int width() default 10;
    int height() default 10;
}
