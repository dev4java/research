package com.yswsoft.base_web.build.core.auto;

/** 
 * 继承QuartzJobBean形式的定时任务 
 */  
  
  
import java.io.Serializable;
import java.text.SimpleDateFormat;  
import java.util.Date;  

import org.springframework.beans.factory.annotation.Autowired;

import com.yswsoft.base_web.build.core.entity.Talk;
import com.yswsoft.base_web.build.core.entity.User;
import com.yswsoft.base_web.build.core.service.serviceImpl.TalkServiceImpl;
import com.yswsoft.base_web.build.core.service.serviceImpl.UserServiceImpl;
import com.yswsoft.base_web.util.RandomUtil;
  
/** 
 * @author mhy2011@163.com 
 * @date 2013年12月21日 
 */  
public class ExampleJob2 {  
	@Autowired
	public UserServiceImpl userServiceImpl;
	@Autowired
	public TalkServiceImpl talkServiceImpl;
	
	/**
	 * 
	 * 随机
	 */
	private boolean addUser(){
		User u = new User();
		u.setName(RandomUtil.getName());
		u.setSex(RandomUtil.get0Or1());
		u.setAddr(RandomUtil.generateRandomCode(5, 2));
		u.setSign(1);
		Serializable uid = userServiceImpl.save(u);
		if(uid!=null){
			Talk t= new Talk();
			t.setUid(Long.parseLong(uid.toString()));
			t.setCreateTime(new java.sql.Date(0));
			t.setTalk(RandomUtil.getTalk());
		}
		return false;
		
	}
	
    /**
     * 仿微博用户
     * 定时插入说说数据，包含经纬度信息 
     */
    public void execute(){  
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "执行ExampleJob2");  
    }  
}   