package com.project.entity;
import java.sql.Timestamp;
public class Comments_post {

	
	private int comid;
	private int votes;
	private String content;
	private int pid;
	private int uid;
	private Timestamp timestamp;
	int reported;
	
	public Comments_post() {}	
	
	public Comments_post(int comid, int votes, String content, int pid, int uid, Timestamp timestamp, int reported) {
		super();
		this.comid = comid;
		this.votes = votes;
		this.content = content;
		this.pid = pid;
		this.uid = uid;
		this.timestamp= timestamp;
		this.reported= reported;
	}


	@Override
	public String toString() {
		return "Comments_post [comid=" + comid + ", votes=" + votes + ", content=" + content + ", pid=" + pid
				+ ", uid=" + uid + ", timestamp=" + timestamp+  ", reported=" + reported + "]";
	}
	
	
	public int getId() {
		return comid;
	}
	public void setId(int comid) {
		this.comid = comid;
	}

	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	
	public Timestamp getTimestamp()
	{
		return timestamp;
	}
	
	public void setTimestamp(Timestamp timestamp)
	{
		this.timestamp=timestamp;
	}
	
	public int getReported()
	{
		return reported;
	}
	
	public void setReported(int reported)
	{
		this.reported=reported; 
	}
	
}
