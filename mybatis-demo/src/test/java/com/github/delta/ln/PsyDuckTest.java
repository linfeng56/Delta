package com.github.delta.ln;

import com.github.delta.ln.mapper.PsyDuckMapper;
import com.github.delta.ln.pojo.PsyDuck;
import com.github.delta.ln.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * 可达鸭测试
 */
public class PsyDuckTest {


    @Test
    public void testInsert() {
        PsyDuck duck = new PsyDuck();
        duck.setId(1);
        duck.setName("可达鸭");
        duck.setSex(1);
        duck.setAge(8);
        duck.setRemark("力量-5,敏捷-3,智力-1");
        duck.setMarketId(1);

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        PsyDuckMapper mapper = sqlSession.getMapper(PsyDuckMapper.class);

        int count = mapper.insert(duck);
        System.out.println(count);
    }
}
