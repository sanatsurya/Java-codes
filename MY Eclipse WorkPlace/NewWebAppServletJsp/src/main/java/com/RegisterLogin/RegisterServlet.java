package com.RegisterLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		String name = req.getParameter("uname");
		String email = req.getParameter("uemail");
		String password = req.getParameter("upassword");
		String gender = req.getParameter("ugender");
		String typeuser = req.getParameter("usertype");
		String condition = req.getParameter("condition");
		PrintWriter out = res.getWriter();
		if(condition!=null) {			
			out.println("<h1>User name is:  "+name +"  </h1>");
			out.println("<h1>User email is:  "+email +"  </h1>");
			out.println("<h1>User password is:  "+password +"  </h1>");
			out.println("<h1>User gender is:  "+gender +"  </h1>");
			out.println("<h1>User type is:  "+typeuser +"  </h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("SucessesServlet");
			dispatcher.include(req, res);
		}else {
			out.println("<div>You are not signed to our agreements</div>");
			//I try to include register.jsp to it
			RequestDispatcher dispatcher = req.getRequestDispatcher("register.jsp");
			dispatcher.include(req, res);
		}
		
	}
}
