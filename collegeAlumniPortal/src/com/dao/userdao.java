package com.dao;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.shared.EventBean;
import com.shared.FeedbackBean;
import com.shared.GalleryBean;
import com.shared.PlacementBean;
import com.shared.QueryBean;
import com.shared.StudentBean;
import com.shared.UserBean;
public interface userdao {
	int insertUserData(Connection connetcion,UserBean userbean) throws SQLException;
	int insertFeedbackData(Connection con, FeedbackBean feedbackbean)throws SQLException;
	List<UserBean> selectUserList( Connection connection) throws SQLException;
	List<FeedbackBean> selectFeedbackList( Connection connection) throws SQLException;
	int DeleteFeedbackData(Connection connecction, FeedbackBean feedbackbean);
	UserBean getuserdata(Connection connection, UserBean userBean);
	StudentBean getstudentdata(Connection connection, UserBean userBean);
	int userStatus(Connection con,UserBean userbean);	
	
	
	int updateUserData(Connection connecction, UserBean userbean);
	int DeleteUserData(Connection connecction, UserBean userbean);
	int insertPlacementData(Connection connetcion,PlacementBean placementbean) throws SQLException;
	int insertEventData(Connection connetcion,EventBean eventbean) throws SQLException;
	List<EventBean> selectEventList(Connection con) throws SQLException;
	List<PlacementBean> selectPlacementList(Connection con) throws SQLException;
	int DeleteEventData(Connection connecction, EventBean eventbean);
	int updateEventData(Connection connecction, EventBean eventbean);
	EventBean geteventdata(Connection connection,String eid);
	int DeletePlacementData(Connection connecction, PlacementBean placementbean);
	int UpdatePlacementData(Connection connecction, PlacementBean placementbean);
	PlacementBean getPlacementdata(Connection connection,String pid);
	UserBean Authentication(Connection connection,UserBean userbean);
	UserBean validateUser(Connection con, String email, String password);
	int insertGalleryData(Connection con, GalleryBean galleryBean);
	List<GalleryBean> selectGalleryList(Connection con);
	int DeleteGalleryData(Connection con, GalleryBean gallerybean);
	int insertQueryData(Connection con, QueryBean querybean)throws SQLException;
	List<QueryBean>selectQueryList(Connection con)throws SQLException;
	int insertQueryAnswerData(Connection con, QueryBean querybean)throws SQLException;
	List<QueryBean>selectQueryAnswerList(Connection con)throws SQLException;
	int updateStudentData(Connection con, StudentBean studentBean);
	int insertStudentData(Connection con, StudentBean studentBean);
	UserBean selectPassword(Connection con, String parameter);
	
	List<UserBean> selectReportList(Connection con, UserBean userbean); 
	
	int eventStatus(Connection con,EventBean eventbean);
	int placementStatus(Connection con,PlacementBean placementbean);
}
