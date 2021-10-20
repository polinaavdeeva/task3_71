package ru.vsu.cs.avdeeva_p_a;

public class Picture {

    private final Parabola PARABOLA;
    private final Rectangle RECTANGLE;
    private final Rectangle BIG_RECTANGLE;

    public Picture(Parabola PARABOLA, Rectangle RECTANGLE, Rectangle BIG_RECTANGLE) {
        this.PARABOLA = PARABOLA;
        this.RECTANGLE = RECTANGLE;
        this.BIG_RECTANGLE = BIG_RECTANGLE;
    }

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
