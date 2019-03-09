package com.avinash.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.avinash.model.Employee;

public interface EmployeeService {
	   ArrayList<Employee>getAllEmployee() throws ClassNotFoundException, SQLException;
	   boolean insertEmployee(Employee emp) throws ClassNotFoundException, SQLException;
}
