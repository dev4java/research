package com.yswsoft.research.admin.build.service;

import com.yswsoft.research.admin.build.entity.User;
import com.yswsoft.research.admin.core.dao.BaseDao;

public interface UserService extends BaseDao<User>{
	
	public User getUserByName(String name);
	
	public void autoAddUser();

}
