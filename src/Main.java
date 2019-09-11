import java.util.Scanner;

public class Main {

	static Scanner leer = new Scanner (System.in);
	static Mastermind partida = new Mastermind("rbygop");

	public static void main(String[] args) {
		String propuesta;
		int intento = 1;
		String salir = null;
		
		System.out.println("¿Juegas a Mastermind? \n" + 
				"Propón una combinación de cuatro colores (r, b, y, g, o, p):");
		do {
			propuesta = leer.nextLine();
			if(partida.comprobarPropuesta(propuesta)) {
				System.out.println("¡Enhorabuena, has adivinado la combinación secreta!");
			} else {
				imprimirPropuestas();
				System.out.println("Vuelve a intentarlo.");
				intento++;
				if(intento == 10)  {
					System.out.println("¿Deseas echar otra partida? s/n");
					salir = leer.nextLine();
					if(salir == "s") {
						intento = 0;
					} else {
						System.out.println("Hasta la próxima.");
					}
				}
			}
		} while(intento <= 10);
	}

	public static void imprimirPropuestas() {
		for(Combinacion propuesta : partida.getPropuestas()) {
			System.out.println(propuesta.toString());
		}
	}

}
