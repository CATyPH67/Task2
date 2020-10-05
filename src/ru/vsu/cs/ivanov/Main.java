package ru.vsu.cs.ivanov;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Point p1 = readPoint("p1");
        Point p2 = readPoint("p2");
        Point p3 = readPoint("p3");
        Point p4 = readPoint("p4");
        System.out.print(isParallelogram(p1, p2, p3, p4));
    }

    private static Point readPoint(String name)
    {
        double x = readDouble(name + ".x");
        double y = readDouble(name + ".y");
        return new Point(x, y);
    }

    public static double readDouble(String name)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("enter %s: ", name);
        return scanner.nextDouble();
    }

    public static boolean isParallelogram(Point p1, Point p2, Point p3, Point p4)
    {
        return (isParallel(p1, p2, p3, p4) && isParallel(p1, p3, p2, p4))
            || (isParallel(p1, p3, p2, p4) && isParallel(p1, p4, p2, p3))
            || (isParallel(p1, p4, p2, p3) && isParallel(p1, p2, p4, p3));
    }

    public static boolean isParallel(Point p1, Point p2, Point p3, Point p4)
    {
        return ((p1.y - p2.y) / (p1.x - p2.x)) == ((p3.y - p4.y) / (p3.x - p4.x)) ||
                ((p1.x == p2.x) && (p3.x == p4.x)) || ((p1.y == p2.y) && (p3.y == p4.y));
    }
}
