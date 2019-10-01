package models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ProposedCombination extends Combination {

    public ProposedCombination(String combination) {
        for (int i = 0; i < combination.length(); i++) {
            switch (combination.charAt(i)) {
                case 'R':
                    this.colors.add(Color.R);
                    break;
                case 'B':
                    this.colors.add(Color.B);
                    break;
                case 'Y':
                    this.colors.add(Color.Y);
                    break;
                case 'G':
                    this.colors.add(Color.G);
                    break;
                case 'O':
                    this.colors.add(Color.O);
                    break;
                case 'P':
                    this.colors.add(Color.P);
                    break;
            }
        }
    }

    public boolean check() {
        Set<Color> set = new HashSet<Color>(colors);
        if (colors.size() == LENGTH) {
            return set.size() >= colors.size();
        } else {
            return false;
        }
    }

    boolean contains(Color color, int position) {
        return this.colors.get(position) == color;
    }

    boolean contains(Color color) {
        for (Color value : this.colors) {
            if (value == color) {
                return true;
            }
        }
        return false;
    }

    ArrayList<Color> getColors() {
        return this.colors;
    }

}
