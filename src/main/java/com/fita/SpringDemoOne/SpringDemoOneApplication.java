package com.fita.SpringDemoOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemoOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoOneApplication.class, args);
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Cricket cricket = context.getBean("cricket", Cricket.class);
		BasketBall basketBall = context.getBean("basketball", BasketBall.class);
		
		System.out.println(cricket.provideInfo());
		System.out.println(cricket.getFirstAidInfo());
		System.out.println("Team Name: " + cricket.getTeamName());
		
		System.out.println(basketBall.provideInfo());
		System.out.println(basketBall.getFirstAidInfo());
		System.out.println("Team Name: " + basketBall.getTeamName());
		
		context.close();
	}

}
