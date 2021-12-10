package usantatecla.tictactoe;

import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.views.console.ConsoleView;

class ConsoleTicTacToe extends TicTacToe{

	private ConsoleTicTacToe() {
		super(new Game(), new ConsoleView(new Game()));
	}

	private void play() {
		do {
			this.view.start();
			this.view.play();
		} while (this.view.resume());
	}

	public static void main(String[] args) {
		new ConsoleTicTacToe().play();
	}

}
