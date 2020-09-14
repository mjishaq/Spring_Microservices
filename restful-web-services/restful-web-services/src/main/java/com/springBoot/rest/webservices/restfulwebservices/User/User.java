package com.springBoot.rest.webservices.restfulwebservices.User;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {
	
	private Integer rollNo;
	
	@Size(min = 2 , message = "Name should have atleast 2 characters")
	private String Name;
	@Past
	private Date dob;
	
	public User(Integer rollNo, String name, Date dob) {
		super();
		this.rollNo = rollNo;
		Name = name;
		this.dob = dob;
	}
	
	public Integer getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	@Override
	public String toString() {
		return "User [rollNo=%s" + rollNo + "\n, Name=%s" + Name + "\n, \ndob=%s" + dob + "]";
	}
	

	
	
}
