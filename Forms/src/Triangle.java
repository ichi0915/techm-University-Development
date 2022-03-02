class Triangle extends Shape {
    double based = position_m;
    double height = position_n;

    @Override double area(){		// Falta return
        return (based*height)/2;
    }

    @Override public String getColor() {
        return "Color: " + color;
    }

    @Override public String toString(){
        return "Triangle color is " + super.getColor() + " and area is : " + area();
    }
    public String toString2(){
        return "Triangle color is " + getColor() + " and area is : " + area();
    }
    public String getPosition3() {                    // Método concreto
        return " Based:" + position_m + " Height:" + position_n;}
    public void move(int x, int y, int z){
        position_x = x + position_x;
        position_y = y + position_y;
        position_z = z + position_z;
    }

}