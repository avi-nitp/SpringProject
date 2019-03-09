package com.avinash.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.avinash.model.Employee;
import com.avinash.service.EmployeeService;

@Controller
public class EmployeeController {
      @Autowired
      EmployeeService employeeService;
        
     	
     	@RequestMapping("/allEmployees")
     	public ModelAndView showAllEmployees(){
     		ModelAndView mv=new ModelAndView();
     	     ArrayList<Employee>result=null;
     	    try {
     			result=employeeService.getAllEmployee();
     		} catch (ClassNotFoundException | SQLException e) {
     			// TODO Auto-generated catch block
     			e.printStackTrace();
     		}
     	   mv.addObject("empList",result);
     	   mv.setViewName("AllEmployees");
     		return mv;
     	}
     	
    	@RequestMapping("/showInsertEmployee")
     	public ModelAndView showInsert(){
     		ModelAndView mv=new ModelAndView();
     		mv.addObject("command", new Employee());
     	   mv.setViewName("EmployeeInsertion");
     		return mv;
     	}
     	
     	@RequestMapping("/insertEmployee")
     	public ModelAndView insertEmployee(@ModelAttribute Employee emp){
     		ModelAndView mv=new ModelAndView();
     	    boolean result=false;
     	    try {
     			result=employeeService.insertEmployee(emp);
     		} catch (ClassNotFoundException | SQLException e) {
     			// TODO Auto-generated catch block
     			e.printStackTrace();
     		}
     	   mv.addObject("isInserted",result);
     	   mv.setViewName("insertionMsg");
     		return mv;
     	}
}
