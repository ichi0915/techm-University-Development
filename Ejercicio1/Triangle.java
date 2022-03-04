package Ejercicio1;

public class Triangle extends Shape{
    private double height;
    private double width;

    public void setHeight(double h){
        height = h;
    }
    public void setWidth(double w){
        width = w;
    }
    public double getHeight(){
        return this.height;
    }
    public double getWidth(){
        return this.width;
    }
    protected double area(){
        return ((height*width)/2);
    }
    protected String getColor(){
        return "green";
    }
    @Override
    public String toString(){
        return "The area of a "+getColor()+" triangle with a height of "+getHeight()+" and a width of "+getWidth()+" is "+area()+".";
    }
}
