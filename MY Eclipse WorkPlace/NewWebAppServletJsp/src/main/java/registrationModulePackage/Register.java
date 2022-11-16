package registrationModulePackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Register
 */

@WebServlet("/Register")
@MultipartConfig
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Part part=request.getPart("image");
		String imagefile= part.getSubmittedFileName();
		out.println("Server is connected");
		String name = request.getParameter("uname");
		String email = request.getParameter("uemail");
		String phone = request.getParameter("uphone");
		String password = request.getParameter("upassword");
		
//		Connection to database********************
		try {
			Thread.sleep(3000);
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspservletpractice?useSSL=false","root","User@1");
//			--Use query
			PreparedStatement prp = connection.prepareStatement("insert into userdetails(uname,uemail,upassword,uphone,uimage) values(?,?,?,?,?)");
			prp.setString(1, name);
			prp.setString(2, email);
			prp.setString(3, password);
			prp.setString(4, phone);
			prp.setString(5, imagefile);
			prp.executeUpdate();
			out.print("done");
//			Upload file control
			InputStream is = part.getInputStream();
			byte[] data = new byte[is.available()];
			is.read(data);
			String path = request.getRealPath("/")+"image"+File.separator+imagefile;
			out.print(path);
			FileOutputStream fileOutputStream = new FileOutputStream(path);
			fileOutputStream.write(data);
			fileOutputStream.close();
			
		} catch (ClassNotFoundException | SQLException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
