package com.service;
import java.io.InputStream;
import java.util.List;

import javax.management.Query;

import com.shared.EventBean;
import com.shared.FeedbackBean;
import com.shared.GalleryBean;
import com.shared.PlacementBean;
import com.shared.QueryBean;
import com.shared.StudentBean;
import com.shared.UserBean;

public interface userService {

	String saveUserData(UserBean userbean);
	String saveStudentData(StudentBean studentBean);
	String changeUserStatus(UserBean userbean);
	
	String saveFeedbackData(FeedbackBean feedbackbean);
	List<FeedbackBean> getFeedbackList();
	
	List<UserBean> getUserList();
	UserBean GetUserData(UserBean userbean); 
	String UpdateUserData(UserBean userbean);
	String UpdateStudentData(StudentBean studentBean);
	String DeleteData(UserBean userbean);
	StudentBean GetStudentData(UserBean userBean);
	
	String DeleteFeedbackData(FeedbackBean feedbackbean);
	String savePlacementData(PlacementBean placementbean);
	String saveEventData(EventBean eventbean);
	List<EventBean> getEventList();
	List<PlacementBean> getPlacementList();
	String DeleteEventData(EventBean eventbean);
	EventBean GetEventData(String eid);
	String UpdateEventData(EventBean eventbean);
	String DeletePlacementData(PlacementBean placementbean);
	String UpdatePlacementData(PlacementBean placementbean);
	PlacementBean GetPlacementData(String pid);
	UserBean Login(String email,String password);
	String saveGalleryData(GalleryBean gallery);
	List<GalleryBean> getGalleryList();
	String DeleteGalleryData(GalleryBean gallerybean);
	String saveQuerydata(QueryBean querybean);
	List<QueryBean>getQueryList();
	String saveQueryAnswerdata(QueryBean querybean);
	List<QueryBean>getQueryAnswerList();
	void getPassword(String parameter);
	
	List<UserBean> getreportlist(UserBean userBean);
	
	String ChangeEventStatus(EventBean eventbean);
	String ChangePlacementStatus(PlacementBean placementbean);
}
