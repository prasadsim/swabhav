package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/editController")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("studentId");
		StudentService service = StudentService.getInstance();

		List<Student> students = service.getStudents();
		for (Student s : students) {
			if (s.getId().equals(id)) {
				request.setAttribute("editStudent", s);
				RequestDispatcher rd = request.getRequestDispatcher("studentEdit.jsp");
				rd.forward(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		int rollno = Integer.parseInt(request.getParameter("rollno"));
		String id = request.getParameter("id");
		StudentService service = StudentService.getInstance();

		List<Student> students = service.getStudents();
		for (Student s : students) {
			if (s.getId().equals(id)) {
				s.setName(name);
				s.setAge(age);
				s.setRollno(rollno);
				s.setId(id);
			}
		}

		RequestDispatcher rd = request.getRequestDispatcher("studentController");
		rd.forward(request, response);

	}

}
