package com.lqh.template.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lqh.common.action.AbstractBaseAction;
import com.lqh.template.exception.PasswordNotCorrectException;
import com.lqh.template.exception.UserNotExistException;
import com.lqh.template.model.User;
import com.lqh.template.service.IUserService;

@Controller(value = "userLoginAction")
@Scope("prototype")
public class UserLoginAction extends AbstractBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6504863976560741913L;
	
	private String username;
	private String password;
	
	private User user;
	private List<User> users;
	
	private IUserService userService;
	
	public String userLogin() {
		try {
			user = userService.checkUser(username, password);			
			getSession().put("currentUser", user);			
			users = userService.queryAll();
		} catch (PasswordNotCorrectException e) {
			setErrorTip("password", "error");
			return "login";
		} catch (UserNotExistException e) {
			setErrorTip("username", "error");
			return "login";
		}
		return "userList";
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
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

	public IUserService getUserService() {
		return userService;
	}

	@Resource(name="userService")
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
}
