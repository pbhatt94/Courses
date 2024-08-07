package com.in28Minutes.oops.interfaces;

public class ChessGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("Moving up");
	}

	@Override
	public void down() {
		System.out.println("Moving down");
	}

	@Override
	public void left() {
		System.out.println("Moving left");
	}

	@Override
	public void right() {
		System.out.println("Moving right");
	}
}