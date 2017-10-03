package com.penghk.learn.service.impl;

import com.penghk.learn.dao.MenuDao;
import com.penghk.learn.domain.Menu;
import com.penghk.learn.domain.RoleMenuBean;
import com.penghk.learn.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author penghk
 */
@Service("menuService")
@Transactional
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public List<Menu> getAllMenu() {
        return menuDao.getAllMenu();
    }

    /**
     * 根据角色查询相对应的菜单
     * @param roleId
     * @return
     */
    @Override
    public List<Menu> getAllMenuByRole(int roleId) {

        List<RoleMenuBean> roleMenuBeans = menuDao.getAllRoleMenuBean(roleId);
        List<Integer> menuIds = new ArrayList<Integer>();
        for(int i = 0;i<roleMenuBeans.size();i++){
            menuIds.add(roleMenuBeans.get(i).getMid());
        }
        return menuDao.getAllMenuByRole(menuIds);
    }
}
