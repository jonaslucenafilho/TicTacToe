package br.com.jonas.tictactoe.core;

import br.com.jonas.tictactoe.ui.UI;

public class Player {

	private String name;
	private Board board;
	private char symbol;
	
	public Player(String name, Board board, char symbol) {
		this.name = name;
		this.board = board;
		this.symbol = symbol;
	}

	@SuppressWarnings("resource")
	private Move inputMove() {
		String moveString = UI.readInput("Jogador '" + name + "' ->");
		return new Move(moveString);
	}
	
	public void play() {
		Move move = inputMove();
		board.play(this, move);
	}
	
	public String getName() {
		return name;
	}
	
	public Board getBoard() {
		return board;
	}
	
	public char getSymbol() {
		return symbol;
	}
}
