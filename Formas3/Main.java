package Formas3;

public class Main {
    public static void main(String[] args) {
        Shapes c1 = new Circle("blue", 2.4);
        Shapes r1 = new Rectangle("pink", 7.6, 5.7);
        Shapes t1 = new Triangle("purple", 4.78, 2);
        System.out.println(c1.toString());
        System.out.println(r1.toString());
        System.out.println(t1.toString());
    }
}
