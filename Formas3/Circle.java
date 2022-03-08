package Formas3;

public class Circle extends Shapes{
    double radius;

    public Circle(String color, double radius){
        super(color);
        System.out.println("circle constructor called");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle color is: " + super.getColor() + " and its area is: " + area();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
