import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Mastermind {

	private String key;
	private ArrayList<Combination> combs;

	public Mastermind() {
		super();
		this.setKey();
		this.combs = new ArrayList<Combination>();
	}

	public String getKey() {
		return key;
	}

	public void setKey() {
		Random r = new Random();
		String colors = "rbygop";

		this.key = "";
		for (int i = 0; i < 4; i++) {
			StringBuilder sb = new StringBuilder(colors);
			int rand = r.nextInt(colors.length());
			this.key += colors.charAt(rand);
			sb.deleteCharAt(rand);
			colors = sb.toString();
		}
	}

	public ArrayList<Combination> getCombinations() {
		return combs;
	}

	public boolean checkCombination(String comb) {
		int dead = 0;
		int wounded = 0;

		if(comb.equals(key)) {
			return true;
		} else {
			for(int i = 0; i < key.length(); i++) {
				if(key.charAt(i) == comb.charAt(i)) {
					dead++;
				}
			}
			for(char c : comb.toCharArray()) {
				if(key.indexOf(c) >= 0) {
					wounded++;
				}
			}
			wounded -= dead; 
			combs.add(new Combination(comb, dead, wounded));
			return false;
		}
	}	
}
