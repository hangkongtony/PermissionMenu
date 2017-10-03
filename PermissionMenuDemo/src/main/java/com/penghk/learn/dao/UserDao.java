package com.penghk.learn.dao;

import com.penghk.learn.domain.User;

import java.util.List;

public interface UserDao {

    /**
     * 获取所有用户
     * @return
     */
    public List<User> selectAllUsers();

    /**
     * 根据用户名获取用户
     * @param loginName
     * @return
     */
    public User getUserByName(String loginName);

    User getUserById(int id);

    boolean updateUser(User user);
}
