package EjemploFiguras;

abstract class Shape {
    String color;
    Double position_x = 0.0;
    Double position_y = 0.0;
    Double position_z = 0.0;
    Double area = 0.0;

    abstract double area();						// Método abstracto

    public abstract String toString();			// Método abstracto

    public String getColor() {					// Método concreto
        return color;
    }

    public String getPosition() {					// Método concreto
        return "\nPositions\nx:" + position_x + " \ny:" + position_y + " \nz:" + position_z;
    }

}

