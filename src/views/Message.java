package views;

class Message {

    static final String START = "¿Juegas a Mastermind?";
    static final String SECRET = "La combinación secreta es ";
    static final String SECRET_COMBINATION = "*";
    static final String PROPOSAL = "Propón una combinación de cuatro colores (R, B, Y, G, O, P):";
    static final String ERROR = "** Atención **\n"
            + "La combinación debe constar de cuatro caracteres sin repetir entre los siguientes: R, B, Y, G, O, P.\n"
            + "Inténtalo de nuevo.";
    static final String WINNER = "¡Enhorabuena! Has encontrado la combinación secreta.";
    static final String FINAL = "Se han agotado los intentos.";
    static final String RETRY = "¿Deseas jugar otra partida? s/n";
    static final String GOODBYE = "No pasa nada, ¡hasta luego!";
}
