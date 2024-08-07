package com.in28Minutes.oops.interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Jump");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Go Down");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub

	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Go right");
	}

}
