

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/aa")
public class First implements Servlet{
ServletConfig config;

public void init(ServletConfig config){
this.config=config;
System.out.println("servlet is initialized");
}

public void service(ServletRequest req,ServletResponse res)
throws IOException,ServletException{

res.setContentType("text/html");

PrintWriter out=res.getWriter();
out.print("");
out.print("<b>Hey man, welcome to SPLesons.</b>");
out.print("");

}
public void destroy(){System.out.println("servlet is destroyed");}
public ServletConfig getServletConfig(){return config;}
public String getServletInfo(){return "copyright 2007-1010";}

//public void service(javax.servlet.ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
}

