package ru.stqa.pft.trainer;

public class Square
{
    public double l; //квадрат описывается длинной его стороны

    public Square (double l)
    {
        this.l = l;
    }
    public double area()
    {
        return this.l * this.l;
    }
}