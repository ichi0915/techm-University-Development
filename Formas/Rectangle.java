package Formas;

class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle(String color, double length, double width){
		this.color = color;
		this.length = length;
		this.width = width;

	}
	@Override 
	public double area(){
		return length * width;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", color =" + super.getColor() + "]";
	}

	
}