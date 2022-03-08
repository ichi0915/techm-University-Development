package Formas3;

public abstract class Shapes {
    protected String color;
    abstract double area();
    public abstract String toString();

    public Shapes(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }
    public  String getColor(){
        return color;
    }
}
