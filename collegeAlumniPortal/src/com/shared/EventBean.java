package com.shared;

import java.util.Date;

public class EventBean {

	public String toString() {
		return "PlacementBean [id=" + id + ",ename=" + ename + ", startdate=" + startdate + ", enddate="
				+ enddate + ", venue=" + venue + ",time="+ time +",desc="+ desc +", posteddate="
				+ posteddate + ",userid=" + userid +",status=" + status +"]";
	}
	private String id;
	private String ename;
	private String startdate;
	private String enddate;
	private String venue;
	private String time;
	private String desc;
	private String posteddate;
	private String userid;
	private String status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPosteddate() {
		return posteddate;
	}
	public void setPosteddate(String posteddate) {
		this.posteddate = posteddate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
