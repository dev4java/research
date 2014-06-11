package com.yswsoft.base_web.core.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yswsoft.base_web.core.dao.AdminUsrDao;
import com.yswsoft.base_web.core.entity.AdminUsr;
import com.yswsoft.base_web.core.service.AdminUsrService;
@Service("adminUsrService")
@Transactional
public class AdminUsrServiceImpl implements AdminUsrService{
	@Autowired
	public AdminUsrDao adminUsrDao;
	@Override
	public AdminUsr getUsrByUsrName(String name) {
		return adminUsrDao.getUsrByUsrName(name);
	}}
