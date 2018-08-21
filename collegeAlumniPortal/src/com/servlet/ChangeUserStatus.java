package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.userService;
import com.service.impl.userServiceImpl;
import com.shared.UserBean;

/**
 * Servlet implementation class ChangeUserStatus
 */
public class ChangeUserStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeUserStatus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserBean status=new UserBean();
		System.out.println(request.getParameter("id")); 
		System.out.println(request.getParameter("status"));
		status.setId(request.getParameter("id"));
		status.setStatus(request.getParameter("status"));
		
		userService cs=new userServiceImpl();
		cs.changeUserStatus(status);
		
		RequestDispatcher rd=request.getRequestDispatcher("Users.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
