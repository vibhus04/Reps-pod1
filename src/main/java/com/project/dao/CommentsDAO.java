package com.project.dao;


import java.sql.*;
import java.util.*;

import com.project.entity.Comments_post;
import com.project.entity.Post;
import com.project.interfaces.IComments_postDAO;
import com.project.utils.DbConnect;


public class CommentsDAO implements IComments_postDAO{
	
	@Override
	public boolean insertComment(int votes, String content, int pid, int uid, Timestamp timestamp, int reported)
	{
		String sql= "INSERT INTO Comments(votes, content, pid, uid, timestamp, reported) VALUES (?,?,?,?,?,?,?,?)";
		
		
		try {
			PreparedStatement ps= DbConnect.getMySQLConn().prepareStatement(sql);
			//ps.setInt(id) taken care of by auto-increment property in DB
			ps.setInt(1, votes);
			ps.setString(2, content);
			ps.setInt(3, pid);
			ps.setInt(4, uid);
			ps.setTimestamp(5, timestamp);
			ps.setInt(6, reported);
			
			return ps.executeUpdate() >0;
		}
		
		catch(SQLException e) 
		{
			//TODO Auto-generated
			e.printStackTrace();
		}
		return false;
	}
	
	@Override 
	public boolean updateComment(int comid, String content)
	{
		String sql= "UPDATE Comments_post SET content=? WHERE comid=?";
		
		try {
			PreparedStatement ps= DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setString(1,  content);
			ps.setInt(2,  comid);
			
			return ps.executeUpdate()>0;
		}
		
		catch(SQLException e)
		{
			//TODO Auto-generated
			e.printStackTrace();
		}
		
		return false;
	}
	
	 @Override
	 public boolean deleteCommentById(int comid)
	 {
		 String sql= "DELETE FROM Comments_post WHERE COMID=?";
		 try {
			 
			 PreparedStatement ps= DbConnect.getMySQLConn().prepareStatement(sql);
			 ps.setInt(1, comid);
			 
			 return ps.executeUpdate()>0;
		 }
		 catch(SQLException e)
		 {
			 e.printStackTrace();
		 }
		 return false;
	 }
	
	
	     
	
		
		
	
}
