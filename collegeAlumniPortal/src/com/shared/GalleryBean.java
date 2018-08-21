package com.shared;
import java.io.InputStream;

public class GalleryBean {

	public String toString() {
		return "GalleryBean [id=" + id + ",description=" + description + ",postdate=" + postdate + ",image=" +image + ", userid=" +userid  +"]";
	}
	
	private String id;
	private String description;
	private String postdate;
	private String image;
	private String userid;
	private InputStream inputImage;
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPostdate() {
		return postdate;
	}
	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public InputStream getInputImage() {
		return inputImage;
	}
	public void setInputImage(InputStream inputImage) {
		this.inputImage = inputImage;
	}
}
