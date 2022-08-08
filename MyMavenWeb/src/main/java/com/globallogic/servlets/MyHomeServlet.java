package com.globallogic.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyHomeServlet extends HttpServlet {
	
	public void destroy() {
		System.out.println("Destroy");
	}
	

	

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//how to return a page using servlet
		System.out.println("Servicing");
		RequestDispatcher rd = request.getRequestDispatcher("/home.html");
		rd.forward(request, response);
	}

}
