package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.userService;
import com.service.impl.userServiceImpl;
import com.shared.FeedbackBean;

/**
 * Servlet implementation class Deletefeedback
 */
public class Deletefeedback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Deletefeedback() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		FeedbackBean feedbackBean = new FeedbackBean();
		String s=request.getParameter("id");
		feedbackBean.setSubject(request.getParameter("Subject"));
		feedbackBean.setDesc(request.getParameter("Description"));
		feedbackBean.setId(s);
		System.out.println(s);
		  userService userservice = new userServiceImpl();
		  userservice.DeleteFeedbackData(feedbackBean);
			
			RequestDispatcher rd=request.getRequestDispatcher("feedback.jsp");
			request.setAttribute("feedbacklist", userservice.getFeedbackList());
			System.out.println(userservice.getFeedbackList().get(0));
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
