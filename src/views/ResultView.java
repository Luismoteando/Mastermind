package views;

import controllers.ProposalController;
import models.Result;

public class ResultView {

    private ProposalController proposalController;

    public ResultView(ProposalController proposalController) {
        this.proposalController = proposalController;
    }

    void printResults() {
        for (Result result : proposalController.getResults()) {
            System.out.println(result.toString());
        }
    }

}
