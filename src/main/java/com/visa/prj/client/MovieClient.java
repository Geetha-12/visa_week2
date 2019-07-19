package com.visa.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.visa.prj.dao.MovieDao;
import com.visa.prj.entity.Actor;
import com.visa.prj.entity.Movie;

public class MovieClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.visa");
		ctx.refresh();
		
		MovieDao dao = (MovieDao) ctx.getBean("movieDaoJpaImpl");
		
		Actor a1 = new Actor();
		a1.setName("Uma");
		
		Actor a2 = new Actor();
		a2.setName("Travlota");
		
		Movie m1 = new Movie();
		m1.setName("Kill Bill");
		
		Movie m2 = new Movie();
		m2.setName("Pulp Fiction");
		
		dao.addActor(a1);
		dao.addActor(a2);
		dao.addMovie(m1);
		dao.addMovie(m2);
		
		
		
		
	}

}
