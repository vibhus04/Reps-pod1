package com.project.entity;

public class Media {

	
	private int id;
	private int pid;
	private String link;
	
	
	public Media() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Media(int id, int pid, String link) {
		super();
		this.id = id;
		this.pid = pid;
		this.link = link;
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


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}


	@Override
	public String toString() {
		return "Media [id=" + id + ", pid=" + pid + ", link=" + link + "]";
	}
	
	
	
}
