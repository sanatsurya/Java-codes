package SeassionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

/**
 * Servlet implementation class S1Seassion
 */
@WebServlet("/S1Seassion")
public class S1Seassion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S1Seassion() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter out = response.getWriter()){
			String name = request.getParameter("name");
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<body>");
//			String name = request.getParameter(getServletName());
			
			out.println("<h1>"+name+"</h1>");
			out.println("<h2>Welcome TO THE S1 SERVER</h2>");
			out.println("<a href='S2Seassion'>Sevlet2 Login</a>");
//			To send cookies to the user browser
//			Create the object of cookies class which is available in https package
//			Cookie c = new Cookie("user_name", name);
//			response.addCookie(c);
//			To send the data to browser using hidden field
			out.println("<input type='hidden' value='"+name+"' name='s1name'/>");
			out.println("</body>");
			out.println("</head>");
			out.println("</html>");
			
			out.print("Welcome sir"+name);
		}
				PrintWriter out = response.getWriter();
				out.println("You are sucess fully get connected");
			}
	

}
