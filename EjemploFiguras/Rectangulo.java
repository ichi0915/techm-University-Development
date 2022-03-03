package EjemploFiguras;

class Rectangulo extends Shape{
    
    double length = 0.0;
    double width = 0.0;
    
    @Override double area(){
        this.area = this.length * this.width;
        return this.area;
    }

    public void setProperties(double largoAsignado, double anchoAsignado){
        this.length = largoAsignado;
        this.width = anchoAsignado;
    }

    @Override public String getColor() {
        return "Color: " + color;
    }

    public void setColor(String colorAsignado){
        this.color = colorAsignado;

    }

    @Override public String toString(){
        return "\n------Rectangle------\n" + super.getColor() + "\nArea: " + area();
    }
    public String toString2(){
        return "\n------Rectangle------\n" + getColor() + "\nArea: " + area();
    }

    public void move(int x, int y, int z){
        position_x = x + position_x;
        position_y = y + position_y;
        position_z = z + position_z;

    }
}
