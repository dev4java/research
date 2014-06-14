package com.yswsoft.research.admin.build.auto;

/** 
 * 继承QuartzJobBean形式的定时任务 
 */  
  
  
import org.springframework.beans.factory.annotation.Autowired;

import com.yswsoft.research.admin.build.service.TalkService;
import com.yswsoft.research.admin.build.service.UserService;
/** 
 * @author mhy2011@163.com 
 * @date 2013年12月21日 
 */  
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:/spring/applicationContext-db.xml")
public class ExampleJob2 {  
	@Autowired
	public UserService userService;
	@Autowired
	public TalkService talkService;
	


	
    /**
     * 仿微博用户
     * 定时插入说说数据，包含经纬度信息 
     */
	//@Test
    public void execute(){  
    	userService.autoAddUser();
       // System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "执行ExampleJob2");  
    }  
}   