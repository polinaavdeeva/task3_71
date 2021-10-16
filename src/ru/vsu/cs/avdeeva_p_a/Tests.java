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

    private static final Picture picture = new Picture();
}




