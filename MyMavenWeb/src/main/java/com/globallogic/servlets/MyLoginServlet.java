package com.globallogic.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyLoginServlet
 */
public class MyLoginServlet extends HttpServlet {
	
	public void destroy() {
		System.out.println("Destroy");
	}
	

	

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Servicing2");
		RequestDispatcher rd = request.getRequestDispatcher("/login.html");
		rd.forward(request, response);
	}

}
