package com.springcore.constructor;

import java.util.List;

public class Person {
	
	private String name;
	private int personId;
	private Certi certi;
	private List<String>contact;
	
	public Person(String name, int personId,Certi certi,List<String>contact) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi=certi;
		this.contact=contact;
	}
	@Override
	public String toString() {
		return this.name+" : "+this.personId+" "+"{ "+this.certi.name+ "}"+this.contact;
	}
}
