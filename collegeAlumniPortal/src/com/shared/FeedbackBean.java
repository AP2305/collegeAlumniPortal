package com.shared;

public class FeedbackBean {

	public String toString() {
		return "FeedbackBean [id=" + id + ", subject=" + subject + ", desc=" + desc + ", date="
				+ date + ", userid=" + userid + "]";
	}
	private String id;
	private String subject;
	private String desc ;
	private String date;
	private String userid;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String string) {
		this.date = string;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
}
