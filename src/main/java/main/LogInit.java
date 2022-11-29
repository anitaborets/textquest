package main;

import org.apache.log4j.PropertyConfigurator;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.File;

public class LogInit implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {

    public void contextInitialized(ServletContextEvent event) {
        String homeDir = event.getServletContext().getRealPath("/");
        File propertiesFile = new File(homeDir, "WEB-INF/log4j.properties");
        PropertyConfigurator.configure(propertiesFile.toString());
    }

    public void contextDestroyed(ServletContextEvent event) {
    }

}
