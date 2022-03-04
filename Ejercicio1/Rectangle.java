package Ejercicio1;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public void setLength(double l){
        length = l;
    }
    public void setWidth(double w){
        width = w;
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }

    protected double area(){
        return length*width;
    }
    protected String getColor(){
        return "blue";
    }
    @Override
    public String toString(){
        return "The area of a "+getColor()+" rectangle with a length of "+getLength()+" and a width of "+getWidth()+" is "+area()+".";
    }
}
