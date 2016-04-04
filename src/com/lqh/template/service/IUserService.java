package com.lqh.template.service;

import com.lqh.common.service.IService;
import com.lqh.template.model.User;

public interface IUserService extends IService<User>{

	public User checkUser(String username, String password);

}
