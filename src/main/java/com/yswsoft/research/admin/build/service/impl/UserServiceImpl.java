package com.yswsoft.research.admin.build.service.impl;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yswsoft.research.admin.build.dao.TalkDao;
import com.yswsoft.research.admin.build.dao.UserDao;
import com.yswsoft.research.admin.build.entity.Talk;
import com.yswsoft.research.admin.build.entity.User;
import com.yswsoft.research.admin.build.service.UserService;
import com.yswsoft.research.admin.core.dao.impl.BaseDaoImpl;
import com.yswsoft.research.common.util.RandomUtil;



@Service("userService")
@Transactional
public class UserServiceImpl extends BaseDaoImpl<User> implements UserService{
	@Autowired
	public UserDao userDao;
	
	@Autowired
	public TalkDao talkDao;

	@Override
	public User getUserByName(String name) {
		User u = userDao.getUserByName(name);
		return u;
	}
	
	//@Test
	public void autoAddUser(){
		long b=System.currentTimeMillis();
		User u = new User();
		Serializable uid = null;
		Talk t= null;
		String userName=RandomUtil.getName();
		User user = getUserByName(userName);
		if(user==null){
			u.setName(userName);
			u.setSex(RandomUtil.get0Or1());
			u.setAddr(RandomUtil.generateRandomCode(5, 2));
			u.setStatus(0);
			uid=userDao.save(u);
		}else{
			uid=user.getUid();
		}	
		if(uid!=null){
			t=new Talk();
			t.setUid(Long.parseLong(uid.toString()));
			t.setCreateTime(new Date());
			t.setTalk(RandomUtil.getTalk());
			t.setLon(RandomUtil.getString(RandomUtil.getLongitude(11525,11730)));
			t.setLat(RandomUtil.getString(RandomUtil.getLatitude(3926,4103)));
			t.setSign(1);
			Serializable tid = talkDao.save(t);
			long e=System.currentTimeMillis();
			long s=(e-b)/1000;
			if(tid!=null){
				System.out.println(s+" s---完成对---"+u.getName()+"    "+u.getSex()+"    "+t.getTalk()+"    "+t.getLon()+"    "+t.getLat());	
			}else{
				System.out.println(s+"err");
			}
			
		}
			
		//return false;
		
	}
}
