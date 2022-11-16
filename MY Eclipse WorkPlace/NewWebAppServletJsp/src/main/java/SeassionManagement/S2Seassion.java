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
 * Servlet implementation class S2Seassion
 */
@WebServlet("/S2Seassion")
public class S2Seassion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S2Seassion() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
    	processRequest(request,response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	processRequest(request,response);

			}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("s1name");
		response.setContentType("text/html");
		try(PrintWriter out = response.getWriter()){
			//String name = request.getParameter("name");
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<body>");
			out.println("<h2>your name is "+name+"welcome to the page</h2>");
//			String name = request.getParameter(getServletName());
//			Getting all the cookies
			
			
//			-----------------Cookies fetching technique start-----------------
//			Cookie[] cookies = request.getCookies();//This will fetch all the cookies from the user as array
//			boolean flag = false;
//			String name = "";
//			if(cookies==null) {
//				out.println("<p>Please go back and insert valid name </p>");
//			}else {
//				for(Cookie c:cookies) {
//					String temp =c.getName();
//					if(temp.equals("user_name")) {
//						out.println("<h1>"+name+"</h1>");
//						out.println("<h2>Welcome TO THE S1 SERVER</h2>");
//					}
//				}
//			}
//			--------------------Cokies Fething end------------------------------
			
			out.println("</body>");
			out.println("</head>");
			out.println("</html>");
			
			out.print("Welcome sir"+name);
		}
				PrintWriter out = response.getWriter();
				out.println("You are sucess fully get connected");
	}
	}

