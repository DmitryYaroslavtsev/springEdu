package com.education.spring.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		Performer performer = (Performer) ctx.getBean("poeticDuke");
		performer.perform();

		Performer performer1 = (Performer) ctx.getBean("kenny2");
		performer1.perform();
		SpringApplication.run(Application.class, args);
	}
}
