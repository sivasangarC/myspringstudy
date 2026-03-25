package org.exa;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException {

        Tomcat tomcat = new Tomcat();  // Create an embedded Tomcat server programmatically
        tomcat.setPort(8081);          // Set the port Tomcat will listen on
        tomcat.getConnector();         // Initialize the HTTP connector (required in newer Tomcat versions)

        Context context = tomcat.addContext("", System.getProperty("java.io.tmpdir")); // Register a web app context with empty path ("/")

        Tomcat.addServlet(context, "HelloServlet", new HelloServlet()); // Register the servlet with a name
        context.addServletMappingDecoded("/hello", "HelloServlet");     // Map URL /hello to HelloServlet

        tomcat.start();              // Start the Tomcat server
        tomcat.getServer().await();  // Keep the server running — blocks main thread so app doesn't exit
    }
}
