package Formas;

/**
 * @author Celeste Tello.
 */

class Circle extends Shape {
    private double radius;
    private String color;

    public Circle(String color, double radius){
        this.color = color;
        this.radius = radius; 
    }

    public double area(){
        return Double.parseDouble(df.format(radius*radius*Math.PI));
    }

    public String getColor(){
        return this.color;
    }

    public String toString(){
        return "This Circle's area is: "+ this.area() + " and it color is "+ this.getColor();
    }
}
