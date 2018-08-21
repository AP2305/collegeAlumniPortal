package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.userService;
import com.service.impl.userServiceImpl;
import com.shared.QueryBean;

/**
 * Servlet implementation class QueryServlet
 */
public class QueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryServlet() {
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
		HttpSession session=request.getSession();
		session.getAttribute("userBean");
		QueryBean querybean=new QueryBean();
		
		querybean.setStudentid("1");
		querybean.setDesc(request.getParameter("Description"));
		querybean.setPosteddate(request.getParameter("date"));
//		querybean.setStudentid(((UserBean)session.getAttribute("userBean")).getId());
		userService userservice=new userServiceImpl();
		String msg=userservice.saveQuerydata(querybean);
		System.out.println(msg);
		
		request.setAttribute("Query",msg);
		RequestDispatcher rd=request.getRequestDispatcher("query.jsp");
		request.setAttribute("Querylist",userservice.getQueryList());
		System.out.println(userservice.getQueryList().get(0));
		rd.forward(request, response);
	}

}
