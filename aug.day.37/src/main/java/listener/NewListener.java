package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class NewListener implements ServletContextListener {

  
    public void contextDestroyed(ServletContextEvent arg0)  { 
         
    }

	
    public void contextInitialized(ServletContextEvent arg0)  { 
         
    }
	
}
