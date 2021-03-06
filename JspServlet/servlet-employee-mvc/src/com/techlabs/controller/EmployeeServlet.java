package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.EmployeeInsert;
import com.techlabs.model.EmployeeService;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeInsert e = null;

	public EmployeeServlet() {
		super();
		e = new EmployeeInsert();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("employees", this.e.getEmployee());
		RequestDispatcher rd = request.getRequestDispatcher("employee.jsp");
		rd.forward(request, response);
	}

}
