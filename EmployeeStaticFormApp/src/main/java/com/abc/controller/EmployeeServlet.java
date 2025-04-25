package com.abc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet(urlPatterns={"/test"}, loadOnStartup=10)
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    static {
    	System.out.println("Sevlet Loading..");
    }
    public EmployeeServlet() {
       
       System.out.println("Servlet Instatntiation..");
    }
    @Override
    public void init() throws ServletException {
    	System.out.println("Servlet Intialisation..");
    }
    
    

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Setting the MIME type
		response.setContentType("text/html");
		
		//Getting the PrinterWriter object to send the response
		PrintWriter out = response.getWriter();
		
		String eid = request.getParameter("eid");
		String ename = request.getParameter("ename");
		String eage = request.getParameter("eage");
		String eaddress = request.getParameter("eaddress");
		
		out.println("<html><head><title> EMPLOYEE REGISTERATION FORM</title></head>");
		out.println("<body>");
		
		out.println("<table border='1'>");
		out.println("<tr><td>EID </td><td>" + eid + "</td></tr>");
		out.println("<tr><td>ENMAE </td><td>" + ename + "</td></tr>");
		out.println("<tr><td>EAGE </td><td>" + eage + "</td></tr>");
		out.println("<tr><td>EADDRESS </td><td>" + eaddress + "</td></tr>");
		out.println("</table>");
		out.println("<h1 style='color:red;text-align:center'><a href= 'index.html'>|Registeration Page|</a></h1>");
		
		out.println("</body>");
	
		
		//Closing the PrinterWriter
		out.close();
		
		
	}

}
