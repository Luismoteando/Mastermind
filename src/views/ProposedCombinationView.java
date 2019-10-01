package views;

import controllers.ProposalController;
import models.ProposedCombination;

import java.util.Scanner;

public class ProposedCombinationView {

    private ProposalController proposalController;

    public ProposedCombinationView(ProposalController proposalController) {
        this.proposalController = proposalController;
    }

    ProposedCombination read() {
        Scanner scanner = new Scanner(System.in);
        return new ProposedCombination(scanner.next());
    }
}
