package com.in28Minutes.oops.level2.inheritance;

public class Person extends Object {
	private String name;
	private String email;
	private String phoneNo;

	public Person(String name) {
		this.name = name;
	}

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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + "]";
	}

}
