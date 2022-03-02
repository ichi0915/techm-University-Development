package Formas;

class Circle extends Shape {
	private double radius;

	public Circle (String color, double radius){
		this.color = color;
		this.radius = radius;

	}

	@Override 
	double area(){					// Falta return
		return Math.PI * Math.pow(radius, 2);
	}

	@Override 
	public String getColor() {
		return "Color: " + color;
	}

	@Override 
	public String toString(){
		return "Circle color is " + super.getColor() + " and area is : " + area();
	}
	public String toString2(){
		return "Circle color is " + getColor() + " and area is : " + area();
	}


}
