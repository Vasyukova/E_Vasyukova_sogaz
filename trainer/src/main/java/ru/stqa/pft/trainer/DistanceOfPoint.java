package ru.stqa.pft.trainer;

public class DistanceOfPoint
{
    public static void main(String[] args)
    {
        Point p1 = new Point(10, 60);
        Point p2 = new Point(50, 30);
        System.out.println("p1.x = " + p1.x + " , " + p1.x);
        System.out.println("p2.x = " + p2.y + " , " + p2.y);
        System.out.println("p1.distance(p2) = " + p1.distance(p2));
    }

    public static double distance(Point p1, Point p2)
    {
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }
}

