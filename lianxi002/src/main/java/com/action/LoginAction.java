package com.action;

import com.beans.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/*
 * 用于处理用户登录的业务控制器LoginAction类
 */
public class LoginAction extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = 1L;

	User user = new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() {
		if (user.getUseName().equals("jili") && user.getPassword().length() >= 6) {

			return SUCCESS;

		} else {
			return ERROR;
		}

	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
