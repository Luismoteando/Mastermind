package models;

import java.util.ArrayList;

public class Combination {

    final static int LENGTH = 4;
    ArrayList<Color> colors;

    public Combination() {
        this.colors = new ArrayList<Color>();
    }

    public static int getLength() {
        return LENGTH;
    }

}