package com.yswsoft.research.admin.core.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yswsoft.research.admin.core.dao.AdminUsrDao;
import com.yswsoft.research.admin.core.entity.AdminUsr;
@Repository("adminUsrDao")
public class AdminUsrDaoImpl extends BaseDaoImpl<AdminUsr> implements AdminUsrDao{

	@Override
	public AdminUsr getUsrByUsrName(String name) {
		return this.queryForObject("from AdminUsr where loginName = ?", new Object[] { name });
	}

	@Override
	public List<AdminUsr> getListUsrByUsrName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}