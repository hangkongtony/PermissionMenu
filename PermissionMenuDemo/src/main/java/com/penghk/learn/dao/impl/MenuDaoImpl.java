package com.penghk.learn.dao.impl;

import com.penghk.learn.dao.MenuDao;
import com.penghk.learn.domain.Menu;
import com.penghk.learn.domain.RoleMenuBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository("menuDao")
public class MenuDaoImpl implements MenuDao {

    @Autowired
    private SqlMapClientTemplate sqlMapClientTemplate;

    @Override
    public List<Menu> getAllMenu() {
        return sqlMapClientTemplate.queryForList("getAllMenu") ;
    }

    @Override
    public List<Menu> getAllMenuByRole(List<Integer> menuIds) {
        return sqlMapClientTemplate.queryForList("getAllMenuByRole",menuIds) ;
    }

    @Override
    public List<RoleMenuBean> getAllRoleMenuBean(int roleId) {
        return sqlMapClientTemplate.queryForList("getAllRoleMenuBean",roleId) ;
    }

}
