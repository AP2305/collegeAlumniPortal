package com.dao.impl;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import org.apache.naming.java.javaURLContextFactory;
import org.apache.tomcat.jni.User;

import com.dao.userdao;
import com.shared.EventBean;
import com.shared.FeedbackBean;
import com.shared.GalleryBean;
import com.shared.PlacementBean;
import com.shared.QueryBean;
import com.shared.StudentBean;
import com.shared.UserBean;

public class daoimpl implements userdao{

	public int insertUserData(Connection connetcion, UserBean userbean) throws SQLException {
		String q = "insert into user_detail " + "(v_email_id,v_password,v_fullname,v_address,v_contact_no,"
				+ "v_gender,d_dob,i_state_id,i_city_id,v_user_type,v_enroll_no) values (?,?,?,?,?,?,?,?,?,?,?)";
		try (PreparedStatement ps = connetcion.prepareStatement(q)) {
			ps.setString(1, userbean.getEmail());
			ps.setString(2, userbean.getPassword());
			ps.setString(3, userbean.getFullname());
			ps.setString(4, userbean.getAddress());
			ps.setString(5, userbean.getContact());
			ps.setString(6, userbean.getGender());
			ps.setString(7, userbean.getDob());
			ps.setString(8, userbean.getState());
			ps.setString(9, userbean.getCity());
			ps.setString(10,userbean.getUsertype());
			ps.setString(11, userbean.getEnrollno());
			return ps.executeUpdate();
		}
	}

	public int insertEventData(Connection connetcion, EventBean eventbean) throws SQLException {
		String q = "insert into event_detail " + "(v_e_name,d_startdate,d_enddate,v_venue,"
				+ "v_time,v_desc,v_posted_date,i_user_id,i_status) values (?,?,?,?,?,?,?,?,?)";
		try (PreparedStatement ps = connetcion.prepareStatement(q)) {
			ps.setString(1, eventbean.getEname());
			ps.setString(2, eventbean.getStartdate());
			ps.setString(3, eventbean.getEnddate());
			ps.setString(4, eventbean.getVenue());
			ps.setString(5, eventbean.getTime());
			ps.setString(6, eventbean.getDesc());
			ps.setDate(7, new java.sql.Date(System.currentTimeMillis()));
			ps.setString(8, eventbean.getUserid());
			ps.setString(9, eventbean.getStatus());
			return ps.executeUpdate();
		}
	}

	public int insertPlacementData(Connection con, PlacementBean placementbean) throws SQLException {
		// TODO Auto-generated method stub
		String q = "insert into placement_detail " + "(v_company_name,v_job_description,d_start_date,d_end_date,"
				+ "v_venue,d_posted_date,i_user_id,i_status) values (?,?,?,?,?,?,?,?)";
		try (PreparedStatement ps = con.prepareStatement(q)) {
			ps.setString(1, placementbean.getCompanyname());
			ps.setString(2, placementbean.getJobdesc());
			ps.setString(3, placementbean.getStartdate());
			ps.setString(4, placementbean.getEnddate());
			ps.setString(5, placementbean.getVenue());
			ps.setDate(6, new java.sql.Date(System.currentTimeMillis()));
			ps.setString(7, placementbean.getUserid());
			ps.setString(8, placementbean.getStatus());
			return ps.executeUpdate();
		}
	}

	public int insertFeedbackData(Connection con, FeedbackBean feedbackbean) throws SQLException {
		// TODO Auto-generated method stub
		String q = "insert into feedback_detail (v_subject,v_description,d_date,i_user_id) values (?,?,?,?)";
		try (PreparedStatement ps = con.prepareStatement(q)) {
			ps.setString(1, feedbackbean.getSubject());
			ps.setString(2, feedbackbean.getDesc());
			ps.setDate(3, new java.sql.Date(System.currentTimeMillis()));
			ps.setString(4, feedbackbean.getUserid());
			return ps.executeUpdate();
		}

	}

	@Override
	public List<UserBean> selectUserList(Connection connection) throws SQLException {

		String q = "select * from user_detail where v_user_type!='ADMIN' and i_status>0";
		Statement stmt = connection.createStatement();
		List<UserBean> userlist = new ArrayList<>();
		ResultSet s1 = stmt.executeQuery(q);
		while (s1.next()) {
			UserBean bean = new UserBean();
			bean.setId(s1.getString(1));
			bean.setEmail(s1.getString(2));
			bean.setPassword(s1.getString(3));
			bean.setFullname(s1.getString(4));
			bean.setAddress(s1.getString(5));
			bean.setContact(s1.getString(6));
			bean.setGender(s1.getString(7));
			bean.setDob(s1.getString(8));
			bean.setUsertype(s1.getString(9));
			bean.setEnrollno(s1.getString(10));
			bean.setState(s1.getString(11));
			bean.setCity(s1.getString(12));
			userlist.add(bean);
		}
		return userlist;
	}

	public List<FeedbackBean> selectFeedbackList(Connection connection) throws SQLException {

		String q = "select * from feedback_detail";
		Statement stmt = connection.createStatement();
		List<FeedbackBean> feedbacklist = new ArrayList<>();
		ResultSet s1 = stmt.executeQuery(q);
		while (s1.next()) {
			FeedbackBean bean = new FeedbackBean();
			bean.setId(s1.getString(1));
			bean.setSubject(s1.getString(2));
			bean.setDesc(s1.getString(3));
			bean.setDate(s1.getString(4));
			bean.setUserid(s1.getString(5));
			feedbacklist.add(bean);
		}
		return feedbacklist;
	}

	public int DeleteFeedbackData(Connection connecction, FeedbackBean feedbackbean) {
		// TODO Auto-generated method stub
		String p = "delete from feedback_detail where i_feedback_id=?";
		try (PreparedStatement ps = connecction.prepareStatement(p)) {
			ps.setString(1, feedbackbean.getId());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public UserBean getuserdata(Connection connection, UserBean userBean) {
		// TODO Auto-generated method stub
		String p = "select * from user_detail where i_user_id=?";

		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(p);
			ps.setString(1, userBean.getId());
			ResultSet s1 = ps.executeQuery();
			UserBean bean = new UserBean();
			while (s1.next()) {
				bean.setFullname(s1.getString(4));
				bean.setEmail(s1.getString(2));
				bean.setDob(s1.getString(8));
				bean.setContact(s1.getString(6));
			}
			return bean;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public UserBean selectPassword(Connection connection, String parameter) {
		String query = "select v_password from user_detail where v_email_id=?";
		UserBean bean = new UserBean();

		try (PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setString(1, parameter);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				bean.setPassword(rs.getString("v_password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}

	public StudentBean getstudentdata(Connection connection, UserBean userBean) {
		String q = "select * from student_detail where i_user_id=?";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(q);
			ps.setString(1, userBean.getId());
			ResultSet s1 = ps.executeQuery();
			StudentBean stubean = new StudentBean();
			while (s1.next()) {
				stubean.setAdmission(s1.getString(3));
				stubean.setPassing(s1.getString(4));
			}
			return stubean;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int updateUserData(Connection connecction, UserBean userbean) {
		// TODO Auto-generated method stub
		String p = "update user_detail set v_email_id=?,v_fullname=?,v_contact_no=?,d_dob=? where i_user_id=?";
		try (PreparedStatement ps = connecction.prepareStatement(p)) {
			ps.setString(1, userbean.getEmail());
			ps.setString(2, userbean.getFullname());
			ps.setString(3, userbean.getContact());
			ps.setString(4, userbean.getDob());
			ps.setString(5, userbean.getId());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	@Override
	public int DeleteUserData(Connection connecction, UserBean userbean) {
		// TODO Auto-generated method stub
		String p = "delete from student_details where id=?";
		try (PreparedStatement ps = connecction.prepareStatement(p)) {
			ps.setString(1, userbean.getId());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override

	public List<PlacementBean> selectPlacementList(Connection conncetion) throws SQLException {
		String q = "select * from placement_detail where d_start_date>"+ new java.sql.Date(System.currentTimeMillis());
		
		
		Statement stmt = conncetion.createStatement();
		List<PlacementBean> placementlist = new ArrayList<>();
		ResultSet s1 = stmt.executeQuery(q);
		while (s1.next()) {
			PlacementBean bean = new PlacementBean();
			bean.setId(s1.getString(1));
			bean.setCompanyname(s1.getString(2));
			bean.setJobdesc(s1.getString(3));
			bean.setStartdate(s1.getString(4));
			bean.setEnddate(s1.getString(5));
			bean.setVenue(s1.getString(6));
			bean.setPosteddate(s1.getString(7));
			bean.setUserid(s1.getString(8));
			placementlist.add(bean);
		}
		return placementlist;
	}

	public List<EventBean> selectEventList(Connection conncetion) throws SQLException {
		String q = "select * from event_detail where d_startdate>"+ new java.sql.Date(System.currentTimeMillis());
		Statement stmt = conncetion.createStatement();
		List<EventBean> eventlist = new ArrayList<>();
		ResultSet s1 = stmt.executeQuery(q);
		while (s1.next()) {
			EventBean bean = new EventBean();
			bean.setId(s1.getString(1));
			bean.setEname(s1.getString(2));
			bean.setStartdate(s1.getString(3));
			bean.setEnddate(s1.getString(4));
			bean.setVenue(s1.getString(5));
			bean.setTime(s1.getString(6));
			bean.setDesc(s1.getString(7));
			bean.setPosteddate(s1.getString(8));
			bean.setUserid(s1.getString(9));
			eventlist.add(bean);
		}
		return eventlist;
	}

	public EventBean geteventdata(Connection connection, String eid) {
		// TODO Auto-generated method stub
		String p = "select * from event_detail where i_event_id=?";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(p);
			ps.setString(1, eid);
			ResultSet s1 = ps.executeQuery();
			EventBean bean = new EventBean();
			while (s1.next()) {
				bean.setId(s1.getString(1));
				bean.setEname(s1.getString(2));
				bean.setStartdate(s1.getString(3));
				bean.setEnddate(s1.getString(4));
				bean.setVenue(s1.getString(5));
				bean.setTime(s1.getString(6));
				bean.setDesc(s1.getString(7));
				bean.setPosteddate(s1.getString(8));
				bean.setUserid(s1.getString(9));
				return bean;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public int updateEventData(Connection connection, EventBean eventbean) {
		// TODO Auto-generated method stub
		String p = "update event_detail set v_e_name=?,d_startdate=?,d_enddate=?,v_venue=?,v_time=?,v_desc=? where i_event_id=?";
		try (PreparedStatement ps = connection.prepareStatement(p)) {
			ps.setString(1, eventbean.getEname());
			ps.setString(2, eventbean.getStartdate());
			ps.setString(3, eventbean.getEnddate());
			ps.setString(4, eventbean.getVenue());
			ps.setString(5, eventbean.getTime());
			ps.setString(6, eventbean.getDesc());
			ps.setString(7, eventbean.getId());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int DeleteEventData(Connection connecction, EventBean eventbean) {
		// TODO Auto-generated method stub
		String p = "delete from event_detail where i_event_id=?";
		try (PreparedStatement ps = connecction.prepareStatement(p)) {
			ps.setString(1, eventbean.getId());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public PlacementBean getPlacementdata(Connection con, String pid) {
		// TODO Auto-generated method stub
		String p = "select * from placement_detail where i_placement_id=?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(p);
			ps.setString(1, pid);
			ResultSet s1 = ps.executeQuery();
			PlacementBean bean = new PlacementBean();
			while (s1.next()) {
				bean.setId(s1.getString(1));
				bean.setCompanyname(s1.getString(2));
				bean.setJobdesc(s1.getString(3));
				bean.setStartdate(s1.getString(4));
				bean.setEnddate(s1.getString(5));
				bean.setVenue(s1.getString(6));
				bean.setPosteddate(s1.getString(7));
				return bean;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public int UpdatePlacementData(Connection connection, PlacementBean placementbean) {
		// TODO Auto-generated method stub
		String p = "update placement_detail set v_company_name=?,v_job_description=?,d_start_date=?,d_end_date=?,v_venue=? where i_placement_id=?";
		try (PreparedStatement ps = connection.prepareStatement(p)) {

			ps.setString(1, placementbean.getCompanyname());
			ps.setString(2, placementbean.getJobdesc());
			ps.setString(3, placementbean.getStartdate());
			ps.setString(4, placementbean.getEnddate());
			ps.setString(5, placementbean.getVenue());
			ps.setString(6, placementbean.getId());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int DeletePlacementData(Connection connecction, PlacementBean placementbean) {
		// TODO Auto-generated method stub
		String p = "delete from placement_detail where i_placement_id=?";
		try (PreparedStatement ps = connecction.prepareStatement(p)) {
			ps.setString(1, placementbean.getId());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public UserBean Authentication(Connection connection, UserBean ub) {
		// TODO Auto-generated method stub
		String p = "select * from user_detail";
		PreparedStatement ps;

		try {
			ps = connection.prepareStatement(p);
			ResultSet s1 = ps.executeQuery();
			UserBean bean = new UserBean();
			while (s1.next()) {
				bean.setEmail(s1.getString(2));
				bean.setPassword(s1.getString(3));
				bean.setUsertype(s1.getString(9));
				return bean;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserBean validateUser(Connection con, String email, String password) {
		// TODO Auto-generated method stub
		String p = "select * from user_detail where v_email_id=? and v_password=?";
		PreparedStatement ps;

		try {
			ps = con.prepareStatement(p);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet s1 = ps.executeQuery();
			UserBean bean = null;
			while (s1.next()) {
				bean = new UserBean();
				bean.setId(String.valueOf(s1.getInt(1)));
				// bean.setPassword(s1.getString(3));
				bean.setUsertype(s1.getString(9));

			}
			return bean;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertGalleryData(Connection con, GalleryBean galleryBean) {
		// TODO Auto-generated method stub
		String q = "insert into gallery_detail (v_description,d_uploaded_date,b_image,i_user_id)" + " values (?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(q);
			if (galleryBean != null && galleryBean.getInputImage() != null) {
				ps.setBlob(3, galleryBean.getInputImage());
			}
			ps.setString(1, galleryBean.getDescription());
			ps.setDate(2, new java.sql.Date(System.currentTimeMillis()));
			ps.setString(4, /* eventbean.getUserid() */"1");

			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<GalleryBean> selectGalleryList(Connection con) {
		// TODO Auto-generated method stub
		String q = "select * from gallery_detail";
		List<GalleryBean> gallerylist = new ArrayList<>();

		try {
			Statement stmt = con.createStatement();
			ResultSet s1 = stmt.executeQuery(q);
			while (s1.next()) {
				GalleryBean bean = new GalleryBean();
				bean.setId(s1.getString(1));
				bean.setDescription(s1.getString(2));
				bean.setPostdate(s1.getString(3));
				bean.setImage(Base64.getEncoder().encodeToString(s1.getBytes(4)));
				bean.setUserid(s1.getString(5));
				gallerylist.add(bean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gallerylist;
	}

	@Override
	public int DeleteGalleryData(Connection con, GalleryBean gallerybean) {
		// TODO Auto-generated method stub
		String p = "delete from gallery_detail where i_image_id=?";
		try (PreparedStatement ps = con.prepareStatement(p)) {
			ps.setString(1, gallerybean.getId());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override

	public int insertQueryData(Connection con, QueryBean querybean) throws SQLException {
		// TODO Auto-generated method stub
		String q = "insert into query_detail " + "(i_student_id,d_posted_date,v_description) values (?,?,?)";
		try (PreparedStatement ps = con.prepareStatement(q)) {
			ps.setString(1, querybean.getStudentid());
			ps.setDate(2, new java.sql.Date(System.currentTimeMillis()));
			ps.setString(3, querybean.getDesc());
			return ps.executeUpdate();
		}
	}

	@Override
	public List<QueryBean> selectQueryList(Connection con) throws SQLException {
		// TODO Auto-generated method stub
		String q = "select *from query_detail";
		List<QueryBean> querylist = new ArrayList<>();
		try {
			Statement stmt = con.createStatement();
			ResultSet s1 = stmt.executeQuery(q);

			while (s1.next()) {
				QueryBean bean = new QueryBean();
				bean.setId(s1.getString(1));
				bean.setStudentid(s1.getString(2));
				bean.setPosteddate(s1.getString(3));
				bean.setDesc(s1.getString(4));
				bean.setAnswer(s1.getString(5));
				bean.setAnswerdate(s1.getString(6));
				bean.setFacultyid(s1.getString(7));
				querylist.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return querylist;
	}

	@Override
	public int insertQueryAnswerData(Connection con, QueryBean querybean) throws SQLException {
		// TODO Auto-generated method stub
		String q = "update query_detail set v_answer=?,d_answer_date=?,i_faculty_id=? where i_query_id=?";
		try (PreparedStatement ps = con.prepareStatement(q)) {
			ps.setString(1, querybean.getAnswer());
			ps.setDate(2, new java.sql.Date(System.currentTimeMillis()));
			ps.setString(3, querybean.getFacultyid());
			ps.setString(4, querybean.getId());
			return ps.executeUpdate();
		}
	}

	@Override
	public List<QueryBean> selectQueryAnswerList(Connection con) throws SQLException {
		// TODO Auto-generated method stub
		String q = "select *from query_datail";
		List<QueryBean> querylist = new ArrayList<>();
		try {
			Statement stmt = con.createStatement();
			ResultSet s1 = stmt.executeQuery(q);

			while (s1.next()) {
				QueryBean bean = new QueryBean();
				bean.setAnswer(s1.getString(5));
				bean.setAnswerdate(s1.getString(6));
				bean.setFacultyid(s1.getString(7));
				querylist.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return querylist;
	}

	@Override
	public int updateStudentData(Connection con, StudentBean studentBean) {
		// TODO Auto-generated method stub
		String p = "update student_detail set v_admission_year=?,v_passing_year=? where i_user_id=?";
		try (PreparedStatement ps = con.prepareStatement(p)) {
			ps.setString(1, studentBean.getAdmission());
			ps.setString(2, studentBean.getPassing());
			ps.setString(3, studentBean.getUserid());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int insertStudentData(Connection con, StudentBean studentBean) {
		// TODO Auto-generated method stub
		String q = "insert into student_detail (v_admission_year,v_passing_year) values (?,?)";
		try (PreparedStatement ps = con.prepareStatement(q)) {
			// ps.setString(2,studentBean.getUserid());
			ps.setString(1, studentBean.getAdmission());
			ps.setString(2, studentBean.getPassing());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<UserBean> selectReportList(Connection con,UserBean userBean) {
		// TODO Auto-generated method stub
		String q = "select * from user_detail";
		Statement stmt;
		
		if(userBean.getCity()!=null || userBean.getUsertype()!=null){
			q=q+" where ";
			if(userBean.getCity()!=null)
			{
				q=q+ "i_city_id=" + userBean.getCity();
				if(userBean.getUsertype()!=null)
				{
					q=q+" and " + "v_user_type='"+userBean.getUsertype()+"'";
				}
			}
			else
			{
				q=q+"v_user_type="+userBean.getUsertype();
			}
		}
		
		
		List<UserBean> userlist=new ArrayList<>();
		try {
			stmt = con.createStatement();
			ResultSet s1  = stmt.executeQuery(q);
			while(s1.next()){
				UserBean bean=new UserBean();	
				bean.setId(s1.getString(1));
				bean.setEmail(s1.getString(2));
				bean.setPassword(s1.getString(3));
				bean.setFullname(s1.getString(4));
				bean.setAddress(s1.getString(5));
				bean.setContact(s1.getString(6));
				bean.setGender(s1.getString(7));
				bean.setDob(s1.getString(8));
				bean.setUsertype(s1.getString(9));
				bean.setEnrollno(s1.getString(10));
				bean.setState(s1.getString(11));
				bean.setCity(s1.getString(12));
				userlist.add(bean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userlist;
	}

	@Override
	public int userStatus(Connection con, UserBean userbean) {
		// TODO Auto-generated method stub
		String p = "update user_detail set i_status=? where i_user_id=?";
		try (PreparedStatement ps = con.prepareStatement(p)) {
			ps.setString(1, userbean.getStatus());
			ps.setString(2, userbean.getId());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int eventStatus(Connection con, EventBean eventbean) {
		// TODO Auto-generated method stub
		String p = "update event_detail set i_status=? where i_event_id=?";
		try (PreparedStatement ps = con.prepareStatement(p)) {
			ps.setString(1, eventbean.getStatus());
			ps.setString(2, eventbean.getId());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int placementStatus(Connection con, PlacementBean placementbean) {
		// TODO Auto-generated method stub
		String p = "update placement_detail set i_status=? where i_user_id=?";
		try (PreparedStatement ps = con.prepareStatement(p)) {
			ps.setString(1, placementbean.getStatus());
			ps.setString(2, placementbean.getId());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
