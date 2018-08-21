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
 * Servlet implementation class approvePlacementServlet
 */
public class approvePlacementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public approvePlacementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PlacementBean place=new PlacementBean();
		place.setId(request.getParameter("apid"));
		place.setStatus(request.getParameter("status"));
		
		userService status=new userServiceImpl();
		status.ChangePlacementStatus(place);
		
		RequestDispatcher rd=request.getRequestDispatcher("adminPlacement.jsp");
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
