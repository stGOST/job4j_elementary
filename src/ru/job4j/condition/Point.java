package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static  void  printDistance(int x1, int y1, int x2, int y2) {
        System.out.println("result (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ") =" + Point.distance(x1, y1, x2, y2));
    }

    public static void main(String[] args) {
        //printDistance(0, 0, 4, 4);
        //printDistance(5, 5, 15, 15);

        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
