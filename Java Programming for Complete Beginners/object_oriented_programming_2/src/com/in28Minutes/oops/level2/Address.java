package com.in28Minutes.oops.level2;

public class Address {
	private String line1;
	private String city;
	private String country;

	public Address(String line1, String city, String country) {
		super();
		this.line1 = line1;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address{" + "line1='" + line1 + '\'' + ", city='" + city + '\'' + ", country='" + country + '\'' + '}';
	}

}
