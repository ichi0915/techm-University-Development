package Ejercicio1;

public class Circle extends Shape{
    private double radious;
    //Holiwi

    public void setRadious(double r){
        radious = r;
    }
    public double getRadious(){
        return this.radious;
    }
    protected double area(){
        return Math.pow(3.14*radious,2);
    }
    protected String getColor(){
        return "yellow";
    }
    @Override
    public String toString(){
        return "The area of a "+getColor()+" circle with a radious of "+getRadious()+" is "+area()+".";
    }
}
