import java.io.*;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

/**
* Servlet implementation class GetHandler
*/
@jakarta.servlet.annotation.WebServlet("/NameServlet")
public class NameServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public NameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
                // TODO Auto-generated method stub
        	PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            out.println("Your full name is " + fname + " " + lname);
            out.println("</body></html>");
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}
