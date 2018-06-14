import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 @WebServlet("/well")
public class ServletRequest extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("");  
         
        String username = request.getParameter("user");
        ServletConfig config = getServletConfig();
        String fullname = request.getParameter("fullname");
         
        out.print(" <h1><b>Hi "+username+" welcome to Splessons</b></h1>"); 
        out.print("<h2><b>This is your fullname "+fullname+" </b></h2>"); 
 
        out.print("");  
        out.flush();
        out.close();
 }
}