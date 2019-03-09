package com.avinash.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.avinash.model.Admin;
import com.avinash.service.AdminService;


@Controller
public class MyController {
     @Autowired
     AdminService adminService;
	@RequestMapping("/")
	public ModelAndView first(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("command", new Admin());
		mv.setViewName("First");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView myCalculator(@ModelAttribute Admin admin){
		ModelAndView mv=new ModelAndView();
		String username=admin.getUsername();
		String password=admin.getPassword();
	    try {
			if(adminService.isValidUser(username, password))
			mv.setViewName("loginSucess");
			else
				mv.setViewName("loginFailure");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mv;
	}
}
