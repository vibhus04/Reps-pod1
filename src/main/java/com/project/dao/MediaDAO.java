package com.project.dao;

import java.sql.*;
import java.util.*;

import com.project.entity.*;
import com.project.interfaces.IMediaDAO;
import com.project.utils.DbConnect;

public class MediaDAO implements IMediaDAO{

	@Override
    public boolean createMedia(int pid, String link) {
		String sql = "INSERT INTO Media_post(link, PID) VALUES (?,?)";
		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			
			ps.setString(1, link);
			ps.setInt(2, pid);
			
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return false;
	}

	@Override
	public String getMediaByPostId(int pid) {
		String post_media="";
		String sql = "Select link From Media_post where PID=?";
		try (
				PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
					)
					{	
						while(rs.next()) {		
							post_media = new String(rs.getString(1));
							ps.setInt(2, pid);
						}
					} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			
			return post_media;
		}
	}
	
	@Override
	public boolean deleteMediaByPostId(int pid)
	{
		String sql = "DELETE FROM Media_post WHERE PID = ?";
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
	public boolean updateMediaByPostId(int pid, String link) {
		
		String sql = "UPDATE Media_post SET link=? WHERE PID=?";
		
		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setString(1, link);
			ps.setInt(2, pid);
			
			return ps.executeUpdate() > 0;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	

}
