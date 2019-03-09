package com.avinash.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.avinash.model.Employee;

public interface EmployeeDao {
                  ArrayList<Employee>getAllEmployee() throws ClassNotFoundException, SQLException;
                  boolean insertEmployee(Employee emp) throws ClassNotFoundException, SQLException;
                  
}
