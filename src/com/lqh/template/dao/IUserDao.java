package com.lqh.template.dao;

import com.lqh.common.dao.IBaseDao;
import com.lqh.template.model.User;

public interface IUserDao extends IBaseDao<User>{

	public User queryByUsername(String username);

}
