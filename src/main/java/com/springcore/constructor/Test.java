package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/personconfig.xml");
		Person per = (Person) context.getBean("person");
		System.out.println(per);

	}

}
