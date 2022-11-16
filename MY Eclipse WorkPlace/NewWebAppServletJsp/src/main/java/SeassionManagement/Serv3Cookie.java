package SeassionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv3Cookie
 */
@WebServlet("/Serv3Cookie")
public class Serv3Cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv3Cookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter out = response.getWriter()){
			//String name = request.getParameter("name");
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<body>");
//			String name = request.getParameter(getServletName());
//			Getting all the cookies
			Cookie[] cookies = request.getCookies();//This will fetch all the cookies from the user as array
			boolean flag = false;
			String name = "";
			if(cookies==null) {
				out.println("<p>Please go back and insert valid name </p>");
			}else {
				for(Cookie c:cookies) {
					String temp =c.getName();
					if(temp.equals("user_name")) {
						out.println("<h1>"+name+"</h1>");
						out.println("<h2>Welcome TO THE S1 SERVER</h2>");
					}else {
						out.println("<h3>You are a new user</h3>");
					}
				}
			}
			out.println("</body>");
			out.println("</head>");
			out.println("</html>");
			
			out.print("Welcome sir"+name);
		}
				PrintWriter out = response.getWriter();
				out.println("You are sucess fully get connected");
			}
	}


