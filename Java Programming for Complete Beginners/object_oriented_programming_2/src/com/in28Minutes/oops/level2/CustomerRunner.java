package com.in28Minutes.oops.level2;

public class CustomerRunner {
	public static void main(String[] args) {
		Address homeAddress = new Address("sector -1", "Noida", "India");
		Customer customer = new Customer("Person", homeAddress);
		Address workAddress = new Address("sector 142", "Noida", "India");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
	}
}
