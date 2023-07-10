package com.springboot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentData1")
public class Student {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	 private long id;
	
	@Column(name =" first_Name")
	 private String firstName;
	
	@Column(name ="last_Name")
	 private String lastName;
	
	@Column(name ="Address")
	 private String address;
	 
	public Student() {
		
	}
	 
	 
	public Student(String firstName, String lastName, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 
	 
	 
	 
	 

}
