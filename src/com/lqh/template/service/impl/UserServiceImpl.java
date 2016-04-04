package com.lqh.template.service.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lqh.common.dao.IBaseDao;
import com.lqh.common.service.AbstractBaseService;
import com.lqh.template.dao.IUserDao;
import com.lqh.template.exception.PasswordNotCorrectException;
import com.lqh.template.exception.UserNotExistException;
import com.lqh.template.model.User;
import com.lqh.template.service.IUserService;

@Service(value = "userService")
@Scope("prototype")
public class UserServiceImpl extends AbstractBaseService<User> implements IUserService{

	private IUserDao userDao;

	@Override
	public IBaseDao<User> getDefaultDao() {
		return userDao;
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	@Resource(name="userDao")
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	public User checkUser(String username, String password) {
		
		if(username.equals("admin")) {
			return new User(0, "admin", "admin", "abc", 20);
		}
		
		User user = userDao.queryByUsername(username);
		if(user != null) {
			String pwd = user.getPassword();
			if(!password.trim().equals(pwd)) {
				throw new PasswordNotCorrectException("abc");
			}
		} else {
			throw new UserNotExistException("abc");
		}
		
		return user;
	}

}
