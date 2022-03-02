package ejercicio1;

public class Rectangle extends Shape{
    double length;
    double width;

    public void setColor(String color){
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle Area is: " + area() + ", Color is: " + getColor() + ", Position is: " + getPosition();
    }
}
