package com.xworkz.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/call", loadOnStartup = 1)
public class King extends HttpServlet {
	
	public King() {
	   	 System.out.println("Created" + this.getClass().getSimpleName());
	   	 
	    }
	    @Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
			System.out.println("Running doGet method");
			String data ="King is back and roars again";
			PrintWriter writer= resp.getWriter();
			writer.print(data);
			resp.setContentType("text/plain");
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("post from fasttrack..");
			String data ="Limited Edition";
			PrintWriter writer= resp.getWriter();
			writer.print(data);
			resp.setContentType("text/plain");
		}
		
		@Override
		protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running doHead..");
			String data ="My fourate food";
			PrintWriter writer= resp.getWriter();
			writer.print(data);
			resp.setContentType("text/plain");

		}
		@Override
		protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running doOptions..");
			String data ="I am Gym Lover ";
			PrintWriter writer= resp.getWriter();
			writer.print(data);
			resp.setContentType("text/plain");

		}
		@Override
		protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running doTrace..");
			String data ="I woud like to spend time in night with friends";
			PrintWriter writer= resp.getWriter();
			writer.print(data);
			resp.setContentType("text/plain");

		}
		@Override
		protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running doHead..");
			String data ="I am not born to impress any one";
			PrintWriter writer= resp.getWriter();
			writer.print(data);
			resp.setContentType("text/plain");

		}
        @Override
        protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running doPut..");
			String data ="My old vertion is week";
			PrintWriter writer= resp.getWriter();
			writer.print(data);
			resp.setContentType("text/plain");

        }

}
