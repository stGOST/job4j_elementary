package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRigth = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (indexLeft == left.length) {
                rsl[i] = right[indexRigth];
                indexRigth++;
                continue;
            }
            if (indexRigth == right.length) {
                rsl[i] = left[indexLeft];
                indexLeft++;
                continue;
            }
            if (left[indexLeft] <= right[indexRigth]) {
                rsl[i] = left[indexLeft];
                indexLeft++;
            } else {
                rsl[i] = right[indexRigth];
                indexRigth++;
            }
        }
        return rsl;
    }
}
