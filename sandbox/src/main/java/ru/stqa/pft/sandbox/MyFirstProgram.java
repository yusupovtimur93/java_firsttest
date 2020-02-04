package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	
	public static void main(String[] args) {
		hello("world");
		hello("user");
		hello("Тимур");
		Point.primer("Растояние ");
		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.len + " = " + s.area());

		Rectangle r = new Rectangle(4,6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и "+ r.b + " = " + r.area());

		Point p = new Point(5, 50, 50, 50);
		System.out.println("Расстояния между двумя точками = " + p.distance());
	}
	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

}