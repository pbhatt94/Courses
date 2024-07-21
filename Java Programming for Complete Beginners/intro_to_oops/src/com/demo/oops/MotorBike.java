package com.demo.oops;

public class MotorBike {
	private int speed;

	MotorBike() {
		speed = 0;
	}

	MotorBike(int init_speed) {
		speed = init_speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void incSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	void start() {
		System.out.println("Bike started...");
	}
}
