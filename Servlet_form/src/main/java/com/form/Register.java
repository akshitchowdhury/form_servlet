package com.form;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
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
		
		//getPArameter method links index.html page with each of the data's url
		
		/*
		 * String name = req.getParameter("user_name"); String password =
		 * req.getParameter("user_password"); String email =
		 * req.getParameter("user_email");
		 * 
		 * String gender = req.getParameter("user_gender"); String course =
		 * req.getParameter("user_course"); String cond =
		 * req.getParameter("conditions");
		 */
		String cond =
				 req.getParameter("conditions");
		 if(cond!= null) {
		   
		   if(cond.equals("checked")) {
			   
			   
			  /* pw.println(name);
			   pw.println(email);
			   pw.println(password);
			   pw.println(course);
			   pw.println(gender);*/
				
			   
				/*
				 * pw.println("<h2>Congratulations! "+ name+"<h2>");
				 * 
				 * pw.println("<h2>Your email is : "+ email+"<h2>");
				 * pw.println("<h2>Your course is "+ course+"<h2>");
				 * pw.println("<h2>You are a "+ gender+"<h2>");
				 */
				  //forward method : calls the SuccesServlet class and displays page via forward method
					
					  RequestDispatcher rd = req.getRequestDispatcher("Success"); rd.forward(req,
					  resp);
					 
				 
		   }
		   
				  else {
					  pw.println("<h1>You have not accepted Tnc</h1>");
				  }
		  
		
	
	
		   
		   }
		 
		 else {
			   pw.println("<h1>You have not accepted Tnc</h1>");
			   
			   //RequestDispatcher methods 
			   
			   RequestDispatcher rd = req.getRequestDispatcher("index.html");
			   
			   //include method : calls the index.html page via include method
			   rd.include(req, resp);
			   
			   
			   
			   
			   }
	}
	
}
