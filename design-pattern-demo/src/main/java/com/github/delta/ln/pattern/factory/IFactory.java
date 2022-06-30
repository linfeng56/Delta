package com.github.delta.ln.pattern.factory;

import com.github.delta.ln.pattern.factory.service.IDeptService;
import com.github.delta.ln.pattern.factory.service.IUserService;

/**
 * 抽象工厂模式
 */
public interface IFactory {

    IUserService createUser();

    IDeptService createDept();
}
