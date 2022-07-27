package com.electoStore.registerLogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = null;
		HttpSession session = request.getSession();
		String loginId = request.getParameter("Email");
		String password	= request.getParameter("Password");
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Electo_Store?useSSL=false","root","User@1");
			PreparedStatement pst = con.prepareStatement("select * from UserTable  where useremail =? and userpassword=?");
			pst.setString(1, loginId);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				session.setAttribute("name",rs.getString("username"));
				dispatcher = request.getRequestDispatcher("index.jsp");
			}else {
				request.setAttribute("status", "failed");
				dispatcher= request.getRequestDispatcher("login.jsp");
			}
			dispatcher.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
