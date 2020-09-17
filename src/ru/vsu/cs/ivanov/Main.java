package ru.vsu.cs.ivanov;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the x and y for first point: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("enter the x and y for second point: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.print("enter the x and y for third point: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        System.out.print("enter the x and y for fourth point: ");
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();
        System.out.printf("%s", isParallelogram(x1, x2, x3, x4, y1, y2, y3, y4));
    }

    private static String isParallelogram(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        if ((Math.abs(x1 - x2) == Math.abs(x3 - x4)) && (Math.abs(y1 - y2) == Math.abs(y3 - y4))) {
            return "yes";
        }
        if ((Math.abs(x1 - x3) == Math.abs(x2 - x4)) && (Math.abs(y1 - y3) == Math.abs(y2 - y4))) {
            return "yes";
        }
        if ((Math.abs(x1 - x4) == Math.abs(x3 - x2)) && (Math.abs(y1 - y4) == Math.abs(y3 - y2))) {
            return "yes";
        }
        return "no";
    }
}
