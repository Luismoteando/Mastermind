package views;

import java.util.Scanner;

import models.Game;
import models.ProposedCombination;

public class GameView {

	protected Game game;

	public GameView(Game game) {
		this.game = game;
	}

	public void interact() {
		boolean finished = false;
		boolean retry = false;
		do {
			System.out.println("¿Juegas a Mastermind?");
			do {
				System.out.println("Propón una combinación de cuatro colores (R, B, Y, G, O, P):");
				ProposedCombination proposedCombination = new ProposedCombinationView().read();
				while (!proposedCombination.check()) {
					System.out.println("** Atención **\n"
							+ "La combinación debe constar de cuatro caracteres sin repetir entre los siguientes: R, B, Y, G, O, P.\n"
							+ "Inténtalo de nuevo.");
					proposedCombination = new ProposedCombinationView().read();
				}
				this.game.addProposedCombination(proposedCombination);
				new ResultView(this.game.getResults()).print();
				finished = this.game.isFinished();
			} while (!finished);
			System.out.println("Se han agotado los intentos. ¿Deseas jugar otra partida? s/n");
			retry = this.retry();
		} while (retry);
	}

	private boolean retry() {
		Scanner scanner = new Scanner(System.in);
		String retry;
		retry = scanner.next();
		if (retry.equals("s")) {
			return true;
		} else {
			return false;
		}
	}
}
