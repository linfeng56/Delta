package com.github.delta.mfh.poi;

import com.github.delta.mfh.annotations.ExcelAnno;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 马飞海
 * @version Copyright(C)2022 一站网版权所有  V1.0
 * @since 2022/6/20 下午2:48
 */
public class PoiOperation {
    public static <T> void toExcel(List<T> list) throws IllegalAccessException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        List<ExcelAnno> annoList = setFirstRowAsTitle(list.get(0),sheet);
        int i = 1;
        for(Object ob : list){
            HSSFRow nextRow = sheet.createRow(i);
            for(ExcelAnno item : annoList){
                int j = 0;
                for(Field field : ob.getClass().getDeclaredFields()){
                    if(field.isAnnotationPresent(ExcelAnno.class)){
                        field.setAccessible(true);
                        nextRow.createCell(j).setCellValue(String.valueOf(field.get(ob)));
                        j++;
                    }
                }
            }
            i++;
        }
        try {
            OutputStream outputStream = new FileOutputStream("/data/home/sea/workspace/excel-to/test.xls");
            workbook.write(outputStream);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static  List<ExcelAnno> setFirstRowAsTitle(Object ob, HSSFSheet sheet){
        HSSFRow firstRow = sheet.createRow(0);
        Field[] fields = ob.getClass().getDeclaredFields();
        List<ExcelAnno> list = new ArrayList<>();
        int i = 0;
        for(Field field : fields){
            if(field.isAnnotationPresent(ExcelAnno.class))
            {

                ExcelAnno excelAnno = field.getAnnotation(ExcelAnno.class);
                firstRow.createCell(i).setCellValue(excelAnno.fieldName());
                list.add(excelAnno);
                i++;
            }

        }
        return list;
    }

}
