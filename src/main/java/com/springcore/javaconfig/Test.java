package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(javaconfig.class);
		
		Student st = context.getBean("getStudent",Student.class);
		System.out.println(st);
		st.study();
	}
}
