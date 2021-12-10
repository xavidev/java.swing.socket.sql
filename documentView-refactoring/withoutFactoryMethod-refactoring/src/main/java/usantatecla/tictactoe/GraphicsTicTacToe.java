package usantatecla.tictactoe;

import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.views.graphics.GraphicsView;

class GraphicsTicTacToe extends TicTacToe{

	private Game game;
	private GraphicsView graphicsView;

	private GraphicsTicTacToe() {
		super();
		this.game = new Game();
		this.graphicsView = new GraphicsView(this.game);
	}

	private void play() {
		do {
			this.graphicsView.start();
			this.graphicsView.play();
		} while (this.graphicsView.resume());
	}

	public static void main(String[] args) {
		new GraphicsTicTacToe().play();
	}

}