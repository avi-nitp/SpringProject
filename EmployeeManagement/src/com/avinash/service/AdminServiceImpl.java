package com.avinash.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avinash.persistence.AdminDao;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
	private AdminDao adminDao;
	@Override
	public boolean isValidUser(String username, String password)  throws ClassNotFoundException,SQLException{
		
		return adminDao.searchRecord(username, password);
	}

}
