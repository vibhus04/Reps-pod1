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
		
		IPostDAO postDAO = new PostDAO();
		
		
		Date date = new Date();
//		postDAO.insertPost(20,1, "How to exercise ", 5,"data", 0, new Timestamp(date.getTime()), 0);
//		postDAO.insertPost(1, "Loose Weight", 2,"Exercise a lot", 0, new Timestamp(date.getTime()), 0);
//		postDAO.insertPost(1, "GainWeight", 3,"Eat a lot", 0, new Timestamp(date.getTime()), 0);
//		postDAO.insertPost(1, "Archived Post", 4,"This is archived post", 0, new Timestamp(date.getTime()), -100);
//		postDAO.insertPost(1, "Reported Post", 4,"This is reported post", 0, new Timestamp(date.getTime()), -5);
		
//		postDAO.deletePostbyId(15);
//		postDAO.deletePostbyId(16);
//		postDAO.deletePostbyId(6);
		
		for(Post p: postDAO.getAllPosts()) {
			System.out.println(p);
		}
		
		System.out.println();
		
		System.out.println("These are all archived posts of user 1");
		for(Post p: postDAO.getAllDraftPosts(1)) {
			System.out.println(p);
		}
		
		System.out.println();
		
		System.out.println("These are reported posts ");
		for(Post p: postDAO.getAllReportedPosts()) {
			System.out.println(p);
		}
		
		System.out.println("These are all posts of category ID 1");
		for(Post p : postDAO.getAllPostsByCategoryId(1)) {
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
		ITagsDAO tagsDAO = new TagsDAO();
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
