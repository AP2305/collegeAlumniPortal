package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.userService;
import com.service.impl.userServiceImpl;
import com.shared.PlacementBean;

/**
 * Servlet implementation class DeletePlacement
 */
public class DeletePlacement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePlacement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PlacementBean placementbean=new PlacementBean();
		String s=request.getParameter("did");
		placementbean.setCompanyname(request.getParameter("companyname"));
	    placementbean.setJobdesc(request.getParameter("jobdesc"));
		placementbean.setStartdate(request.getParameter("startdate"));
		placementbean.setEnddate(request.getParameter("enddate"));
		placementbean.setVenue(request.getParameter("venue"));
		placementbean.setId(s);
		  userService userservice = new userServiceImpl();
		  userservice.DeletePlacementData(placementbean);
			
			RequestDispatcher rd=request.getRequestDispatcher("placement.jsp");
			request.setAttribute("PlacementList", userservice.getPlacementList());
			System.out.println(userservice.getPlacementList().get(0));
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
