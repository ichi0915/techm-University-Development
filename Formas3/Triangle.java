package Formas3;

public class Triangle extends Shapes{
    double height;
    double base;

    public Triangle(String color, double height, double base){
        super((color));
        this.height = height;
        this.base = base;
        System.out.println("Triangle is constructed");
    }

    @Override
    double area() {
        return (base*height)/2;
    }

    @Override
    public String toString() {
        return "Triangle color is: " + super.getColor() + " and its area is: " + area();
    }
    //Getters and setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
