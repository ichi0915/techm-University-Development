package Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        Gun machineGun = new Gun("Uzi", 200, 400, 20);
        System.out.println(machineGun.getInfo());
        Sword mySword = new Sword("Dragon Killer", 100);
        System.out.println(mySword.getInfo());
    }
}
