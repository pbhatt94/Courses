package com.in28Minutes.oops.level2;

public class Rectangle {
	// state
	private int length;
	private int width;

	public Rectangle(int len, int width) {
		this.length = len;
		this.width = width;
	}

	// getters
	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	// setters
	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	// methods
	public int calculateArea() {
		return length * width;
	}

	public int calculatePerimeter() {
		return 2 * (length + width);
	}

	// printing the state
	@Override
	public String toString() {
		return "Rectangle{" + "length=" + length + ", width=" + width + " Area = " + this.calculateArea()
		+ " Perimeter = " + this.calculatePerimeter() + '}';
	}

}
