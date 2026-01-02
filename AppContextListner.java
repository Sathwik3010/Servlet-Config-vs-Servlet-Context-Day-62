package com.codegnan.web;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
@WebListener
public class AppContextListner implements ServletContextListener{
public void contextInitialized(ServletContextEvent sce) {
	ServletContext context = sce.getServletContext();
	context.setInitParameter("A", "AAA");
	context.setInitParameter("B", "BBB");

}
}
