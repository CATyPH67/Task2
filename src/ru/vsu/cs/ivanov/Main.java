package ru.vsu.cs.ivanov;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Main
{
    public static void main(String[] args)
    {
        Point p1 = Program.readPoint("p1");
        Point p2 = Program.readPoint("p2");
        Point p3 = Program.readPoint("p3");
        Point p4 = Program.readPoint("p4");
        System.out.print(Program.isParallelogram(p1, p2, p3, p4));
    }
}
