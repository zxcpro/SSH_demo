package com.lqh.template.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lqh.common.action.AbstractBaseAction;
import com.lqh.template.model.User;
import com.lqh.template.service.IUserService;

@Controller(value = "loginAction")
@Scope("prototype")
public class LoginAction extends AbstractBaseAction {

	private static final long serialVersionUID = 1L;
	
	private IUserService userService;
	
	private String username;
	private String password;
	
	public String login() {
		User user = userService.checkUser(username, password);
		if (user != null) {
			getSession().put("currentUser", user);
			return "success";
		}
		return "login";
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Resource(name="userService")
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
}
