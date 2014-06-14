package com.yswsoft.research.admin.build.dao.impl;

import org.springframework.stereotype.Repository;

import com.yswsoft.research.admin.build.dao.TalkDao;
import com.yswsoft.research.admin.build.entity.Talk;
import com.yswsoft.research.admin.core.dao.impl.BaseDaoImpl;
@Repository("talkDao")
public class TalkDaoImpl extends BaseDaoImpl<Talk> implements TalkDao{
	
}

