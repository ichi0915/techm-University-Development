package Ejercicio2;

public class Main {
    public static void main(String[] args){
        Sword s1 = new Sword("cordelia", 1, 3, "fire", 10, "yes"); 
        Gun g1 = new Gun("Fenix", 2, 4, "gold", 7);
        System.out.println(s1.toString());
        System.out.println(g1.toString());
    }
}
