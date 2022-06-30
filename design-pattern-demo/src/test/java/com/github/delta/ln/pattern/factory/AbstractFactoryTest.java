package com.github.delta.ln.pattern.factory;

import com.github.delta.ln.pattern.factory.entity.Dept;
import com.github.delta.ln.pattern.factory.entity.User;
import com.github.delta.ln.pattern.factory.service.IDeptService;
import com.github.delta.ln.pattern.factory.service.IUserService;
import org.junit.Assert;
import org.junit.Test;

/**
 * 抽象工厂模式测试
 */
public class AbstractFactoryTest {

    @Test
    public void testMysqlUserService(){
        User user = new User();
        user.setId(1);
        user.setUserName("用户1");

        IFactory factory = new MysqlFactory();
        IUserService userService = factory.createUser();

        userService.insertUser(user);
    }

    @Test
    public void testSqlserverUserService(){
        IFactory factory = new SqlserverFactory();
        IUserService userService = factory.createUser();

        User user = userService.getUser(1);
        Assert.assertEquals(user.getId(), 1);
    }

    @Test
    public void testMysqlDeptService(){
        Dept dept = new Dept();
        dept.setId(1);
        dept.setDeptName("部门1");

        IFactory factory = new MysqlFactory();
        IDeptService deptService = factory.createDept();

        deptService.insertDept(dept);
    }

    @Test
    public void testSqlserverDeptService(){
        IFactory factory = new SqlserverFactory();
        IDeptService deptService = factory.createDept();

        Dept dept = deptService.getDept(1);
        Assert.assertEquals(dept.getId(), 1);
    }
}
