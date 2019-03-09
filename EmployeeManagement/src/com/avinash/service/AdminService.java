package com.avinash.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;


public interface AdminService {
              boolean isValidUser(String username,String password) throws ClassNotFoundException,SQLException;
}
