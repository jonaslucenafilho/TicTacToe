package br.com.jonas.tictactoe.core;

public class Move {
	
	public Move(String moveString) {
		String[] tokens = moveString.split(",");
		
		this.i = Integer.parseInt(tokens[0]);
		this.j = Integer.parseInt(tokens[1]);
		
		// TODO Validar se a estrutura do moveString está correta
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
