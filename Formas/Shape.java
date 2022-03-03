package Formas;

import java.text.DecimalFormat;

/**
 * @author Celeste Tello.
 */

abstract class Shape{

    static String color;

    DecimalFormat df = new DecimalFormat("###,###.00");

    public abstract double area();

    public abstract String toString();

    public String getColor(){
        return color;
    }




}