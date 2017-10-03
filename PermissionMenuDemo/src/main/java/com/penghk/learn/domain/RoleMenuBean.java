package com.penghk.learn.domain;

/**
 * 角色对应的菜单
 */
public class RoleMenuBean {
    private Integer roleId;
    private Integer mid;

    public RoleMenuBean() {
    }

    public RoleMenuBean(Integer roleId, Integer mid) {
        this.roleId = roleId;
        this.mid = mid;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }
}
