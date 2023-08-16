package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{11+22}")
	private String x;
	
	@Value("#{15+65+14}")
	private String y;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	
	@Value("#{new java.lang.String('Ramesh')}")
	private String name;
	
	@Value("#{8<9}")
	private boolean isActive;
	
	
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
}
