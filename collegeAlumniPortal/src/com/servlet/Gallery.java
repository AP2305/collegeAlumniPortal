package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.service.userService;
import com.service.impl.userServiceImpl;
import com.shared.GalleryBean;
import com.shared.UserBean;

/**
 * Servlet implementation class Gallery
 */
public class Gallery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Gallery() {
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
		GalleryBean gallery=new GalleryBean();
		gallery.setDescription(request.getParameter("description"));
		gallery.setUserid(((UserBean)session.getAttribute("userBean")).getId());
		
		Part filepart=request.getPart("image");
		if (filepart!=null){
			System.out.println(filepart.getName());
			System.out.println(filepart.getSize());
			System.out.println(filepart.getContentType());
			gallery.setInputImage(filepart.getInputStream());
		}
		
		userService image=new userServiceImpl();
		image.saveGalleryData(gallery);
		RequestDispatcher rd=request.getRequestDispatcher("gallery.jsp");
		request.setAttribute("gallerylist",image.getGalleryList() );
		System.out.println(image.getGalleryList().get(0));
		rd.forward(request, response);
	}

}
