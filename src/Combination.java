
public class Combination {

	private String colors;
	private int dead;
	private int wounded;

	public Combination(String colors, int dead, int wounded) {
		super();
		this.colors = colors;
		this.dead = dead;
		this.wounded = wounded;
	}

	@Override
	public String toString() {
		return "En la combinación " + this.colors +", hay " + 
				this.dead + " muertos y " +
				this.wounded + " heridos.";
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public int getDead() {
		return dead;
	}

	public void setDead(int dead) {
		this.dead = dead;
	}

	public int getWounded() {
		return wounded;
	}

	public void setWounded(int wounded) {
		this.wounded = wounded;
	}

}
