package ru.vsu.cs.avdeeva_p_a;

public class Tests {

    public boolean tests() {

        if ((picture.getColor(4, 8) == SimpleColor.GREEN)
                && (picture.getColor(1, 3) == SimpleColor.GRAY)
                && (picture.getColor(6, -8) == SimpleColor.GRAY)
                && (picture.getColor(-2, 2) == SimpleColor.YELLOW)
                && (picture.getColor(-4, 5) == SimpleColor.ORANGE)) {
            return true;
        } else return false;
    }

    public static final Picture picture = new Picture(new Parabola(6, -5, 1.0 / 9),
            new Rectangle(2, 4, -4, 1),
            new Rectangle(4, 7, -5, 0));

}




