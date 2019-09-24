
import models.Game;
import views.GameView;

public class Mastermind {

	private Game game;
	private GameView gameView;

	public Mastermind() {
		this.game = new Game();
		this.gameView = new GameView(this.game);
	}

	public void play() {
		gameView.interact();
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}

}