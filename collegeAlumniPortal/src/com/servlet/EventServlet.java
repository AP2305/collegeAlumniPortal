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
import com.shared.EventBean;
import com.shared.UserBean;

/**
 * Servlet implementation class EventServlet
 */
public class EventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventServlet() {
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
		EventBean eventbean=new EventBean();
		eventbean.setEname(request.getParameter("eventname"));
		eventbean.setStartdate(request.getParameter("startdate"));
		eventbean.setEnddate(request.getParameter("enddate"));
		eventbean.setVenue(request.getParameter("venue"));
		eventbean.setTime(request.getParameter("time"));
		eventbean.setDesc(request.getParameter("description"));
		eventbean.setStatus("1");
		eventbean.setUserid(((UserBean)session.getAttribute("userBean")).getId());
		
		userService userservice = new userServiceImpl();
		String msg = userservice.saveEventData(eventbean);
		System.out.println(msg);
		request.setAttribute("Messege",msg);
		RequestDispatcher rd=request.getRequestDispatcher("event.jsp");
		request.setAttribute("eventList",userservice.getEventList() );
		System.out.println(userservice.getEventList().get(0));
		rd.forward(request, response);
	}

}
