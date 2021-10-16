package ru.vsu.cs.avdeeva_p_a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if (test.tests() == true) {

            System.out.print("Input x: ");
            double x = readNum();

            System.out.print("Input y: ");
            double y = readNum();

            printColorForPoint(x, y);
        } else {
            System.out.println("An error was found in the data.Re-enter the data");
        }
    }

    private static final Picture picture = new Picture();
    private static final Tests test = new Tests();

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

}
