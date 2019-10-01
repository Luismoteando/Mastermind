package controllers;

import models.Combination;
import models.Game;

public class StartController extends Controller {

    public StartController(Game game) {
        super(game);
    }

    public int getLength() {
        return Combination.getLength();
    }
}
