package com.ServletsF;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.tomcat.jni.Time;

public class MyFirstServlet implements Servlet{
	ServletConfig conf;
	@Override
	public void destroy() {
		System.out.println("This is going to be destroyed");
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.conf;
	}
	//These are the life cycle method
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This servlet is created by sanat";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("The servlet is Started");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("This servlet is processing requestes");
		//Set the content type of the response
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>The date is "+new Date().toString()+"</h1>");
	}

}
