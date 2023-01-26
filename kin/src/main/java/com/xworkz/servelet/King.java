package com.xworkz.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = "/raja")
public class King extends HttpServlet {
	
	public King() {
		System.out.println("Created "+ this.getClass().getSimpleName());
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
      System.out.println("Running init  configauration...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       System.out.println("Running doGet in Kingdom...");		
       String name= req.getParameter("kingName");
       String region = req.getParameter("region");
       String noOfQueens= req.getParameter("noOfQueens");
       String dOB = req.getParameter("dOB");
       String dOD = req.getParameter("dOD");
       
       System.out.println(name);
       System.out.println(region);
       System.out.println(noOfQueens);
       System.out.println(dOB);
       System.out.println(dOD);
       
       PrintWriter writer=resp.getWriter();
       writer.print("<html>");
       writer.print("<body>");
       writer.print("<h1>");
       writer.print("<span style='color:brown;'>");
       writer.print("kingName"+name +"is sent succes");
       writer.print("</span>");
       writer.print("</h1>");
       writer.print("</body>");
       writer.print("</html>");
       resp.setContentType("text/html");

	}

	

}
