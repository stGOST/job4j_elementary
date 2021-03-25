package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
            for (int i = 0; i < coins.length; i++) {
                while (money - price >= coins[i]) {
                    rsl[size] = coins[i];
                    money -= coins[i];
                    size++;
                }
                if (money == price) {
                    break;
                }
            }
        return Arrays.copyOf(rsl, size);
    }
}
