package com.penghk.learn.dao;

import com.penghk.learn.domain.Menu;
import com.penghk.learn.domain.RoleMenuBean;

import java.util.List;

public interface MenuDao {
    public List<Menu> getAllMenu();

    List<Menu> getAllMenuByRole(List<Integer> menuIds);

    List<RoleMenuBean> getAllRoleMenuBean(int roleId);
}
