package ru.stqa.pft.trainer;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class PointsTests
{
    public void testPoints()
    {
        Point p1 = new Point(10, 60);
        Point p2 = new Point(50, 30);
        Assert.assertEquals((p1.distance(p2)), 40.0);
    }
}