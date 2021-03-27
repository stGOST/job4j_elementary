package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        int rsl = max(first, second);
        return rsl > third ? rsl : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        int comparison1 = max(first, second);
        int comparison2 = max(third, fourth);
        return  comparison1 > comparison2 ? comparison1 : comparison2;
    }
}
