package com.yswsoft.research.admin.build.dao.impl;

import org.springframework.stereotype.Repository;

import com.yswsoft.research.admin.build.dao.UserDao;
import com.yswsoft.research.admin.build.entity.User;
import com.yswsoft.research.admin.core.dao.impl.BaseDaoImpl;
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	@Override
	public User getUserByName(String name) {
		return this.queryForObject("from User where name = ?", new Object[] { name });
	}

}
