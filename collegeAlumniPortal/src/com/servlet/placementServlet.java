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
import com.shared.PlacementBean;
import com.shared.UserBean;

/**
 * Servlet implementation class placementServlet
 */
public class placementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public placementServlet() {
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
		PlacementBean placementbean=new PlacementBean();
		placementbean.setCompanyname(request.getParameter("companyname"));
		placementbean.setJobdesc(request.getParameter("jobdescription"));
		placementbean.setStartdate(request.getParameter("startdate"));
		placementbean.setEnddate(request.getParameter("enddate"));
		placementbean.setVenue(request.getParameter("venue"));
		placementbean.setStatus("-1");
		placementbean.setUserid(((UserBean)session.getAttribute("userBean")).getId());
		
		userService userservice = new userServiceImpl();
		String msg = userservice.savePlacementData(placementbean);
		System.out.println(msg);
		request.setAttribute("Messege",msg);
		RequestDispatcher rd=request.getRequestDispatcher("placement.jsp");
		request.setAttribute("PlacementList",userservice.getPlacementList() );
		System.out.println(userservice.getPlacementList().get(0));
		rd.forward(request, response);
	}

}
