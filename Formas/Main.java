package Formas;

abstract class Shape {
	String color;

	abstract double area();

	public abstract String toString();

	public String getColor() {
		return this.color;
	}
}

class Circle extends Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	public String toString() {
		return "Shape: Circle Color: " + this.color + " Area: " + this.area();
	}
}

class Rectangle extends Shape {
	double width;
	double length;

	Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	double area() {
		return width * length;
	}

	@Override
	public String toString() {
		return "Shape: Rectangle Color: " + this.color + " Area: " + this.area();
	}
}

class Triangle extends Shape {
	double height;
	double base;

	Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}

	@Override
	double area() {
		return (base * height) / 2;
	}

	@Override
	public String toString() {
		return "Shape: Triangle Color: " + this.color + " Area: " + this.area();
	}

}

public class Main {
	public static void main(String[] args) throws Exception {
		Circle circle = new Circle(10);
		circle.color = "RED";
		Rectangle rectangle = new Rectangle(5, 15);
		rectangle.color = "YELLOW";
		Triangle triangle = new Triangle(5, 15);
		triangle.color = "GREEN";

		System.out.println(circle);
		System.out.println(rectangle);
		System.out.println(triangle);
	}
}
