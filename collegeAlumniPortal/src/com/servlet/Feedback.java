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
import com.shared.FeedbackBean;
import com.shared.UserBean;

/**
 * Servlet implementation class Feedback
 */
public class Feedback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Feedback() {
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
		FeedbackBean feedbackbean = new FeedbackBean();
		feedbackbean.setSubject(request.getParameter("Subject"));
		feedbackbean.setDesc(request.getParameter("Description"));
		feedbackbean.setUserid(((UserBean)session.getAttribute("userBean")).getId());
		
        userService userservice = new userServiceImpl();
	    String msg=userservice.saveFeedbackData(feedbackbean);
	    request.setAttribute("Message", msg);
	    RequestDispatcher rd=request.getRequestDispatcher("feedback.jsp");
		request.setAttribute("feedbacklist", userservice.getFeedbackList());
		System.out.println(userservice.getFeedbackList().get(0));
		rd.forward(request, response);
	}

}
