//package servletattribute;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 @WebServlet("/set1")
public class ForwardAttributes extends HttpServlet {
 
   public void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       //general settings
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
         
       //reading request attribute value
       out.println("servlet2 request attribute value::"+request.getAttribute("abc")+"");
         
       //reading session attribute value
       HttpSession sessionObject = request.getSession();
       out.println("servlet session attribute value::"+sessionObject.getAttribute("tutorial")+"");
         
       //reading servlet context value
         
       ServletContext contextObject = getServletContext();
       out.println("servlet session attribute value::"+contextObject.getAttribute("contact to")+"");
         
       out.flush();
       out.close();
   }
 
}