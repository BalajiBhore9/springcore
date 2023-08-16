package com.springcore.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanscope/config.xml");
		Student st = context.getBean("student",Student.class);
		System.out.println(st);
		
		//Singleton Bean Scope - provide same object every time
//		System.out.println(st.hashCode()); // 90567568
//		Student st1 = context.getBean("student",Student.class);
//		System.out.println(st1.hashCode()); // 90567568
		
		//Prototype Bean Scope - provide different object every time
		System.out.println(st.hashCode()); // 1346343363
		Student st2 = context.getBean("student",Student.class);
		System.out.println(st2.hashCode()); // 1003292107
	}
}
