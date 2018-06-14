import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 @WebServlet("/red")
 
public class SimpleSendRedirect extends HttpServlet {
 
     
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String tutorialName = request.getParameter("name");
        response.sendRedirect("http://www.splessons.com");
        out.flush();
        out.close();
    }
 
}