package Formas;

/**
 * @author Celeste Tello.
 */

public class Triangle extends Shape{
    private double base;
    private double heigh;
    private String color;

    public Triangle(String color, double base, double heigh){
        this.color=color;
        this.base=base;
        this.heigh=heigh;
    }

    public double area(){
        return (base*heigh)/2;
    }

    public String getColor(){
        return this.color;
    }

    public String toString(){
        return"This Triangle's area is: "+ this.area() + " and it color is "+ this.getColor();
    }
}
