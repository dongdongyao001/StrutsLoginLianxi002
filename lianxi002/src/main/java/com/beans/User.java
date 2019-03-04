package com.beans;

/*
 * 0305
 * 创建实体POJO层
 * 创建实体User
 */
public class User {
	private String useName;
	private String password;

	public User() {
		// TODO 自动生成的构造函数存根
	}

	public User(String useName, String password) {
		super();
		this.useName = useName;
		this.password = password;
	}

	public String getUseName() {
		return useName;
	}

	public void setUseName(String useName) {
		this.useName = useName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
