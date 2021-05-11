package com.project.interfaces;

import java.sql.Timestamp;
import java.util.List;

import com.project.entity.Post;

public interface IPostDAO {

	
	public boolean insertPost(int uid, String title, int categoryId, String content, int votes, Timestamp timestamp, int reported);
	public List<Post> getAllPosts();
	public boolean deletePostbyId(int pid);
	public boolean updatePost(int pid,String title, String content,  int categoryId, int votes, Timestamp timestamp, int reported);
	public boolean updateVoteCountbyId(int pid, int votes);
	
	public List<Post> getAllPostsByCategoryId(int categoryId);
	
	
	
	
	public List<Post> getAllPostbyUserId(int pid);
	
	public List<Post> getAllVisiblePosts();
	
	public boolean updateStatusofPost(int pid,int newstatus);
	
	public List<Post> getAllDraftPosts(int uid);
	
	public List<Post> getAllReportedPosts();
	
}
