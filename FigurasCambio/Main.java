import javax.sound.midi.SysexMessage;

/*
Compilar:
	javac Main.java
Correr:
	java Formas
​
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
    public void setColor(String color){
        this.color=color;
    }
	public String getPosition() {					// Método concreto
		return "x:" + position_x + " y:" + position_y + " z:" + position_z;
	}
}
class Circle extends Shape {
	double radius;

	public void setRadius(double radius){
        this.radius=radius;
    }
    double area(){
        return radius*radius*Math.PI;
    }

	@Override public String getColor() {
		return "Color: " + color;
	}

	public String toString(){
		return "Circle color is " + getColor() + " and area is : " + area();
	}

	public void move(int x, int y, int z){
		position_x = x + position_x;
		position_y = y + position_y;
		position_z = z + position_z;

	}
    public void move(int x, int y){
        position_x = x + position_x;
		position_y = y + position_y;
    }
    public String obtainPositions(){
        return "X = "+position_x+", Y = "+position_y+", Z = "+position_z;
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    public void setLength(double length){
        this.length=length;
    }
    public void setWidth(double width){
        this.width=width;
    }
    double area(){
        return length*width;
    }
    public String toString(){
        return "Rectangle color is " + getColor() + " and area is : " + area();
    }
}
class Triangle extends Shape{
    double base;
    double height;
    public void setBase(double base){
        this.base=base;
    }
    public void setHeight(double height){
        this.height=height;
    }
    double area(){
        return base*height/2;
    }
    public String toString(){
        return "Triangle color is " + getColor() + " and area is : " + area();
    }
}
//== Implementar ==
//Triangle
	//Base: double
	//Height: double
//Rectangle
	//length: double
	//width: double


//public class Formas {
class Formas {
	public static void main(String args[]) {

		System.out.println("== Formas ==");

		//Shape forma = new Shape();
		Shape circulo2 = new Circle();
        Circle circulo = new Circle();
		Rectangle rectangulo = new Rectangle();
        Triangle triangulo = new Triangle();
        circulo.setColor("Azul");
        triangulo.setColor("Amarillo");
        rectangulo.setColor("Verde");
        //circulo2.setRadius(4.5);
        circulo.setRadius(10.2);
        rectangulo.setLength(21);
        rectangulo.setWidth(11);
        triangulo.setBase(8.1);
        triangulo.setHeight(4.5);
        System.out.println(circulo.toString());
        System.out.println(rectangulo.toString());
        System.out.println(triangulo.toString());
        circulo.move(12, 12);
        System.out.println(circulo.getPosition());
        circulo.move(3, 4, 5);
        System.out.println(circulo.getPosition());

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
