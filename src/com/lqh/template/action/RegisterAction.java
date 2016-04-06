package com.lqh.template.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lqh.common.action.AbstractBaseAction;
import com.lqh.template.model.User;
import com.lqh.template.service.IUserService;

@Controller(value = "registerAction")
@Scope("prototype")
public class RegisterAction extends AbstractBaseAction {

	private static final long serialVersionUID = 1L;
	private IUserService userService;
	
	private String username;
	private String password;
	private String confirmPassword;
	private int age;
	
	public String register() throws Exception {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setNickname(username);
		user.setAge(age);
		
		userService.add(user);
		
		getSession().put("currentUser", user);
		return "success";
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Resource(name="userService")
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
}
