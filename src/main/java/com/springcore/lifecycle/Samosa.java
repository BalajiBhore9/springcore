package com.springcore.lifecycle;

public class Samosa {
	
	//configure technique with xml
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Start Buying");
		this.price = price;
	}

	public Samosa() {
		super();
	}
	
	public void init() {
		System.out.println("Inside init method");
		System.out.println("Taking Samosa");	
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
}
