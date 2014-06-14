package com.yswsoft.research.admin.core.dao;

import java.util.List;

import com.yswsoft.research.admin.core.entity.AdminUsr;



public interface AdminUsrDao  extends BaseDao<AdminUsr>{
	
	public List<AdminUsr> getListUsrByUsrName(String name);
	
	public AdminUsr getUsrByUsrName(String name);
}