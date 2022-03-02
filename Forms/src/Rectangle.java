
    class Rectangle extends Shape {
        double width = position_y;
        double lenght = position_z;

        @Override double area(){		// Falta return
            return width * lenght;
        }

        @Override public String getColor() {
            return "Color: " + color;
        }

        @Override public String toString(){
            return "Rectangle color is " + super.getColor() + " and area is : " + area();
        }
        public String toString2(){
            return "Rectangle color is " + getColor() + " and area is : " + area();
        }
        public String getPosition2() {                    // Método concreto
            return " Width:" + position_y + " Lenght:" + position_z;}
        public void move(int x, int y, int z){
            position_x = x + position_x;
            position_y = y + position_y;
            position_z = z + position_z;
        }

    }

