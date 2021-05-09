package com.project.dao;

import java.io.*;
import java.sql.*;
import java.util.*;

import com.project.entity.*;
import com.project.interfaces.IUserDAO;
import com.project.utils.DbConnect;

public class UserDOO implements IUserDAO{
	
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		
//		String statement = "select user_id, username, password, role, badge from user";
		FileInputStream fis;
		Properties prop = new Properties();
		try {
			fis = new FileInputStream("src/main/resources/sql.properties");
			prop.load(fis);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		List<User> users = new ArrayList<>();
		try (
				PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(prop.getProperty("getAllUsers"));
				ResultSet rs = ps.executeQuery();
					)
					{	while(rs.next()) {
					
					User user = new User(); 
					user.setUser_id(rs.getInt(1)); 
					user.setUsername(rs.getString(2));
					user.setPassword(rs.getString(3)); 
					user.setRole(rs.getString(4)); 
					user.setBadge(rs.getString(5)); 
					
					users.add(user); 
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		
		return users;
	}

}
