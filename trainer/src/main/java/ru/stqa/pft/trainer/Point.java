package ru.stqa.pft.trainer;

public class Point {
    public double x, y;
    public double dx;
    public double dy; //параметры точки, координаты

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p)
    {
        //Поскольку метод distance у DistanceOfPoint статический
        //мы должны явно указать где искать
        Point dx = new Point(10, 60);
        Point dy = new Point(50, 30);
        this.dx = dx.x - dy.x;
        this.dy = dy.y - dy.y;
        return Math.sqrt( (Math.pow((this.dx), 2)) +  (Math.pow((this.dy),2)));
    }
}
