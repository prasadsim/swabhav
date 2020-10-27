package com.techlabs.controller;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Employee;
import com.techlabs.model.EmployeeInsert;

/**
 * Servlet implementation class InsertEmployee
 */
@WebServlet("/InsertEmployee")
public class InsertEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InsertEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UUID id = UUID.randomUUID();
		String name = request.getParameter("name");
		String role = request.getParameter("role");
		EmployeeInsert e = new EmployeeInsert();
		e.addEmployee(new Employee(id, name, role));
		List employeeList = e.getEmployee();
		System.out.println("insertEmployee");
		System.out.println(employeeList.size());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
