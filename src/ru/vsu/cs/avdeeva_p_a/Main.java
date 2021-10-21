package ru.vsu.cs.avdeeva_p_a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if (test.tests()) {

            System.out.print("Input x: ");
            double x = readNum();

            System.out.print("Input y: ");
            double y = readNum();

            printColorForPoint(x, y);
        } 
        else {
            System.out.println("An error was found in the data.Re-enter the data");
        }
    }

    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.2f, %.2f) -> %s%n", x, y, picture.getColor(x, y));
    }

    private static double readNum() {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        if (Math.abs(value) > 10) {
            System.out.println("error,the coordinate was not found ");
            System.exit(1);
        }
        return value;
    }

    private static final Picture picture = new Picture(new Parabola(6, -5, 1.0 / 9),
            new Rectangle(2, 4, -4, 1),
            new Rectangle(4, 7, -5, 0));

    private static final Tests test = new Tests();

}
