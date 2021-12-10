package usantatecla.tictactoe;

import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.views.console.ConsoleView;

class ConsoleTicTacToe extends TicTacToe{

	private ConsoleTicTacToe() {
		super(new Game(), new ConsoleView(new Game()));
	}

	public static void main(String[] args) {
		new ConsoleTicTacToe().play();
	}

}
