import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Config implements ServletContextListener {

    // @Override
    public void contextInitialized(ServletContextEvent event) {
        ServletContext servletContext = event.getServletContext(); 
        servletContext.setInitParameter("username", "ABC");
    }

	public void contextDestroyed(ServletContextEvent sce) {
		
	}

    

}