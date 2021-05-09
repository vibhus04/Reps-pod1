package com.project.entity;

public class Comments {

	
	private int id;
	private int parentId;
	private int votes;
	private String text;
	private int pid;
	private int uid;
	
	public Comments() {}	
	
	public Comments(int id, int parentId, int votes, String text, int pid, int uid) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.votes = votes;
		this.text = text;
		this.pid = pid;
		this.uid = uid;
	}


	@Override
	public String toString() {
		return "Comments [id=" + id + ", parentId=" + parentId + ", votes=" + votes + ", text=" + text + ", pid=" + pid
				+ ", uid=" + uid + "]";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
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
	
	
	
}
