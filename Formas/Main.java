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


class Triangle extends Shape {
    double Base;
    double Height;

    @Override double area(){					// Falta return
        return (Base*Height)/2;
    }

    @Override public String getColor() {
        return "Color: " + color;
    }

    @Override public String toString(){
        return "Triangle color is " + super.getColor() + " and area is : " + area();
    }
    public String toString2(){
        return "Triangle color is " + getColor() + " and area is : " + area();
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
    double length;
    double width;

    @Override double area(){					// Falta return
        return length*width;
    }

    @Override public String getColor() {
        return "Color: " + color;
    }

    @Override public String toString(){
        return "Rectangle color is " + super.getColor() + " and area is : " + area();
    }
    public String toString2(){
        return "Rectangle color is " + getColor() + " and area is : " + area();
    }

    public void move(int x, int y, int z){
        position_x = x + position_x;
        position_y = y + position_y;
        position_z = z + position_z;
        // repaint();
        // checkboxes();
    }
}
//public class Formas {
class Formas {
    public static void main(String args[]) {

        System.out.println("== Formas ==");

        //Shape forma = new Shape();
        Shape forma = new Circle();
        Circle forma2 = new Circle();
        Mover miMovi = new Mover();

        System.out.println( forma.toString() );
        System.out.println( forma2.toString2() );
        System.out.println( forma2.getPosition() );
         miMovi.move(4);

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

class Mover {

    public void move(int x){
        System.out.println("Me he movido en x");
    }

    public void move2(int y){
        System.out.println("Me he movido en y");
    }
    public void move3(int z){
        System.out.println("Me he movido en z");
    }
}