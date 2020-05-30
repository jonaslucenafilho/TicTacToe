package br.com.jonas.tictactoe;

import java.io.IOException;

import br.com.jonas.tictactoe.core.Game;

public class Main {

	public static void main(String[] args) throws IOException {

		Game game = new Game();
		game.play();
	}
}
