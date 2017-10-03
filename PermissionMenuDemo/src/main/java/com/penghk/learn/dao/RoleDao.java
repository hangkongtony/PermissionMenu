package com.penghk.learn.dao;

import com.penghk.learn.domain.Role;
import com.penghk.learn.domain.RoleMenuBean;

import java.util.List;

public interface RoleDao {
    public List<Role> getAllRole();

    void deleteRoleMenuByRoleId(int roleId);

    void allocateRoleMenu(List<RoleMenuBean> roleMenuBeans);
}
