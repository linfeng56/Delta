package com.github.delta.ln.pattern.factory.service.impl;

import com.github.delta.ln.pattern.factory.entity.Dept;
import com.github.delta.ln.pattern.factory.service.IDeptService;

/**
 * sqlserver 实现
 */
public class SqlserverDeptService implements IDeptService {

    @Override
    public void insertDept(Dept dept) {
        System.out.println("Sqlserver -> insert dept");
    }

    @Override
    public Dept getDept(int id) {
        Dept dept = new Dept();
        dept.setId(id);
        return dept;
    }
}
