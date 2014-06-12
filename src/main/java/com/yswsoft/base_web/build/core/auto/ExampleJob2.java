package com.yswsoft.base_web.build.core.auto;

/** 
 * 继承QuartzJobBean形式的定时任务 
 */  
  
  
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.yswsoft.base_web.build.core.entity.Talk;
import com.yswsoft.base_web.build.core.entity.User;
import com.yswsoft.base_web.build.core.service.TalkService;
import com.yswsoft.base_web.build.core.service.UserService;
import com.yswsoft.base_web.util.RandomUtil;
  
/** 
 * @author mhy2011@163.com 
 * @date 2013年12月21日 
 */  
public class ExampleJob2 {  
	@Autowired
	public UserService userService;
	@Autowired
	public TalkService talkService;
	
	/**
	 * 
	 * 随机
	 */
	private boolean addUser(){
		long b=System.currentTimeMillis();
		User u = new User();
		Talk t= null;
		u.setName(RandomUtil.getName());
		u.setSex(RandomUtil.get0Or1());
		u.setAddr(RandomUtil.generateRandomCode(5, 2));
		u.setSign(1);
		
		Serializable uid = userService.save(u);
		if(uid!=null){
			t=new Talk();
			//t.setUid(Long.parseLong(uid.toString()));
			t.setCreateTime(new java.sql.Date(0));
			t.setTalk(RandomUtil.getTalk());
			t.setLon(RandomUtil.getLongitude());
			t.setLat(RandomUtil.getLatitude());
			Serializable tid = talkService.save(t);
			long e=System.currentTimeMillis();
			long s=(e-b)/1000;
			if(tid!=null){
				System.out.println(s+" s---完成对---"+u.getName()+"    "+u.getSex()+"    "+t.getTalk()+"    "+t.getLon()+"    "+t.getLat());	
			}else{
				System.out.println(s+"err");
			}
			
		}
			
		return false;
		
	}
	
    /**
     * 仿微博用户
     * 定时插入说说数据，包含经纬度信息 
     */
    public void execute(){  
    	addUser();
       // System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "执行ExampleJob2");  
    }  
}   