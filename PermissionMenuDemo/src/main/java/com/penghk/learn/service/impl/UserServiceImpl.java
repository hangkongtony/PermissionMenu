package com.penghk.learn.service.impl;

import com.penghk.learn.dao.UserDao;
import com.penghk.learn.domain.User;
import com.penghk.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public List<User> selectAllUsers()  {
        List<User> users =  userDao.selectAllUsers();
        return users;
    }

    @Override
    public User getUserByName(String loginName) {
        return userDao.getUserByName(loginName);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public boolean updateUser(User user) {
        return userDao.updateUser(user);
    }
}
