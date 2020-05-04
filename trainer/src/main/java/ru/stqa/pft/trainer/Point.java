package ru.stqa.pft.trainer;

public class Point {
    public double x, y;
    private Object p1;
    private Object p2;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p)
    {
        DistanceOfPoint dop = new DistanceOfPoint();
        return dop.distance(this, p);
    }
}
