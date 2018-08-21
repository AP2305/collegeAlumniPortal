package com.service.impl;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.dao.commondao;
import com.dao.userdao;
import com.dao.impl.commondaoimpl;
import com.dao.impl.daoimpl;
import com.service.userService;
import com.shared.EventBean;
import com.shared.FeedbackBean;
import com.shared.GalleryBean;
import com.shared.PlacementBean;
import com.shared.QueryBean;
import com.shared.StudentBean;
import com.shared.UserBean;
import com.shared.SendEmail;;

public class userServiceImpl implements userService{

	commondao comdao = new commondaoimpl();
	userdao userdao = new daoimpl();

	public String saveUserData(UserBean userbean) {
		int rowsInserted;

		String msg = "Registration Failed";
		try (Connection con = comdao.getConnnection()) {
			rowsInserted = userdao.insertUserData(con, userbean);
			if (rowsInserted >= 1) {
				msg = "Registration Successfull";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return msg;
	}
	commondao Comdao=new commondaoimpl();
	userdao Userdao=new daoimpl();
	public String saveEventData(EventBean eventbean) {
		int rowsInserted;

		String msg = "Registration Failed";
		try (Connection con = Comdao.getConnnection()) {
			rowsInserted = Userdao.insertEventData(con, eventbean);
			if (rowsInserted >= 1) {
				msg = "Registration Successfull";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return msg;
	}
	commondao comDao=new commondaoimpl();
	userdao userDao=new daoimpl();
	public String savePlacementData(PlacementBean placementbean) {
		int rowsInserted;

		String msg = "Registration Failed";
		try (Connection con = comDao.getConnnection()) {
			rowsInserted = userDao.insertPlacementData(con, placementbean);
			if (rowsInserted >= 1) {
				msg = "Registration Successfull";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return msg;
	}
	commondao commdao = new commondaoimpl() ;
	userdao UserDao =new daoimpl();
	public String saveFeedbackData(FeedbackBean feedbackbean) {
		// TODO Auto-generated method stub
		int rowsInserted;

		String msg = "Registration Failed";
		try (Connection con = commdao.getConnnection()) {
			rowsInserted = UserDao.insertFeedbackData(con, feedbackbean);
			if (rowsInserted >= 1) {
				msg = "Registration Successfull";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return msg;
	}
public List<FeedbackBean> getFeedbackList() {
		
		try (Connection con = comdao.getConnnection()) {
			return userdao.selectFeedbackList(con);
		}catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
public String DeleteFeedbackData(FeedbackBean feedbackbean) {
	// TODO Auto-generated method stub
	try (Connection con = comdao.getConnnection()) {
		int i= userdao.DeleteFeedbackData(con, feedbackbean);
		if (i> 0) {
			 return "Success";
		}
		else{
			 return "Fail";
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
}


	@Override
	public List<UserBean> getUserList() {
		
		try (Connection con = comdao.getConnnection()) {
			return userdao.selectUserList(con);
		}catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public UserBean GetUserData(UserBean userBean) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			return userdao.getuserdata(con,userBean);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public StudentBean GetStudentData(UserBean userBean) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			return userdao.getstudentdata(con,userBean);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String UpdateUserData(UserBean userbean) {
		// TODO Auto-generated method stub
		
		try (Connection con = comdao.getConnnection()) {
			int i= userdao.updateUserData(con, userbean);
			if (i> 0) {
				 return "Success";
			}
			else{
				 return "Fail";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
		
	}

	@Override
	public String DeleteData(UserBean userbean) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			int i= userdao.DeleteUserData(con, userbean);
			if (i> 0) {
				 return "Success";
			}
			else{
				 return "Fail";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<EventBean> getEventList() {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			return userdao.selectEventList(con);
		}catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
	@Override
	public List<PlacementBean> getPlacementList() {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			return userdao.selectPlacementList(con);
		}catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
	@Override
	public String DeleteEventData(EventBean eventbean) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			int i= userdao.DeleteEventData(con, eventbean);
			if (i> 0) {
				 return "Success";
			}
			else{
				 return "Fail";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String DeletePlacementData(PlacementBean placementbean) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			int i= userdao.DeletePlacementData(con, placementbean);
			if (i> 0) {
				 return "Success";
			}
			else{
				 return "Fail";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public EventBean GetEventData(String eid) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			return userdao.geteventdata(con,eid);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String UpdateEventData(EventBean eventbean) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			int i= userdao.updateEventData(con, eventbean);
			if (i> 0) {
				 return "Success";
			}
			else{
				 return "Fail";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String UpdatePlacementData(PlacementBean placementbean) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			int i= userdao.UpdatePlacementData(con, placementbean);
			if (i> 0) {
				 return "Success";
			}
			else{
				 return "Fail";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public PlacementBean GetPlacementData(String pid) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			return userdao.getPlacementdata(con,pid);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public UserBean Login(String email, String password) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
		return userdao.validateUser(con,email,password);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String saveGalleryData(GalleryBean galleryBean) {
		// TODO Auto-generated method stub
		int rowsInserted;

		String msg = "Registration Failed";
		try (Connection con = comdao.getConnnection()) {
			rowsInserted = userdao.insertGalleryData(con, galleryBean);
			if (rowsInserted >= 1) {
				msg = "Registration Successfull";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<GalleryBean> getGalleryList() {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			return userdao.selectGalleryList(con);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String DeleteGalleryData(GalleryBean gallerybean) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			int i= userdao.DeleteGalleryData(con, gallerybean);
			if (i> 0) {
				 return "Success";
			}
			else{
				 return "Fail";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String saveQuerydata(QueryBean querybean) {
		// TODO Auto-generated method stub
		int rowsInserted;

		String msg = "Registration Failed";
		try (Connection con = comdao.getConnnection()) {
			rowsInserted = userdao.insertQueryData(con,querybean);
			if (rowsInserted >= 1) {
				msg = "Registration Successfull";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<QueryBean> getQueryList() {
		// TODO Auto-generated method stub
		try(Connection con=comdao.getConnnection()){
			return userdao.selectQueryList(con);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String saveQueryAnswerdata(QueryBean querybean) {
		// TODO Auto-generated method stub
		int rowsInserted;
		
		String msg="Registration Failed";
		try(Connection con=comdao.getConnnection()){
			rowsInserted=userdao.insertQueryAnswerData(con,querybean);
			if(rowsInserted>=1){
				msg="Registration Successfull";
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<QueryBean> getQueryAnswerList() {
		// TODO Auto-generated method stub
		try(Connection con=comdao.getConnnection()){
			return userdao.selectQueryList(con);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String UpdateStudentData(StudentBean studentBean) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			int i= userdao.updateStudentData(con, studentBean);
			if (i> 0) {
				 return "Success";
			}
			else{
				 return "Fail";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String saveStudentData(StudentBean studentBean) {
		// TODO Auto-generated method stub
		int rowsInserted;

		String msg = "Registration Failed";
		try (Connection con = comdao.getConnnection()) {
			rowsInserted = userdao.insertStudentData(con, studentBean);
			if (rowsInserted >= 1) {
				msg = "Registration Successfull";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return msg;
	}
	@Override
	public void getPassword(String parameter) {
		// TODO Auto-generated method stub,
		try (Connection con = comdao.getConnnection()) {
			UserBean userbean=userdao.selectPassword(con,parameter);
			String password=userbean.getPassword();
			System.out.println("password here is :" + password);
			if (password!=null){
				SendEmail.send("yashshah5325@gmail.com", parameter,"Please find your Password",
						"Your password College Alumni Portal is::" + password);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<UserBean> getreportlist(UserBean userBean) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			return userdao.selectReportList(con,userBean);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String changeUserStatus(UserBean userbean) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			int i= userdao.userStatus(con, userbean);
			if (i> 0) {
				 return "Success";
			}
			else{
				 return "Fail";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String ChangeEventStatus(EventBean eventbean) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			int i= userdao.eventStatus(con, eventbean);
			if (i> 0) {
				 return "Success";
			}
			else{
				 return "Fail";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String ChangePlacementStatus(PlacementBean placementbean) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			int i= userdao.placementStatus(con, placementbean);
			if (i> 0) {
				 return "Success";
			}
			else{
				 return "Fail";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
