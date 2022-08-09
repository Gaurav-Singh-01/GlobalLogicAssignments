package com.globallogic.employeeController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditEmployeeByTag
 */
public class EditEmployeeByTag extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service Executing");
		String action = request.getServletPath();
		
		System.out.println(action);
		String empid = request.getParameter("id1");
		System.out.println(empid);
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get Executing");
		String action = request.getServletPath();
		System.out.println(action);
		String empid = request.getParameter("id1");
		System.out.println(empid);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
