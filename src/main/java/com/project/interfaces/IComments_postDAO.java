package com.project.interfaces;

import java.util.List;
import java.sql.Timestamp;

import com.project.entity.Comments_post;

public interface IComments_postDAO {

	
	public boolean insertComment(int votes, String content, int pid, int uid, Timestamp timestamp, int reported);
	
	public boolean updateComment(int comid, String content);
	
	public boolean deleteCommentById(int comid);
	
	
}
