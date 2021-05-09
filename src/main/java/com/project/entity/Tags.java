package com.project.entity;

public class Tags {

	
	private int id;
	private int pid;
	private String content;
	
	
	
	public Tags() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Tags(int id, int pid, String content) {
		super();
		this.id = id;
		this.pid = pid;
		this.content = content;
	}



	@Override
	public String toString() {
		return "Tags [id=" + id + ", pid=" + pid + ", content=" + content + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getPid() {
		return pid;
	}



	public void setPid(int pid) {
		this.pid = pid;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
	
}
