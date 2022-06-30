package com.github.delta.ln.pattern.factory;

import com.github.delta.ln.pattern.factory.service.IDeptService;
import com.github.delta.ln.pattern.factory.service.IUserService;
import com.github.delta.ln.pattern.factory.service.impl.SqlserverDeptService;
import com.github.delta.ln.pattern.factory.service.impl.SqlserverUserService;

/**
 * sqlserver 工厂
 */
public class SqlserverFactory implements IFactory{
    @Override
    public IUserService createUser() {
        return new SqlserverUserService();
    }

    @Override
    public IDeptService createDept() {
        return new SqlserverDeptService();
    }
}
