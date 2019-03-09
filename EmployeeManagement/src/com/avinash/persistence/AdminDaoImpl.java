package com.avinash.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.avinash.utility.MyJdbcConnection;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Override
	public boolean searchRecord(String username, String password) throws ClassNotFoundException, SQLException {
		Connection connection = MyJdbcConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM Admin WHERE username = ? AND password=?");
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		ResultSet resultSet=preparedStatement.executeQuery();
		boolean result=resultSet.next();
		connection.close();
		return result;
	}

}
