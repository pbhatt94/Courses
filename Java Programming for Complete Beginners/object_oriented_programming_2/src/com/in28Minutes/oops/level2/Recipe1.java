package com.in28Minutes.oops.level2;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
	}

	@Override
	void doTheDish() {
		System.out.println("Do the dish");
	}

	@Override
	void cleanup() {
		System.out.println("Clean up the utensils");

	}

}
