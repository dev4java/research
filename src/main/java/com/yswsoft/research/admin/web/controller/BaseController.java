package com.yswsoft.research.admin.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.yswsoft.research.admin.core.entity.AdminUsr;
import com.yswsoft.research.admin.core.service.AdminUsrService;
@Controller
public class BaseController extends DispatcherServlet{

	private static final Logger log = LoggerFactory.getLogger(BaseController.class);

	/** serialVersionUID*/
	private static final long serialVersionUID = 1L;


	@Autowired
	public AdminUsrService adminUsrService;

	@RequestMapping(value="/admin/login",method=RequestMethod.GET)
	public ModelAndView getLogin(){
		ModelAndView model = new ModelAndView();
		model.setViewName("/admin/signin");
		return model;
	}


	/**
	* <p>Title: login</p>
	* <p>Description: 后台用户登陆</p>
	* <p>Copyright: Copyright © 2013 - Luole.com</p>
	* <p>Company: luoleTech</p>
	* @author yusw
	* @email yswthink@163.com
	* @date 2014年5月6日下午4:40:53
	* @version 1.0
	* @param request
	* @param response
	* @param session
	* @return
	 */
	@RequestMapping(value="/admin/login",method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		if(StringUtils.isBlank(name) || StringUtils.isBlank(password)){
			this.jsonError("请输入用户名或密码");
		}
		AdminUsr aUsr = adminUsrService.getUsrByUsrName(name);
		if(aUsr!=null){
			String dbPwd=aUsr.getPassword();
			if(password.equals(dbPwd)){
				session.setAttribute("isLogin", aUsr.getLoginName());
				session.setMaxInactiveInterval(30*60);//半小时
				return this.jsonSuccess("suc", "");
			}else{
				return this.jsonError("密码错误");
			}			
		}else{
			return this.jsonError("无此用户,请与管理员联系");
		}
	}

	/**
	* <p>Title: isLogin</p>
	* <p>Description: 判断用户是否登录</p>
	* <p>Copyright: Copyright © 2013 - Luole.com</p>
	* <p>Company: luoleTech</p>
	* @author yusw
	* @email yswthink@163.com
	* @date 2014年5月6日下午1:24:33
	* @version 1.0
	* @param request
	* @param response
	* @return
	 */
	public boolean isLogin(HttpSession session){
		boolean flag=false;
		Object login=session.getAttribute("isLogin");
		if(login != null){
			flag=true;
			System.out.println(login.toString());
		}
		return flag;
	}

	/**
	 * 返回错误提示
	 * @author shiyue[jianpingcao@sohu-inc.com][2011-12-16]
	 * @param msg
	 * @return
	 */
	protected ModelAndView jsonError(String msg) {
		ModelAndView view = new ModelAndView("res");
		try {
			JSONObject json = new JSONObject();
			json.put("status", 1);
			json.put("statusText", msg);
			json.put("data", "null");
			String res = json.toString();
			view.addObject("res", res);
		} catch (Exception e) {
			log.warn("json error", e.getMessage());
		}
		return view;
	}

	/**
	 * 返回成功提示
	 * @author shiyue[jianpingcao@sohu-inc.com][2011-12-16]
	 * @param msg
	 * @return
	 */
	protected ModelAndView jsonSuccess(String msg, Object data) {
		ModelAndView view = new ModelAndView("res");
		try {
			JSONObject json = new JSONObject();
			json.put("status", 0);
			json.put("statusText", msg);
			json.put("data", data);
			String res = json.toString();
			view.addObject("res", res);
		} catch (Exception e) {
			log.warn("json error", e.getMessage());
		}
		return view;
	}
}

