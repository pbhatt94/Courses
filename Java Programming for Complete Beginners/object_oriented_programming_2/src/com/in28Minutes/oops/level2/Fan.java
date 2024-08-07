package com.in28Minutes.oops.level2;

public class Fan {
	// state
	private String make;
	private double radius;
	private String color;

	private boolean isOn;
	private byte speed;

	// creation
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	// behaviour
	public void switchOn() {
		this.isOn = true;
	}

	public void switchOff() {
		this.isOn = false;
		this.setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	// print the state
	@Override
	public String toString() {
		return String.format("Make - %s, radius - %s, color - %s, isOn - %s, speed - %s", make, radius, color, isOn,
				speed);
	}
}
