package com.example.SpringBoot.LearnSpringBoot;

public class Course {
	
	int number;
	String CName;
	String service;
	
	
	public Course(int number, String cName, String service) {
		super();
		this.number = number;
		CName = cName;
		this.service = service;
	}


	public int getNumber() {
		return number;
	}


	public String getCName() {
		return CName;
	}


	public String getService() {
		return service;
	}


	@Override
	public String toString() {
		return "Course [number=" + number + ", CName=" + CName + ", service=" + service + "]";
	}
	
	

}
