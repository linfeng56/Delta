package com.github.delta.ln;

import com.github.delta.ln.mapper.ToysMarketMapper;
import com.github.delta.ln.pojo.ToysMarket;
import com.github.delta.ln.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ToysMarketTest {

    @Test
    public void testInsert() {
        ToysMarket market = new ToysMarket();
        market.setId(1);
        market.setName("第" + market.getId() + "玩具市场");

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ToysMarketMapper mapper = sqlSession.getMapper(ToysMarketMapper.class);

        int count = mapper.insert(market);

        System.out.println(count);
    }
}
