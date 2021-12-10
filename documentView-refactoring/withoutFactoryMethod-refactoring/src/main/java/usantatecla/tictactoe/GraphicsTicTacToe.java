package usantatecla.tictactoe;

import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.views.graphics.GraphicsView;

class GraphicsTicTacToe extends TicTacToe{

	private GraphicsTicTacToe() {
		super(new Game(), new GraphicsView(new Game()));
	}

	public static void main(String[] args) {
		new GraphicsTicTacToe().play();
	}

}