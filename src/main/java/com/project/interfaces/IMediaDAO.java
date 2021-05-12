package com.project.interfaces;

import java.util.List;

import com.project.entity.Media;

public interface IMediaDAO {

	
	    //public List<Media> getAllMedia();
		public boolean createMedia(int pid, String link);
		
		public String getMediaByPostId(int pid);
		
		public boolean updateMediaByPostId(int pid, String link);
		
		public boolean deleteMediaByPostId(int pid);
		
		//public boolean deleteAllMediaByPostId(int pid);
	
}
