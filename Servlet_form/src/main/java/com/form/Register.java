package com.form;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Register extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		pw.println("<h2>Welcome to the Register Servlet");
		
		 String name = req.getParameter("user_name");
		   String password = req.getParameter("user_password");
		   String email = req.getParameter("user_email");
		 
		   String gender = req.getParameter("user_gender");
		   String course = req.getParameter("user_course");
		   String cond = req.getParameter("conditions");
		   
		   
		   if(cond.equals("checked")) {
			   
			   
			  /* pw.println(name);
			   pw.println(email);
			   pw.println(password);
			   pw.println(course);
			   pw.println(gender);*/
				
			   
				  pw.println("<h2>Congratulations! "+ name+"<h2>");
				  
				  pw.println("<h2>Your email is : "+ email+"<h2>");
				  pw.println("<h2>Your course is "+ course+"<h2>");
				  pw.println("<h2>You are a "+ gender+"<h2>");
				 
			   
		   
		   
		  
		
	
	}
	}
	
}
