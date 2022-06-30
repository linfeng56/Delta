package com.github.delta.ln.pattern.factory.service;

import com.github.delta.ln.pattern.factory.entity.Dept;

public interface IDeptService {

    void insertDept(Dept dept);

    Dept getDept(int id);
}
