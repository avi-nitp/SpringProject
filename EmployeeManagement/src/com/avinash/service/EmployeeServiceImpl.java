package com.avinash.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avinash.model.Employee;
import com.avinash.persistence.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDao employeeDao;
	@Override
	public ArrayList<Employee> getAllEmployee() throws ClassNotFoundException, SQLException {
	           return employeeDao.getAllEmployee();
	}
	@Override
	public boolean insertEmployee(Employee emp) throws ClassNotFoundException, SQLException {
		return employeeDao.insertEmployee(emp);
	}

}
