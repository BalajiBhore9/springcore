package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		Samosa s = (Samosa) context.getBean("samosa");
		System.out.println(s);
		//register shutdown hook method present in Abstract Application Context file-it's used to run the destroy method 
		context.registerShutdownHook();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Pepsi p = (Pepsi) context.getBean("pepsi");
		System.out.println(p);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		Burgers b = (Burgers) context.getBean("burgers");
		System.out.println(b);
	}

}
