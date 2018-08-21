package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.service.CommonService;
import com.service.impl.CommonServiceImpl;

/**
 * Servlet implementation class StateAndCityServlet
 */
public class StateAndCityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StateAndCityServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String stateId = request.getParameter("id");
		System.out.println(stateId);
		CommonService commonService = new CommonServiceImpl();
		Map<Integer, String> demoMap =  new HashMap<>();
		
		if(stateId!=null && !stateId.isEmpty()) {
			PrintWriter out = response.getWriter();
			JSONObject jsonObject = new JSONObject(commonService.selectCities(Integer.parseInt(stateId)));
		    out.println(jsonObject);
		    System.out.println(commonService.selectCities(Integer.parseInt(stateId)));
		}
		else {
			request.setAttribute("stateMap", commonService.selectStates());
		}
		request.setAttribute("cityMap2", commonService.selectCities2());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
