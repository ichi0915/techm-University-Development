package Multiplicacion;

class Calculator {
	static int Multiply(int a, int b){
		System.out.println("Multiply int");
		return a * b;							//Regresa multiplicación de 2 enteros
	}
	static int Multiply(int a, int b, int c){
		System.out.println("Multiply int");
		return a * b * c;						//Regresa multiplicación de 2 enteros
	}
	static double Multiply(double a, double b){
		System.out.println("Multiply double");
		return a * b;							//Regresa multiplicación de 2 dobles
	}
}

public class Main {
	public static void main(String[] args){
		System.out.println("Hola");
		System.out.println(Calculator.Multiply(2, 4));			//Método entero
		System.out.println(Calculator.Multiply(5.5, 6.3));		//Método doble
	}
}
