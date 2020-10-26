package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletListener")
public class ServletListener extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String n = request.getParameter("name");
		out.print("Welcome " + n);

		HttpSession session = request.getSession();
		session.setAttribute("name", n);

		ServletContext ctx = getServletContext();
		int t = (Integer) ctx.getAttribute("total");
		int c = (Integer) ctx.getAttribute("current");
		out.print("<br>total users= " + t);
		out.print("<br>current users= " + c);
		out.print("<br><a href='ServletListener2'>logout</a>");
		out.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
