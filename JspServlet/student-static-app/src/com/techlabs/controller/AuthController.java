package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.LoginService;

/**
 * Servlet implementation class AuthController
 */
@WebServlet("/authController")
public class AuthController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AuthController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		RequestDispatcher rd;
		LoginService login = new LoginService();
		HttpSession session = request.getSession();
		if (login.check(username, password)) {
			session.setAttribute("accountType", "admin");
		}
		rd = request.getRequestDispatcher("studentController");
		rd.forward(request, response);
//
//		if (login.check(username, password)) {
//			rd = request.getRequestDispatcher("studentController");
//		} else if (username.equals("guest")) {
//			rd = request.getRequestDispatcher("guestController");
//		} else {
//			rd = request.getRequestDispatcher("error.html");
//		}
//		rd.forward(request, response);
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
