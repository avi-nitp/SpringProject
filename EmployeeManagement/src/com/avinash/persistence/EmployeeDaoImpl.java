package com.avinash.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.avinash.model.Employee;
import com.avinash.utility.MyJdbcConnection;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public ArrayList<Employee> getAllEmployee() throws ClassNotFoundException, SQLException{
		Connection connection = MyJdbcConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE");
		ResultSet resultSet=preparedStatement.executeQuery();
		ArrayList<Employee> result=new ArrayList<>();
		while(resultSet.next()) {
			Employee temp=new Employee();
			temp.setEid(resultSet.getString("eid"));
			temp.setName(resultSet.getString("name"));
			temp.setDesignation(resultSet.getString("designation"));
			temp.setDept(resultSet.getString("dept"));
			temp.setBasic(resultSet.getLong("basic"));
			result.add(temp);
		}
		connection.close();
		return result;
	}

	@Override
	public boolean insertEmployee(Employee emp) throws ClassNotFoundException, SQLException {
		Connection connection=MyJdbcConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("Insert into Employee values(?,?,?,?,?)");
		preparedStatement.setString(1, emp.getEid());
		preparedStatement.setString(2, emp.getName());
		preparedStatement.setString(3, emp.getDesignation());
		preparedStatement.setString(4, emp.getDept());
		preparedStatement.setLong(5, emp.getBasic());
		int result=preparedStatement.executeUpdate();
		connection.close();
		if(result>0)
			return true;
		return false;
	}

}
