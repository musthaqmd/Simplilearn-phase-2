import java.io.*;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;

/**
* Servlet implementation class GetHandler
*/
@jakarta.servlet.annotation.WebServlet("/GetHandler")
public class GetHandler extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public GetHandler() {
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
                    
                    String name = request.getParameter("name");
                    String address = request.getParameter("address");
                    out.println("Name=" + name + "<br>Address=" + address);
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
