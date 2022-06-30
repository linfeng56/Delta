package com.github.delta.ln.pattern.factory.service;

import com.github.delta.ln.pattern.factory.entity.User;

public interface IUserService {

    void insertUser(User user);

    User getUser(int id);
}
