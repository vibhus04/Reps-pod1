package com.project.entity;

public class User {
	
	
	private int user_id;
	private String username;
	private String password;
	private String role;
	private String badge;
	
	
	public User() {}
	
	public User(int user_id, String username, String password, String role, String badge) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.badge = badge;
	}
	
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getBadge() {
		return badge;
	}
	public void setBadge(String badge) {
		this.badge = badge;
	}
	
	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", badge=" + badge + "]";
	}

}
