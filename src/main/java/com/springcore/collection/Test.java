package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
    	Emp empolye = (Emp) context.getBean("empolyee");
    	System.out.println(empolye);
    	System.out.println(empolye.getName());
    	System.out.println(empolye.getAddress());
    	System.out.println(empolye.getPhone());
    	System.out.println(empolye.getCourses());
    	System.out.println(empolye.getLogin());   	
    }
}
