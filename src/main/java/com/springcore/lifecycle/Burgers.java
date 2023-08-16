package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Burgers {
	
	//configure technique with annotation 
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public Burgers() {
		super();	
	}

	@PostConstruct
	public void init() {
		System.out.println("Taking Burger");	
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method");
	}

	@Override
	public String toString() {
		return "Burgers [price=" + price + "]";
	}
	
}
