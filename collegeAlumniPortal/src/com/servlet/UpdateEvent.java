package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.userService;
import com.service.impl.userServiceImpl;
import com.shared.EventBean;

/**
 * Servlet implementation class UpdateEvent
 */
public class UpdateEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEvent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s=request.getParameter("upid");
		userService userservice=new userServiceImpl();
		EventBean bean=userservice.GetEventData(s);
		
		request.setAttribute("event",bean);
		RequestDispatcher rd=request.getRequestDispatcher("updateEvent.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EventBean eventbean = new EventBean();
		String s=request .getParameter("upid");
		eventbean.setId(s);
		eventbean.setEname(request.getParameter("eventname"));
		eventbean.setStartdate(request.getParameter("startdate"));
		eventbean.setEnddate(request.getParameter("enddate"));
		eventbean.setVenue(request.getParameter("venue"));
		eventbean.setTime(request.getParameter("time"));
		eventbean.setDesc(request.getParameter("description"));
		
		userService userservice2=new userServiceImpl();
		String message=userservice2.UpdateEventData(eventbean);
		System.out.println(message);
		
		RequestDispatcher rd=request.getRequestDispatcher("event.jsp");
		request.setAttribute("eventList",userservice2.getEventList() );
		System.out.println(userservice2.getEventList().get(0));
		rd.forward(request, response);
	}

}
