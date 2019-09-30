package models;

public class Result {

	private ProposedCombination proposedCombination;
	private int dead;
	private int wounded;

	public Result(ProposedCombination proposedCombination, int dead, int wounded) {
		this.proposedCombination = proposedCombination;
		this.dead = dead;
		this.wounded = wounded;
	}

	public String toString() {
		return "La combinación " + this.proposedCombination.getColors() + " tiene " + this.dead + " muertos y "
				+ this.wounded + " heridos.";
	}

	public boolean isWinner() {
		return this.dead == Combination.getLength();
	}

}
