

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
 @WebServlet("/set")
public class DemoServletAttribute extends HttpServlet {
 
   public void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
 
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
         
       
         
       //Create session attribute
       HttpSession sessionObject = request.getSession();//Create session object
         
       sessionObject.setAttribute("tutorial", "yes");//create set attribute
         
       //Create ServletContext attribute
       ServletContext servletContextObject = getServletContext();//create sessionContext object
       servletContextObject.setAttribute("contact to", "SPlesson@info.com");
         
       //forward request to servlet2 program
       RequestDispatcher rd = request.getRequestDispatcher("set1");
       request.setAttribute("xname", "SPlesson");//Create request attribute
       request.setAttribute("abc", "SPlesson");//Create request attribute
       rd.forward(request, response);

    // request.getRequestDispatcher("set1").forward(request, response);
         
       out.flush();
       out.close();
   }
 
}