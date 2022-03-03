package Formas;

/**
 * @author Celeste Tello.
 */

public class Rectangle extends Shape {
    private double lengh;
    private double width;
    private String color;

    Rectangle(String color, double lengh, double width){
        this.color=color;
        this.width=width;
        this.lengh=lengh;
    }

    public double area(){
        return width*lengh;
    }

    public String getColor(){
        return this.color;
    }

    public String toString(){
        return "This Rectangle's area is: "+ this.area() + " and it color is "+ this.getColor();
    }

}
