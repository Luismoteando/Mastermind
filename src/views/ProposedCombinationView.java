package views;

import java.util.Scanner;

import controllers.ProposalController;
import models.ProposedCombination;

public class ProposedCombinationView {

	private ProposalController proposalController;

	public ProposedCombinationView(ProposalController proposalController) {
		this.proposalController = proposalController;
	}

	public ProposedCombination read() {
		Scanner scanner = new Scanner(System.in);
		ProposedCombination proposedCombination = new ProposedCombination(scanner.next());
		return proposedCombination;
	}
}
