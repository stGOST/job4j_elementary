package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] index = new int[5];
        for (int i = 0; i < 5; i++) {
            index[i] = i * 2 + 3;
        }
        for (int i: index) {
            System.out.println(i);
        }
    }
}
