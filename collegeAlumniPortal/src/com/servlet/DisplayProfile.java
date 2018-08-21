package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.userService;
import com.service.impl.userServiceImpl;
import com.shared.UserBean;

/**
 * Servlet implementation class DisplayProfile
 */
public class DisplayProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		session.getAttribute("userBean");
		
		UserBean userbean=new UserBean();
		userbean.setId(((UserBean)session.getAttribute("userBean")).getId());
		
		userService sb=new userServiceImpl();
		request.setAttribute("userData",sb.GetUserData(userbean));
		request.setAttribute("studentData",sb.GetStudentData(userbean));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
