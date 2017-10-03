package com.penghk.learn.service;

import com.penghk.learn.domain.Role;

import java.util.List;

public interface RoleService {
    public List<Role> getAllRole();

    void allocateRoleMenu(int roleId, int[] mids);
}
