import java.util.Scanner;

public class Main {

	static Scanner read = new Scanner (System.in);
	static Mastermind game = new Mastermind();

	public static void main(String[] args) {
		String comb;
		int attempt = 0;
		System.out.println("Bienvenido, introduzca una combinación:");
		do {
			comb = read.nextLine();
			if(game.checkCombination(comb)) {
				System.out.println("¡Bien hecho, lo has logrado! :)");
			} else {
				printCombinations();
				System.out.println("Inténtalo de nuevo. :(");
				attempt++;
			}
		} while(attempt <= 10);
	}

	public static void printCombinations() {
		for(Combination comb : game.getCombinations()) {
			System.out.println(comb.toString());
		}
	}
}
