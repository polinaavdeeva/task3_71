package ru.vsu.cs.avdeeva_p_a;

public class Parabola {

    private final double x0;
    private final double y0;
    private final double a;

    public Parabola(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }

    public boolean isPointAboveParabola(double x, double y) {
        return y > a * Math.pow(x - x0, 2) + y0;
    }

}
