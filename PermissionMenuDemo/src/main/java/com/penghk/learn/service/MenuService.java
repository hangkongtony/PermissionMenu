package com.penghk.learn.service;

import com.penghk.learn.domain.Menu;

import java.util.List;

public interface MenuService {
    public List<Menu> getAllMenu();

    List<Menu> getAllMenuByRole(int roleId);
}
