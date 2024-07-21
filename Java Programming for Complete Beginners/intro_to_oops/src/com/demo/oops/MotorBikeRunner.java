package com.demo.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike(1200);
		//		honda.setSpeed(100);
		System.out.println(honda.getSpeed());
		honda.incSpeed(20);
		System.out.println(honda.getSpeed());
		honda.decSpeed(30);
		System.out.println(honda.getSpeed());
		ducati.start();
	}
}
