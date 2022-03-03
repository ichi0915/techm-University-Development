package Formas;

abstract class Shape {
	String color;
	Double position_x = 0.0;
	Double position_y = 0.0;
	Double position_z = 0.0;

	abstract double area();						// Método abstracto

	public abstract String toString();			// Método abstracto

	public String getColor() {					// Método concreto
		return color;
	}

	public String getPosition() {				// Método concreto
		return "x:" + position_x + " y:" + position_y + " z:" + position_z;
	}
}
class Circle extends Shape {
	double radius;

	Circle() {
		this.radius = 0.0;
	}

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	public String getColor() {
		return "Color: " + color;
	}

	@Override
	public String toString(){
		return "Circle color is " + super.getColor() + " and area is : " + area();
	}
	public String toString2(){
		return "Circle color is " + getColor() + " and area is : " + area();
	}

	public void move(int x, int y, int z){
		position_x = x + position_x;
		position_y = y + position_y;
		position_z = z + position_z;
		// repaint();
		// checkboxes();
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
	public static void main(String args[]) {

		System.out.println("== Formas ==");

		//Shape forma = new Shape();
		Shape forma = new Circle();
		Circle forma2 = new Circle();
		System.out.println( forma.toString() );
		System.out.println( forma2.toString2() );
		System.out.println( forma2.getPosition() );


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
