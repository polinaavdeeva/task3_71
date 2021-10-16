package ru.vsu.cs.avdeeva_p_a;


public class Picture {

    public Parabola PARABOLA = new Parabola(6, -5, 1.0/9);
    public Rectangle RECTANGLE= new Rectangle(2, 4, -4,1);
    public Rectangle BIG_RECTANGLE = new Rectangle(4, 7, -5,0);

    public SimpleColor getColor(double x, double y) {

        if (PARABOLA.isPointAboveParabola(x, y) && !RECTANGLE.isPointInRectangle(x, y)) {
            return SimpleColor.GREEN;
        } else if (!PARABOLA.isPointAboveParabola(x, y) || !RECTANGLE.isPointInRectangle(x, y))
            if (RECTANGLE.isPointInRectangle(x, y) && !PARABOLA.isPointAboveParabola(x, y)) {
                return SimpleColor.YELLOW;
            } else if (BIG_RECTANGLE.isPointInRectangle(x, y)
                    && !PARABOLA.isPointAboveParabola(x, y)
                    && !RECTANGLE.isPointInRectangle(x, y)) {
                return SimpleColor.ORANGE;
            }
        return SimpleColor.GRAY;
    }

}
