package com.lqh.template.dao;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.lqh.common.dao.impl.AbstractBaseDaoImp;
import com.lqh.template.model.User;

@Repository(value = "userDao")
@Scope("prototype")
public class UserDaoImpl extends AbstractBaseDaoImp<User> implements IUserDao {

	public UserDaoImpl() {
		super(User.class);
	}

	public User queryByUsername(String username) {
		
		String hql = "from User o where o.username = '" + username + "'";
		List<User> users = this.queryByHQL(hql);
		if(users != null && users.size() > 0) {
			return users.get(0);
		}
		
		return null;
	}

}
