package views;

import controllers.ProposalController;
import controllers.RetryController;
import controllers.StartController;

public class GameView {

	private StartView startView;

	private ProposalView proposalView;

	private RetryView retryView;

	public GameView(StartController startController, ProposalController proposalController,
			RetryController retryController) {
		this.startView = new StartView(startController);
		this.proposalView = new ProposalView(proposalController);
		this.retryView = new RetryView(retryController);
	}

	public void interact() {
		boolean retry;
		do {
			this.start();
			boolean finished;
			do {
				finished = this.propose();
			} while (!finished);
			retry = this.retry();
		} while (retry);
	}

	public void start() {
		this.startView.interact();
	}

	public boolean propose() {
		return this.proposalView.interact();
	}

	public boolean retry() {
		return this.retryView.interact();
	}
}
