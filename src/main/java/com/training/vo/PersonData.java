package com.training.vo;

public class PersonData {

	private String firstName;
	private String lastName;
	private String midName;
	private String phoneNumber;
	
	String getPhoneNumber() {
		return phoneNumber;
	}
	void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}
	
	public String getMidName(String midName) {
		return midName;
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

}
