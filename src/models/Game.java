package models;

import java.util.ArrayList;

public class Game {

    private static final int ATTEMPTS = 10;
    private SecretCombination secretCombination;
    private ArrayList<ProposedCombination> proposedCombinations;
    private ArrayList<Result> results;

    public Game() {
        this.secretCombination = new SecretCombination();
        this.proposedCombinations = new ArrayList<ProposedCombination>();
        this.results = new ArrayList<Result>();
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.proposedCombinations.add(proposedCombination);
        this.results.add(this.secretCombination.getResult(proposedCombination));
    }

    public boolean isFinished() {
        return results.size() == ATTEMPTS;
    }

    public boolean isWinner() {
        return this.results.get(results.size() - 1).isWinner();
    }

    public ArrayList<Result> getResults() {
        return this.results;
    }

    public void clear() {
        this.secretCombination = new SecretCombination();
        this.proposedCombinations = new ArrayList<ProposedCombination>();
        this.results = new ArrayList<Result>();
    }
}
