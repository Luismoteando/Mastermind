package views;

public class Message {

	public static final String START = "¿Juegas a Mastermind?";
	public static final String SECRET = "La combinación secreta es ";
	public static final String SECRET_COMBINATION = "*";
	public static final String PROPOSAL = "Propón una combinación de cuatro colores (R, B, Y, G, O, P):";
	public static final String ERROR = "** Atención **\n"
			+ "La combinación debe constar de cuatro caracteres sin repetir entre los siguientes: R, B, Y, G, O, P.\n"
			+ "Inténtalo de nuevo.";
	public static final String WINNER = "¡Enhorabuena! Has encontrado la combinación secreta.";
	public static final String FINAL = "Se han agotado los intentos.";
	public static final String RETRY = "¿Deseas jugar otra partida? s/n";
	public static final String GOODBYE = "No pasa nada, ¡hasta luego!";
}
