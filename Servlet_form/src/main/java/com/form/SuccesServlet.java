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
	   
	   
	   
	   String name = req.getParameter("user_name");
	   String password = req.getParameter("user_password");
	   String email = req.getParameter("user_email");
	 
	   String gender = req.getParameter("user_gender");
	   String course = req.getParameter("user_course");
	   String cond = req.getParameter("conditions");
	   
	   
	   pw.println("<h2>Congratulations! "+ name+"<h2>");
		  
		  pw.println("<h2>Your email is : "+ email+"<h2>");
		  pw.println("<h2>Your course is "+ course+"<h2>");
		  pw.println("<h2>You are a "+ gender+"<h2>");
	   
	   
	  
	}
	
	
}

	
	

