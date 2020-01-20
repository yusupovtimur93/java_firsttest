package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	
	public static void main(String[] args) {
		hello("world");
		hello("user");
		hello("Тимур");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.len + " = " + s.area());

		Rectangle r = new Rectangle(4,6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и "+ r.b + " = " + r.area());
		double p1 = 5;
		double p2 = 50;
		double p3 = 50;
		double p4 = 50;
		System.out.println("Расстояние между точками =" + distance(p1,p2,p3,p4));
	}
	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	public static double distance(double p1, double p2, double p3, double p4) {
		return Math.sqrt(Math.pow (p1 - p2, 2) + Math.pow (p3 - p4, 2));
	}
}