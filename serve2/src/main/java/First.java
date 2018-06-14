//package servletinterface;

import java.io.*;
import javax.servlet.*;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
@WebServlet("/hello")
public class First implements Servlet {
ServletConfig config=null;

public void init(ServletConfig config) throws ServletException {
	this.config=config;
    System.out.println("servlet is initialized");
}

public ServletConfig getServletConfig() {
	return config;
}

public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	res.setContentType("text/html");
    
    PrintWriter out=res.getWriter();
    out.print("<html><body>");
    out.print("<b>Hey man, welcome to SPLesons.</b>");
    out.print("</body></html>");
}

public String getServletInfo() {
	return "copyright 2007-1010";
}

public void destroy() {
	System.out.println("servlet is destroyed");
}



}