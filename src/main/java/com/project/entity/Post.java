package com.project.entity;

import java.sql.Timestamp;

public class Post {

	
	private int pid;
	private int uid;
	private String title;
	private String content;
	private String status;
	private int votes;
	private Timestamp createdAt;
	private Timestamp lastUpdatedAt;
	private int reported;
	
	
	public Post() {}
	
	public Post(int pid, int uid, String title, String content, String status, int votes, Timestamp createdAt,
			Timestamp lastUpdatedAt, int reported) {
		super();
		this.pid = pid;
		this.uid = uid;
		this.title = title;
		this.content = content;
		this.status = status;
		this.votes = votes;
		this.createdAt = createdAt;
		this.lastUpdatedAt = lastUpdatedAt;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getLastUpdatedAt() {
		return lastUpdatedAt;
	}
	public void setLastUpdatedAt(Timestamp lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}
	public int getReported() {
		return reported;
	}
	public void setReported(int reported) {
		this.reported = reported;
	}
	
	
	@Override
	public String toString() {
		return "Post [pid=" + pid + ", uid=" + uid + ", title=" + title + ", content=" + content + ", status=" + status
				+ ", votes=" + votes + ", createdAt=" + createdAt + ", lastUpdatedAt=" + lastUpdatedAt + ", reported="
				+ reported + "]";
	}
	
	
}
