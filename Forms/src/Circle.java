class Circle extends Shape {
    double radius = position_x;

    @Override double area(){					// Falta return
        return ((radius/2)*(radius/2))*3.14;
    }

    @Override public String getColor() {
        return "Color: " + color;
    }

    @Override public String toString(){
        return "Circle color is " + super.getColor() + " and area is : " + area();
    }
    public String toString2(){
        return "Circle color is " + getColor() + " and area is : " + area();
    }
    public String getPosition1() {                    // Método concreto
        return "Radius:" + position_x;
    }
    public void move(int x, int y, int z){
        position_x = x + position_x;
        position_y = y + position_y;
        position_z = z + position_z;
    }
}

