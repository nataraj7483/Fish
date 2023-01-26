package com.xworkz.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/movie")
public class Movie extends HttpServlet {
	
	public Movie() {
		System.out.println("Created "+ this.getClass().getSimpleName());
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
      System.out.println("Running init  configauration...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       System.out.println("Running doGet in Movie...");		
       String movieName= req.getParameter("movieName");
       String heroName = req.getParameter("heroName");
       String heroinName= req.getParameter("heroinName");
       String movieDirector= req.getParameter("movieDirector");
       String musicDirectorName= req.getParameter("musicDirectorName");
       String danceMaster= req.getParameter("danceMaster");
       String maleSinger= req.getParameter("maleSinger");
       String femaleSinger= req.getParameter("femaleSinger");
       String cameraMan= req.getParameter("cameraMan");
       String producer= req.getParameter("producer");
       String fightMaster= req.getParameter("fightMaster");
       String villanName= req.getParameter("villanName");
       String comedian= req.getParameter("comedian");
       String budget= req.getParameter("budget");
       String loss= req.getParameter("loss");
       String secondHeroin= req.getParameter("secondHeroin");
       String coProducer= req.getParameter("co-Producer");
       String language= req.getParameter("language");
       String assiDirector= req.getParameter("assiDirector");
       String dOR= req.getParameter("dOR");

       System.out.println(movieName);
       System.out.println(heroName);
       System.out.println(heroinName);
       System.out.println(movieDirector);
       System.out.println(musicDirectorName);
       System.out.println(danceMaster);
       System.out.println(maleSinger);
       System.out.println(femaleSinger);
       System.out.println(cameraMan);
       System.out.println(producer);
       System.out.println(fightMaster);
       System.out.println(villanName);
       System.out.println(comedian);
       System.out.println(budget);
       System.out.println(loss);
       System.out.println(secondHeroin);
       System.out.println(coProducer);
       System.out.println(language);
       System.out.println(assiDirector);
       System.out.println(dOR);

       
       PrintWriter writer=resp.getWriter();
       writer.print("<html>");
       writer.print("<body>");
       writer.print("<h1>");
       writer.print("<span style='color:brown;'>");
       writer.print("movieName"+movieName +"is sent succes");
       writer.print("</span>");
       writer.print("</h1>");
       writer.print("</body>");
       writer.print("</html>");
       resp.setContentType("text/html");

	}


}
