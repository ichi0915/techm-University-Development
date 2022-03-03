package EjemploFiguras;

class Triangulo extends Shape {

    double base = 0.0;
    double height = 0.0;
    
    @Override double area(){
        this.area = (this.base * this.height)/2;
        return this.area;
    }

    public void setProperties(double baseAsignado, double alturaAsignado){
        this.base = baseAsignado;
        this.height= alturaAsignado;
    }

    @Override public String getColor() {
        return "Color: " + color;
    }

    public  void setColor(String colorAsignado){
        this.color = colorAsignado;
    
    }

    @Override public String toString(){
        return "\n------Triangle------\n" + super.getColor() + "\nArea: " + area();
    }
    public String toString2(){
        return "\n------Triangle------\n" + getColor() + "\nArea: " + area();
    }

    public void move(int x, int y, int z){
        position_x = x + position_x;
        position_y = y + position_y;
        position_z = z + position_z;

    }
}
