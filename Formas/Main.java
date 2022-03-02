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

public class Main {
	public static void main(String args[]) {

		System.out.println("== Formas ==");

		//Shape forma = new Shape();
		Shape forma = new Circle("rojillo", 5.5);
		Rectangle forma2 = new Rectangle("azul", 5.5 ,5.5);
		System.out.println( forma.toString() );
		System.out.println(forma2.toString());
	}
}
