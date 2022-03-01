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

	@Override double area(){					// Falta return
		return 0.0;
	}

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

//== Implementar ==
//Triangle
	//Base: double
	//Height: double
//Rectangle
	//length: double
	//width: double


public class Main {
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
