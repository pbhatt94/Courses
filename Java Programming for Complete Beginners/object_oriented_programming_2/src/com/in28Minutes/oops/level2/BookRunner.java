package com.in28Minutes.oops.level2;

public class BookRunner {
	public static void main(String[] args) {
		Book book = new Book(1, "OOPS", "Some Random Author");
		book.addReview(new Review(123, "Good Book", 9));
		System.out.println(book);
	}
}
