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
		Point p = new Point();
		p.p1 = 5;
		p.p2 = 50;
		p.p3 = 50;
		p.p4 = 50;
		System.out.println("Расстояния между двумя точками =" + distance(p));
	}
	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	public static double distance(Point p) {
		return Math.sqrt(Math.pow (p.p1 - p.p2, 2) + Math.pow (p.p3 - p.p4, 2));
	}
}