package com.project.interfaces;

import java.util.List;

import com.project.entity.Media;

public interface IMediaDAO {

	
	public List<Media> getAllMedia();
	
	public List<Media> getAllMediaByPostId();
	
	public boolean updateLink(int id, String link);
	
	public boolean deleteMediabyId(int id);
	
	public boolean deleteAllMediaByPostId(int pid);
	
}
