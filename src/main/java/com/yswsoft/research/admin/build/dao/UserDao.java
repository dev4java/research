package com.yswsoft.research.admin.build.dao;

import com.yswsoft.research.admin.build.entity.User;
import com.yswsoft.research.admin.core.dao.BaseDao;

public interface UserDao extends BaseDao<User>{
	public User getUserByName(String name);
}
