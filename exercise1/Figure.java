package ejemplo01; //Ejercicio #1, realizado por Rafael Torres//

public class Figure {
	
	static final Double PI = 3.1416; //declaro PI como variable global//

	abstract class Shape{
		//variables//
		String color;
		Double position_x = 0.0;
		Double position_y = 0.0;
		Double position_z = 0.0;
		//Metodos abstractos//
		abstract double area();				// Método abstracto
		public abstract String toString();	// Método abstracto
		//Gets & Sets//
		public String getColor() {			// Método concreto
			return color;
		}
		public void setColor(String tono){
			this.color = tono;
		}
		public String getPosition() {		// Método concreto
			return "X:" + position_x + " Y:" + position_y + " Z:" + position_z;
		}
		public void setPosition(Double newX,Double newY,Double newZ){
			this.position_x = newX;
			this.position_y = newY;
			this.position_z = newZ;
		}
		//Polimorfismo//
		public void move(double X, double Y, double Z){
			setPosition(this.position_x+X,this.position_y+Y,this.position_z+Z);
		}
		public void move(double X, double Y){
			setPosition(this.position_x+X,this.position_y+Y,this.position_z);
		}
		public void move(double X){
			setPosition(this.position_x+X,this.position_y,this.position_z);
		}
	}
	
	class Circle extends Shape {
		double radius;
		//double diameter = radius*2;//
		Circle(double radio){ //constructor con polimorfismo//
			this.radius=radio;
			super.color="desconocido";
		}
		Circle(double radio,String color){
			this.radius=radio;
			super.color=color;
		}
		@Override double area(){
			return PI*(radius*radius);
		}
		@Override public String toString(){
			return "Circle color is " + super.getColor() + " and area is : " + area();
		}
	}

	class Rectangle extends Shape{
		double width;
		double length;
		Rectangle(double base,double altura){
			this.width=base;
			this.length=altura;
			super.color="desconocido";
		}
		Rectangle(double base,double altura,String color){
			this.width=base;
			this.length=altura;
			super.color=color;
		}
		@Override double area(){
			return length*width;
		}
		@Override public String toString(){
			return "Rectangle color is " + super.getColor() + " and it area is : " + area();
		}
	}
	
	class Triangle extends Rectangle{
		Triangle(double base,double altura){
			super(base,altura);
		}
		Triangle(double base,double altura,String color){
			super(base,altura,color);
		}
		@Override double area(){
			return (length*width)/2;
		}
		@Override public String toString(){
			return "Triangle color is " + super.getColor() + " and it area is : " + area();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Exercise #1.");
	}

}
