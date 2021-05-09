package com.project.client;



import java.sql.Timestamp;
import java.util.Date;

import com.project.dao.*;
import com.project.entity.*;
import com.project.interfaces.*;

public class App {
	public static void main(String[] args) {

		IUserDAO userDAO = new UserDOO();
		for(User u: userDAO.getAllUsers()) {
			System.out.println(u);
		}
		
		IPostDAO postDAO = new PostDOO();
		
		
		Date date = new Date();
		postDAO.insertPost(4, 1, "My guide to a healthy lifestype", "CONTENNT", "Visible", 0, new Timestamp(date.getTime()), new Timestamp(date.getTime()), 0);
		for(Post p: postDAO.getAllPosts()) {
			System.out.println(p);
		}
		
		postDAO.deletePostbyId(4);
		
		System.out.println("-----------POSTS---------");
		System.out.println();
		for(Post p: postDAO.getAllPosts()) {
			System.out.println(p);
		}
		
		System.out.println("-----------UPDATED POSTS---------");
		System.out.println();
		postDAO.updatePost(3, "new title", "new content", "HiddenByUser", 10, new Timestamp(date.getTime()), 0);
		postDAO.updateVoteCountbyId(2, 20);
		for(Post p: postDAO.getAllPosts()) {
			System.out.println(p);
		}
		
		
		System.out.println("----------- TAGS ----------");
		System.out.println();
		ITagsDAO tagsDAO = new TagsDOO();
		tagsDAO.updateTag(2, "fitness");
		for(Tags t: tagsDAO.getAllTags()) {
			System.out.println(t);
		}
	}
}
