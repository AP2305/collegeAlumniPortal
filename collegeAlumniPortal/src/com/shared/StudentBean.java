package com.shared;

public class StudentBean {

	public String toString() {
		return "StudentBean [id" +id + ",userid" +userid +"admission=" + admission + ",passing=" + passing +  "]";
	}
	private String id;
	private String admission;
	private String passing;
	private String userid;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getAdmission() {
		return admission;
	}

	public void setAdmission(String admission) {
		this.admission = admission;
	}

	public String getPassing() {
		return passing;
	}

	public void setPassing(String passing) {
		this.passing = passing;
	}
}
