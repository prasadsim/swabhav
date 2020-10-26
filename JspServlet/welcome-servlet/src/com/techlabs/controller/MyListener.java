package com.techlabs.controller;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MyListener implements HttpSessionListener {
	ServletContext ctx = null;
	static int total = 0, current = 0;

	public void sessionCreated(HttpSessionEvent e) {
		total++;
		current++;
		ctx = e.getSession().getServletContext();
		ctx.setAttribute("total", total);
		ctx.setAttribute("current", current);
	}

	public void sessionDestroyed(HttpSessionEvent e) {
		current--;
		ctx.setAttribute("current", current);
	}

}
