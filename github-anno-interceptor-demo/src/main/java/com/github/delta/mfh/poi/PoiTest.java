package com.github.delta.mfh.poi;

import com.github.delta.mfh.entity.DataEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 马飞海
 * @version Copyright(C)2022 一站网版权所有  V1.0
 * @since 2022/6/20 下午3:08
 */

public class PoiTest {

    @Test
    public void test() throws IllegalAccessException {
        List<DataEntity> list = new ArrayList<>();
        for(int i=0; i < 3;i++){
            DataEntity dataEntity = new DataEntity();
            dataEntity.setAge(i+10);
            dataEntity.setName(i+"-123");
            dataEntity.setAddress(i+"-hello");
            list.add(dataEntity);
        }
        PoiOperation.toExcel(list);
    }
}
