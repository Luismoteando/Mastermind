import controllers.ProposalController;
import controllers.RetryController;
import controllers.StartController;
import models.Game;
import views.GameView;

public class Mastermind {

    private Game game;

    private GameView gameView;

    private StartController startController;

    private ProposalController proposalController;

    private RetryController retryController;

    public Mastermind() {
        this.game = new Game();
        this.startController = new StartController(this.game);
        this.proposalController = new ProposalController(this.game);
        this.retryController = new RetryController(this.game);
        this.gameView = new GameView(this.startController, this.proposalController, this.retryController);
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

    private void play() {
        this.gameView.interact();
    }

}