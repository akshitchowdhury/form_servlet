package com.form;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class SuccesServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp  )throws ServletException, IOException 
	{
	   resp.setContentType("text/html");
	   
	   PrintWriter pw = resp.getWriter();
	   pw.println("<h1>Succesfully Working</h1>");
	   pw.println("<h1>Server flight test running</h1>");
	   
	   
	  
	}
	
	
}

	
	

