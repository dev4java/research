package com.yswsoft.base_web.build.core.service.serviceImpl;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.yswsoft.base_web.build.core.entity.Talk;
import com.yswsoft.base_web.build.core.service.TalkService;
import com.yswsoft.base_web.core.dao.impl.BaseDaoImpl;


@Repository("talkService")
public class TalkServiceImpl extends BaseDaoImpl<Talk> implements TalkService{

}
