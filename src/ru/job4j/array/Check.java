package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean flag : data) {
            if (data[0] != flag) result = false;
        }
        return result;
    }
}
