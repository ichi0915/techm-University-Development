/*
Compilar:
	javac Main.java
Correr:
	java Formas

rm *.class
*/


// abstracción

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

	public String getPosition() {					// Método concreto
		return "x:" + position_x + " y:" + position_y + " z:" + position_z;
	}
}
class Circle extends Shape {
	double radius;

	@Override double area(){return 3.1416 * (radius * radius)}

	@Override public String getColor() {
		return "Color: " + color;
	}

	@Override public String toString(){
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

//Triangle
class Triangle extends Shape {
	double base;
	double height;

	@Override double area(){ return base * height / 2}

}

//Rectangle
class Rectangle extends Shape {
	double length;
	double height;

	@Override double area(){return length * height}

}

//public class Formas {
class Formas {
	public static void main(String args[]) {

		System.out.println("== Formas ==");

		//Shape forma = new Shape();
		Shape forma = new Circle();
		Circle forma2 = new Circle();
		System.out.println( forma.toString() );
		System.out.println( forma2.toString2() );
		System.out.println( forma2.getPosition() );
	}
}



// Polimorfismo
class Multiply {
	static int Multiply(int a, int b){
		System.out.println("Multiply int");
		return a * b;						//Regresa multiplicacion de 2 enteros
	}
	static int Multiply(int a, int b, int c){
		System.out.println("Multiply int");
		return a * b * c;						//Regresa multiplicacion de 2 enteros
	}
	static double Multiply(double a, double b){
		System.out.println("Multiply double");
		return a * b;						//Regresa multiplicacion de 2 dobles
	}
}
class Multiplicacion {
	public static void main(String[] args){
		System.out.println("Hola");
		System.out.println(Multiply.Multiply(2, 4));			//Metodo entero
		System.out.println(Multiply.Multiply(5.5, 6.3));		//Metodo doble
	}
}




