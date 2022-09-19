package com.ServletsF;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//Creating servlet using GenericServlet Class
public class SecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servlet is serving your request");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>This is the second servlet</h1>");
	}
	
}
