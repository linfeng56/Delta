package com.github.delta.ln.pattern.factory;

import com.github.delta.ln.pattern.factory.service.IDeptService;
import com.github.delta.ln.pattern.factory.service.IUserService;
import com.github.delta.ln.pattern.factory.service.impl.MysqlDeptService;
import com.github.delta.ln.pattern.factory.service.impl.MysqlUserService;

/**
 * mysql 工厂
 */
public class MysqlFactory implements IFactory {
    @Override
    public IUserService createUser() {
        return new MysqlUserService();
    }

    @Override
    public IDeptService createDept() {
        return new MysqlDeptService();
    }
}
