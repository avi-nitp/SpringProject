package com.avinash.persistence;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;


public interface AdminDao {
            boolean searchRecord(String username, String password) throws ClassNotFoundException,SQLException;
}
