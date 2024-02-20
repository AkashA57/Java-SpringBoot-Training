package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;


@WebListener
public class ApplicationScopeListener implements ServletContextListener {

    
    public void contextDestroyed(ServletContextEvent arg0)  { 
      
    }

	
    public void contextInitialized(ServletContextEvent arg0)  { 
    	ServletContext applicationScope = arg0.getServletContext();
    	applicationScope.setAttribute("email", "email@email.com"); 
    }
	
}
