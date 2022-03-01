package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        triangle.setPosition_x(5.5);
        triangle.setPosition_y(3.5);
        triangle.setPosition_z(10.3);
        triangle.setBase(5.3);
        triangle.setHeight(7.4);
        triangle.setColor("Blue");

        rectangle.setPosition_x(10.3);
        rectangle.setPosition_y(20.4);
        rectangle.setPosition_z(5.3);
        rectangle.setLength(3.7);
        rectangle.setWidth(10.1);
        rectangle.setColor("Red");

        System.out.println(triangle);
        System.out.println(rectangle);
    }
}
