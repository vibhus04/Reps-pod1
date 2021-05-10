package com.project.entity;

import java.sql.Timestamp;

public class Post {

	
	private int pid;
	private int uid;
	private String title;
	private String content;
	private int categoryId;
	private int votes;
	private Timestamp timestamp;
	private int reported;
	
	
	public Post() {}
	
	
	public Post(int pid, int uid, String title, int categoryId, String content,int votes, Timestamp timeStamp,
			int reported) {
		super();
		this.pid = pid;
		this.uid = uid;
		this.title = title;
		this.content = content;
		this.categoryId = categoryId;
		this.votes = votes;
		this.timestamp = timeStamp;
		this.reported = reported;
	}



	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	
	public int getReported() {
		return reported;
	}
	public void setReported(int reported) {
		this.reported = reported;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public Timestamp getTimeStamp() {
		return timestamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timestamp = timeStamp;
	}

	@Override
	public String toString() {
		return "Post [pid=" + pid + ", uid=" + uid + ", title=" + title + ", content=" + content + ", categoryId="
				+ categoryId + ", votes=" + votes + ", timeStamp=" + timestamp + ", reported=" + reported + "]";
	}
	
	
	
}
