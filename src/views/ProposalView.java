package views;

import controllers.ProposalController;
import models.ProposedCombination;

public class ProposalView {

	private ProposalController proposalController;

	private ProposedCombinationView proposedCombinationView;

	private ResultView resultView;

	public ProposalView(ProposalController proposalController) {
		this.proposalController = proposalController;
		this.proposedCombinationView = new ProposedCombinationView(this.proposalController);
		this.resultView = new ResultView(this.proposalController);
	}

	public boolean interact() {
		System.out.println(Message.PROPOSAL);
		ProposedCombination proposedCombination = this.proposedCombinationView.read();
		while (!proposedCombination.check()) {
			System.out.println(Message.ERROR);
			proposedCombination = this.proposedCombinationView.read();
		}
		this.proposalController.addProposedCombination(proposedCombination);
		resultView.printResults();
		if (this.proposalController.isWinner()) {
			System.out.println(Message.WINNER);
			return true;
		} else {
			if (this.proposalController.isFinished()) {
				System.out.println(Message.FINAL);
				return true;
			}
		}
		return false;
	}

}
