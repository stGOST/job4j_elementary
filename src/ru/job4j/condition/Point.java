package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        int x12 = x2-x1;
        int y12 = y2-y1;
        double rsl = Math.sqrt(Math.pow(x12,2)+Math.pow(y12,2));
        return rsl;
    }

    public static  void  printDistance(int x1, int y1, int x2, int y2){
        System.out.println("result ("+x1+","+ y1+") to ("+x2+","+ y2+") =" + Point.distance(x1, y1, x2, y2));
    }

    public static void main(String[] args) {
        printDistance(0,0,4,4);
        printDistance(5,5,15,15);
    }
}
