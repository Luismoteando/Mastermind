package controllers;

import models.Game;

public class RetryController extends Controller {
	
    public RetryController(Game game) {
        super(game);
    }

    public void retry() {
        this.game.clear();
    }
}
