package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Student {
	
	
	
	int rollNo;
	String name;
	String country;
	
	
	
	
public Student() {
		super();
		// TODO Auto-generated constructor stub
	}




public Student(int rollNo, String name, String country) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.country = country;
}


@Id

public int getRollNo() {
	return rollNo;
}




public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}




public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public String getCountry() {
	return country;
}




public void setCountry(String country) {
	this.country = country;
}




@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", country=" + country + "]";
}

	

	
	
	
	
	
	
	
	
}
