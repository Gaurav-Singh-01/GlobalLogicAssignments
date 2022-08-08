package com.globallogic.employeeController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.globallogic.beans.Employee;
import com.globallogic.queries.Query;

/**
 * Servlet implementation class UpdateEmployeeDetailsController
 */
public class UpdateEmployeeDetailsController extends HttpServlet {
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id  = request.getParameter("id");
		Query q = new Query();
		Employee emp = q.selectEmployeeById(id);
		boolean flag = q.updateDetails(emp);
		if(flag == true) {
		List<Employee> employees = new Query().selectAllEmployee();
		System.out.println(employees);
		
		request.setAttribute("listemployee", employees);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
		
		dispatcher.forward(request, response);
		}
		else {
			System.out.println("No such Id exists");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id  = request.getParameter("updateid");
		Query q = new Query();
		Employee emp = q.selectEmployeeById(id);
		RequestDispatcher rs = request.getRequestDispatcher("/updateEmployee.jsp");
		request.setAttribute("empId",emp.getEmployeeId());
		request.setAttribute("pass",emp.getPassword());
		request.setAttribute("type",emp.getEmployeeType());
		request.setAttribute("first",emp.getFirstName());
		request.setAttribute("last",emp.getLastName());
		request.setAttribute("address",emp.getAddress());
		request.setAttribute("phone",emp.getPhoneNo());
		request.setAttribute("email",emp.getEmail());
		request.setAttribute("gender",emp.getGender());
		request.setAttribute("hire",emp.getHireDate());
		request.setAttribute("sal",emp.getSalary());
		rs.forward(request, response);
	}

}
