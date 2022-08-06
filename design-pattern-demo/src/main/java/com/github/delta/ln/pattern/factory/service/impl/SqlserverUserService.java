package com.github.delta.ln.pattern.factory.service.impl;

import com.github.delta.ln.pattern.factory.entity.User;
import com.github.delta.ln.pattern.factory.service.IUserService;

/**
 * sqlserver 实现
 */
public class SqlserverUserService implements IUserService {

    @Override
    public void insertUser(User user) {
        System.out.println("Sqlserver -> insert user");
    }

    @Override
    public User getUser(int id) {
        User user = new User();
        user.setId(id);
        return user;
    }
}
