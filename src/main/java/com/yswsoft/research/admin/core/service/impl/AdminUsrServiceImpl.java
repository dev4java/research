package com.yswsoft.research.admin.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yswsoft.research.admin.core.dao.AdminUsrDao;
import com.yswsoft.research.admin.core.entity.AdminUsr;
import com.yswsoft.research.admin.core.service.AdminUsrService;
@Service("adminUsrService")
@Transactional
public class AdminUsrServiceImpl implements AdminUsrService{
	@Autowired
	public AdminUsrDao adminUsrDao;
	@Override
	public AdminUsr getUsrByUsrName(String name) {
		return adminUsrDao.getUsrByUsrName(name);
	}}
