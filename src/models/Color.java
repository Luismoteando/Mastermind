package models;

public enum Color {
	R("red"), B("blue"), Y("yellow"), G("green"), O("orange"), P("purple");

	public final String color;

	private Color(String color) {
		this.color = color;
	}
	
	public static int length() {
		return Color.values().length;
	}
}