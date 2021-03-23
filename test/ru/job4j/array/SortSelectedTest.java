package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {9, 5, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 5, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {10, 50, 20, 30, 40};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 20, 30, 40, 50};
        Assert.assertArrayEquals(expected, result);
    }
}