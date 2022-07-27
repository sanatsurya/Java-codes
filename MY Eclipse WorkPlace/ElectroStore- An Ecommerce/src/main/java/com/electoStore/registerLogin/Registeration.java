package com.electoStore.registerLogin;

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class Registeration
 */
@WebServlet("/register")
public class Registeration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registeration() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usrname=request.getParameter("Name");
		String uemail = request.getParameter("Email");
		String uphone = request.getParameter("Pone");
		String upassword = request.getParameter("password");
		 
		//database code
		RequestDispatcher dispatcher=null;
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Electo_Store?useSSL=false","root","User@1");
			PreparedStatement pst = con.prepareStatement("insert into UserTable(username,useremail,userphone,userpassword) values(?,?,?,?)");
			pst.setString(1, usrname);
			pst.setString(2, uemail);
			pst.setString(3, uphone);
			pst.setString(4, upassword);
			int rowcount = pst.executeUpdate();
			dispatcher = request.getRequestDispatcher("login.jsp");
			if(rowcount>0) {
				request.setAttribute("status", "sucess");
			}else {
				request.setAttribute("status", "failed");
			}
			dispatcher.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//database code end
	}

}
