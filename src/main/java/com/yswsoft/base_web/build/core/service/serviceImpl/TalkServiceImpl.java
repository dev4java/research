package com.yswsoft.base_web.build.core.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.yswsoft.base_web.build.core.entity.Talk;
import com.yswsoft.base_web.build.core.service.TalkService;
import com.yswsoft.base_web.core.dao.impl.BaseDaoImpl;


@Service("talkService")
public class TalkServiceImpl extends BaseDaoImpl<Talk> implements TalkService{

}
