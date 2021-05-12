package com.project.dao;


import java.sql.*;
import java.util.*;

import com.project.entity.Comments_post;
import com.project.entity.Post;
import com.project.exception.InvalidId;
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
	 
	 
	

	 @Override
	 public List<Comments_post> getAllCommentsByPostId(int pid) {
			List<Comments_post> commentsPost = new ArrayList<>();
			String statement = "select * from Comments_post where PID = ?";
			try {
					PreparedStatement ps= DbConnect.getMySQLConn().prepareStatement(statement);
					ps.setInt(1,pid);
					ResultSet rs = ps.executeQuery();
					while(rs.next()) {
						Comments_post commentPost = new Comments_post(rs.getInt(1),
								rs.getInt(2),
								rs.getString(3),
								rs.getInt(4),
								rs.getInt(5),
								rs.getTimestamp(7),
								rs.getInt(8)); 
							
						commentsPost.add(commentPost); 
					}
				}catch(SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return commentsPost;
		}
	 
	 
	 @Override
		public boolean updateVotebyCommentId(int comid, int votes) {
			
			
			String sql = "UPDATE Comments_post SET votes=? WHERE COMID=?";
			
			try {
				PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
				ps.setInt(1, votes);
				ps.setInt(2, comid);
				
				return ps.executeUpdate() > 0;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}
	 
	
	 
	 @Override
		public boolean updateStatusofComment(int comid,int newstatus) {
			
			
			String sql= "UPDATE Comments_post SET reported = ? where COMID = ?";
			
			try {
				PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
				ps.setInt(1, newstatus);
				ps.setInt(2, comid);
				
				return ps.executeUpdate() > 0;
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
	 
	 @Override
	 public Comments_post getMostVotedComment(int pid) {
		
		 String sql="SELECT * from Comments_post where PID_id=? order by votes desc limit 1;";
		 Comments_post mostVotedComment = null;
		 //=new Comments_post();
		 try {
				PreparedStatement ps= DbConnect.getMySQLConn().prepareStatement(sql);
				ps.setInt(1,pid);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Comments_post commentPost = new Comments_post(rs.getInt(1),
							rs.getInt(2),
							rs.getString(3),
							rs.getInt(4),
							rs.getInt(5),
							rs.getTimestamp(7),
							rs.getInt(8)); 
					mostVotedComment=commentPost;
					 break;
				}
			}catch(SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 return mostVotedComment;
		 
		 
	 }
	     
	
		
		
	
}
