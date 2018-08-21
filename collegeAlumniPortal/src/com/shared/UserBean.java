package com.shared;

public class UserBean {

	public String toString() {
		return "UserBean [id=" + id + ", email=" + email + ", password=" + password + ", fullname="
				+ fullname + ", address=" + address + ", contact=" + contact +",gender="+gender+",dob="
				+ dob+",usertype="+usertype+",enrollno=" + enrollno + ",state="
				+  state+ ",city=" +city+ ",status=" +status+ "]";
	}
	private String id;
	private String email;
	private String password;
	private String fullname;
	private String address;
	private String contact;
	private String gender;
	private String dob;
	private String usertype;
	private String state;
	private String city;
	private String enrollno;
	private String status;
	
	public String getEnrollno() {
		return enrollno;
	}
	public void setEnrollno(String enrollno) {
		this.enrollno = enrollno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
