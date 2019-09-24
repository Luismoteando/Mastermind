package views;

import java.util.Scanner;

import models.ProposedCombination;

public class ProposedCombinationView {
	
	public ProposedCombination read() {
		Scanner scanner = new Scanner(System.in);
		ProposedCombination proposedCombination = new ProposedCombination(scanner.next());
		return proposedCombination;
	}
}
