package com.in28Minutes.oops.level2;

import java.util.ArrayList;

public class Book {
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();

	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public void addReview(Review review) {
		reviews.add(review);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Book{id=").append(id).append(", name='").append(name).append('\'').append(", author='")
				.append(author).append('\'').append(", reviews=").append(reviews).append('}');
		return sb.toString();
	}
}
