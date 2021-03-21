package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to02then2() {
        int expected = 2;
        double out = Point.distance(0, 0, 0, 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when40to00then4() {
        int expected = 4;
        double out = Point.distance(4, 0, 0, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to00then0() {
        int expected = 0;
        double out = Point.distance(0, 0, 0, 0);
        Assert.assertEquals(expected, out, 0.01);
    }
}