package com.lqh.template.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lqh.common.action.AbstractBaseAction;
import com.lqh.template.model.User;
import com.lqh.template.service.IUserService;

@Controller(value = "userListAction")
@Scope("prototype")
public class UserListAction extends AbstractBaseAction {

	private static final long serialVersionUID = 2294834740743323838L;
	
	private List<User> users;
	private IUserService userService;
	
	public String userList() {
		users = userService.queryAll();
		return "userList";
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public IUserService getUserService() {
		return userService;
	}

	@Resource(name="userService")
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

}
