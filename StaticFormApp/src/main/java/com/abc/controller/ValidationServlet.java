package com.abc.controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidationServlet
 */
@WebServlet(urlPatterns={"/login"}, loadOnStartup=1)
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("Servlet Loading...");
	}
       
    
    public ValidationServlet() {
        
        System.out.println("Servlet Instantiation...");
    }

	@Override
	public void init() throws ServletException {
		
		System.out.println("Servlet Intialization...");
	}

	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request processing phase...");
		
		//Setting the MIME type
		response.setContentType("text/html");
		
		//Get the PrintWriter object to send the response
		
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("username");
		String userPassword = request.getParameter("upwd");
		
		out.println("<html> <head> <title>Login page</title> </head>");
		out.println("<body>");
		
		// Assume username= Dhoni Password=MSD
		if (userName.equalsIgnoreCase("dhoni") && userPassword.equals("MSD")) 
		{
			out.println("<h1> Login Sucess</h1>");
			
		} else {
			out.println("<h1> Login fail</h1>");

		}
		
		out.println("</body>");
		
		//close the PrintWriter Object
		out.close();
		
		 
	}

}
