package Ejercicio1;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        System.out.println("Enter the circle's radious:");
        c.setRadious(sc.nextDouble());
        System.out.println("Enter the rectangle's length:");
        r.setLength(sc.nextDouble());
        System.out.println("Enter the rectangle's width:");
        r.setWidth(sc.nextDouble());
        System.out.println("Enter the triangle's heigth:");
        t.setHeight(sc.nextDouble());
        System.out.println("Enter the triangle's width:");
        t.setWidth(sc.nextDouble());

        System.out.println(c.toString());
        System.out.println(r.toString());
        System.out.println(t.toString());
    }
}
