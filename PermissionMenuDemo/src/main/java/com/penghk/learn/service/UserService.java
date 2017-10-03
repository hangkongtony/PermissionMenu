package com.penghk.learn.service;

import com.penghk.learn.domain.User;

import java.util.List;

public interface UserService {

    public List<User> selectAllUsers() ;

    User getUserByName(String loginName);

    User getUserById(int id);

    boolean updateUser(User user);
}
