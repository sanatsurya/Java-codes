package com.TDIC.registration_login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("name");
		String uemail= request.getParameter("email");
		String uphone= request.getParameter("contact");
		String upassword= request.getParameter("pass");
		RequestDispatcher dispatcher= null;
		
//		My database code
		if(uname.equals("")&& upassword.equals("")) {
			request.setAttribute("status", "failed");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			request.setAttribute("status", "failed");
		}else {
			Connection con = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TDIC?useSSL=false","root","User@1");
				PreparedStatement pst = con.prepareStatement("insert into Registration(uname,uemail,umobile,upwd) values(?,?,?,?)");
				pst.setString(1, uname);
				pst.setString(2, uemail);
				pst.setString(3, uphone);
				pst.setString(4, upassword);
				
				int rowCount=pst.executeUpdate();
				dispatcher = request.getRequestDispatcher("registration.jsp");
				if(rowCount>0) {
					request.setAttribute("status", "sucess");
				}else {
					request.setAttribute("status", "failed");
				}
				dispatcher.forward(request, response);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}finally {
				 try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		
	}

}
//PrintWriter out = response.getWriter();
//out.println(Name);
