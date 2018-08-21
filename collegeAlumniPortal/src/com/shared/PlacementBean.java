package com.shared;

public class PlacementBean {
	
	public String toString() {
		return "PlacementBean [id=" + id + ",companyname=" + companyname + ", startdate=" + startdate + ", enddate="
				+ enddate + ", venue=" + venue + ", posteddate=" + posteddate + ",userid=" + userid +",jobdesc="
				+jobdesc + ", status=" + status +  "]";
	}
	private String id;
	private String companyname;
	private String startdate;
	private String enddate;
	private String venue;
	private String posteddate;
	private String userid;
	private String jobdesc;
	private String status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
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
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
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
	public String getJobdesc() {
		return jobdesc;
	}
	public void setJobdesc(String jobdesc) {
		this.jobdesc = jobdesc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
