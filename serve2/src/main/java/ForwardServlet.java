import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/Splessons")
public class ForwardServlet extends HttpServlet {
 
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String email = request.getParameter("email");
         
        out.println("<h1>Thank you ::"+username+" From Splessons</h1>");
        out.println("<h2>This is your Email ID::"+email+"</h2>");
        out.flush();
        out.close();
    }}