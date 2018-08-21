package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.userService;
import com.service.impl.userServiceImpl;
import com.shared.UserBean;

/**
 * Servlet implementation class generateReport
 */
public class generateReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public generateReport() {
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
		userbean.setCity(request.getParameter("City"));
		userbean.setUsertype(request.getParameter("usertype"));
		userService report=new userServiceImpl();
		
		List<UserBean> userBeans = report.getreportlist(userbean);
		request.setAttribute("pdfData",userBeans);
		RequestDispatcher rd=request.getRequestDispatcher("reportDisplay.jsp");
		rd.forward(request, response );
	}

}
