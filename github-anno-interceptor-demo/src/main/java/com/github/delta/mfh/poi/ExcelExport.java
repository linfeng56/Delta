package com.github.delta.mfh.poi;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * excel导出注解
 * @author 马飞海
 * @version Copyright(C)2022 一站网版权所有  V1.0
 * @since 2022/6/29 下午2:29
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelExport {

    /**
     * 每一列的标题
     */
    String cellName() default "";

    /**
     * 宽度（像素）
     */
    int width() default 10;

    /**
     * 高度（像素）
     */
    int height() default 10;

    /**
     * 排序
     */
    int order() default 0;

}
