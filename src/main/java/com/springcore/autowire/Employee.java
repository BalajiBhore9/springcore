package com.springcore.autowire;

public class Employee {
	
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor");
	}

	public Employee() {
		super();
	   
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
