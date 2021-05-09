package com.project.interfaces;

import java.util.List;

import com.project.entity.Comments;

public interface ICommentsDAO {

	
	public boolean insertComment(int id, int parentId, int votes, String text, int pid, int uid);
	
	public List<Comments> getAllComments();
	
	public List<Comments> getAllRepliesbyCommentId(int id);
	
	public boolean deleteCommentbyId(int id);
	
	public boolean updateComment(int id, String text);
	
	
}
