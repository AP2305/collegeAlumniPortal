package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.userService;
import com.service.impl.userServiceImpl;
import com.shared.StudentBean;
import com.shared.UserBean;

/**
 * Servlet implementation class registrationServlet
 */
public class registrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserBean userbean=new  UserBean();
		StudentBean student=new StudentBean();
		userbean.setFullname(request.getParameter("fullname"));
		userbean.setContact(request.getParameter("contact"));
		userbean.setEmail(request.getParameter("email"));
		userbean.setAddress(request.getParameter("address"));
		userbean.setState(request.getParameter("State"));
		userbean.setCity(request.getParameter("City"));
		userbean.setGender(request.getParameter("gender"));
		userbean.setDob(request.getParameter("dob"));
		userbean.setPassword(request.getParameter("password"));
		userbean.setEnrollno(request.getParameter("enrollno"));
		userbean.setUsertype(request.getParameter("user"));
		
		student.setAdmission(request.getParameter("admissionyear"));
		student.setPassing(request.getParameter("passingyear"));
		System.out.println(request.getParameter("password"));
		userService us = new userServiceImpl();
		us.saveUserData(userbean);
		us.saveStudentData(student);
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}

}
