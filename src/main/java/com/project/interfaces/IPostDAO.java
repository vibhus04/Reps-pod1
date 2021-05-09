package com.project.interfaces;

import java.sql.Timestamp;
import java.util.List;

import com.project.entity.Post;

public interface IPostDAO {

	
	public boolean insertPost(int pid, int uid, String title, String content, String status, int votes, Timestamp createdAt,
			Timestamp lastUpdatedAt, int reported);
	
	
	public List<Post> getAllPosts();
	
	
	public boolean deletePostbyId(int pid);
	
	public boolean updatePost(int pid,String title, String content, String status, int votes, Timestamp lastUpdateAt, int reported);
	
	public boolean updateVoteCountbyId(int pid, int votes);
	
	
}
