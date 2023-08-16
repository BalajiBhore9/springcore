package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/studnetconfig.xml");
    	
    	Student student = (Student) context.getBean("student");
    	Student student1 = (Student) context.getBean("student1");
    	Student student2 = (Student) context.getBean("student2");
    	System.out.println(student);
    	System.out.println(student1);
    	System.out.println(student2);
    }
}
