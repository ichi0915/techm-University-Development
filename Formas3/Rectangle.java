package Formas3;

public class Rectangle extends Shapes{
    double width;
    double length;

    public Rectangle(String color, double width, double length) {
        super((color));
        System.out.println("Rectangle is constructed");
        this.width = width;
        this.length = length;
    }

    @Override
    double area() {
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectangle color is: " + super.getColor() + " and its area is: " + area();
    }
    
    //Getters and Setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double width) {
        this.width = length;
    }
}
