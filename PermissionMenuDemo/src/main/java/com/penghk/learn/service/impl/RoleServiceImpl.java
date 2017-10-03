package com.penghk.learn.service.impl;

import com.penghk.learn.dao.RoleDao;
import com.penghk.learn.domain.Role;
import com.penghk.learn.domain.RoleMenuBean;
import com.penghk.learn.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> getAllRole() {
        return roleDao.getAllRole();
    }

    /**
     * 根据角色id删除所有的角色菜单记录，再插入新的记录
     * @param roleId
     * @param mids
     */
    @Transactional
    @Override
    public void allocateRoleMenu(int roleId, int[] mids) {
        roleDao.deleteRoleMenuByRoleId(roleId);
        List<RoleMenuBean> roleMenuBeans = new ArrayList<RoleMenuBean>();
        for(int i = 0;i<mids.length;i++){
            RoleMenuBean roleMenuBean = new RoleMenuBean();
            roleMenuBean.setMid(mids[i]);
            roleMenuBean.setRoleId(roleId);
            roleMenuBeans.add(roleMenuBean);
        }
        roleDao.allocateRoleMenu(roleMenuBeans);
    }
}
