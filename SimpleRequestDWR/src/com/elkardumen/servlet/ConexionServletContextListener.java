package com.elkardumen.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ConexionServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
		System.out.println("Servlet conext destroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Servlet conext initialized");
	}

}
