package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.javaconfig")
public class javaconfig {
	
	// if you use @Bean annotation then u can remove the @ComponentScan annotation and create the new student class 
	@Bean
	public Student getStudent() {
		
		//creating a new student object
		Student student = new Student();
		return student;	
	}
}
