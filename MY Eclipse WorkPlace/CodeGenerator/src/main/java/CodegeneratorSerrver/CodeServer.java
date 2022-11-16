package CodegeneratorSerrver;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CodeServer
 */
@WebServlet("/CodeServer")
public class CodeServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CodeServer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher =null;
		PrintWriter out = response.getWriter();
		String mo = request.getParameter("monumber");
		String code ="";
		if(mo.length()==8||mo.length()==12) {
			if(mo.length()==8) {
				String stb = "0000"+mo;
				code="select * from sfcmousn where mousn where mo ='"+stb+"'and usn not in (select usn from sfcusn where mo='"+stb+"')";
				//out.println(code);
			}
			if(mo.length()==12) {
				 code ="select * from sfcmousn where mousn where mo ='"+mo+"'and usn not in (select usn from sfcusn where mo='"+mo+"')";
				//out.println();
			}
			
			
		}else {
			code="invalid input";
		}
		dispatcher = request.getRequestDispatcher("codegen.jsp");
		request.setAttribute("sqlcode",code);
		dispatcher.forward(request, response);
		
		
	}

}
