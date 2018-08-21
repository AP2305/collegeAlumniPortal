package com.shared;

public class QueryBean {

	public String toString() {
		return "QueryBean [id=" + id + ",studentid=" + studentid +",posteddate=" + posteddate + ",desc="+ desc +",answer=" + answer + ", answerdate=" + answerdate + ",facultyid=" + facultyid +"]";
	}
	private String id;
	private String studentid;
	private String posteddate;
	private String desc;
	private String answer;
	private String answerdate;
	private String facultyid;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getPosteddate() {
		return posteddate;
	}
	public void setPosteddate(String posteddate) {
		this.posteddate = posteddate;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswerdate() {
		return answerdate;
	}
	public void setAnswerdate(String answerdate) {
		this.answerdate = answerdate;
	}
	public String getFacultyid() {
		return facultyid;
	}
	public void setFacultyid(String facultyid) {
		this.facultyid = facultyid;
	}
}
