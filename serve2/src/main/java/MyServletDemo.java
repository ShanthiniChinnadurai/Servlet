//package servletresponse;

import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.io.*;
@WebServlet("/mydetails")
public class MyServletDemo extends HttpServlet{
  public void doGet(HttpServletRequest req,HttpServletResponse res)
  throws ServletException,IOException
  {
    res.setContentType("text/html");
    PrintWriter pwriter=res.getWriter();
    String name=req.getParameter("uname");
    pwriter.println("User Details Page:");
    pwriter.println("Hello "+name);
    pwriter.close();
 }
}