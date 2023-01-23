package iti.jets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class HelloServlet implements Servlet
{

    public void destroy() {
        // TODO Auto-generated method stub
        System.out.println("detroy method");
    }

    public ServletConfig getServletConfig() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getServletInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    public void init(ServletConfig arg0) throws ServletException {
    System.out.println("init function");
        
    }

    public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
        arg1.setContentType("text/html");
        PrintWriter out = arg1.getWriter();
        out.println("<p>Hello servlets<p>");
        System.out.println("I am inside the service method");

    }

}