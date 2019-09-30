package models;

import java.util.ArrayList;

public class Combination {

	protected ArrayList<Color> colors;

	protected final static int LENGTH = 4;

	public Combination() {
		this.colors = new ArrayList<Color>();
	}

	public static int getLength() {
		return LENGTH;
	}

}