package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	
	public static void main(String[] args) {
		hello("world");
		hello("user");
		hello("Тимур");
		primer("Растояние ");
		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.len + " = " + s.area());

		Rectangle r = new Rectangle(4,6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и "+ r.b + " = " + r.area());

		Point p = new Point(5, 50, 50, 50);
		System.out.println("Расстояния между двумя точками = " + distance(p));
	}
	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}
	public static void primer(String args) {
		Point p = new Point(5, 50, 50, 50);
		System.out.println(args + distance(p));
	}
	public static double distance(Point p) {
		return Math.sqrt(Math.pow (p.p1 - p.p2, 2) + Math.pow (p.p3 - p.p4, 2));
	}
}