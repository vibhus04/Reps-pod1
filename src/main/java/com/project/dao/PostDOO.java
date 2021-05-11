package com.project.dao;

import java.sql.*;
import java.util.*;

import com.project.entity.*;
import com.project.interfaces.IPostDAO;
import com.project.utils.DbConnect;

public class PostDOO implements IPostDAO{

	@Override
	public boolean insertPost(int uid, String title, int categoryId, String content, int votes, Timestamp timestamp, int reported) {
		
		
		String sql = "INSERT INTO Post(UID, title, category_id, content, votes, time_stamp, reported) VALUES(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
//			ps.setInt(1, pid);  taken care by 'autoincrement' property in DB
			ps.setInt(1, uid);
			ps.setString(2, title);
			ps.setInt(3, categoryId);
			ps.setString(4, content);
			ps.setInt(5, votes);
			ps.setTimestamp(6, timestamp);
			ps.setInt(7, reported);
			
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return false;
	}

	@Override
	public List<Post> getAllPosts() {
		
		List<Post> posts = new ArrayList<>();
		String sql = "select PID, UID, title, category_id, content, votes, time_stamp, reported from Post";
		
		try (
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
				)
				{	
					while(rs.next()) {		
						Post post = new Post(rs.getInt(1),
								rs.getInt(2),
								rs.getString(3),
								rs.getInt(4),
								rs.getString(5),
								rs.getInt(6),
								rs.getTimestamp(7),
								rs.getInt(8)); 
						
						posts.add(post); 
					}
				} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
		return posts;
	}

	@Override
	public boolean deletePostbyId(int pid) {
		String sql = "DELETE FROM Post WHERE PID = ?";
		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, pid);
			
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updatePost(int pid,String title, String content,  int categoryId, int votes, Timestamp timestamp, int reported) {
		
		String sql = "UPDATE Post SET title=?, content=?, category_id=?, votes=?, time_stamp=?, reported=? WHERE PID=?";
		
		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, categoryId);
			ps.setInt(4, votes);
			ps.setTimestamp(5, timestamp);
			ps.setInt(6, reported);
			ps.setInt(7, pid);
			
			return ps.executeUpdate() > 0;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean updateVoteCountbyId(int pid, int votes) {
		
		String sql = "UPDATE Post SET votes=? WHERE PID=?";
		
		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, votes);
			ps.setInt(2, pid);
			
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
    
	@Override
	public List<Post> getAllPostsByCategoryId(int categoryId)
	{
		List<Post> posts = new ArrayList<>();
		String sql = "select PID, UID, title, category_id, content, votes, time_stamp, reported from Post where category_id= ?";
		
		try (
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, categoryId);
			ResultSet rs = ps.executeQuery();
				)
				{	
					while(rs.next()) {		
						Post post = new Post(rs.getInt(1),
								rs.getInt(2),
								rs.getString(3),
								rs.getInt(4),
								rs.getString(5),
								rs.getInt(6),
								rs.getTimestamp(7),
								rs.getInt(8)); 
						
						posts.add(post); 
					}
				} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		return posts;
	}
	
	
	
	

}
