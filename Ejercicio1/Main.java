package Ejercicio1;

    public class Main {
        public static void main(String args[]){
            Circle circulo = new Circle();
            circulo.setRadius(3);
            circulo.setColor("Blue");
            System.out.println(circulo.toString());
            Triangle triangulo = new Triangle();
            triangulo.setBase(5);
            triangulo.setHeight(7);
            triangulo.setColor("Red");
            System.out.println(triangulo.toString());
            Rectangle rectangulo = new Rectangle();
            rectangulo.setBase(10);
            rectangulo.setWidth(5);
            System.out.println(rectangulo.toString());
            System.out.println(rectangulo.basewidth("Hola :)"));
        }
    }

    abstract class Shape{
        String color;

        abstract double area();						// Método abstracto

        public abstract String toString();			// Método abstracto

        public String getColor() {					// Método concreto
            return color;
        }
        public void setColor(String color){
            this.color=color;
        }
    }

    class Circle extends Shape{
        double radius;
        public void setRadius(double radius){
            this.radius=radius;
        }
        @Override
        double area(){
            return (radius*radius)*Math.PI;
        }
        @Override
        public String toString() {
            return "Área de circulo: "+area();
        }
        @Override
        public String getColor(){
            return "Color override: "+color;
        }
    }
    class Triangle extends Shape{

        double base;
        double height;

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        @Override
        double area() {
            return (base*height)/2;
        }

        @Override
        public String toString() {
            return "El area del triangulo es: "+area()+"\nY su color es: "+color;
        }
    }
    class Rectangle extends Shape{
        double base;
        double width;

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        @Override
        double area() {
            return base*width;
        }

        @Override
        public String toString() {
            return "Area de rectangulo es: "+area()+basewidth();
        }

        private String basewidth(){
            return "\nBase: "+base+", Width: "+width;
        }
        public String basewidth(String msj){
            return "\nBase: "+base+", Width: "+width+", Msj: "+msj;
        }

    }

