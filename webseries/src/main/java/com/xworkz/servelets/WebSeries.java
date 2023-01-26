package com.xworkz.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/webseries")
public class WebSeries extends HttpServlet{
	
	public WebSeries() {
		System.out.println("Created "+ this.getClass().getSimpleName());
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
      System.out.println("Running init  onfigauration...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       System.out.println("Running doGet in WebSeries...");		
       String name= req.getParameter("webSeriesName");
       String language = req.getParameter("language");
       String episodes= req.getParameter("episodes");
       String ott = req.getParameter("ott");
       String budget = req.getParameter("budget");
       
       System.out.println(name);
       System.out.println(language);
       System.out.println(episodes);
       System.out.println(ott);
       System.out.println(budget);
       
       PrintWriter writer=resp.getWriter();
       writer.print("<html>");
       writer.print("<body>");
       writer.print("<h1>");
       writer.print("<span style='color:red;'>");
       writer.print("webseriesName"+name +"is sent succes");
       writer.print("</span>");
       writer.print("</h1>");
       writer.print("</body>");
       writer.print("</html>");
       resp.setContentType("text/html");

	}

}
