package com.penghk.learn.domain;

public class User {

	private Integer id;
	private String loginName;
	private String password;
	private Integer roleId;
	private Integer state;

	public User() {
	}

	public User(Integer id, String loginName, String password, Integer roleId, Integer state) {
		this.id = id;
		this.loginName = loginName;
		this.password = password;
		this.roleId = roleId;
		this.state = state;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	
	
}
