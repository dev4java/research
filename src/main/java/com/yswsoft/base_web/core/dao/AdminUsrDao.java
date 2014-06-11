package com.yswsoft.base_web.core.dao;

import java.util.List;

import com.yswsoft.base_web.core.entity.AdminUsr;

public interface AdminUsrDao  extends BaseDao<AdminUsr>{
	
	public List<AdminUsr> getListUsrByUsrName(String name);
	
	public AdminUsr getUsrByUsrName(String name);
}