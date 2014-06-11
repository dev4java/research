package com.yswsoft.base_web.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

import sun.misc.Request;

import com.yswsoft.base_web.core.entity.AdminUsr;
import com.yswsoft.base_web.core.service.AdminUsrService;
@Controller
@RequestMapping("/admin")
public class BaseController extends  DispatcherServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	public AdminUsrService adminUsrService;
	
	@Autowired
	public HttpSession session;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login(HttpServletRequest req,HttpServletResponse rep){
		ModelAndView model = new ModelAndView();
		String uName=req.getParameter("username");
		String uPwd=req.getParameter("userpwd");
		AdminUsr adminUsr=	adminUsrService.getUsrByUsrName(uName);
		if(adminUsr!=null){
				String dbUpwd=adminUsr.getPassword();
				if(dbUpwd.equals(uPwd)){
					model.setViewName("/admin/index");
				}
		}else{
			
		}
		return null;
		
	}

}
