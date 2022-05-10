package com.example.demo.model;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "Customer")
public class Customer {
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	private String name;
	private String email;
	private String phone;
	private String customerId;
	private String passcode;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date dob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPasscode() {
		return passcode;
	}
	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Customer(String name, String email, String phone, String customerId, String passcode, Date dob) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.customerId = customerId;
		this.passcode = passcode;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", phone=" + phone + ", customerId=" + customerId
				+ ", passcode=" + passcode + ", dob=" + dob + "]";
	}
	
	
	

	
}
