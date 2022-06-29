package com.github.delta.mfh.poi;

import com.github.delta.mfh.annotations.ExcelAnno;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.FillPatternType;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 马飞海
 * @version Copyright(C)2022 一站网版权所有  V1.0
 * @since 2022/6/20 下午2:48
 */
public class PoiOperation {

    public static <T> void toExcel(List<T> list){
        toExcel(list ,new HSSFWorkbook());
    }

    /**
     * 导出成excel
     * @param list 列表
     * @param <T> 通用实体
     */
    public static <T> void toExcel(List<T> list,HSSFWorkbook workbook){
        HSSFSheet sheet = workbook.createSheet();
        int i = 0;
        for(Object ob : list){
            if(i==0){
                setFirstRowAsTitle(ob, workbook, sheet);
                i=1;
            }
            HSSFRow nextRow = sheet.createRow(i);
            int j = 0;
            for(Field field : ob.getClass().getDeclaredFields()){
                if(field.isAnnotationPresent(ExcelExport.class)){
                    field.setAccessible(true);
                    try {
                        nextRow.createCell(j).setCellValue(String.valueOf(field.get(ob)));
                        if(field.get(ob) instanceof Date){
                            nextRow.createCell(j).setCellValue(new SimpleDateFormat("yyyy年MM月dd日 HH时mm分").format(field.get(ob)));
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    j++;
                }
            }
            i++;
        }
    }

    /**
     * 设置头部信息
     * @param ob 对象
     * @param workbook workbook
     * @param sheet sheet 第一栏
     * @return
     */
    private static void setFirstRowAsTitle(Object ob, HSSFWorkbook workbook, HSSFSheet sheet) {
        HSSFRow firstRow = sheet.createRow(0);
        Field[] fields = ob.getClass().getDeclaredFields();
        Annotation[] annotations = ob.getClass().getDeclaredAnnotations();
        Integer colWidth = 1000;
        for(Annotation annotation : annotations){
            if(annotation instanceof  ExcelTitle){
                colWidth =  ((ExcelTitle) annotation).colWidth();
            }
        }
        List<ExcelExport> list = new ArrayList<>();
        HSSFCellStyle style = workbook.createCellStyle();
        int i = 0;
        for(Field field : fields){
            if(field.isAnnotationPresent(ExcelExport.class))
            {
                ExcelExport excelExport = field.getAnnotation(ExcelExport.class);
                firstRow.createCell(i).setCellValue(excelExport.cellName());
                sheet.setColumnWidth(i, colWidth);
                // 前景颜色
                style.setFillForegroundColor(HSSFColor.HSSFColorPredefined.GREY_25_PERCENT.getIndex());
                // 填充方式，前色填充
                style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                firstRow.getCell(i).setCellStyle(style);
                list.add(excelExport);
                i++;
            }

        }
    }

}
