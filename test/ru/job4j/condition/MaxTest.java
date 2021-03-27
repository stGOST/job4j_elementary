package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax123Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int expected = 3;
        int actual = Max.max(first, second, third);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void whenMax5678Then8() {
        int first = 5;
        int second = 6;
        int third = 7;
        int fourth = 8;
        int expected = 8;
        int actual = Max.max(first, second, third, fourth);
        Assert.assertEquals(actual, expected);
    }
}