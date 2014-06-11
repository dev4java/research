package com.yswsoft.base_web.build.core.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.yswsoft.base_web.build.core.entity.User;
import com.yswsoft.base_web.build.core.service.UserService;
import com.yswsoft.base_web.core.dao.impl.BaseDaoImpl;

@Service("userServiceImpl")
public class UserServiceImpl extends BaseDaoImpl<User> implements UserService{

}