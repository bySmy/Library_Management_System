package com.sumeyye.controller;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sumeyye.dao.UserDatabase;
import com.sumeyye.model.User;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String baseUrl;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     String username = request.getParameter("username");
	     String password = request.getParameter("password");
	     baseUrl=request.getServletContext().getInitParameter("baseUrl");
	     // validation
	     // 1. username boþ olup olmadýðý
	     // 2. password boþ validation
	     
	     User user = new User(username, password);
	     UserDatabase userdatabase = new UserDatabase();
	    
	     
	     if( userdatabase.controlUser(user)) {
	    	HttpSession session=request.getSession();
	    	session.setAttribute("auth_user", user);
	    	response.sendRedirect(baseUrl+"/protected/member.jsp");
	     }
	     else {
	    	 response.sendRedirect("error.jsp");
	     }
	
	}

}