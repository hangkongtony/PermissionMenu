package com.penghk.learn.dao.impl;

import com.penghk.learn.dao.UserDao;
import com.penghk.learn.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private SqlMapClientTemplate sqlMapClientTemplate;

    @Override
    public List<User> selectAllUsers() {
        return sqlMapClientTemplate.queryForList("selectAllUsers");
    }

    @Override
    public User getUserByName(String loginName) {
        return (User) sqlMapClientTemplate.queryForObject("getUserByName",loginName);
    }

    @Override
    public User getUserById(int id) {
        return (User) sqlMapClientTemplate.queryForObject("getUserById",id);
    }

    @Override
    public boolean updateUser(User user) {
        int updateCount = sqlMapClientTemplate.update("updateUser",user);
        if(updateCount>0){
            return true;
        }
        return false;
    }
}
