/*
Compilar:
	javac Main.java
Correr:
	java Formas

rm *.class
*/
// abstracción
import java.util.Scanner;
abstract class Shape {
    static Scanner v = new Scanner(System.in);
    static Scanner q = new Scanner(System.in);
    static Scanner w = new Scanner(System.in);
    static Scanner y = new Scanner(System.in);
    static Scanner u = new Scanner(System.in);
    static double r = v.nextDouble();
    static double e = q.nextDouble();
    static double t = w.nextDouble();
    static double i = y.nextDouble();
    static double o = u.nextDouble();


    String color;
    Double position_x = r;
    Double position_y = e;
    Double position_z = t;
    Double position_m = i;
    Double position_n = o;

    protected Shape() {
    }

    abstract double area();						// Método abstracto

    public abstract String toString();			// Método abstracto

    public String getColor() {					// Método concreto
        return color;
    }
public String getPosition() {					// Método concreto
        return "Radius:" + position_x + " Width:" + position_y + " Lenght:" + position_z + " Based:" + position_m + " Height:" + position_n;
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
        System.out.println("--Area & color of each figure--");
        System.out.println("Enter the radius of a circle, width and lenght of a rectangle, a based and height: ");

        Circle forma2 = new Circle();
        //Shape forma = new Circle();System.out.println( forma.toString() );
        System.out.println( "----Circle-----\n"+ forma2.toString2() );
        System.out.println( forma2.getPosition1() );


        System.out.println("-----Rectangle-----");
        Rectangle forma4 =new Rectangle();
        //Shape forma3 = new Rectangle();System.out.println(forma3.toString());
        System.out.println(forma4.toString2());
        System.out.println(forma4.getPosition2());

        System.out.println("----Triangle------");
        Triangle forma6 =new Triangle();
        //Shape forma5 = new Triangle(); System.out.println(forma5.toString());
        System.out.println(forma6.toString2());
        System.out.println(forma6.getPosition3());
    }
}
