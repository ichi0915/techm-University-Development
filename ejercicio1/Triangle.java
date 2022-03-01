package ejercicio1;

public class Triangle extends Shape{
    double base;
    double height;
    String color;

    public void setColor(String color){
        this.color = color;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double area() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle Area is: " + area() + ", Color is: " + color + ", Position is: " + getPosition();
    }

    @Override
    public void setPosition_x(Double position_x) {
        this.position_x = position_x;

    }

    @Override
    public void setPosition_y(Double position_y) {
        this.position_y = 10.3;
    }

    @Override
    public void setPosition_z(Double position_z) {
        this.position_z = 4.6;
    }
}
