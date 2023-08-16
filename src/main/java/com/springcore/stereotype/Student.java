package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("Durgesh")
	private String stuName;
	@Value("Delhi")
	private String stuCity;
	
	@Value("#{temp}")
	private List<String>address;
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuCity() {
		return stuCity;
	}
	public void setStuCity(String stuCity) {
		this.stuCity = stuCity;
	}
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuCity=" + stuCity + ", address=" + address + "]";
	}
	
}
