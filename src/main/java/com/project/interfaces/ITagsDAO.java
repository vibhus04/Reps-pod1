package com.project.interfaces;

import java.util.List;

import com.project.entity.Tags;

public interface ITagsDAO {

	
	public List<Tags> getAllTagsByPostId(int pid);
	
	public List<Tags> getAllTags();
	
	public boolean deleteTagbyId(int id);
	
	public boolean deleteAllTagsByPostId(int pid);
	
	public boolean updateTag(int id, String content);
	
	
	
}
