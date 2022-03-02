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

class Triangle extends Shape {
	double base;
	double height;
	String color;

	public void setColor(String color){
		this.color = color;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	double area() {
		return (base * height) / 2;
	}

	@Override
	public String toString() {
		return "Triangle Area is: " + area() + ", Color is: " + color + ", Position is: " + getPosition();
	}

	public void setPosition_x(Double position_x) {
		this.position_x = position_x;

	}

	public void setPosition_y(Double position_y) {
		this.position_y = 10.3;
	}

	public void setPosition_z(Double position_z) {
		this.position_z = 4.6;
	}
}

class Rectangle extends Shape {
	double length;
	double width;

	public void setColor(String color){
		this.color = color;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	double area() {
		return length * width;
	}

	public String toString() {
		return "Rectangle Area is: " + area() + ", Color is: " + getColor() + ", Position is: " + getPosition();
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

		ejercicio1.Triangle triangle = new ejercicio1.Triangle();
		ejercicio1.Rectangle rectangle = new ejercicio1.Rectangle();

		triangle.setPosition_x(5.5);
		triangle.setPosition_y(3.5);
		triangle.setPosition_z(10.3);
		triangle.setBase(5.3);
		triangle.setHeight(7.4);
		triangle.setColor("Blue");

		rectangle.setPosition_x(10.3);
		rectangle.setPosition_y(20.4);
		rectangle.setPosition_z(5.3);
		rectangle.setLength(3.7);
		rectangle.setWidth(10.1);
		rectangle.setColor("Red");

		System.out.println(triangle);
		System.out.println(rectangle);
	}
}
