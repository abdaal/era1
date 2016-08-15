package com.training.vo;

public class PersonData {
	
	private String firstName;
	private String lName;
	private String MName;
	private String phoneNumber;
	
	String getPhoneNumber() {
		return phoneNumber;
	}
	void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMiddleName() {
		return MName;
	}
	public void setMiddleName(String middleName) {
		this.MName = middleName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lName;
	}
	public void setLastName(String lName) {
		this.lName = lName;
	}
	
	
	
}
