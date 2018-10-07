package com.distribuida;

import java.io.File;

import javax.servlet.ServletException;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;




public class LevantaServidor {

	public static void main(String[] args) throws LifecycleException, InterruptedException, ServletException {

		String webappDirLocation = "WebContent/";
		Tomcat tomcat = new Tomcat();
		String webPort = System.getenv("PORT");
		if (webPort == null || webPort.isEmpty()) {
			webPort = "8080";
		}

		tomcat.setPort(Integer.valueOf(webPort));
		Connector connector = tomcat.getConnector();
		connector.setURIEncoding("UTF-8");
		tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
		System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());
		tomcat.start();
		tomcat.getServer().await();
	}

	/*
	 * String docBase = "WebContent/";
	 * 
	 * Tomcat serv = new Tomcat(); serv.setPort(8888);
	 * 
	 * serv.addWebapp("/", new File(docBase).getAbsolutePath()); serv.start();
	 * serv.getServer().await();
	 */
}
