package usantatecla.tictactoe;

import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.views.View;

public class TicTacToe {

    protected  Game game;
    protected View view;

    protected TicTacToe(Game game, View view){
        this.game = game;
        this.view = view;
    }
}
