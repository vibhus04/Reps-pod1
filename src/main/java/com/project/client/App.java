package com.project.client;



import java.sql.Timestamp;
import java.util.Date;

import com.project.dao.*;
import com.project.entity.*;
import com.project.interfaces.*;

public class App {
	public static void main(String[] args) {

//		IUserDAO userDAO = new UserDOO();
//		for(User u: userDAO.getAllUsers()) {
//			System.out.println(u);
//		}
		
		IPostDAO postDAO = new PostDOO();
		
		
		Date date = new Date();
//		postDAO.insertPost(1, "My guide to a healthy lifestype", 1,"CONTENNT", 0, new Timestamp(date.getTime()), 0);
		for(Post p: postDAO.getAllPosts()) {
			System.out.println(p);
		}
		
//		postDAO.deletePostbyId(3);
//		postDAO.deletePostbyId(4);
		
//		System.out.println("-----------POSTS---------");
//		System.out.println();
//		for(Post p: postDAO.getAllPosts()) {
//			System.out.println(p);
//		}
//		
//		System.out.println("-----------UPDATED POSTS---------");
//		System.out.println();
//		postDAO.updatePost(2, "new title", "new content",5, 10, new Timestamp(date.getTime()), 10);
//		postDAO.updateVoteCountbyId(2, 4);
//		for(Post p: postDAO.getAllPosts()) {
//			System.out.println(p);
//		}
//		
//		
		System.out.println("----------- TAGS ----------");
		System.out.println();
		ITagsDAO tagsDAO = new TagsDOO();
//		tagsDAO.updateTag(2, "fitness");
		tagsDAO.insertTag(2, "lifestyle");
//		tagsDAO.updateTag(1, "health and fitness");
//		tagsDAO.deleteTagbyId(2);
		tagsDAO.deleteAllTagsByPostId(2);
		for(Tags t: tagsDAO.getAllTags()) {
			System.out.println(t);
		}
	}
}
