package br.com.jonas.tictactoe.core;

import br.com.jonas.tictactoe.Constants;
import br.com.jonas.tictactoe.ui.UI;

public class Game {

	private Board board =  new Board();
	private Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	
	public void play() {
		UI.printGameTitle();
		
		for (int i = 0; i < players.length; i++) {
			players[i] = createPlayer(i);
		}
	}
	
	private Player createPlayer(int index) {
		String name = UI.readInput("Jogador " + (index + 1) + " ->");
		char symbol = Constants.SYMBOL_PLAYERS[index];
		Player player = new Player(name, board, symbol);
		
		UI.printText("O jogador '" + name + "' vai usar o símbolo '" + symbol + "'" );
		
		return player;
	}
}
