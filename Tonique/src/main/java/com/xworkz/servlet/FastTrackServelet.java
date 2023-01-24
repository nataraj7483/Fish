package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3, urlPatterns = "/raj")
public class FastTrackServelet extends HttpServlet {
	
	public FastTrackServelet() {
	   	 System.out.println("Created" + this.getClass().getSimpleName());
	   	 
	    }
	    
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
			System.out.println("Running doGet method");
		}


}
