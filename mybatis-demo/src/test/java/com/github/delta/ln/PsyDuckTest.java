package com.github.delta.ln;

import com.github.delta.ln.mapper.PsyDuckMapper;
import com.github.delta.ln.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * 可达鸭测试
 */
public class PsyDuckTest {

    @Test
    public void testCount() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        PsyDuckMapper mapper = sqlSession.getMapper(PsyDuckMapper.class);
        System.out.println(mapper.count());
    }
}
