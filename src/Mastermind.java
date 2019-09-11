import java.util.ArrayList;
import java.util.Random;

public class Mastermind {

	private String colores;
	private Combinacion clave;
	private ArrayList<Combinacion> propuestas;

	public Mastermind(String colores) {
		this.colores = colores;
		this.generarClave();
		this.propuestas = new ArrayList<Combinacion>();
	}

	public void generarClave() {
		Random r = new Random();
		String clave = "";

		for (int i = 0; i < 4; i++) {
			StringBuilder sb = new StringBuilder(colores);
			int rand = r.nextInt(colores.length());
			clave += colores.charAt(rand);
			sb.deleteCharAt(rand);
			colores = sb.toString();
		}
		this.clave = new Combinacion(clave, 0, 0);
	}

	public boolean comprobarPropuesta(String propuesta) {
		int muertos = 0;
		int heridos = 0;

		if(propuesta.equals(clave.getValor())) {
			return true;
		} else {
			for(int i = 0; i < clave.getValor().length(); i++) {
				if(clave.getValor().charAt(i) == propuesta.charAt(i)) {
					muertos++;
				}
			}
			for(char c : propuesta.toCharArray()) {
				if(clave.getValor().indexOf(c) >= 0) {
					heridos++;
				}
			}
			heridos -= muertos; 
			propuestas.add(new Combinacion(propuesta, muertos, heridos));
			return false;
		}
	}

	public ArrayList<Combinacion> getPropuestas() {
		return propuestas;
	}

}
