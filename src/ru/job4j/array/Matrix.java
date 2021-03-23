package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] result = new int[size][size];
        for (int row = 0; row < result.length; row++) {
            for (int cell = 0; cell < result.length; cell++) {
                result[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return result;
    }
}
