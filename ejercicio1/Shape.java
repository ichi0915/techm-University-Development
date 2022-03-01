package ejercicio1;

abstract class Shape {
    String color;
    Double position_x;
    Double position_y;
    Double position_z;

    abstract double area();

    public abstract String toString();

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getPosition(){
        return "x= " + position_x + ", y= " + position_y + ", z= " + position_z;
    }

    public void setPosition_x(Double position_x) {
        this.position_x = position_x;
    }

    public void setPosition_y(Double position_y) {
        this.position_y = position_y;
    }

    public void setPosition_z(Double position_z) {
        this.position_z = position_z;
    }
}
