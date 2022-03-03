package Formas;

/**
 * @author Celeste Tello.
 */
public class Main {
    public static void main(String[] args) {
        
        Circle c = new Circle("Black", 2.5);
        Rectangle r = new Rectangle("Pink", 13.2, 8);
        Triangle t = new Triangle("Yellow", 15,3);

        System.out.println("\n CIRCLE VALUES \n"+c.toString()+"\n");
        System.out.println(" RECTANGLE VALUES \n"+r.toString()+"\n");
        System.out.println(" TRIANGLE VALUES \n"+t.toString()+"\n");
    }
}
