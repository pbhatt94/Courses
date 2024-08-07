package com.in28Minutes.oops.interfaces;

public class GameRunner {
	public static void main(String[] args) {
		//		MarioGame game = new MarioGame();
		ChessGame game = new ChessGame();
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
