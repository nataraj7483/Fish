package com.xworkz.movies.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.xworkz.movies.bean.Assistance;
import com.xworkz.movies.bean.Battery;
import com.xworkz.movies.bean.Camera;
import com.xworkz.movies.bean.CameraMan;
import com.xworkz.movies.bean.Capacity;
import com.xworkz.movies.bean.Company;
import com.xworkz.movies.bean.Director;
import com.xworkz.movies.bean.Experience;
import com.xworkz.movies.bean.Lens;
import com.xworkz.movies.bean.Location;
import com.xworkz.movies.bean.Movie;
import com.xworkz.movies.bean.Producer;
import com.xworkz.movies.bean.Skill;
import com.xworkz.movies.configuration.MovieConfiguration;

public class MovieRunner {

	public static void main(String[] args) {

		ApplicationContext application =new AnnotationConfigApplicationContext(MovieConfiguration.class);
		System.out.println(Arrays.toString(application.getBeanDefinitionNames()));
		
		Movie movie =application.getBean(Movie.class);
		movie.Moviedisplay();
		Skill skill= application.getBean(Skill.class);
		skill.display();
		Assistance assistance =application.getBean(Assistance.class);
		assistance.display();
		Producer producer =application.getBean(Producer.class);
		producer.display();
		Lens lens =application.getBean(Lens.class);
		lens.display();
		Location location =application.getBean(Location.class);
		location.display();
		Experience experience =application.getBean(Experience.class);
		experience.display();
		Director director =application.getBean(Director.class);
		director.display();
		Company company =application.getBean(Company.class);
		company.display();
		CameraMan man =application.getBean(CameraMan.class);
		man.display();
		Camera camera =application.getBean(Camera.class);
		camera.display();
		Battery battery =application.getBean(Battery.class);
		battery.display();
		
	}

}
