package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collection.Emp;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/autowireconfig.xml");
		Employee emp1 = context.getBean("emp",Employee.class);
		System.out.println(emp1);

	}

}
