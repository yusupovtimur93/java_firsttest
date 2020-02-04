package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;
import org.testng.Assert;

public class PointTests {
    @Test
    public void testPoint() {
        Point p = new Point (5, 50, 50, 50);
        Assert.assertEquals(p.distance(), 45.0);
    }
}
