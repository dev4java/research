package com.yswsoft.research.admin.build.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yswsoft.research.admin.build.dao.TalkDao;
import com.yswsoft.research.admin.build.entity.Talk;
import com.yswsoft.research.admin.build.service.TalkService;
import com.yswsoft.research.admin.core.dao.impl.BaseDaoImpl;


@Service("talkService")
@Transactional
public class TalkServiceImpl extends BaseDaoImpl<Talk> implements TalkService{
	@Autowired
	public TalkDao talkDao;

}
