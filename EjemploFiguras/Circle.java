package EjemploFiguras;

class Circulo extends Shape {
    double radius;

    @Override double area(){
        this.area = 3.1416*this.radius;
        return this.area;
    }

    @Override public String getColor() {
        return "Color: " + color;
    }

    public void setColor(String colorAsignado){
        this.color = colorAsignado;
    
    }

    public void setRadio(double radioAsignado){
        this.radius = radioAsignado;
    }

    @Override public String toString(){
        return "\n------Circle------\n" + super.getColor() + "\nArea: " + area();
    }
    public String toString2(){
        return "\n------Circle------\n" + getColor() + "\nArea: " + area();
    }

    public void move(int x, int y, int z){
        position_x = x + position_x;
        position_y = y + position_y;
        position_z = z + position_z;

    }

}
