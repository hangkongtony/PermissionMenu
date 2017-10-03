package com.penghk.learn.dao.impl;

import com.penghk.learn.dao.RoleDao;
import com.penghk.learn.domain.Role;
import com.penghk.learn.domain.RoleMenuBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    @Autowired
    SqlMapClientTemplate sqlMapClientTemplate;

    @Override
    public List<Role> getAllRole() {
        return sqlMapClientTemplate.queryForList("getAllRole");
    }

    @Override
    public void deleteRoleMenuByRoleId(int roleId) {
         sqlMapClientTemplate.delete("deleteRoleMenuByRoleId" ,roleId);
    }

    @Override
    public void allocateRoleMenu(List<RoleMenuBean> roleMenuBeans) {
        sqlMapClientTemplate.insert("allocateRoleMenu" ,roleMenuBeans);

    }
}
