package ru.stqa.pft.trainer;

public class FirstTrainerProject
{
	public static void main(String[] args)
	{
		printText("Hi,","my dear teacher!");
		printText("Next ","version");

		Square s = new Square(5);
		printText("1). Вычислить площадь квадарата, ", "если его сторона равна 5:");
		System.out.println("Если сторона квадрата равна " + s.l + ", то площадь квадрата равна " + area(s));

		Rectangle t = new Rectangle(4, 6); //длина
		printText("2). Вычислить площадь прямоугольника, ", "если его стороны равны 5 и 6:");
		System.out.println("Если стороны прямоугольника равны " + t.a + " и " + t.b + ", то площадь равна " + area(t));
	}

	public static void printText (String firstword,String secondword) // функция печати текста с параметрами
	{
		System.out.println(firstword + secondword); //параметры функции
	}
	public static double area (Square s) //функция с одним параметром
	{
		return s.l * s.l;
	}

	public static double area (Rectangle t) //функция с двумя параметром
	{
		return t.a * t.b;
	}

}