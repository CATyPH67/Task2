package ru.vsu.cs.ivanov;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    private static String isParallelogram(Point p1,Point p2, Point p3, Point p4) {
        if ((Math.abs(p1.x - p2.x) == Math.abs(p3.x - p4.x)) && (Math.abs(p1.y - p2.y) == Math.abs(p3.y - p4.y))) {
            return "yes";
        }
        if ((Math.abs(p1.x - p3.x) == Math.abs(p2.x - p4.x)) && (Math.abs(p1.y - p3.y) == Math.abs(p2.y - p4.y))) {
            return "yes";
        }
        if ((Math.abs(p1.x - p4.x) == Math.abs(p3.x - p2.x)) && (Math.abs(p1.y - p4.y) == Math.abs(p3.y - p2.y))) {
            return "yes";
        }
        return "no";
    }

    private static class Point {
        private double x, y;

        private Point (double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    private static double readDouble (String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("enter %s: ", name);
        return scanner.nextDouble();
    }

    private static Point readPoint (String name) {
        double x = readDouble (name + ".x");
        double y = readDouble (name + ".y");
        return new Point (x, y);
    }

    public static void main (String[] args) {
        Point p1 = readPoint("p1");
        Point p2 = readPoint("p2");
        Point p3 = readPoint("p3");
        Point p4 = readPoint("p4");
        System.out.printf(isParallelogram(p1, p2, p3, p4));
    }
}
