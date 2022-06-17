package com.github.delta.cxw;

import com.github.delta.cxw.mapper.UserMapper;
import com.github.delta.cxw.pojo.User;
import com.github.delta.cxw.util.DatabaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * MyBatis测试类
 */
public class MyBatisTest {

    /**
     * SqlSession默认不自动提交事务，若需要自动提交事务
     * 可以使用SqlSessionFactory.openSession(true);
     */


    @Test
    public void testMyBatis() throws IOException {
        //获取SqlSession
        SqlSession sqlSession = DatabaseUtil.getSqlSession();
        //获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //测试功能
        int result = mapper.insertUser();
        //提交事务
        //sqlSession.commit();
        System.out.println("result:"+result);
    }

    @Test
    public void testCRUD() throws IOException {
        SqlSession sqlSession = DatabaseUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //mapper.updateUser();
        //mapper.deleteUser();
        User user = mapper.getUserById();
        System.out.println(user);
        List<User> list = mapper.getAllUser();
    }

}
