package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 6, urlPatterns = "/nata")

public class Natraj extends HttpServlet{
	
	public Natraj() {
   	 System.out.println("Created" + this.getClass().getSimpleName());
   	 
    }
    
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("Running doGet method");
	}


}
