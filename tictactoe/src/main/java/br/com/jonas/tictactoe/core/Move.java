package br.com.jonas.tictactoe.core;

import br.com.jonas.tictactoe.exceptions.InvalidMoveException;

public class Move {
	
	public Move(String moveString) throws InvalidMoveException {
		try {
			String[] tokens = moveString.split(",");
			
			this.i = Integer.parseInt(tokens[0]);
			this.j = Integer.parseInt(tokens[1]);
			
		} catch (Exception e) {
			throw new InvalidMoveException("A jogada é inválida");
		}
	}

	private int i;
	private int j;
	
	public int getI() {
		return i;
	}
	
	public int getJ() {
		return j;
	}
}
