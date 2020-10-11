package usantatecla.tictactoe.controllers;

import usantatecla.tictactoe.models.Game;

public class ResumeController extends Controller {

	public ResumeController(Game game) {
		super(game);
	}

	public void newGame() {
		this.game.newGame();
	}

}
