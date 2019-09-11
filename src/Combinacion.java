
public class Combinacion {

	private String valor;
	private int muertos;
	private int heridos;

	public Combinacion(String valor, int muertos, int heridos) {
		this.valor = valor;
		this.muertos = muertos;
		this.heridos = heridos;
	}

	@Override
	public String toString() {
		return "En la combinación " + this.valor +", hay " + 
				this.muertos + " muertos y " +
				this.heridos + " heridos.";
	}

	public String getValor() {
		return valor;
	}

}
