package com.in28Minutes.oops.level2;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan = new Fan("Manufacturer 1", 2123, "BLUE");
		fan.switchOn();
		fan.setSpeed((byte) 5);
		System.out.println(fan.toString());
		fan.setSpeed((byte) 3);
		System.out.println(fan.toString());
		fan.switchOff();
		System.out.println(fan.toString());
	}

}
