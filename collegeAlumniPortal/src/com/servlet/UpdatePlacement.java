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
 * Servlet implementation class UpdatePlacement
 */
public class UpdatePlacement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePlacement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s=request .getParameter("upid");
		userService userservice=new userServiceImpl();
		PlacementBean placementbean=userservice.GetPlacementData(s);
		request.setAttribute("placement",placementbean);
		RequestDispatcher rd=request.getRequestDispatcher("updatePlacement.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PlacementBean placementbean=new PlacementBean();
		String s=request .getParameter("upid");
		placementbean.setId(s);
		
		placementbean.setCompanyname(request.getParameter("companyname"));
		placementbean.setJobdesc(request.getParameter("jobdescription"));
		placementbean.setStartdate(request.getParameter("startdate"));
		placementbean.setEnddate(request.getParameter("enddate"));
		placementbean.setVenue(request.getParameter("venue"));
		
		userService userservice = new userServiceImpl();
		String msg = userservice.UpdatePlacementData(placementbean);
		System.out.println(msg);
		request.setAttribute("Messege",msg);
		RequestDispatcher rd=request.getRequestDispatcher("placement.jsp");
		request.setAttribute("PlacementList",userservice.getPlacementList() );
		System.out.println(userservice.getPlacementList().get(0));
		rd.forward(request, response);
	}

}
