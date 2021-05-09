package com.project.dao;

import java.sql.*;
import java.util.*;

import com.project.entity.*;
import com.project.interfaces.IPostDAO;
import com.project.utils.DbConnect;

public class PostDOO implements IPostDAO{

	@Override
	public boolean insertPost(int pid, int uid, String title, String content, String status, int votes,
			Timestamp createdAt, Timestamp lastUpdatedAt, int reported) {
		
		
		String sql = "INSERT INTO Post(PID, UID, title, content, status, votes, created_at, last_updated_at, reported) VALUES(?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, pid);
			ps.setInt(2, uid);
			ps.setString(3, title);
			ps.setString(4, content);
			ps.setString(5, status);
			ps.setInt(6, votes);
			ps.setTimestamp(7, createdAt);
			ps.setTimestamp(8, lastUpdatedAt);
			ps.setInt(9, reported);
			
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
		String statement = "select PID, UID, title, content, status, votes, created_at, last_updated_at, reported from Post";
		
		try (
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(statement);
			ResultSet rs = ps.executeQuery();
				)
				{	
					while(rs.next()) {		
						Post post = new Post(rs.getInt(1),
								rs.getInt(2),
								rs.getString(3),
								rs.getString(4),
								rs.getString(5),
								rs.getInt(6),
								rs.getTimestamp(7),
								rs.getTimestamp(8),
								rs.getInt(9)); 
						
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
	public boolean updatePost(int pid, String title, String content, String status, int votes, Timestamp lastUpdateAt,
			int reported) {
		
		String sql = "UPDATE Post SET title=?, content=?, status=?, votes=?, last_updated_at=?, reported=? WHERE PID=?";
		
		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, status);
			ps.setInt(4, votes);
			ps.setTimestamp(5, lastUpdateAt);
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

	

}
