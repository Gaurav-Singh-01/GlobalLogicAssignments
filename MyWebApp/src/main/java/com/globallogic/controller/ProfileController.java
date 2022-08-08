package com.globallogic.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Getting request");
		RequestDispatcher rd = request.getRequestDispatcher("/login.html");
		rd.forward(request, response);
		
		System.out.println("GET");
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("Username : "+name);
		System.out.println("Password : "+password);
		
		RequestDispatcher rs = request.getRequestDispatcher("/Profile.jsp");
		
		request.setAttribute("name", name);
		request.setAttribute("pass", password);
		
		
		rs.forward(request, response);
	}

}
