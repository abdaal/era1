package com.training.vo;

public class PersonData {
	
	private String firstName;
	private String lastName;
	private String MName;
	
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
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
