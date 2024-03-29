package com.github.delta.cxw.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 数据库工具类
 */
public class DatabaseUtil {

    /**
     * 获取sql会话
     *
     * @return
     */
    public static SqlSession getSqlSession() {
        try {
            //加载mybatis配置文件
            InputStream is = Resources.getResourceAsStream("cxw/mybatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            //设置自动提交事务
            SqlSession sqlSession = factory.openSession(true);
            return sqlSession;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
