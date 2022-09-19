package com.ServletsF;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		System.out.println("This is the initial of the service is started");
		PrintWriter out = res.getWriter();
		out.print("<h1>This is the http servlet</h1>");
		out.println(new Date().toString());
	}
}
