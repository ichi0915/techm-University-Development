package Formas;

class Triangle extends Shape {
	private double base;
	private double height;

	public Triangle (String color, double base, double height){
		this.color = color;
		this.base = base;
		this.height = height;
	}
	@Override
	public double area(){
		return base * height / 2;
	}
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height +"color:" + super.getColor() + "]";
	}
	
}